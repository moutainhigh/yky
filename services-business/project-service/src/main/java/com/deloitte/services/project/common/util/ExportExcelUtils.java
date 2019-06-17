package com.deloitte.services.project.common.util;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author : JeaChen
 * @Date : Create in 2019/5/8 9:50
 * @Description : Excel数据导出辅助工具类
 * @Modified:
 */
@Slf4j
public class ExportExcelUtils {

    /**
     * 模板map
     */
    private static Map<String, Workbook> tempWorkbook = Maps.newHashMap();
    /**
     * 模板输入流map
     */
    private static Map<String, InputStream> tempStream = Maps.newHashMap();

    private static final String SUFFIX_XLSX = ".xlsx";

    /**
     * 功能: 根据模板名获取模板文件路径
     * @param templateName
     * @return
     */
    public static String getTemplatePath(String templateName) {
        String templatePath = ExportExcelUtils.class
                .getClassLoader()
                .getResource("excel/template/" + templateName + SUFFIX_XLSX).getPath();
        return templatePath;
    }

    /**
     * 功能:按模板向Excel中相应地方填充数据
     */
    public static void writeData(String templateFilePath, Map<String, Object> dataMap, int sheetNo) throws IOException, InvalidFormatException {
        if (dataMap == null || dataMap.isEmpty()) {
            return;
        }
        //读取模板
        Workbook wbModule = getTempWorkbook(templateFilePath);
        //数据填充的sheet
        Sheet wsheet = wbModule.getSheetAt(sheetNo);

        for (Entry<String, Object> entry : dataMap.entrySet()) {
            String point = entry.getKey();
            Object data = entry.getValue();

            TempCell cell = getCell(point, data, wsheet);
            //指定坐标赋值
            setCell(cell, wsheet);
        }

        //设置生成excel中公式自动计算
        wsheet.setForceFormulaRecalculation(true);
    }

    /**
     * 功能:按模板向Excel中列表填充数据.只支持列合并
     */
    public static void writeDataList(String templateFilePath, String[] heads, List<Map<Integer, Object>> datalist, int sheetNo) throws IOException, InvalidFormatException {
        if (heads == null || heads.length <= 0 || CollectionUtils.isEmpty(datalist)) {
            return;
        }
        //读取模板
        Workbook wbModule = getTempWorkbook(templateFilePath);
        //数据填充的sheet
        Sheet wsheet = wbModule.getSheetAt(sheetNo);

        //列表数据模板cell
        List<TempCell> tempCells = new ArrayList<TempCell>(heads.length);
        for (String point : heads) {
            TempCell tempCell = getCell(point, null, wsheet);
            //取得合并单元格位置  -1:表示不是合并单元格
            int pos = isMergedRegion(wsheet, tempCell.getRow(), tempCell.getColumn());
            if (pos > -1) {
                CellRangeAddress range = wsheet.getMergedRegion(pos);
                tempCell.setColumnSize(range.getLastColumn() - range.getFirstColumn());
            }
            tempCells.add(tempCell);
        }
        //赋值
        //数据行
        for (int i = 0; i < datalist.size(); i++) {
            Map<Integer, Object> dataMap = datalist.get(i);
            //列
            for (int j = 0; j < tempCells.size(); j++) {
                TempCell tempCell = tempCells.get(j);
                tempCell.setData(dataMap.get(j + 1));
                setCell(tempCell, wsheet);
                tempCell.setRow(tempCell.getRow() + 1);
            }
        }
    }

    /**
     * 功能:获取输入工作区
     */
    private static Workbook getTempWorkbook(String templateFilePath) throws IOException, InvalidFormatException {
        if (!tempWorkbook.containsKey(templateFilePath)) {
            InputStream inputStream = getInputStream(templateFilePath);
            tempWorkbook.put(templateFilePath, WorkbookFactory.create(inputStream));
        }
        return tempWorkbook.get(templateFilePath);
    }

    /**
     * 功能:获得模板输入流
     */
    private static InputStream getInputStream(String templateFilePath) throws FileNotFoundException {
        if (!tempStream.containsKey(templateFilePath)) {
            tempStream.put(templateFilePath, new FileInputStream((templateFilePath)));
        }
        return tempStream.get(templateFilePath);
    }

    /**
     * 功能:获取单元格数据,样式(根据坐标:B3)
     */
    private static TempCell getCell(String point, Object data, Sheet sheet) {
        TempCell tempCell = new TempCell();

        //得到列   字母
        String lineStr = "";
        String reg = "[A-Z]+";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(point);
        while (m.find()) {
            lineStr = m.group();
        }
        //将列字母转成列号  根据ascii转换
        char[] ch = lineStr.toCharArray();
        int column = 0;
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            int post = ch.length - i - 1;
            int r = (int) Math.pow(10, post);
            column = column + r * ((int) c - 65);
        }
        tempCell.setColumn(column);

        //得到行号
        reg = "[1-9]+";
        p = Pattern.compile(reg);
        m = p.matcher(point);
        while (m.find()) {
            tempCell.setRow((Integer.parseInt(m.group()) - 1));
        }

        //获取模板指定单元格样式,设置到tempCell(写列表数据的时候用)
        Row rowIn = sheet.getRow(tempCell.getRow());
        if (rowIn == null) {
            rowIn = sheet.createRow(tempCell.getRow());
        }
        Cell cellIn = rowIn.getCell(tempCell.getColumn());
        if (cellIn == null) {
            cellIn = rowIn.createCell(tempCell.getColumn());
        }
        tempCell.setCellStyle(cellIn.getCellStyle());
        tempCell.setData(data);
        return tempCell;
    }

    /**
     * 功能:给指定坐标单元格赋值
     */
    private static void setCell(TempCell tempCell, Sheet sheet) {
        if (tempCell.getColumnSize() > -1) {
            CellRangeAddress rangeAddress = mergeRegion(sheet, tempCell.getRow(), tempCell.getRow(), tempCell.getColumn(), tempCell.getColumn() + tempCell.getColumnSize());
            setRegionStyle(tempCell.getCellStyle(), rangeAddress, sheet);
        }

        Row rowIn = sheet.getRow(tempCell.getRow());
        if (rowIn == null) {
            // 复制上一行
            copyRows(tempCell.getRow() - 1, tempCell.getRow() - 1, tempCell.getRow(), sheet);
            rowIn = sheet.getRow(tempCell.getRow());
        }
        Cell cellIn = rowIn.getCell(tempCell.getColumn());
        if (cellIn == null) {
            cellIn = rowIn.createCell(tempCell.getColumn());
        }
        //根据data类型给cell赋值
        if (tempCell.getData() instanceof String) {
            cellIn.setCellValue((String) tempCell.getData());
        } else if (tempCell.getData() instanceof Integer) {
            cellIn.setCellValue((int) tempCell.getData());
        } else if (tempCell.getData() instanceof Double) {
            cellIn.setCellValue((double) tempCell.getData());
        } else {
            cellIn.setCellValue((String) tempCell.getData());
        }
        //样式
        if (tempCell.getCellStyle() != null && tempCell.getColumnSize() == -1) {
            cellIn.setCellStyle(tempCell.getCellStyle());
        }
    }

    /**
     * 功能:写到输出流并移除资源
     */
    public static void writeAndClose(String templateFilePath, OutputStream os) throws IOException, InvalidFormatException {
        if (getTempWorkbook(templateFilePath) != null) {
            getTempWorkbook(templateFilePath).write(os);
            tempWorkbook.remove(templateFilePath);
        }
        if (getInputStream(templateFilePath) != null) {
            getInputStream(templateFilePath).close();
            tempStream.remove(templateFilePath);
        }
    }

    /**
     * 功能:判断指定的单元格是否是合并单元格
     */
    private static Integer isMergedRegion(Sheet sheet, int row, int column) {
        for (int i = 0; i < sheet.getNumMergedRegions(); i++) {
            CellRangeAddress range = sheet.getMergedRegion(i);
            int firstColumn = range.getFirstColumn();
            int lastColumn = range.getLastColumn();
            int firstRow = range.getFirstRow();
            int lastRow = range.getLastRow();
            if (row >= firstRow && row <= lastRow) {
                if (column >= firstColumn && column <= lastColumn) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * 功能:合并单元格
     */
    private static CellRangeAddress mergeRegion(Sheet sheet, int firstRow, int lastRow, int firstCol, int lastCol) {
        CellRangeAddress rang = new CellRangeAddress(firstRow, lastRow, firstCol, lastCol);
        sheet.addMergedRegion(rang);
        return rang;
    }

    /**
     * 功能:设置合并单元格样式
     */
    private static void setRegionStyle(CellStyle cs, CellRangeAddress region, Sheet sheet) {
        for (int i = region.getFirstRow(); i <= region.getLastRow(); i++) {
            Row row = sheet.getRow(i);
            if (row == null) {
                row = sheet.createRow(i);
            }
            for (int j = region.getFirstColumn(); j <= region.getLastColumn(); j++) {
                Cell cell = row.getCell(j);
                if (cell == null) {
                    cell = row.createCell(j);
                    cell.setCellValue("");
                }
                cell.setCellStyle(cs);
            }
        }
    }

    /**
     * 功能:copy rows
     */
    private static void copyRows(int startRow, int endRow, int pPosition, Sheet sheet) {
        int pStartRow = startRow - 1;
        int pEndRow = endRow - 1;
        int targetRowFrom;
        int targetRowTo;
        int columnCount;
        CellRangeAddress region = null;
        int i;
        int j;
        if (pStartRow == -1 || pEndRow == -1) {
            return;
        }
        // 拷贝合并的单元格
        for (i = 0; i < sheet.getNumMergedRegions(); i++) {
            region = sheet.getMergedRegion(i);
            if ((region.getFirstRow() >= pStartRow)
                    && (region.getLastRow() <= pEndRow)) {
                targetRowFrom = region.getFirstRow() - pStartRow + pPosition;
                targetRowTo = region.getLastRow() - pStartRow + pPosition;
                CellRangeAddress newRegion = region.copy();
                newRegion.setFirstRow(targetRowFrom);
                newRegion.setFirstColumn(region.getFirstColumn());
                newRegion.setLastRow(targetRowTo);
                newRegion.setLastColumn(region.getLastColumn());
                sheet.addMergedRegion(newRegion);
            }
        }
        // 设置列宽
        for (i = pStartRow; i <= pEndRow; i++) {
            Row sourceRow = sheet.getRow(i);
            columnCount = sourceRow.getLastCellNum();
            if (sourceRow != null) {
                Row newRow = sheet.createRow(pPosition - pStartRow + i);
                newRow.setHeight(sourceRow.getHeight());
                for (j = 0; j < columnCount; j++) {
                    Cell templateCell = sourceRow.getCell(j);
                    if (templateCell != null) {
                        Cell newCell = newRow.createCell(j);
                        copyCell(templateCell, newCell);
                    }
                }
            }
        }
    }

    /**
     * 功能:copy cell,不copy值
     */
    private static void copyCell(Cell srcCell, Cell distCell) {
        distCell.setCellStyle(srcCell.getCellStyle());
        if (srcCell.getCellComment() != null) {
            distCell.setCellComment(srcCell.getCellComment());
        }
        int srcCellType = srcCell.getCellType();
        distCell.setCellType(srcCellType);
    }

    /**
     * 描述:临时单元格数据
     */
    static class TempCell {
        private int row;
        private int column;
        private CellStyle cellStyle;
        private Object data;
        /**
         * 用于列表合并,表示几列合并
         */
        private int columnSize = -1;

        public int getColumn() {
            return column;
        }

        public void setColumn(int column) {
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public CellStyle getCellStyle() {
            return cellStyle;
        }

        public void setCellStyle(CellStyle cellStyle) {
            this.cellStyle = cellStyle;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public int getColumnSize() {
            return columnSize;
        }

        public void setColumnSize(int columnSize) {
            this.columnSize = columnSize;
        }
    }

}

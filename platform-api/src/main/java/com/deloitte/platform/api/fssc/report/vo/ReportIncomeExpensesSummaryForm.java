package com.deloitte.platform.api.fssc.report.vo;
import com.deloitte.platform.common.core.entity.form.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.sql.Blob;

/**
 * @Author : jaws
 * @Date : Create in 2019-06-12
 * @Description : ReportIncomeExpensesSummary新增修改form对象
 * @Modified :
 */
@ApiModel("新增ReportIncomeExpensesSummary表单")
@Data
public class ReportIncomeExpensesSummaryForm extends BaseForm {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "报表名称")
    private String name;

    @ApiModelProperty(value = "年份")
    private String year;

    @ApiModelProperty(value = "单位ID")
    private Long unitId;

    @ApiModelProperty(value = "单位编码")
    private String unitCode;

    @ApiModelProperty(value = "收入_一般公共预算拨款收入")
    private BigDecimal incomeItem1;

    @ApiModelProperty(value = "政府性基金预算拨款收入")
    private BigDecimal incomeItem2;

    @ApiModelProperty(value = "事业收入")
    private BigDecimal incomeItem3;

    @ApiModelProperty(value = "事业单位经营收入")
    private BigDecimal incomeItem4;

    @ApiModelProperty(value = "其他收入")
    private BigDecimal incomeItem5;

    @ApiModelProperty(value = "本年收入合计")
    private BigDecimal incomeItem6;

    @ApiModelProperty(value = "用事业基金弥补收支差额")
    private BigDecimal incomeItem7;

    @ApiModelProperty(value = "用事业基金弥补收支差额1")
    private BigDecimal incomeItem8;

    @ApiModelProperty(value = "收入总计")
    private BigDecimal incomeItem9;

    @ApiModelProperty(value = "支出-科学技术支出")
    private BigDecimal expenseItem1;

    @ApiModelProperty(value = "支出-住房保障支出")
    private BigDecimal expenseItem2;

    @ApiModelProperty(value = "支出-本年支出合计")
    private BigDecimal expenseItem3;

    @ApiModelProperty(value = "支出-结转下年")
    private BigDecimal expenseItem4;

    @ApiModelProperty(value = "支出总计")
    private BigDecimal expenseItem5;

    @ApiModelProperty(value = "报表状态")
    private String status;

    @ApiModelProperty(value = "周期类型(Y:年度，M:月)")
    private String periodType;

    @ApiModelProperty(value = "属性1")
    private String ext1;

    @ApiModelProperty(value = "属性2")
    private String ext2;

    @ApiModelProperty(value = "属性3")
    private String ext3;

    @ApiModelProperty(value = "属性4")
    private String ext4;

    @ApiModelProperty(value = "属性5")
    private String ext5;

    @ApiModelProperty(value = "月份")
    private String month;

    @ApiModelProperty(value = "是否多个单位合并")
    private String mergeFlag;

}
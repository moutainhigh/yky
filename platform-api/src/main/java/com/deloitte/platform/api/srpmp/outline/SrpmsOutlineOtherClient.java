package com.deloitte.platform.api.srpmp.outline;

import com.deloitte.platform.api.isump.vo.DeptVo;
import com.deloitte.platform.api.isump.vo.UserVo;
import com.deloitte.platform.api.srpmp.outline.param.SrpmsOutlineOtherQueryForm;
import com.deloitte.platform.api.srpmp.outline.vo.SrpmsOutlineOtherFormList;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @Author : Apeng
 * @Date : Create in 2019-02-26
 * @Description :  SrpmsOutlineOther控制器接口
 * @Modified :
 */
public interface SrpmsOutlineOtherClient {

    public static final String path="/srpmp/srpms-outline/other";

    /**
     * GET----其他查询
     *
     * @param queryForm
     * @return
     */
    @CrossOrigin
    @GetMapping(value = path)
    Result searchSrpmsOutline(HttpServletRequest request, @Valid @ModelAttribute SrpmsOutlineOtherQueryForm queryForm, UserVo user, DeptVo dept);

    /**
     * POST---新增
     *
     * @param data
     * @return
     */
    @CrossOrigin
    @PostMapping(value = path)
    Result saveSrpmsOutline(@Valid @ModelAttribute SrpmsOutlineOtherFormList data, UserVo user);

    /**
     * POST---读取excel
     *
     * @param file
     * @return
     */
    @CrossOrigin
    @PostMapping(value = path + "/file")
    Result readExeclFile(MultipartFile file);

    /**
     *导出基础数据功能
     *
     * @param response
     * @param queryForm
     * @return
     */
    @CrossOrigin
    @GetMapping(value = path+"/export/file")
    Result exportExeclFile(HttpServletRequest request, HttpServletResponse response, @Valid @ModelAttribute SrpmsOutlineOtherQueryForm queryForm, UserVo user, DeptVo dept);
}

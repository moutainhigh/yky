package com.deloitte.platform.api.srpmp.project.task;

import com.deloitte.platform.api.isump.vo.DeptVo;
import com.deloitte.platform.api.isump.vo.UserVo;
import com.deloitte.platform.api.srpmp.project.apply.vo.ext.SrpmsProjectApplySchStuSaveVo;
import com.deloitte.platform.api.srpmp.project.base.vo.ext.WordImportReqVo;
import com.deloitte.platform.api.srpmp.project.task.vo.SrpmsProjectTaskSchStudentForm;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @Author : Apeng
 * @Date : Create in 2019-03-14
 * @Description :  SrpmsProjectTaskSchStudent控制器接口
 * @Modified :
 */
public interface SrpmsProjectTaskSchStudentClient {

    public static final String path="/srpmp/project/task/student";

    /**
     *  GET----根据ID获取
     * @param  id
     * @return
     */
    @GetMapping(value = path+"/{id}")
    Result get(@PathVariable(value = "id") long id);

    /**
     * POST---保存
     *
     * @param taskForm
     * @return
     */
    @PostMapping(value = path)
    Result save(@ModelAttribute SrpmsProjectTaskSchStudentForm taskForm);

    /**
     *  POST---提交
     * @param taskForm
     * @return
     */
    @PostMapping(value = path+"/submit")
    Result submit(@Valid @ModelAttribute SrpmsProjectTaskSchStudentForm taskForm, UserVo userVo, DeptVo deptVo);



    /**
     *  导出----根据ID获取
     * @param  id
     * @return
     */
    @GetMapping(value = path+"/export/{id}")
    Result export(@PathVariable(value="id") long id, HttpServletRequest request, HttpServletResponse response, UserVo userVo, DeptVo deptVo);


    /**
     *  导出----根据ID获取
     * @param  id
     * @return
     */
    @GetMapping(value = path+"/exportpdf/{id}")
    Result exportPdf(@PathVariable(value="id") long id, HttpServletRequest request, HttpServletResponse response, UserVo userVo, DeptVo deptVo);


    /**
     * 导入模板
     */
    @PostMapping(value = path+"/import")
    Result<SrpmsProjectTaskSchStudentForm> importWord(@Valid @ModelAttribute WordImportReqVo reqVo);

}

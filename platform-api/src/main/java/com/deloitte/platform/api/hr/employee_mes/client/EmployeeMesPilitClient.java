package com.deloitte.platform.api.hr.employee_mes.client;

import com.deloitte.platform.api.hr.employee_mes.param.EmployeeMesPilitQueryForm;
import com.deloitte.platform.api.hr.employee_mes.vo.EmployeeMesPilitForm;
import com.deloitte.platform.api.hr.employee_mes.vo.EmployeeMesPilitVo;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * @Author : ZhongJiang
 * @Date : Create in 2019-05-08
 * @Description :  EmployeeMesPilit控制器接口
 * @Modified :
 */
public interface EmployeeMesPilitClient {

    public static final String path="/hr/employee-mes-pilit";


    /**
     *  POST---新增
     * @param employeeMesPilitForm
     * @return
     */
    @PostMapping(value = path)
    Result add(@Valid @ModelAttribute EmployeeMesPilitForm employeeMesPilitForm);

    /**
    *  Delete---删除
    * @param  id
    * @return
    */
    @DeleteMapping(value = path+"/{id}")
    Result delete(@PathVariable(value = "id") long id);

    /**
     *  Patch----部分更新
     * @param  id, employeeMesPilitForm
     * @return
     */
    @PatchMapping(value = path+"/{id}")
    Result update(@PathVariable(value = "id") long id, @Valid @RequestBody EmployeeMesPilitForm employeeMesPilitForm);

    /**
    *  GET----根据ID获取
    * @param  id
    * @return
    */
    @GetMapping(value = path+"/{id}")
    Result<EmployeeMesPilitVo> get(@PathVariable(value = "id") long id);


    /**
     *  POST----列表查询
     * @param   employeeMesPilitQueryForm
     * @return
     */
    @PostMapping(value = path+"/list/conditions")
    Result<List<EmployeeMesPilitVo>> list(@Valid @RequestBody EmployeeMesPilitQueryForm employeeMesPilitQueryForm);


    /**
     *  POST----复杂查询
     * @param  employeeMesPilitQueryForm
     * @return
     */
    @PostMapping(value = path+"/page/conditions")
    Result<IPage<EmployeeMesPilitVo>> search(@Valid @RequestBody EmployeeMesPilitQueryForm employeeMesPilitQueryForm);
}

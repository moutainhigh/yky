package com.deloitte.platform.api.hr.employee.client;

import com.deloitte.platform.api.hr.employee.param.IncomeproveApplyQueryForm;
import com.deloitte.platform.api.hr.employee.vo.IncomeproveApplyForm;
import com.deloitte.platform.api.hr.employee.vo.IncomeproveApplyVo;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * @Author : ZhongJiang
 * @Date : Create in 2019-04-08
 * @Description :  IncomeproveApply控制器接口
 * @Modified :
 */
public interface IncomeproveApplyClient {

    public static final String path="/hr/incomeprove-apply";


    /**
     *  POST---新增
     * @param incomeproveApplyForm
     * @return
     */
    @PostMapping(value = path)
    Result add(@Valid @ModelAttribute IncomeproveApplyForm incomeproveApplyForm);

    /**
    *  Delete---删除
    * @param  id
    * @return
    */
    @DeleteMapping(value = path+"/{id}")
    Result delete(@PathVariable(value = "id") long id);

    /**
     *  Patch----部分更新
     * @param  id, incomeproveApplyForm
     * @return
     */
    @PatchMapping(value = path+"/{id}")
    Result update(@PathVariable(value = "id") long id, @Valid @RequestBody IncomeproveApplyForm incomeproveApplyForm);

    /**
    *  GET----根据ID获取
    * @param  id
    * @return
    */
    @GetMapping(value = path+"/{id}")
    Result<IncomeproveApplyVo> get(@PathVariable(value = "id") long id);


    /**
     *  POST----列表查询
     * @param   incomeproveApplyQueryForm
     * @return
     */
    @PostMapping(value = path+"/list/conditions")
    Result<List<IncomeproveApplyVo>> list(@Valid @RequestBody IncomeproveApplyQueryForm incomeproveApplyQueryForm);


    /**
     *  POST----复杂查询
     * @param  incomeproveApplyQueryForm
     * @return
     */
    @PostMapping(value = path+"/page/conditions")
    Result<IPage<IncomeproveApplyVo>> search(@Valid @RequestBody IncomeproveApplyQueryForm incomeproveApplyQueryForm);
}

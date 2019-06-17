package com.deloitte.platform.api.hr.employee.client;

import com.deloitte.platform.api.hr.employee.param.TeacherdisApplyQueryForm;
import com.deloitte.platform.api.hr.employee.vo.TeacherdisApplyForm;
import com.deloitte.platform.api.hr.employee.vo.TeacherdisApplyVo;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * @Author : woo
 * @Date : Create in 2019-05-18
 * @Description :  TeacherdisApply控制器接口
 * @Modified :
 */
public interface TeacherdisApplyClient {

    public static final String path="/hr/teacherdis-apply";


    /**
     *  POST---新增
     * @param teacherdisApplyForm
     * @return
     */
    @PostMapping(value = path)
    Result add(@Valid @ModelAttribute TeacherdisApplyForm teacherdisApplyForm);

    /**
    *  Delete---删除
    * @param  id
    * @return
    */
    @DeleteMapping(value = path+"/{id}")
    Result delete(@PathVariable(value = "id") long id);

    /**
     *  Patch----部分更新
     * @param  id, teacherdisApplyForm
     * @return
     */
    @PatchMapping(value = path+"/{id}")
    Result update(@PathVariable(value = "id") long id, @Valid @RequestBody TeacherdisApplyForm teacherdisApplyForm);

    /**
    *  GET----根据ID获取
    * @param  id
    * @return
    */
    @GetMapping(value = path+"/{id}")
    Result<TeacherdisApplyVo> get(@PathVariable(value = "id") long id);


    /**
     *  POST----列表查询
     * @param   teacherdisApplyQueryForm
     * @return
     */
    @PostMapping(value = path+"/list/conditions")
    Result<List<TeacherdisApplyVo>> list(@Valid @RequestBody TeacherdisApplyQueryForm teacherdisApplyQueryForm);


    /**
     *  POST----复杂查询
     * @param  teacherdisApplyQueryForm
     * @return
     */
    @PostMapping(value = path+"/page/conditions")
    Result<IPage<TeacherdisApplyVo>> search(@Valid @RequestBody TeacherdisApplyQueryForm teacherdisApplyQueryForm);
}

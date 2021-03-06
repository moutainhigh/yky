package com.deloitte.platform.api.hr.registrationResultEnquiry.client;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.deloitte.platform.api.hr.registrationResultEnquiry.param.HrWorkExperienceQueryForm;
import com.deloitte.platform.api.hr.registrationResultEnquiry.vo.HrWorkExperienceForm;
import com.deloitte.platform.api.hr.registrationResultEnquiry.vo.HrWorkExperienceVo;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author : zengshuai
 * @Date : Create in 2019-04-04
 * @Description :  HrWorkExperience控制器接口
 * @Modified :
 */
public interface HrWorkExperienceClient {

    public static final String path="/hr/registrationResultEnquiry/hr-work-experience";


    /**
     *  POST---新增
     * @param hrWorkExperienceForm
     * @return
     */
    @PostMapping(value = path)
    Result add(@Valid @ModelAttribute HrWorkExperienceForm hrWorkExperienceForm);

    /**
    *  Delete---删除
    * @param  id
    * @return
    */
    @DeleteMapping(value = path+"/{id}")
    Result delete(@PathVariable(value = "id") long id);

    /**
     *  Patch----部分更新
     * @param  id, hrWorkExperienceForm
     * @return
     */
    @PatchMapping(value = path+"/{id}")
    Result update(@PathVariable(value = "id") long id, @Valid @RequestBody HrWorkExperienceForm hrWorkExperienceForm);

    /**
    *  GET----根据ID获取
    * @param  id
    * @return
    */
    @GetMapping(value = path+"/{id}")
    Result<HrWorkExperienceVo> get(@PathVariable(value = "id") long id);


    /**
     *  POST----列表查询
     * @param   hrWorkExperienceQueryForm
     * @return
     */
    @PostMapping(value = path+"/list/conditions")
    Result<List<HrWorkExperienceVo>> list(@Valid @RequestBody HrWorkExperienceQueryForm hrWorkExperienceQueryForm);


    /**
     *  POST----复杂查询
     * @param  hrWorkExperienceQueryForm
     * @return
     */
    @PostMapping(value = path+"/page/conditions")
    Result<IPage<HrWorkExperienceVo>> search(@Valid @RequestBody HrWorkExperienceQueryForm hrWorkExperienceQueryForm);
}

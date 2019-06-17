package com.deloitte.platform.api.hr.recruitment.client;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.deloitte.platform.api.hr.recruitment.param.ZpcpExperienceQueryForm;
import com.deloitte.platform.api.hr.recruitment.vo.DeleteForm;
import com.deloitte.platform.api.hr.recruitment.vo.ZpcpExperienceForm;
import com.deloitte.platform.api.hr.recruitment.vo.ZpcpExperienceVo;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author : tankui
 * @Date : Create in 2019-04-23
 * @Description :  ZpcpExperience控制器接口
 * @Modified :
 */
public interface ZpcpExperienceClient {

    public static final String path="/hr/zpcp-experience";


    /**
     *  POST---新增
     * @param zpcpExperienceForm
     * @return
     */
    @PostMapping(value = path)
    Result add(@Valid @ModelAttribute ZpcpExperienceForm zpcpExperienceForm);

    /**
    *  Delete---删除
    * @param  id
    * @return
    */
    @DeleteMapping(value = path+"/{id}")
    Result delete(@PathVariable(value = "id") long id);

    /**
     *  Patch----部分更新
     * @param  id, zpcpExperienceForm
     * @return
     */
    @PatchMapping(value = path+"/{id}")
    Result update(@PathVariable(value = "id") long id, @Valid @RequestBody ZpcpExperienceForm zpcpExperienceForm);

    /**
    *  GET----根据ID获取
    * @param  id
    * @return
    */
    @GetMapping(value = path+"/{id}")
    Result<ZpcpExperienceVo> get(@PathVariable(value = "id") long id);


    /**
     *  POST----列表查询
     * @param   zpcpExperienceQueryForm
     * @return
     */
    @PostMapping(value = path+"/list/conditions")
    Result<List<ZpcpExperienceVo>> list(@Valid @RequestBody ZpcpExperienceQueryForm zpcpExperienceQueryForm);


    /**
     *  POST----复杂查询
     * @param  zpcpExperienceQueryForm
     * @return
     */
    @PostMapping(value = path+"/page/conditions")
    Result<IPage<ZpcpExperienceVo>> search(@Valid @RequestBody ZpcpExperienceQueryForm zpcpExperienceQueryForm);

    /**
     *  POST---批量新增或更新
     * @param experienceForms
     * @return
     */
    @PostMapping(value = path+"/addOrUpdateList")
    Result addOrUpdateList(@Valid @RequestBody List<ZpcpExperienceForm> experienceForms);

    /**
     * 批量删除
     * @param deleteForm
     * @return
     */
    @PostMapping(value = path+"/deleteList")
    public Result deleteList(@Valid @RequestBody DeleteForm deleteForm);

}

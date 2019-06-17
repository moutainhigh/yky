package com.deloitte.platform.api.hr.recruitment.client;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.deloitte.platform.api.hr.recruitment.param.ZpcpSocialPerformanceQueryForm;
import com.deloitte.platform.api.hr.recruitment.vo.DeleteForm;
import com.deloitte.platform.api.hr.recruitment.vo.ZpcpSocialPerformanceForm;
import com.deloitte.platform.api.hr.recruitment.vo.ZpcpSocialPerformanceVo;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author : tankui
 * @Date : Create in 2019-04-23
 * @Description :  ZpcpSocialPerformance控制器接口
 * @Modified :
 */
public interface ZpcpSocialPerformanceClient {

    public static final String path="/hr/zpcp-social-performance";


    /**
     *  POST---新增
     * @param zpcpSocialPerformanceForm
     * @return
     */
    @PostMapping(value = path)
    Result add(@Valid @ModelAttribute ZpcpSocialPerformanceForm zpcpSocialPerformanceForm);

    /**
    *  Delete---删除
    * @param  id
    * @return
    */
    @DeleteMapping(value = path+"/{id}")
    Result delete(@PathVariable(value = "id") long id);

    /**
     *  Patch----部分更新
     * @param  id, zpcpSocialPerformanceForm
     * @return
     */
    @PatchMapping(value = path+"/{id}")
    Result update(@PathVariable(value = "id") long id, @Valid @RequestBody ZpcpSocialPerformanceForm zpcpSocialPerformanceForm);

    /**
    *  GET----根据ID获取
    * @param  id
    * @return
    */
    @GetMapping(value = path+"/{id}")
    Result<ZpcpSocialPerformanceVo> get(@PathVariable(value = "id") long id);


    /**
     *  POST----列表查询
     * @param   zpcpSocialPerformanceQueryForm
     * @return
     */
    @PostMapping(value = path+"/list/conditions")
    Result<List<ZpcpSocialPerformanceVo>> list(@Valid @RequestBody ZpcpSocialPerformanceQueryForm zpcpSocialPerformanceQueryForm);


    /**
     *  POST----复杂查询
     * @param  zpcpSocialPerformanceQueryForm
     * @return
     */
    @PostMapping(value = path+"/page/conditions")
    Result<IPage<ZpcpSocialPerformanceVo>> search(@Valid @RequestBody ZpcpSocialPerformanceQueryForm zpcpSocialPerformanceQueryForm);

    /**
     *  POST---批量新增或更新
     * @param socialPerformanceForms
     * @return
     */
    @PostMapping(value = path+"/addOrUpdateList")
    Result addOrUpdateList(@Valid @RequestBody List<ZpcpSocialPerformanceForm> socialPerformanceForms);


    /**
     * 批量删除
     * @param deleteForm
     * @return
     */
    @PostMapping(value = path+"/deleteList")
    public Result deleteList(@Valid @RequestBody DeleteForm deleteForm);

}

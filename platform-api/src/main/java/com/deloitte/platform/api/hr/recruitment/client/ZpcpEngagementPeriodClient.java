package com.deloitte.platform.api.hr.recruitment.client;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.deloitte.platform.api.hr.recruitment.param.ZpcpEngagementPeriodQueryForm;
import com.deloitte.platform.api.hr.recruitment.vo.DeleteForm;
import com.deloitte.platform.api.hr.recruitment.vo.ZpcpEngagementPeriodForm;
import com.deloitte.platform.api.hr.recruitment.vo.ZpcpEngagementPeriodVo;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * @Author : tankui
 * @Date : Create in 2019-04-23
 * @Description :  ZpcpEngagementPeriod控制器接口
 * @Modified :
 */
public interface ZpcpEngagementPeriodClient {

    public static final String path="/hr/zpcp-engagement-period";


    /**
     *  POST---新增
     * @param zpcpEngagementPeriodForm
     * @return
     */
    @PostMapping(value = path)
    Result add(@Valid @ModelAttribute ZpcpEngagementPeriodForm zpcpEngagementPeriodForm);

    /**
    *  Delete---删除
    * @param  id
    * @return
    */
    @DeleteMapping(value = path+"/{id}")
    Result delete(@PathVariable(value = "id") long id);

    /**
     *  Patch----部分更新
     * @param  id, zpcpEngagementPeriodForm
     * @return
     */
    @PatchMapping(value = path+"/{id}")
    Result update(@PathVariable(value = "id") long id, @Valid @RequestBody ZpcpEngagementPeriodForm zpcpEngagementPeriodForm);

    /**
    *  GET----根据ID获取
    * @param  id
    * @return
    */
    @GetMapping(value = path+"/{id}")
    Result<ZpcpEngagementPeriodVo> get(@PathVariable(value = "id") long id);


    /**
     *  POST----列表查询
     * @param   zpcpEngagementPeriodQueryForm
     * @return
     */
    @PostMapping(value = path+"/list/conditions")
    Result<List<ZpcpEngagementPeriodVo>> list(@Valid @RequestBody ZpcpEngagementPeriodQueryForm zpcpEngagementPeriodQueryForm);


    /**
     *  POST----复杂查询
     * @param  zpcpEngagementPeriodQueryForm
     * @return
     */
    @PostMapping(value = path+"/page/conditions")
    Result<IPage<ZpcpEngagementPeriodVo>> search(@Valid @RequestBody ZpcpEngagementPeriodQueryForm zpcpEngagementPeriodQueryForm);


    /**
     * 批量删除
     * @param deleteForm
     * @return
     */
    @PostMapping(value = path+"/deleteList")
    public Result deleteList(@Valid @RequestBody DeleteForm deleteForm);

    /**
     * GET----聘任审核时根据条件导出列表
     *
     * @param queryForm
     * @return
     */
    @GetMapping(value = path+"/exportEngagementPeriodList")
    Result exportEngagementPeriodList(@Valid @ModelAttribute ZpcpEngagementPeriodQueryForm queryForm, HttpServletRequest request, HttpServletResponse response);

}

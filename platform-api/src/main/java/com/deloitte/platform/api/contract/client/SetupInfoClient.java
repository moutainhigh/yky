package com.deloitte.platform.api.contract.client;

import com.deloitte.platform.api.contract.param.SetupInfoQueryForm;
import com.deloitte.platform.api.contract.vo.SetupInfoForm;
import com.deloitte.platform.api.contract.vo.SetupInfoVo;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * @Author : hemingzheng
 * @Date : Create in 2019-04-13
 * @Description :  SetupInfo控制器接口
 * @Modified :
 */
public interface SetupInfoClient {

    public static final String path="/contract/setup-info";


    /**
     *  POST---新增
     * @param setupInfoForm
     * @return
     */
    @PostMapping(value = path)
    Result add(@Valid @ModelAttribute SetupInfoForm setupInfoForm);

    /**
    *  Delete---删除
    * @param  id
    * @return
    */
    @DeleteMapping(value = path+"/{id}")
    Result delete(@PathVariable(value="id") long id);

    /**
     *  Patch----部分更新
     * @param  id, setupInfoForm
     * @return
     */
    @PatchMapping(value = path+"/{id}")
    Result update(@PathVariable(value="id") long id, @Valid @RequestBody SetupInfoForm setupInfoForm);

    /**
    *  GET----根据ID获取
    * @param  id
    * @return
    */
    @GetMapping(value = path+"/{id}")
    Result<SetupInfoVo> get(@PathVariable(value="id") long id);


    /**
     *  POST----列表查询
     * @param   setupInfoQueryForm
     * @return
     */
    @PostMapping(value = path+"/list/conditions")
    Result<List<SetupInfoVo>> list(@Valid @RequestBody SetupInfoQueryForm setupInfoQueryForm);


    /**
     *  POST----复杂查询
     * @param  setupInfoQueryForm
     * @return
     */
    @PostMapping(value = path+"/page/conditions")
    Result<IPage<SetupInfoVo>> search(@Valid @RequestBody SetupInfoQueryForm setupInfoQueryForm);
}

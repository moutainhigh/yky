package com.deloitte.platform.api.project.client;

import com.deloitte.platform.api.project.param.ActBakQueryForm;
import com.deloitte.platform.api.project.vo.ActBakForm;
import com.deloitte.platform.api.project.vo.ActBakVo;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * @Author : zhengchun
 * @Date : Create in 2019-05-14
 * @Description :  ActBak控制器接口
 * @Modified :
 */
public interface ActBakClient {

    public static final String path="/project/act-bak";


    /**
     *  POST---新增
     * @param actBakForm
     * @return
     */
    @PostMapping(value = path)
    Result add(@Valid @ModelAttribute ActBakForm actBakForm);

    /**
    *  Delete---删除
    * @param  id
    * @return
    */
    @DeleteMapping(value = path+"/{id}")
    Result delete(@PathVariable(value = "id") long id);

    /**
     *  Patch----部分更新
     * @param  id, actBakForm
     * @return
     */
    @PatchMapping(value = path+"/{id}")
    Result update(@PathVariable(value = "id") long id, @Valid @RequestBody ActBakForm actBakForm);

    /**
    *  GET----根据ID获取
    * @param  id
    * @return
    */
    @GetMapping(value = path+"/{id}")
    Result<ActBakVo> get(@PathVariable(value = "id") long id);


    /**
     *  POST----列表查询
     * @param   actBakQueryForm
     * @return
     */
    @PostMapping(value = path+"/list/conditions")
    Result<List<ActBakVo>> list(@Valid @RequestBody ActBakQueryForm actBakQueryForm);


    /**
     *  POST----复杂查询
     * @param  actBakQueryForm
     * @return
     */
    @PostMapping(value = path+"/page/conditions")
    Result<IPage<ActBakVo>> search(@Valid @RequestBody ActBakQueryForm actBakQueryForm);
}

package com.deloitte.platform.api.bpmservice.clinet;

import com.deloitte.platform.api.bpmservice.param.BpmPositionQueryForm;
import com.deloitte.platform.api.bpmservice.vo.BpmPositionForm;
import com.deloitte.platform.api.bpmservice.vo.BpmPositionVo;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * @Author : jackliu
 * @Date : Create in 2019-02-18
 * @Description :  BpmPosition控制器接口
 * @Modified :
 */
public interface BpmPositionClient {

    public static final String path="/bpmservice/bpm-position";


    /**
     *  POST---新增
     * @param bpmPositionForm
     * @return
     */
    @PostMapping(value = path)
    Result add(@Valid @ModelAttribute BpmPositionForm bpmPositionForm);

    /**
    *  Delete---删除
    * @param  id
    * @return
    */
    @DeleteMapping(value = path+"/{id}")
    Result delete(@PathVariable(value="id") long id);

    /**
     *  Patch----部分更新
     * @param  id, bpmPositionForm
     * @return
     */
    @PatchMapping(value = path+"/{id}")
    Result update(@PathVariable(value="id") long id, @Valid @RequestBody BpmPositionForm bpmPositionForm);

    /**
    *  GET----根据ID获取
    * @param  id
    * @return
    */
    @GetMapping(value = path+"/{id}")
    Result<BpmPositionVo> get(@PathVariable(value="id") long id);


    /**
     *  POST----列表查询
     * @param   bpmPositionForm
     * @return
     */
    @PostMapping(value = path+"/list/conditions")
    Result<List<BpmPositionVo>> list(@Valid @RequestBody BpmPositionQueryForm bpmPositionQueryForm);


    /**
     *  POST----复杂查询
     * @param  bpmPositionQueryForm
     * @return
     */
    @PostMapping(value = path+"/page/conditions")
    Result<IPage<BpmPositionVo>> search(@Valid @RequestBody BpmPositionQueryForm bpmPositionQueryForm);
}

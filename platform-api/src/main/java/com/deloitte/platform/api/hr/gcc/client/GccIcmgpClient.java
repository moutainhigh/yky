package com.deloitte.platform.api.hr.gcc.client;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.deloitte.platform.api.hr.gcc.param.GccBaseBatchForm;
import com.deloitte.platform.api.hr.gcc.param.GccIcmgpQueryForm;
import com.deloitte.platform.api.hr.gcc.vo.GccIcmgpForm;
import com.deloitte.platform.api.hr.gcc.vo.GccIcmgpVo;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author : jianglong
 * @Date : Create in 2019-04-01
 * @Description :  GccIcmgp控制器接口
 * @Modified :
 */
public interface GccIcmgpClient {

    public static final String path="/hr/gcc-icmgp";


    /**
     *  POST---新增
     * @param gccIcmgpForm
     * @return
     */
    @PostMapping(value = path)
    Result add(@Valid @ModelAttribute GccIcmgpForm gccIcmgpForm);

    /**
    *  Delete---删除
    * @param  id
    * @return
    */
    @DeleteMapping(value = path+"/{id}")
    Result delete(@PathVariable(value = "id") long id);

    /**
     *  Patch----部分更新
     * @param  id, gccIcmgpForm
     * @return
     */
    @PatchMapping(value = path+"/{id}")
    Result update(@PathVariable(value = "id") long id, @Valid @RequestBody GccIcmgpForm gccIcmgpForm);

    /**
    *  GET----根据ID获取
    * @param  id
    * @return
    */
    @GetMapping(value = path+"/{id}")
    Result<GccIcmgpVo> get(@PathVariable(value = "id") long id);


    /**
     *  POST----列表查询
     * @param   gccIcmgpQueryForm
     * @return
     */
    @PostMapping(value = path+"/list/conditions")
    Result<List<GccIcmgpVo>> list(@Valid @RequestBody GccIcmgpQueryForm gccIcmgpQueryForm);


    /**
     *  POST----复杂查询
     * @param  gccIcmgpQueryForm
     * @return
     */
    @PostMapping(value = path+"/page/conditions")
    Result<IPage<GccIcmgpVo>> search(@Valid @RequestBody GccIcmgpQueryForm gccIcmgpQueryForm);

    /**
     *  POST---批量新增或更新
     * @param gccIcmgpForms
     * @return
     */
    @PostMapping(value = path+"/addOrUpdateList")
    Result addOrUpdateList(@Valid @RequestBody List<GccIcmgpForm> gccIcmgpForms);

    /**
     * 批量删除
     * @param form
     * @return
     */
    @PostMapping(value = path+"/deleteList")
    Result deleteList(@Valid @RequestBody GccBaseBatchForm form);
}
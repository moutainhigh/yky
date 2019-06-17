package com.deloitte.platform.api.hr.vacation.client;

import com.deloitte.platform.api.hr.vacation.param.VacationTrainQueryForm;
import com.deloitte.platform.api.hr.vacation.vo.VacationTrainForm;
import com.deloitte.platform.api.hr.vacation.vo.VacationTrainVo;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * @Author : ZhongJiang
 * @Date : Create in 2019-04-01
 * @Description :  VacationTrain控制器接口
 * @Modified :
 */
public interface VacationTrainClient {

    public static final String path="/hr/vacation-train";


    /**
     *  POST---新增
     * @param vacationTrainForm
     * @return
     */
    @PostMapping(value = path)
    Result add(@Valid @ModelAttribute VacationTrainForm vacationTrainForm);

    /**
    *  Delete---删除
    * @param  id
    * @return
    */
    @DeleteMapping(value = path+"/{id}")
    Result delete(@PathVariable(value = "id") long id);

    /**
     *  Patch----部分更新
     * @param  id, vacationTrainForm
     * @return
     */
    @PatchMapping(value = path+"/{id}")
    Result update(@PathVariable(value = "id") long id, @Valid @RequestBody VacationTrainForm vacationTrainForm);

    /**
    *  GET----根据ID获取
    * @param  id
    * @return
    */
    @GetMapping(value = path+"/{id}")
    Result<VacationTrainVo> get(@PathVariable(value = "id") long id);

    /**
     *  POST----列表查询
     * @param   vacationTrainQueryForm
     * @return
     */
    @PostMapping(value = path+"/list/conditions")
    Result<List<VacationTrainVo>> list(@Valid @RequestBody VacationTrainQueryForm vacationTrainQueryForm);


    /**
     *  POST----复杂查询
     * @param  vacationTrainQueryForm
     * @return
     */
    @PostMapping(value = path+"/page/conditions")
    Result<IPage<VacationTrainVo>> search(@Valid @RequestBody VacationTrainQueryForm vacationTrainQueryForm);
}

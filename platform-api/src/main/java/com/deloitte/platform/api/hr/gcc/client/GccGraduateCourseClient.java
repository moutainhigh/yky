package com.deloitte.platform.api.hr.gcc.client;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.deloitte.platform.api.hr.gcc.param.GccBaseBatchForm;
import com.deloitte.platform.api.hr.gcc.param.GccGraduateCourseQueryForm;
import com.deloitte.platform.api.hr.gcc.vo.GccGraduateCourseForm;
import com.deloitte.platform.api.hr.gcc.vo.GccGraduateCourseVo;
import com.deloitte.platform.common.core.entity.vo.Result;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author : jianglong
 * @Date : Create in 2019-04-01
 * @Description :  GccGraduateCourse控制器接口
 * @Modified :
 */
public interface GccGraduateCourseClient {

    public static final String path="/hr/gcc-graduate-course";


    /**
     *  POST---新增
     * @param gccGraduateCourseForm
     * @return
     */
    @PostMapping(value = path)
    Result add(@Valid @ModelAttribute GccGraduateCourseForm gccGraduateCourseForm);

    /**
    *  Delete---删除
    * @param  id
    * @return
    */
    @DeleteMapping(value = path+"/{id}")
    Result delete(@PathVariable(value = "id") long id);

    /**
     *  Patch----部分更新
     * @param  id, gccGraduateCourseForm
     * @return
     */
    @PatchMapping(value = path+"/{id}")
    Result update(@PathVariable(value = "id") long id, @Valid @RequestBody GccGraduateCourseForm gccGraduateCourseForm);

    /**
    *  GET----根据ID获取
    * @param  id
    * @return
    */
    @GetMapping(value = path+"/{id}")
    Result<GccGraduateCourseVo> get(@PathVariable(value = "id") long id);


    /**
     *  POST----列表查询
     * @param   gccGraduateCourseQueryForm
     * @return
     */
    @PostMapping(value = path+"/list/conditions")
    Result<List<GccGraduateCourseVo>> list(@Valid @RequestBody GccGraduateCourseQueryForm gccGraduateCourseQueryForm);


    /**
     *  POST----复杂查询
     * @param  gccGraduateCourseQueryForm
     * @return
     */
    @PostMapping(value = path+"/page/conditions")
    Result<IPage<GccGraduateCourseVo>> search(@Valid @RequestBody GccGraduateCourseQueryForm gccGraduateCourseQueryForm);


    /**
     *  POST---批量新增或更新
     * @param gccGraduateCourseForms
     * @return
     */
    @PostMapping(value = path+"/addOrUpdateList")
    Result addOrUpdateList(@Valid @RequestBody List<GccGraduateCourseForm> gccGraduateCourseForms);

    /**
     * 批量删除
     * @param form
     * @return
     */
    @PostMapping(value = path+"/deleteList")
    Result deleteList(@Valid @RequestBody GccBaseBatchForm form);
}

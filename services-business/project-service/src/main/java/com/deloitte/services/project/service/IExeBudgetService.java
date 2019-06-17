package com.deloitte.services.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;

import com.deloitte.platform.api.project.param.ExeBudgetQueryForm;
import com.deloitte.services.project.entity.ExeBudget;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Author : zhengchun
 * @Date : Create in 2019-05-20
 * @Description : ExeBudget服务类接口
 * @Modified :
 */
public interface IExeBudgetService extends IService<ExeBudget> {

    /**
     *  分页查询
     * @param queryForm
     * @return IPage<ExeBudget>
     */
    IPage<ExeBudget> selectPage(ExeBudgetQueryForm queryForm);

    /**
     *  条件查询
     * @param queryForm
     * @return List<ExeBudget>
     */
    List<ExeBudget> selectList(ExeBudgetQueryForm queryForm);
}

package com.deloitte.services.dss.scientific.mapper;

import com.deloitte.platform.api.dss.scientific.vo.TalentStructureDistributionMapVo;

import java.util.List;

/**
 * @interfaceName: TalentStructureDistributionMapMapper
 * @Description:
 * @Auther: wangyanyun
 * @Date: 2019-03-11
 * @version: v1.0
 */
public interface TalentStructureDistributionMapMapper {
    /**
     *各类型项目人才分布
     * @return
     */
    TalentStructureDistributionMapVo getProjectTalentStructureDistribution();

    /**
     *人才结构分布图
     * @param category
     * @return
     */
    TalentStructureDistributionMapVo getTalentStructureDistribution(String category);

    /**
     *各依托单位人才结构分布图
     * @param category
     * @return
     */
    List<TalentStructureDistributionMapVo> getDeptTalentStructureDistribution(String category);
}

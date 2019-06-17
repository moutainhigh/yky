package com.deloitte.platform.api.srpmp.project.accept.vo;

import com.deloitte.platform.common.core.entity.form.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author : Apeng
 * @Date : Create in 2019-04-25
 * @Description : SrpmsProjectAcceptSchool新增修改form对象
 * @Modified :
 */
@ApiModel("新增SrpmsProjectAcceptSchool表单")
@Data
public class SrpmsProjectAcceptSchoolForm extends BaseForm {
    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "验收ID")
    private Long acceptId;

    @ApiModelProperty(value = "项目摘要")
    private String projectAbstract;

    @ApiModelProperty(value = "研究内容及考核指标执行情况描述")
    private String projectContentIndicators;

    @ApiModelProperty(value = "研究工作取得的重要进展与成果")
    private String projectGainResult;

    @ApiModelProperty(value = "团队建设，人才培养")
    private String projectTeamConstruction;

    @ApiModelProperty(value = "存在问题及建议")
    private String projectQuestionAdvice;

    @ApiModelProperty(value = "项目成果目录")
    private String projectResultDirectory;

}

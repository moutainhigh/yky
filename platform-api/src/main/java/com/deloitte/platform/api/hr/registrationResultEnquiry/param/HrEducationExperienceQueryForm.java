package com.deloitte.platform.api.hr.registrationResultEnquiry.param;
import com.deloitte.platform.common.core.entity.form.BaseQueryForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author : zengshuai
 * @Date : Create in 2019-04-04
 * @Description :   HrEducationExperience查询from对象
 * @Modified :
 */
@ApiModel("HrEducationExperience查询表单")
@Data
public class HrEducationExperienceQueryForm extends BaseQueryForm<HrEducationExperienceQueryParam>  {


    @ApiModelProperty(value = "${field.comment}")
    private String id;

    @ApiModelProperty(value = "社会人员个人基本情况id")
    private String socialPersonalInformationId;

    @ApiModelProperty(value = "开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "毕业学校(高中起）")
    private String graduationSchool;

    @ApiModelProperty(value = "所学专业")
    private String major;

    @ApiModelProperty(value = "职务")
    private String duty;

    @ApiModelProperty(value = "毕业生个人基本情况id")
    private String graduateId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人")
    private String careteBy;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "组织编码")
    private String orgCode;
}

package com.deloitte.platform.api.hr.recruitment.vo;
import com.deloitte.platform.common.core.entity.form.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author : tankui
 * @Date : Create in 2019-04-23
 * @Description : ZpcpTechReward新增修改form对象
 * @Modified :
 */
@ApiModel("新增ZpcpTechReward表单")
@Data
public class ZpcpTechRewardForm extends BaseForm {
    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "年度")
    private String year;

    @ApiModelProperty(value = "获奖项目名称")
    private String rewardProjectName;

    @ApiModelProperty(value = "奖励名称")
    private String rewardName;

    @ApiModelProperty(value = "等级")
    private String grade;

    @ApiModelProperty(value = "排名")
    private String ranking;

    @ApiModelProperty(value = "通知id")
    private Long noticeId;

    @ApiModelProperty(value = "员工编号")
    private String empCode;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "证书编号")
    private String certificateNo;

    @ApiModelProperty(value = "组织code")
    private String orgCode;

}
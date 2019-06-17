package com.deloitte.platform.api.hr.check.param;

import com.deloitte.platform.common.core.entity.form.BaseQueryForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author : woo
 * @Date : Create in 2019-04-13
 * @Description :   CheckAchEvaluateContent查询from对象
 * @Modified :
 */
@ApiModel("CheckAchEvaluateContent查询表单")
@Data
public class CheckAchEvaluateContentQueryForm extends BaseQueryForm<CheckAchEvaluateContentQueryParam>  {


    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "业绩考核测评通知id（冗余用于结果计算）")
    private String checkEvaluateNotifyId;

    @ApiModelProperty(value = "个人测评通知id")
    private String achEvaluateUserId;

    @ApiModelProperty(value = "评价人id")
    private String evaluateUserId;

    @ApiModelProperty(value = "个人业绩考核id")
    private String achUserId;

    @ApiModelProperty(value = "评价等级")
    private String grade;

    @ApiModelProperty(value = "评估选项")
    private String evaluateModeId;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "被评价人id")
    private String userId;

    @ApiModelProperty(value = "组织code")
    private String orgCode;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "更新人")
    private String updateBy;
}

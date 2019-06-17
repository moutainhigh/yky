package com.deloitte.platform.api.project.param;
import com.deloitte.platform.api.contract.param.ProcessTaskQueryParam;
import com.deloitte.platform.common.core.entity.form.BaseQueryForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author : zhengchun
 * @Date : Create in 2019-05-13
 * @Description :   ProcessTask查询from对象
 * @Modified :
 */
@ApiModel("ProcessTask查询表单")
@Data
public class ProcessTaskQueryForm extends BaseQueryForm<ProcessTaskQueryParam>  {


    @ApiModelProperty(value = "主键ID")
    private Long id;

    @ApiModelProperty(value = "流程定义key")
    private String processDefineKey;

    @ApiModelProperty(value = "${field.comment}")
    private String processInstanceId;

    @ApiModelProperty(value = "任务ID")
    private String taskId;

    @ApiModelProperty(value = "任务定义key")
    private String taskKey;

    @ApiModelProperty(value = "任务定义名称")
    private String taskName;

    @ApiModelProperty(value = "任务标题")
    private String taskTitle;

    @ApiModelProperty(value = "任务描述")
    private String taskDescription;

    @ApiModelProperty(value = "流程任务审批状态 【1待审批 2已批准 3已驳回 4已提交 5待提交 6已转办 7 终止流程 8 撤回】")
    private String taskStauts;

    @ApiModelProperty(value = "审批人账号")
    private String approverAcount;

    @ApiModelProperty(value = "审批人姓名")
    private String approverName;

    @ApiModelProperty(value = "审批人岗位")
    private String approverStation;

    @ApiModelProperty(value = "审批人描述")
    private String approverDescription;

    @ApiModelProperty(value = "审批对象ID")
    private String objectId;

    @ApiModelProperty(value = "审批对象业务单据编号")
    private String objectOrderNum;

    @ApiModelProperty(value = "审批对象审批状态 【1审批中 2已通过 3 已驳回 4 停止审批】")
    private String objectStauts;

    @ApiModelProperty(value = "审批对象类型")
    private String objectType;

    @ApiModelProperty(value = "审批对象URL")
    private String objectUrl;

    @ApiModelProperty(value = "审批对象描述")
    private String objectDescription;

    @ApiModelProperty(value = "审批意见")
    private String opinion;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
/*
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;*/

    @ApiModelProperty(value = "持续时间毫秒数")
    private Long durationTime;

    @ApiModelProperty(value = "提交人账号")
    private String submitterCode;

    @ApiModelProperty(value = "提交人姓名")
    private String submitterName;

    @ApiModelProperty(value = "提交人组织")
    private String submitterOrg;

    @ApiModelProperty(value = "审批人组织")
    private String approverOrg;

    @ApiModelProperty(value = "审批单归属系统")
    private String sourceSystem;

    @ApiModelProperty(value = "提交人岗位")
    private String submitterStation;

    @ApiModelProperty(value = "开始时间")
    private String spareField4;

    @ApiModelProperty(value = "结束时间")
    private String updateTime;

    @ApiModelProperty(value = "合同id")
    private String contractId;

    @ApiModelProperty(value = "紧急程度")
    private String emergency;

    @ApiModelProperty(value = "签收时间")
    private LocalDateTime signTime;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "创建人")
    private String createByName;

    @ApiModelProperty(value = "创建人所在部门")
    private String createByOrgId;

    @ApiModelProperty(value = "上一任务id")
    private String previousTaskId;

    @ApiModelProperty(value = "流程创建时间")
    private LocalDateTime processCreateTime;

    @ApiModelProperty(value = "代理人")
    private String agentId;

    @ApiModelProperty(value = "代理人姓名")
    private String agentName;

    @ApiModelProperty(value = "手机端请求地址")
    private String objectAppUrl;
}

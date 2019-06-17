package com.deloitte.platform.api.bpmservice.vo;
import com.deloitte.platform.common.core.entity.form.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * @Author : jackliu
 * @Date : Create in 2019-03-16
 * @Description : BpmApprovalMatrix新增修改form对象
 * @Modified :
 */
@ApiModel("新增BpmApprovalMatrix表单")
@Data
public class BpmApprovalMatrixForm extends BaseForm {
    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "流程定义")
    private String processDefineKey;

    @ApiModelProperty(value = "节点ID")
    private String activityId;

    @ApiModelProperty(value = "节点名称")
    private String activityName;

    @ApiModelProperty(value = "负责组织")
    private String chargeOrg;

    @ApiModelProperty(value = "负责业务")
    private String chargeBusiness;

    @ApiModelProperty(value = "审批人员工编号")
    private String accountEmpNo;

    @ApiModelProperty(value = "审批人账号")
    private String accountNum;

    @ApiModelProperty(value = "审批人名称")
    private String accountName;

    @ApiModelProperty(value = "审批人部门")
    private String orgCode;

    @ApiModelProperty(value = "审批人岗位")
    private String position;

    @ApiModelProperty(value = "是否有效")
    private String effective;

    @ApiModelProperty(value = "生效开始时间")
    private LocalDateTime effectiveStart;

    @ApiModelProperty(value = "失效结束时间")
    private LocalDateTime effectiveEnd;

    @ApiModelProperty(value = "部门集合")
    private String orgNoList;

    @ApiModelProperty(value = "岗位集合")
    private String positionList;

    @ApiModelProperty(value = "角色编号计划")
    private String roleNoList;

    @ApiModelProperty(value = "规则类型")
    private String ruleType;

    @ApiModelProperty(value = "自定义规则")
    private String customRule;

    @ApiModelProperty(value = "审批排序")
    private String orderNum;

    @ApiModelProperty(value = "所属系统")
    private String systemCode;

}

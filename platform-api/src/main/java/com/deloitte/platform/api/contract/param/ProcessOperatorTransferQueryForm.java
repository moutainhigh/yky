package com.deloitte.platform.api.contract.param;
import com.deloitte.platform.common.core.entity.form.BaseQueryForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import java.time.LocalDateTime;
import java.sql.Blob;

/**
 * @Author : hemingzheng
 * @Date : Create in 2019-04-16
 * @Description :   ProcessOperatorTransfer查询from对象
 * @Modified :
 */
@ApiModel("ProcessOperatorTransfer查询表单")
@Data
public class ProcessOperatorTransferQueryForm extends BaseQueryForm<ProcessOperatorTransferQueryParam>  {


    @ApiModelProperty(value = "编号")
    private Long id;

    @ApiModelProperty(value = "合同编号")
    private Long contractId;

    @ApiModelProperty(value = "发起人编号")
    private String operatorCode;

    @ApiModelProperty(value = "发起人")
    private String operator;

    @ApiModelProperty(value = "新经办人编号")
    private String newOperatorCode;

    @ApiModelProperty(value = "新经办人")
    private String newOperator;

    @ApiModelProperty(value = "流程id")
    private String processId;

    @ApiModelProperty(value = "流程实例id")
    private String processInstanceId;

    @ApiModelProperty(value = "审批状态")
    private String statue;

    @ApiModelProperty(value = "发起时间")
    private LocalDateTime sendTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "备用字段")
    private String spareField1;

    @ApiModelProperty(value = "备用字段")
    private String spareField2;

    @ApiModelProperty(value = "备用字段")
    private String spareField3;

    @ApiModelProperty(value = "备用字段")
    private LocalDateTime spareField4;

    @ApiModelProperty(value = "备用字段")
    private Long spareField5;

    @ApiModelProperty(value = "经办人移交原因")
    private String transferResult;

    @ApiModelProperty(value = "经办人部门ID")
    private String orgId;

    @ApiModelProperty(value = "经办人部门")
    private String org;

    @ApiModelProperty(value = "发起人部门Id")
    private String oldOrgId;

    @ApiModelProperty(value = "发起人部门")
    private String oldOrg;

    @ApiModelProperty(value = "新经办人联系方式")
    private String operatorInfomation;

    @ApiModelProperty(value = "经办人联系方式")
    private String oldOperatorInfomation;
}

package com.deloitte.platform.api.fssc.ppc.param;

import com.deloitte.platform.common.core.entity.form.BaseQueryForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author : qiliao
 * @Date : Create in 2019-04-01
 * @Description :   ProjectRecieveDetail查询from对象
 * @Modified :
 */
@ApiModel("ProjectRecieveDetail查询表单")
@Data
public class ProjectRecieveDetailQueryForm extends BaseQueryForm<ProjectRecieveDetailQueryParam>  {


    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "创建人ID申请人")
    private Long createBy;

    @ApiModelProperty(value = "创建人姓名申请人")
    private String createUserName;

    @ApiModelProperty(value = "更新人ID")
    private Long updateBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "单据ID")
    private Long documentId;

    @ApiModelProperty(value = "单据类型")
    private String documentType;

    @ApiModelProperty(value = "版本")
    private Long version;

    @ApiModelProperty(value = "单据ID收款单ID")
    private Long connectDocumentId;

    @ApiModelProperty(value = "单据类型收款单表名")
    private String connectDocumentType;

    @ApiModelProperty(value = "收款单编号单据编号")
    private String connectDocumentNum;

    @ApiModelProperty(value = "收款单位")
    private String recieveUnitName;

    @ApiModelProperty(value = "收款银行账号名称")
    private String recieveBankName;

    @ApiModelProperty(value = "账户类型")
    private String recieveBankType;

    @ApiModelProperty(value = "收款银行账号")
    private String recieveBankAccount;

    @ApiModelProperty(value = "款项收入小类ID")
    private Long inComeSubTypeId;

    @ApiModelProperty(value = "款项收入小类CODE")
    private String inComeSubTypeCode;

    @ApiModelProperty(value = "款项收入小类名称")
    private String inComeSubTypeName;

    @ApiModelProperty(value = "收款金额")
    private BigDecimal recieveAmount;

    @ApiModelProperty(value = "收入确认金额")
    private BigDecimal recieveConfirmAmount;

    @ApiModelProperty(value = "收款时间")
    private LocalDateTime recieveTime;

    @ApiModelProperty(value = "付款银行账户名称")
    private String payBankName;

    @ApiModelProperty(value = "付款银行账号")
    private String payBankAccount;

    @ApiModelProperty(value = "付款单位")
    private String payUnitName;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "预留字段1")
    private String ex1;

    @ApiModelProperty(value = "预留字段2")
    private String ex2;

    @ApiModelProperty(value = "预留字段3")
    private String ex3;

    @ApiModelProperty(value = "预留字段4")
    private String ex4;

    @ApiModelProperty(value = "预留字段5")
    private String ex5;

    @ApiModelProperty(value = "预留字段6")
    private String ex6;

    @ApiModelProperty(value = "预留字段7")
    private String ex7;

    @ApiModelProperty(value = "预留字段8")
    private String ex8;

    @ApiModelProperty(value = "预留字段9")
    private String ex9;

    @ApiModelProperty(value = "预留字段10")
    private String ex10;

    @ApiModelProperty(value = "预留字段11")
    private String ex11;

    @ApiModelProperty(value = "预留字段12")
    private String ex12;

    @ApiModelProperty(value = "预留字段13")
    private String ex13;

    @ApiModelProperty(value = "预留字段14")
    private String ex14;

    @ApiModelProperty(value = "预留字段15")
    private String ex15;

    @ApiModelProperty(value = "行号")
    private Long lineNumber;

    @ApiModelProperty(value = "款项收入小类科目CODE")
    private String inComeSubSubjectCode;

    @ApiModelProperty(value = "关联收款行表id")
    private Long connectRecieveLineId;

}

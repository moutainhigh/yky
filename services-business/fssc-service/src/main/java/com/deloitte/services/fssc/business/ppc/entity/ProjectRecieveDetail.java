package com.deloitte.services.fssc.business.ppc.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;



/**
 * <p>
 * 收款明细行表
 * </p>
 *
 * @author qiliao
 * @since 2019-04-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("PPC_PROJECT_RECIEVE_DETAIL")
@ApiModel(value="ProjectRecieveDetail对象", description="收款明细行表")
public class ProjectRecieveDetail extends Model<ProjectRecieveDetail> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "ID", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "创建人ID申请人")
    @TableField(value = "CREATE_BY", fill = FieldFill.INSERT)
    private Long createBy;

    @ApiModelProperty(value = "创建人姓名申请人")
    @TableField("CREATE_USER_NAME")
    private String createUserName;

    @ApiModelProperty(value = "更新人ID")
    @TableField(value = "UPDATE_BY", fill = FieldFill.INSERT_UPDATE)
    private Long updateBy;

    @ApiModelProperty(value = "更新时间")
    @TableField(value = "UPDATE_TIME", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "CREATE_TIME", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty(value = "单据ID")
    @TableField("DOCUMENT_ID")
    private Long documentId;

    @ApiModelProperty(value = "单据类型")
    @TableField("DOCUMENT_TYPE")
    private String documentType;

    @ApiModelProperty(value = "版本")
    @TableField("VERSION")
    @Version
    private Long version;

    @ApiModelProperty(value = "单据ID收款单ID")
    @TableField("CONNECT_DOCUMENT_ID")
    private Long connectDocumentId;

    @ApiModelProperty(value = "单据类型收款单表名")
    @TableField("CONNECT_DOCUMENT_TYPE")
    private String connectDocumentType;

    @ApiModelProperty(value = "收款单编号单据编号")
    @TableField("CONNECT_DOCUMENT_NUM")
    private String connectDocumentNum;

    @ApiModelProperty(value = "收款单位")
    @TableField("RECIEVE_UNIT_NAME")
    private String recieveUnitName;

    @ApiModelProperty(value = "收款银行账号名称")
    @TableField("RECIEVE_BANK_NAME")
    private String recieveBankName;

    @ApiModelProperty(value = "账户类型")
    @TableField("RECIEVE_BANK_TYPE")
    private String recieveBankType;

    @ApiModelProperty(value = "收款银行账号")
    @TableField("RECIEVE_BANK_ACCOUNT")
    private String recieveBankAccount;

    @ApiModelProperty(value = "款项收入小类ID")
    @TableField("IN_COME_SUB_TYPE_ID")
    private Long inComeSubTypeId;

    @ApiModelProperty(value = "款项收入小类CODE")
    @TableField("IN_COME_SUB_TYPE_CODE")
    private String inComeSubTypeCode;

    @ApiModelProperty(value = "款项收入小类名称")
    @TableField("IN_COME_SUB_TYPE_NAME")
    private String inComeSubTypeName;

    @TableField("ACCOUNT_CODE")
    @ApiModelProperty("会计科目代码")
    private String accountCode;

    @ApiModelProperty("预算会计科目代码")
    @TableField("BUDGET_ACCOUNT_CODE")
    private String budgetAccountCode;


    @ApiModelProperty(value = "收款金额")
    @TableField("RECIEVE_AMOUNT")
    private BigDecimal recieveAmount;


    @ApiModelProperty(value = "收入确认金额")
    @TableField("RECIEVE_CONFIRM_AMOUNT")
    private BigDecimal recieveConfirmAmount;

    @ApiModelProperty(value = "收款时间")
    @TableField("RECIEVE_TIME")
    private LocalDateTime recieveTime;

    @ApiModelProperty(value = "付款银行账户名称")
    @TableField("PAY_BANK_NAME")
    private String payBankName;

    @ApiModelProperty(value = "付款银行账号")
    @TableField("PAY_BANK_ACCOUNT")
    private String payBankAccount;

    @ApiModelProperty(value = "付款单位")
    @TableField("PAY_UNIT_NAME")
    private String payUnitName;

    @ApiModelProperty(value = "备注")
    @TableField("REMARK")
    private String remark;

    @ApiModelProperty(value = "预留字段1")
    @TableField("EX1")
    private String ex1;

    @ApiModelProperty(value = "预留字段2")
    @TableField("EX2")
    private String ex2;

    @ApiModelProperty(value = "预留字段3")
    @TableField("EX3")
    private String ex3;

    @ApiModelProperty(value = "预留字段4")
    @TableField("EX4")
    private String ex4;

    @ApiModelProperty(value = "预留字段5")
    @TableField("EX5")
    private String ex5;

    @ApiModelProperty(value = "预留字段6")
    @TableField("EX6")
    private String ex6;

    @ApiModelProperty(value = "预留字段7")
    @TableField("EX7")
    private String ex7;

    @ApiModelProperty(value = "预留字段8")
    @TableField("EX8")
    private String ex8;

    @ApiModelProperty(value = "预留字段9")
    @TableField("EX9")
    private String ex9;

    @ApiModelProperty(value = "预留字段10")
    @TableField("EX10")
    private String ex10;

    @ApiModelProperty(value = "预留字段11")
    @TableField("EX11")
    private String ex11;

    @ApiModelProperty(value = "预留字段12")
    @TableField("EX12")
    private String ex12;

    @ApiModelProperty(value = "预留字段13")
    @TableField("EX13")
    private String ex13;

    @ApiModelProperty(value = "预留字段14")
    @TableField("EX14")
    private String ex14;

    @ApiModelProperty(value = "预留字段15")
    @TableField("EX15")
    private String ex15;

    @ApiModelProperty(value = "行号")
    @TableField("LINE_NUMBER")
    private Long lineNumber;

    @ApiModelProperty(value = "款项收入小类科目CODE")
    @TableField("IN_COME_SUB_SUBJECT_CODE")
    private String inComeSubSubjectCode;

    @ApiModelProperty(value = "关联收款行表id")
    @TableField("CONNECT_RECIEVE_LINE_ID")
    private Long connectRecieveLineId;

    @ApiModelProperty(value = "不含税金额")
    @TableField("NO_TAX_AMOUNT")
    private BigDecimal noTaxAmount;

    @ApiModelProperty(value = "税率")
    @TableField("TAX")
    private BigDecimal tax;

    @ApiModelProperty(value = "税额")
    @TableField("TAX_AMOUNT")
    private BigDecimal taxAmount;


    @ApiModelProperty(value = "银行账号ID")
    @TableField("RECIEVE_BANK_UNIT_ID")
    private Long recieveBankUnitId;

    @ApiModelProperty(value = "银行账户会计科目代码")
    @TableField("BANK_SUBJECT_CODE")
    private String bankSubjectCode;

    @ApiModelProperty(value = "银行账户预算会计科目代码")
    @TableField(value = "BUDGET_BANK_SUBJECT_CODE")
    private String budgetBankSubjectCode;


    public static final String ID = "ID";

    public static final String CREATE_BY = "CREATE_BY";

    public static final String CREATE_USER_NAME = "CREATE_USER_NAME";

    public static final String UPDATE_BY = "UPDATE_BY";

    public static final String UPDATE_TIME = "UPDATE_TIME";

    public static final String CREATE_TIME = "CREATE_TIME";

    public static final String DOCUMENT_ID = "DOCUMENT_ID";

    public static final String DOCUMENT_TYPE = "DOCUMENT_TYPE";

    public static final String VERSION = "VERSION";

    public static final String CONNECT_DOCUMENT_ID = "CONNECT_DOCUMENT_ID";

    public static final String CONNECT_DOCUMENT_TYPE = "CONNECT_DOCUMENT_TYPE";

    public static final String CONNECT_DOCUMENT_NUM = "CONNECT_DOCUMENT_NUM";

    public static final String RECIEVE_UNIT_NAME = "RECIEVE_UNIT_NAME";

    public static final String RECIEVE_BANK_NAME = "RECIEVE_BANK_NAME";

    public static final String RECIEVE_BANK_TYPE = "RECIEVE_BANK_TYPE";

    public static final String RECIEVE_BANK_ACCOUNT = "RECIEVE_BANK_ACCOUNT";

    public static final String IN_COME_SUB_TYPE_ID = "IN_COME_SUB_TYPE_ID";

    public static final String IN_COME_SUB_TYPE_CODE = "IN_COME_SUB_TYPE_CODE";

    public static final String IN_COME_SUB_TYPE_NAME = "IN_COME_SUB_TYPE_NAME";

    public static final String RECIEVE_AMOUNT = "RECIEVE_AMOUNT";

    public static final String RECIEVE_CONFIRM_AMOUNT = "RECIEVE_CONFIRM_AMOUNT";

    public static final String RECIEVE_TIME = "RECIEVE_TIME";

    public static final String PAY_BANK_NAME = "PAY_BANK_NAME";

    public static final String PAY_BANK_ACCOUNT = "PAY_BANK_ACCOUNT";

    public static final String PAY_UNIT_NAME = "PAY_UNIT_NAME";

    public static final String REMARK = "REMARK";

    public static final String EX1 = "EX1";

    public static final String EX2 = "EX2";

    public static final String EX3 = "EX3";

    public static final String EX4 = "EX4";

    public static final String EX5 = "EX5";

    public static final String EX6 = "EX6";

    public static final String EX7 = "EX7";

    public static final String EX8 = "EX8";

    public static final String EX9 = "EX9";

    public static final String EX10 = "EX10";

    public static final String EX11 = "EX11";

    public static final String EX12 = "EX12";

    public static final String EX13 = "EX13";

    public static final String EX14 = "EX14";

    public static final String EX15 = "EX15";

    public static final String LINE_NUMBER = "LINE_NUMBER";

    public static final String IN_COME_SUB_SUBJECT_CODE = "IN_COME_SUB_SUBJECT_CODE";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

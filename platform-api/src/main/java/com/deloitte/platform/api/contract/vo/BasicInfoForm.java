package com.deloitte.platform.api.contract.vo;
import com.deloitte.platform.common.core.entity.form.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @Author : zhengchun
 * @Date : Create in 2019-04-03
 * @Description : BasicInfo新增修改form对象
 * @Modified :
 */
@ApiModel("新增BasicInfo表单")
@Data
public class BasicInfoForm extends BaseForm {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "合同id")
    private Long id;

    @ApiModelProperty(value = "合同编号")
    private String contractNo;

    @ApiModelProperty(value = "合同名称")
    private String contractName;

    @ApiModelProperty(value = "原合同id")
    private String oldContractId;

    @ApiModelProperty(value = "原合同编号")
    private String oldContractNo;

    @ApiModelProperty(value = "原合同名称")
    private String oldContractName;

    @ApiModelProperty(value = "合同流水号")
    private String contractSerialNumber;

    @ApiModelProperty(value = "收支类型编号")
    private String incomeExpenditureTypeCode;

    @ApiModelProperty(value = "收支类型")
    private String incomeExpenditureType;

    @ApiModelProperty(value = "合同类型编号")
    private String contractTypeCode;

    @ApiModelProperty(value = "合同类型")
    private String contractType;

    @ApiModelProperty(value = "合同性质编号")
    private String contractNatureCode;

    @ApiModelProperty(value = "合同性质")
    private String contractNature;

    @ApiModelProperty(value = "标准文本属性编号")
    private String templateAttributeCode;

    @ApiModelProperty(value = "标准文本属性")
    private String templateAttribute;

    @ApiModelProperty(value = "标准文本属性补充（选择方式为其他时填写）")
    private String templateAttributeRemark;

    @ApiModelProperty(value = "标准文本编号")
    private String templateCode;

    @ApiModelProperty(value = "标准文本名称")
    private String templateName;

    @ApiModelProperty(value = "合同币种编号")
    private String contractCurrencyCode;

    @ApiModelProperty(value = "合同币种")
    private String contractCurrency;

    @ApiModelProperty(value = "合同币种补充（选择方式为其他时填写）")
    private String contractCurrencyRemark;

    @ApiModelProperty(value = "对方选择方式编号")
    private String otherWayCode;

    @ApiModelProperty(value = "对方选择方式")
    private String otherWay;

    @ApiModelProperty(value = "对方选择方式补充（选择方式为其他时填写）")
    private String otherWayRemark;

    @ApiModelProperty(value = "经费来源")
    private String sourcesFunding;

    @ApiModelProperty(value = "收付款方式编号")
    private String paymentWayCode;

    @ApiModelProperty(value = "收付款方式")
    private String paymentWay;

    @ApiModelProperty(value = "收付款方式补充（选择方式为其他时填写）")
    private String paymentWayRemark;

    @ApiModelProperty(value = "结算比例")
    private String billingRatio;

    @ApiModelProperty(value = "原含税合同金额")
    private BigDecimal oldAmountIncludTax;

    @ApiModelProperty(value = "原税率")
    private BigDecimal oldTaxRate;

    @ApiModelProperty(value = "原税额")
    private BigDecimal oldTaxAmount;

    @ApiModelProperty(value = "原不含税合同金额")
    private BigDecimal oldAmountExcludTax;

    @ApiModelProperty(value = "原含税合同金额大写（汉字版本）")
    private String oldAmountExcludTaxCapital;

    @ApiModelProperty(value = "已报账金额")
    private BigDecimal reportedAmount;

    @ApiModelProperty(value = "已付款金额")
    private BigDecimal paidAmount;

    @ApiModelProperty(value = "含税合同金额")
    private BigDecimal amountIncludTax;

    @ApiModelProperty(value = "税率")
    private BigDecimal taxRate;

    @ApiModelProperty(value = "税率补充（选择方式为其他时填写）")
    private BigDecimal taxRateRemark;

    @ApiModelProperty(value = "税额")
    private BigDecimal taxAmount;

    @ApiModelProperty(value = "不含税合同金额")
    private BigDecimal amountExcludTax;

    @ApiModelProperty(value = "含税合同金额大写（汉字版本）")
    private String amountExcludTaxCapital;

    @ApiModelProperty(value = "保证金/保函编号")
    private String isPayDepositCode;

    @ApiModelProperty(value = "保证金/保函")
    private String isPayDeposit;

    @ApiModelProperty(value = "保证金/保函金额")
    private BigDecimal contractDeposit;

    @ApiModelProperty(value = "明确到期时间")
    private LocalDateTime performanceEffectiveTime;

    @ApiModelProperty(value = "是否为涉外合同")
    private String isForeignContract;

    @ApiModelProperty(value = "经办人编号")
    private String operatorCode;

    @ApiModelProperty(value = "经办人")
    private String operator;

    @ApiModelProperty(value = "原经办人编号")
    private String oldOperatorCode;

    @ApiModelProperty(value = "原经办人")
    private String oldOperator;

    @ApiModelProperty(value = "主办部门编号")
    private String orgCode;

    @ApiModelProperty(value = "主办部门")
    private String org;

    @ApiModelProperty(value = "联系电话")
    private String contactNum;

    @ApiModelProperty(value = "原主办部门编号")
    private String oldOrgCode;

    @ApiModelProperty(value = "原主办部门")
    private String oldOrg;

    @ApiModelProperty(value = "原联系电话")
    private String oldContactNum;

    @ApiModelProperty(value = "合同履行情况编号")
    private String executeInfoCode;

    @ApiModelProperty(value = "合同履行情况")
    private String executeInfo;

    @ApiModelProperty(value = "合同履行情况补充（选择方式为其他时填写）")
    private String executeInfoRemark;

    @ApiModelProperty(value = "履行原因说明")
    private String executeCause;

    @ApiModelProperty(value = "履行期限-开始时间")
    private LocalDateTime executeStartTime;

    @ApiModelProperty(value = "履行期限-结束时间")
    private LocalDateTime executeEndTime;

    @ApiModelProperty(value = "合同正文")
    private String contractBody;

    @ApiModelProperty(value = "合同附件")
    private String contractAttament;

    @ApiModelProperty(value = "合同启动依据")
    private String contractStartupBasis;

    @ApiModelProperty(value = "定稿人编号")
    private String surePersonCode;

    @ApiModelProperty(value = "定稿人")
    private String surePerson;

    @ApiModelProperty(value = "履行人编号")
    private String executerCode;

    @ApiModelProperty(value = "履行人")
    private String executer;

    @ApiModelProperty(value = "原履行人编号")
    private String oldExecutePersonCode;

    @ApiModelProperty(value = "原履行人")
    private String oldExecutePerson;

    @ApiModelProperty(value = "无效时间")
    private LocalDateTime disabledTime;

    @ApiModelProperty(value = "无效人")
    private String disabledBy;

    @ApiModelProperty(value = "审批状态")
    private String statue;

    @ApiModelProperty(value = "定稿状态")
    private String sureStatue;

    @ApiModelProperty(value = "签署状态")
    private String signStatue;

    @ApiModelProperty(value = "履行状态")
    private String executeStatue;

    @ApiModelProperty(value = "办结状态")
    private String finishStatue;

    @ApiModelProperty(value = "备用字段")
    private String spareField1;

    @ApiModelProperty(value = "备用字段")
    private String spareField2;

    @ApiModelProperty(value = "备用字段")
    private String spareField3;

    @ApiModelProperty(value = "备用字段")
    private LocalDateTime spareField4;

    @ApiModelProperty(value = "备用字段")
    private BigDecimal spareField5;

    @ApiModelProperty(value = "关联性质编号")
    private String relationCode;

    @ApiModelProperty(value = "关联性质")
    private String relation;

    @ApiModelProperty(value = "定稿时间")
    private LocalDateTime sureStatueTime;

    @ApiModelProperty(value = "签署时间")
    private LocalDateTime signStatueTime;

    @ApiModelProperty(value = "履行时间")
    private LocalDateTime executeStatueTime;

    @ApiModelProperty(value = "办结时间")
    private LocalDateTime finishStatueTime;

    @ApiModelProperty(value = "审批时间")
    private LocalDateTime statueTime;

    @ApiModelProperty(value = "保函到期方式code")
    private String performanceTypeCode;

    @ApiModelProperty(value = "保函到期方式")
    private String performanceType;

    @ApiModelProperty(value = "条件到期时间")
    private String performanceEffectiveCond;

    @ApiModelProperty(value = "履行期限方式")
    private String executeType;

    @ApiModelProperty(value = "履行期限方式code")
    private String executeTypeCode;

    @ApiModelProperty(value = "固定时长")
    private Long executeLong;

    @ApiModelProperty(value = "时间类型（年；月；日）")
    private String timeType;

    @ApiModelProperty(value = "结束条件")
    private String engCond;

    @ApiModelProperty(value = "签约主体对象")
    private ArrayList<BasicSubjectMapForm> basicSubjectList;

    @ApiModelProperty(value = "上传文件")
    private ArrayList<BasicAttamentMapForm> basicAttamentList;

    @ApiModelProperty(value = "合同id")
    private Long contractId;

    @ApiModelProperty(value = "打印状态")
    private String printStatue;

    @ApiModelProperty(value = "打印时间")
    private String printStatueTime;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "经办人移交时间")
    private LocalDateTime userTransferTime;

    @ApiModelProperty(value = "查询列表状态")
    private String statueList;

    @ApiModelProperty(value = "是否印花税")
    private String isImprint;

    @ApiModelProperty(value = "合同评价状态")
    private String evaluateStatue;

    @ApiModelProperty(value = "生效时间")
    private LocalDateTime validTime;

    @ApiModelProperty(value = "计税金额或件数")
    private String imprintCases;

    @ApiModelProperty(value = "印花税税额")
    private String imprintAmount;

    @ApiModelProperty("是否已复审 1为已复审， 其他为未复审")
    private String review;

    @ApiModelProperty("办公室负责人审批意见 1：勾选【重要事项，请分管领导、主要领导审批】  2：勾选【常规事项，请分管领导审批】  3：勾选【重要事项，请分管领导、主要领导审批】和【签名章，请院校主要负责人本人审批】")
    private String approvalType;

    @ApiModelProperty(value = "经费来源value")
    private String sourcesFundingValue;

    @ApiModelProperty(value = "原税率value")
    private String oldTaxRateValue;

    @ApiModelProperty(value = "税率value")
    private String taxRateValue;

    @ApiModelProperty(value = "原保证金/保函金额")
    private BigDecimal oldContractDeposit;

    @ApiModelProperty(value = "公司")
    private String dept;

    @ApiModelProperty(value = "公司code")
    private String deptCode;
}

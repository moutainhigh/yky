package com.deloitte.platform.api.fssc.ito.vo;
import com.deloitte.platform.api.fssc.config.LongJsonDeserializer;
import com.deloitte.platform.api.fssc.config.LongJsonSerializer;
import com.deloitte.platform.common.core.entity.vo.BaseVo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author : qiliao
 * @Date : Create in 2019-04-15
 * @Description : DetailsOfFunds返回的VO对象
 * @Modified :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailsOfFundsVo extends BaseVo {
    private static final long serialVersionUID = 1L;


    @JsonSerialize(using = LongJsonSerializer.class)
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @ApiModelProperty(value = "ID")
    private Long id;

    @JsonSerialize(using = LongJsonSerializer.class)
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @ApiModelProperty(value = "创建人ID")
    private Long createBy;

    @ApiModelProperty(value = "创建人姓名")
    private String createUserName;

    @JsonSerialize(using = LongJsonSerializer.class)
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @ApiModelProperty(value = "更新人ID")
    private Long updateBy;

    @JsonSerialize(using = LongJsonSerializer.class)
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @ApiModelProperty(value = "收款单行Id")
    private Long receiptLineId;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "预留字段1")
    private String ext1;

    @ApiModelProperty(value = "预留字段2")
    private String ext2;

    @ApiModelProperty(value = "预留字段3")
    private String ext3;

    @ApiModelProperty(value = "预留字段4")
    private String ext4;

    @ApiModelProperty(value = "预留字段5")
    private String ext5;

    @ApiModelProperty(value = "预留字段6")
    private String ext6;

    @ApiModelProperty(value = "预留字段7")
    private String ext7;

    @ApiModelProperty(value = "预留字段8")
    private String ext8;

    @ApiModelProperty(value = "预留字段9")
    private String ext9;

    @ApiModelProperty(value = "预留字段10")
    private String ext10;

    @ApiModelProperty(value = "预留字段11")
    private String ext11;

    @ApiModelProperty(value = "预留字段12")
    private String ext12;

    @ApiModelProperty(value = "预留字段13")
    private String ext13;

    @ApiModelProperty(value = "预留字段14")
    private String ext14;

    @ApiModelProperty(value = "预留字段15")
    private String ext15;

    @JsonSerialize(using = LongJsonSerializer.class)
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @ApiModelProperty(value = "收入小类ID")
    private Long inComeSubTypeId;

    @ApiModelProperty(value = "收入小类CODE")
    private String incomeSubTypeCode;

    @ApiModelProperty(value = "收入小类NAME")
    private String incomeSubTypeName;

    @JsonSerialize(using = LongJsonSerializer.class)
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @ApiModelProperty(value = "收入大类ID")
    private Long incomeTypeId;

    @ApiModelProperty(value = "收入大类名称")
    private String incomeTypeName;

    @ApiModelProperty(value = "收入大类编码")
    private String incomeTypeCode;

    @ApiModelProperty(value = "会计科目代码")
    private String accountCode;

    @ApiModelProperty(value = "预算会计科目代码")
    private String budgetAccountCode;

    @ApiModelProperty(value = "行号")
    private Long lineNumber;

    @ApiModelProperty(value = "收款单编号")
    private String receiptNumber;

    @ApiModelProperty(value = "上缴单位")
    private String paidUnit;

    @ApiModelProperty(value = "缴款银行信息")
    private String paymentBankInfo;

    @ApiModelProperty(value = "账户类型")
    private String accountType;

    @ApiModelProperty(value = "缴款银行账户号")
    private String paymentBankAccount;

    @ApiModelProperty(value = "上缴金额")
    private BigDecimal amountPaid;

    @ApiModelProperty(value = "上缴时间")
    private LocalDateTime paidTime;

    @ApiModelProperty(value = "收款账户")
    private String collectionAccount;

    @ApiModelProperty(value = "收款账户号")
    private String collectionNumber;

    @ApiModelProperty(value = "备注")
    private String remark;

    @JsonSerialize(using = LongJsonSerializer.class)
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @ApiModelProperty(value = "单据id")
    private Long documentId;

    @ApiModelProperty(value = "单据类型")
    private String documentType;

    @ApiModelProperty(value = "会计科目代码")
    private String bankSubjectCode;

    @ApiModelProperty(value = "预算会计科目代码")
    private String budgetBankSubjectCode;

    @JsonSerialize(using = LongJsonSerializer.class)
    @JsonDeserialize(using = LongJsonDeserializer.class)
    @ApiModelProperty(value = "银行ID")
    private Long bankId;

}

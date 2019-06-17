package com.deloitte.platform.api.fssc.advance.param;
import com.deloitte.platform.common.core.entity.param.BaseParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**

 * @Author : hjy
 * @Date : Create in 2019-03-12
 * @Description :  BmContactDetail查询参数
 * @Modified :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactDetailQueryParam extends BaseParam {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long createBy;
    private String createUserName;
    private Long updateBy;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;
    private String ex1;
    private String ex2;
    private String ex3;
    private String ex4;
    private String ex5;
    private Long version;
    private Long mainTypeId;
    private String mainTypeCode;
    private Long subTypeId;
    private String subTypeCode;
    private String accountCode;
    private String budgetAccountCode;
    private String remark;
    private Long documentId;
    private String mainTypeName;
    private String subTypeName;
    private String contactName;
    private Long contactNumberId;
    private String contactNumber;
    private String subjectSuperficil;
    private String agreedPaymentLot;
    private BigDecimal agreedPaymentAmount;
    private  String agreedPropertions;
    private LocalDateTime planPaymentTime;
    private String documentType;
    private String invoiceNumber;
    private BigDecimal taxMmount;
    private BigDecimal taxRate;
    private Long lineNumber;
    private BigDecimal actualPlayAmount;
    private String ourSubjectMainstay;
    private String  performangeDepartment;
    private String  executor;
    private BigDecimal hasVerAmount;
    private BigDecimal noVerAmount;
    private String paymentType;
    private Long travelPlanId;
    private BigDecimal paidAmount;
}

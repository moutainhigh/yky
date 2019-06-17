package com.deloitte.platform.api.fssc.general.param;

import com.deloitte.platform.common.core.entity.param.BaseParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**

 * @Author : jaws
 * @Date : Create in 2019-03-14
 * @Description :  GeGeneralExpenseLine查询参数
 * @Modified :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeGeneralExpenseLineQueryParam extends BaseParam {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long createBy;
    private String createUserName;
    private Long updateBy;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;
    private Long version;
    private Long documentId;
    private Long subTypeId;
    private String subTypeName;
    private String invoiceCode;
    private String invoiceNumber;
    private BigDecimal invoiceAmount;
    private BigDecimal tax;
    private BigDecimal taxAmount;
    private String remark;
    private String ex1;
    private String ex2;
    private String ex3;
    private String ex4;
    private String ex5;
    private String ex6;
    private String ex7;
    private String ex8;
    private String ex9;
    private String ex10;
    private String ex11;
    private String ex12;
    private String ex13;
    private String ex14;
    private String ex15;

}

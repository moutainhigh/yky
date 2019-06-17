package com.deloitte.platform.api.contract.vo;
import com.deloitte.platform.common.core.entity.form.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * @Author : zhengchun
 * @Date : Create in 2019-03-27
 * @Description : ApprovalVoucher新增修改form对象
 * @Modified :
 */
@ApiModel("新增ApprovalVoucher表单")
@Data
public class ApprovalVoucherForm extends BaseForm {
    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "单据业务编号")
    private String bizNumber;

    @ApiModelProperty(value = "单据名称")
    private String voucherName;

    @ApiModelProperty(value = "单据类型")
    private String voucherType;

    @ApiModelProperty(value = "单据状态")
    private String voucherStatus;

    @ApiModelProperty(value = "申请人ID")
    private Long userId;

    @ApiModelProperty(value = "申请人姓名")
    private String personName;

    @ApiModelProperty(value = "申请时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "业务id")
    private String businessId;

}

package com.deloitte.platform.api.project.vo;
import com.deloitte.platform.common.core.entity.vo.BaseVo;
import lombok.AllArgsConstructor;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.sql.Blob;

/**
 * @Author : zhengchun
 * @Date : Create in 2019-06-11
 * @Description : ApprovalVouchers返回的VO对象
 * @Modified :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApprovalVouchersVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private String id;

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
    private String userName;

    @ApiModelProperty(value = "申请时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "单据归属机构")
    private String orgCode;

    @ApiModelProperty(value = "业务id")
    private String businessId;

    @ApiModelProperty(value = "业务名称")
    private String businessName;

}

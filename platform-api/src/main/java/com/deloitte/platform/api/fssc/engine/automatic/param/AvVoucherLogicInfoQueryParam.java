package com.deloitte.platform.api.fssc.engine.automatic.param;
import com.deloitte.platform.common.core.entity.param.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**

 * @Author : chenx
 * @Date : Create in 2019-03-23
 * @Description :  AvVoucherLogicInfo查询参数
 * @Modified :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvVoucherLogicInfoQueryParam extends BaseParam {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long ledgerId;
    private String type;
    private LocalDateTime createDate;
    private Long createBy;
    private LocalDateTime updateDate;
    private Long updateBy;
    private String etx1;
    private String etx2;
    private String etx3;
    private String etx4;
    private String etx5;

}

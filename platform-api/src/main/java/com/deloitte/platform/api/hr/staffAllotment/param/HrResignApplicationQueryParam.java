package com.deloitte.platform.api.hr.staffAllotment.param;
import com.baomidou.mybatisplus.annotation.TableField;
import com.deloitte.platform.common.core.entity.param.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**

 * @Author : zengshuai
 * @Date : Create in 2019-04-03
 * @Description :  HrResignApplication查询参数
 * @Modified :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HrResignApplicationQueryParam extends BaseParam {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String staffCode;
    private LocalDateTime dat;
    private String reason;
    private LocalDateTime createTime;
    private String careteBy;
    private String updateBy;
    private LocalDateTime updateTime;
    private String exp;
    private String orgCode;
    private String fileReceivingUnit;
    private String leaveTo;

}

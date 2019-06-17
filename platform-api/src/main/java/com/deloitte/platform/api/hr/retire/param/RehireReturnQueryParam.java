package com.deloitte.platform.api.hr.retire.param;
import com.deloitte.platform.common.core.entity.param.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.sql.Blob;

/**

 * @Author : ZhongJiang
 * @Date : Create in 2019-04-12
 * @Description :  RehireReturn查询参数
 * @Modified :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RehireReturnQueryParam extends BaseParam {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String rehirereturnExplain;
    private LocalDateTime createTime;
    private String careteBy;
    private String updateBy;
    private String updateTime;
    private String states;

}

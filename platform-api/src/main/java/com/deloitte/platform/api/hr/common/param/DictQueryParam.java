package com.deloitte.platform.api.hr.common.param;
import com.deloitte.platform.common.core.entity.param.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**

 * @Author : jianglong
 * @Date : Create in 2019-04-01
 * @Description :  Dict查询参数
 * @Modified :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DictQueryParam extends BaseParam {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String code;
    private String name;
    private String parentCode;
    private Long sort;
    private String state;

}

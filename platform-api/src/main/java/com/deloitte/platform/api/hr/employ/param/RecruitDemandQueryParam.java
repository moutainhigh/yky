package com.deloitte.platform.api.hr.employ.param;
import com.deloitte.platform.common.core.entity.param.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.sql.Blob;

/**

 * @Author : ZhongJiang
 * @Date : Create in 2019-04-09
 * @Description :  RecruitDemand查询参数
 * @Modified :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecruitDemandQueryParam extends BaseParam {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String dep;
    private String organization;
    private String numberallNow;
    private String numbersInside;
    private String numbersOutside;
    private String yearNow;
    private String yearIncrease;
    private String yearReduction;
    private String threeYearsRetire;
    private String applyNumbers;
    private String increaseDep;
    private String reason;
    private LocalDateTime createTime;
    private String careteBy;
    private String updateBy;
    private LocalDateTime updateTime;
    private String orgCode;

}

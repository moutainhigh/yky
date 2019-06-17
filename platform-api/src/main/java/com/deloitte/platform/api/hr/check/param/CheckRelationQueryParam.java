package com.deloitte.platform.api.hr.check.param;
import com.deloitte.platform.common.core.entity.param.BaseParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**

 * @Author : woo
 * @Date : Create in 2019-04-09
 * @Description :  CheckRelation查询参数
 * @Modified :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckRelationQueryParam extends BaseParam {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String checkTimeId;
    private String checkOrgId;
    private String checkWorkId;
    private String relationName;
    private String checkTableTypeId;
    private String checkTemplateId;
    private Long orderNumber;
    private String status;
    private String orgCode;
    private LocalDateTime createTime;
    private String createBy;
    private LocalDateTime updateTime;
    private String updateBy;

}

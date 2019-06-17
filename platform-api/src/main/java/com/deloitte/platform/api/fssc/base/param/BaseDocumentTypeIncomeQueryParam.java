package com.deloitte.platform.api.fssc.base.param;
import com.deloitte.platform.common.core.entity.param.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**

 * @Author : jaws
 * @Date : Create in 2019-03-18
 * @Description :  BaseDocumentTypeIncome查询参数
 * @Modified :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseDocumentTypeIncomeQueryParam extends BaseParam {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long incomeMainTypeId;
    private Long documentTypeId;
    private String validFlag;
    private String createBy;
    private LocalDateTime createTime;
    private String updateBy;
    private LocalDateTime updateTime;
    private String ext1;
    private String ext2;
    private String ext3;
    private String ext4;
    private String ext5;

}

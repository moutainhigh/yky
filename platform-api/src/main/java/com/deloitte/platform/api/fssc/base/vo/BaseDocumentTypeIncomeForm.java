package com.deloitte.platform.api.fssc.base.vo;
import com.deloitte.platform.common.core.entity.form.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import java.time.LocalDateTime;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @Author : jaws
 * @Date : Create in 2019-03-18
 * @Description : BaseDocumentTypeIncome新增修改form对象
 * @Modified :
 */
@ApiModel("新增BaseDocumentTypeIncome表单")
@Data
public class BaseDocumentTypeIncomeForm extends BaseForm {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "收入大类ID")
    @NotEmpty(message = "支出大类ID不能为空")
    private Long incomeMainTypeId;

    @ApiModelProperty(value = "单据类型ID")
    private Long documentTypeId;

    @ApiModelProperty(value = "启用标志")
    private String validFlag;

    @ApiModelProperty(value = "扩展字段1")
    private String ext1;

    @ApiModelProperty(value = "扩展字段2")
    private String ext2;

    @ApiModelProperty(value = "扩展字段3")
    private String ext3;

    @ApiModelProperty(value = "扩展字段4")
    private String ext4;

    @ApiModelProperty(value = "扩展字段5")
    private String ext5;

}

package com.deloitte.platform.api.contract.vo;
import com.deloitte.platform.common.core.entity.form.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * @Author : zhengchun
 * @Date : Create in 2019-03-26
 * @Description : SysWatermark新增修改form对象
 * @Modified :
 */
@ApiModel("新增SysWatermark表单")
@Data
public class SysWatermarkForm extends BaseForm {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "公司编号")
    private String companyCode;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "部门编号")
    private String departmentCode;

    @ApiModelProperty(value = "部门名称")
    private String departmentName;

    @ApiModelProperty(value = "水印内容")
    private String watermarkText;

    @ApiModelProperty(value = "水印说明")
    private String describe;

    @ApiModelProperty(value = "是否在用，0弃用 1在用")
    private String isUsed;

    @ApiModelProperty(value = "备用字段")
    private String spareField1;

    @ApiModelProperty(value = "备用字段")
    private String spareField2;

    @ApiModelProperty(value = "备用字段")
    private String spareField3;

    @ApiModelProperty(value = "备用字段")
    private LocalDateTime spareField4;

    @ApiModelProperty(value = "备用字段")
    private Long spareField5;

    @ApiModelProperty(value = "类型")
    private String type;
}

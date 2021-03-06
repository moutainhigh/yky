package com.deloitte.platform.api.project.param;
import com.deloitte.platform.common.core.entity.form.BaseQueryForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import java.time.LocalDateTime;
import java.sql.Blob;

/**
 * @Author : zhengchun
 * @Date : Create in 2019-05-31
 * @Description :   AppAttachment查询from对象
 * @Modified :
 */
@ApiModel("AppAttachment查询表单")
@Data
public class AppAttachmentQueryForm extends BaseQueryForm<AppAttachmentQueryParam>  {


    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "申报书ID")
    private String applicationId;

    @ApiModelProperty(value = "房屋修缮附件ID")
    private String attachmentId;

    @ApiModelProperty(value = "建成时间")
    private LocalDateTime startDate;

    @ApiModelProperty(value = "建筑面积")
    private String builtUpArea;

    @ApiModelProperty(value = "修缮面积")
    private String repairArea;

    @ApiModelProperty(value = "实施周期")
    private String operateCycle;

    @ApiModelProperty(value = "内容摘要")
    private String contents;

    @ApiModelProperty(value = "原值")
    private String originalValue;

    @ApiModelProperty(value = "规格及型号")
    private String specificationsAndModels;

    @ApiModelProperty(value = "产地")
    private String placeOfOrigin;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "拓展字段")
    private String ext1;

    @ApiModelProperty(value = "拓展字段")
    private String ext2;

    @ApiModelProperty(value = "拓展字段")
    private String ext3;

    @ApiModelProperty(value = "拓展字段")
    private String ext4;

    @ApiModelProperty(value = "拓展字段")
    private String ext5;

    @ApiModelProperty(value = "拓展字段")
    private Long orgId;

    @ApiModelProperty(value = "拓展字段")
    private String orgPath;

    @ApiModelProperty(value = "明细名称")
    private String attachmentName;

    @ApiModelProperty(value = "中央财政-经费申请数(万元)")
    private String centralFin;

    @ApiModelProperty(value = "主管部门-经费申请数(万元)")
    private String department;

    @ApiModelProperty(value = "其它-经费申请数(万元)")
    private String other;
}

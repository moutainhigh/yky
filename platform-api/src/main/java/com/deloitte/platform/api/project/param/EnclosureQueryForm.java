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
 * @Date : Create in 2019-06-14
 * @Description :   Enclosure查询from对象
 * @Modified :
 */
@ApiModel("Enclosure查询表单")
@Data
public class EnclosureQueryForm extends BaseQueryForm<EnclosureQueryParam>  {


    @ApiModelProperty(value = "编号 ID")
    private Long id;

    @ApiModelProperty(value = "附件编号")
    private String enclosureId;

    @ApiModelProperty(value = "附件名称")
    private String enclosureName;

    @ApiModelProperty(value = "附件类型")
    private String enclosureType;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建者")
    private String createBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "更新者")
    private String updateBy;

    @ApiModelProperty(value = "拓展字段1")
    private String ext1;

    @ApiModelProperty(value = "拓展字段2")
    private String ext2;

    @ApiModelProperty(value = "拓展字段3")
    private String ext3;

    @ApiModelProperty(value = "拓展字段4")
    private String ext4;

    @ApiModelProperty(value = "拓展字段5")
    private String ext5;

    @ApiModelProperty(value = "数据权限维度字段org_id")
    private Long orgId;

    @ApiModelProperty(value = "数据权限维度字段org_path")
    private String orgPath;

    @ApiModelProperty(value = "申报书ID")
    private String applicationId;

    @ApiModelProperty(value = "附件文件服务地址")
    private String enclosureUrl;

    @ApiModelProperty(value = "文件服务器文件ID")
    private String fileId;

    @ApiModelProperty(value = "项目ID")
    private String projectId;

    @ApiModelProperty(value = "上传时间")
    private String uploadTime;

    @ApiModelProperty(value = "评审id")
    private String reviewId;

    @ApiModelProperty(value = "项目维护id")
    private String mianId;

    @ApiModelProperty(value = "项目执行变更id")
    private String changeId;

    @ApiModelProperty(value = "项目评价id,区分字段")
    private String projectEvaluationId;

    @ApiModelProperty(value = "项目（申报书）取消id,区分字段")
    private String applicationCancelId;
}
package com.deloitte.platform.api.project.vo;
import com.deloitte.platform.common.core.entity.form.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import java.time.LocalDateTime;
import java.sql.Blob;

/**
 * @Author : zhengchun
 * @Date : Create in 2019-06-06
 * @Description : ExeRepHis新增修改form对象
 * @Modified :
 */
@ApiModel("新增ExeRepHis表单")
@Data
public class ExeRepHisForm extends BaseForm {
    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "执行审批记录id")
    private String repHisId;

    @ApiModelProperty(value = "执行审批表id")
    private String exeReplyId;

    @ApiModelProperty(value = "审批部门id")
    private String replyPartId;

    @ApiModelProperty(value = "审批部门name")
    private String replyPartName;

    @ApiModelProperty(value = "审批意见")
    private String replyAdv;

    @ApiModelProperty(value = "审批结论code")
    private String replyEndCode;

    @ApiModelProperty(value = "审批结论name")
    private String replyEndName;

    @ApiModelProperty(value = "拓展1")
    private String ext1;

    @ApiModelProperty(value = "拓展2")
    private String ext2;

    @ApiModelProperty(value = "拓展3")
    private String ext3;

    @ApiModelProperty(value = "维度")
    private Long orgId;

    @ApiModelProperty(value = "维度path")
    private String orgPath;

    @ApiModelProperty(value = "申报书id")
    private String applicationId;

    @ApiModelProperty(value = "项目id")
    private String projectId;

    @ApiModelProperty(value = "评审人id")
    private String repPersonId;

    @ApiModelProperty(value = "评审人name")
    private String repPersonName;

    @ApiModelProperty(value = "审批部门id")
    private String repDepartmentId;

    @ApiModelProperty(value = "审批部门name")
    private String repDepartmentName;

    @ApiModelProperty(value = "项目维护id")
    private String maintenanceId;

    @ApiModelProperty(value = "项目批复id")
    private String replyId;

}

package com.deloitte.platform.api.hr.gcc.vo;
import com.deloitte.platform.common.core.entity.form.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * @Author : jianglong
 * @Date : Create in 2019-04-01
 * @Description : GccConferenceReport新增修改form对象
 * @Modified :
 */
@ApiModel("新增GccConferenceReport表单")
@Data
public class GccConferenceReportForm extends BaseForm {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "人员编号")
    private Long userId;

    @ApiModelProperty(value = "人员姓名")
    private String userName;

    @ApiModelProperty(value = "时间")
    private LocalDateTime reportTime;

    @ApiModelProperty(value = "地点")
    private String site;

    @ApiModelProperty(value = "会议名称")
    private String reportName;

    @ApiModelProperty(value = "报告性质")
    private String reportProperty;

    @ApiModelProperty(value = "组织代码")
    private String orgCode;

    @ApiModelProperty(value = "审核状态")
    private String auditStatus;

}

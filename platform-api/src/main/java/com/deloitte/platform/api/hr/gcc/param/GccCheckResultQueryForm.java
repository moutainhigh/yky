package com.deloitte.platform.api.hr.gcc.param;
import com.deloitte.platform.common.core.entity.form.BaseQueryForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * @Author : jianglong
 * @Date : Create in 2019-04-01
 * @Description :   GccCheckResult查询from对象
 * @Modified :
 */
@ApiModel("GccCheckResult查询表单")
@Data
public class GccCheckResultQueryForm extends BaseQueryForm<GccCheckResultQueryParam>  {


    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "项目主管单位")
    private String projectUnit;

    @ApiModelProperty(value = "项目名称")
    private String projectName;

    @ApiModelProperty(value = "项目类别")
    private String projectCatagroy;

    @ApiModelProperty(value = "人员编号")
    private Long userId;

    @ApiModelProperty(value = "人员姓名")
    private String userName;

    @ApiModelProperty(value = "人员单位")
    private String userUnit;

    @ApiModelProperty(value = "考核类型")
    private String checkType;

    @ApiModelProperty(value = "考核年度")
    private String checkYear;

    @ApiModelProperty(value = "考核日期")
    private LocalDateTime checkTime;

    @ApiModelProperty(value = "考核结果")
    private String checkResult;

    @ApiModelProperty(value = "考核分数")
    private String checkScroe;

    @ApiModelProperty(value = "所院考核进度")
    private String syCheckProgress;

    @ApiModelProperty(value = "所院考核结果")
    private String syCheckResult;

    @ApiModelProperty(value = "院校考核进度")
    private String yxCheckProgress;

    @ApiModelProperty(value = "院校考核结果")
    private String yxCheckResult;

    @ApiModelProperty(value = "备注")
    private String remarks;

    @ApiModelProperty(value = "附件")
    private Long enclosure;

    @ApiModelProperty(value = "组织代码")
    private String orgCode;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人id")
    private Long createBy;

    @ApiModelProperty(value = "修改人id")
    private Long updateBy;
}

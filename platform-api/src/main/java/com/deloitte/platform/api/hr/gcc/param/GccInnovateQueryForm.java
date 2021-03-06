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
 * @Description :   GccInnovate查询from对象
 * @Modified :
 */
@ApiModel("GccInnovate查询表单")
@Data
public class GccInnovateQueryForm extends BaseQueryForm<GccInnovateQueryParam>  {


    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "人员编号")
    private Long userId;

    @ApiModelProperty(value = "人员姓名")
    private String userName;

    @ApiModelProperty(value = "教材名称")
    private String bookName;

    @ApiModelProperty(value = "出版社")
    private String publishing;

    @ApiModelProperty(value = "出版年份")
    private String publishYear;

    @ApiModelProperty(value = "编著情况")
    private String compile;

    @ApiModelProperty(value = "排名")
    private String ranking;

    @ApiModelProperty(value = "成效情况")
    private String results;

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

    @ApiModelProperty(value = "审核状态")
    private String auditStatus;
}

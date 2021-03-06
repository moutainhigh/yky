package com.deloitte.platform.api.isump.param;
import com.deloitte.platform.common.core.entity.form.BaseQueryForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author : jianglong
 * @Date : Create in 2019-02-28
 * @Description :   Organization查询from对象
 * @Modified :
 */
@ApiModel("Organization查询表单")
@Data
public class OrganizationQueryForm extends BaseQueryForm<OrganizationQueryParam>  {


    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "上级ID")
    private Long parentId;

    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "状态")
    private String state;

    @ApiModelProperty(value = "排序")
    private Long sort;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "预留字段1")
    private String reserve;

    @ApiModelProperty(value = "预留字段2")
    private String version;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人ID")
    private Long createBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "更新人ID")
    private Long updateBy;

    @ApiModelProperty(value = "上级code")
    private String parentCode;

    @ApiModelProperty(value = "code")
    private String code;

    @ApiModelProperty(value = "路径")
    private String path;

    @ApiModelProperty(value = "统一信用代码")
    private String commonCreditCode;

    @ApiModelProperty(value = "in 的id集合")
    private List<String> ids;

    @ApiModelProperty(value = "in 的code集合")
    private List<String> codes;

    @ApiModelProperty(value = "分组（ 虚拟组：fiction）")
    private String groupType;

    @ApiModelProperty(value = "处室负责人")
    private String dutyperson;

    @ApiModelProperty(value = "分管领导")
    private String leader;

    @ApiModelProperty(value = "简称")
    private String simpleName;

    @ApiModelProperty(value = "层级")
    private String orgLevel;
}

package com.deloitte.platform.api.hr.gcc.param;

import com.deloitte.platform.common.core.entity.form.BaseQueryForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author : liangjinghai
 * @Date : Create in 2019-04-08
 * @Description :   GccGroupUser查询from对象
 * @Modified :
 */
@ApiModel("GccGroupUser查询表单")
@Data
public class GccGroupUserQueryForm extends BaseQueryForm<GccGroupUserQueryParam>  {


    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "人员信息id")
    private Long userId;

    @ApiModelProperty(value = "专家小组编号")
    private Long groupId;

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

    @ApiModelProperty(value = "人员姓名")
    private String userName;
}

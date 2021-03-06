package com.deloitte.platform.api.hr.train.param;
import com.deloitte.platform.common.core.entity.form.BaseQueryForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * @Author : ZhongJiang
 * @Date : Create in 2019-04-02
 * @Description :   CompanyTrainApply查询from对象
 * @Modified :
 */
@ApiModel("CompanyTrainApply查询表单")
@Data
public class CompanyTrainApplyQueryForm extends BaseQueryForm<CompanyTrainApplyQueryParam>  {


    @ApiModelProperty(value = "${field.comment}")
    private Long id;

    @ApiModelProperty(value = "培训班名称")
    private String trainClassName;

    @ApiModelProperty(value = "培训内容")
    private String trainContent;

    @ApiModelProperty(value = "培训对象")
    private String trainObject;

    @ApiModelProperty(value = "期数")
    private String stage;

    @ApiModelProperty(value = "人数/期")
    private String numbers;

    @ApiModelProperty(value = "举办地点")
    private String address;

    @ApiModelProperty(value = "天数/期")
    private String days;

    @ApiModelProperty(value = "主办部门")
    private String sponDep;

    @ApiModelProperty(value = "协力部门")
    private String assistDep;

    @ApiModelProperty(value = "经费")
    private Long funds;

    @ApiModelProperty(value = "列支渠道")
    private String channel;

    @ApiModelProperty(value = "是否公开（1公开, 2不公开）")
    private String isopen;

    @ApiModelProperty(value = "备注")
    private String remake;

    @ApiModelProperty(value = "${field.comment}")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "${field.comment}")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "${field.comment}")
    private String careteBy;

    @ApiModelProperty(value = "${field.comment}")
    private String updateBy;

    @ApiModelProperty(value = "${field.comment}")
    private String orgCoode;

    @ApiModelProperty(value = "申请单位名称")
    private String trainDeptname;

    @ApiModelProperty(value = "1 单位 2 部门")
    private String trainType;

    @ApiModelProperty(value = "发起申请员的员工---工表ID")
    private String empId;
}

package com.deloitte.platform.api.hr.recruitment.param;
import com.deloitte.platform.common.core.entity.form.BaseQueryForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author : tankui
 * @Date : Create in 2019-04-25
 * @Description :   ZpcpBudget查询from对象
 * @Modified :
 */
@ApiModel("ZpcpBudget查询表单")
@Data
public class ZpcpBudgetQueryForm extends BaseQueryForm<ZpcpBudgetQueryParam>  {

    @ApiModelProperty(value = "教职工编号")
    private Long empCode;

    @ApiModelProperty(value = "年份")
    private String year;

    @ApiModelProperty(value = "批次")
    private String batch;

    @ApiModelProperty(value = "教职工姓名")
    private String name;

    @ApiModelProperty(value = "单位编号")
    private String deptCode;

    @ApiModelProperty(value = "岗位编号")
    private String stationCode;

    @ApiModelProperty(value = "聘用类型编号")
    private String employCoder;

    @ApiModelProperty(value = "聘用状态")
    private String employmentStatus;

    /*@ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "职工编号")
    private String empCode;

    @ApiModelProperty(value = "在聘信息表id")
    private Long infoId;

    @ApiModelProperty(value = "基本年薪总额")
    private Long totalSalay;

    @ApiModelProperty(value = "安家预算总额（元）")
    private Long totalSettle;

    @ApiModelProperty(value = "备注")
    private String remarks;

    @ApiModelProperty(value = "年度")
    private String year;

    @ApiModelProperty(value = "拨付安家费")
    private Long settlPay;

    @ApiModelProperty(value = "组织代码")
    private String organizationCode;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人id")
    private Long createBy;

    @ApiModelProperty(value = "修改人id")
    private Long updateBy;*/
}
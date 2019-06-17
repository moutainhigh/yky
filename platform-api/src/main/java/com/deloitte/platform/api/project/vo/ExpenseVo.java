package com.deloitte.platform.api.project.vo;
import com.deloitte.platform.common.core.entity.vo.BaseVo;
import lombok.AllArgsConstructor;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.sql.Blob;

/**
 * @Author : zhengchun
 * @Date : Create in 2019-05-30
 * @Description : Expense返回的VO对象
 * @Modified :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    private String id;

    @ApiModelProperty(value = "立项支出汇总ID")
    private String expenseId;

    @ApiModelProperty(value = "项目批复书ID")
    private String projectApprovalId;

    @ApiModelProperty(value = "预算年度")
    private String budgetYear;

    @ApiModelProperty(value = "支出计划")
    private String expensePlan;

    @ApiModelProperty(value = "FIN_ALLOCATION_BEGINNING_YEAR 年初财政拨款")
    private String finAllocationEarly;

    @ApiModelProperty(value = "FIN_CARRY_OVER_BEGINNING_YEAR 年初结转资金")
    private String finCarryOverEarly;

    @ApiModelProperty(value = "调整财政拨款")
    private String adjFinancialAllocation;

    @ApiModelProperty(value = "调整结转资金")
    private String adjFinancialCarryOver;

    @ApiModelProperty(value = "全年财政拨款")
    private String finAllocationAllYear;

    @ApiModelProperty(value = "全年结转资金")
    private String finCarryOverAllYear;

    @ApiModelProperty(value = "支出财政拨款")
    private String finAllocationBudget;

    @ApiModelProperty(value = "支出结转资金")
    private String finCarryOverBudget;

    @ApiModelProperty(value = "FIN_ALLOCATION_REST_OF_YEAR 年度剩余财政拨款")
    private String finAllocationSurplus;

    @ApiModelProperty(value = "FIN_CARRY_OVER_REST_OF_YEAR 年度剩余结转资金")
    private String finCarryOverSurplus;

    @ApiModelProperty(value = "FIN_ALLOCATION_REST_OF_FACT_YEAR 实际年度剩余财政拨款")
    private String finAllocationFactSurplus;

    @ApiModelProperty(value = "FIN_CARRY_OVER_REST_OF_FACT_YEAR 实际年度剩余结转资金")
    private String finCarryOverFactSurplus;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建者")
    private String createBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "更新者")
    private String updateBy;

    @ApiModelProperty(value = "数据权限维度字段ORG_ID")
    private Long orgId;

    @ApiModelProperty(value = "数据权限维度字段ORG_PATH")
    private String orgPath;

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

    @ApiModelProperty(value = "项目id")
    private String projectId;

    @ApiModelProperty(value = "申报书id")
    private String applicationId;

}

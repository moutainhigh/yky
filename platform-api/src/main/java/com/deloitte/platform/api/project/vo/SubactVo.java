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
 * @Date : Create in 2019-05-28
 * @Description : Subact返回的VO对象
 * @Modified :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubactVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private String id;

    @ApiModelProperty(value = "活动ID")
    private String subactId;

    @ApiModelProperty(value = "项目活动ID")
    private String actId;

    @ApiModelProperty(value = "子活动")
    private String subact;

    @ApiModelProperty(value = "子活动描述")
    private String subactAbs;

    @ApiModelProperty(value = "创建")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "评审金额")
    private Long reviewAmount;

    @ApiModelProperty(value = "拓展字段")
    private String ext2;

    @ApiModelProperty(value = "拓展字段")
    private String ext3;

    @ApiModelProperty(value = "拓展字段")
    private String ext4;

    @ApiModelProperty(value = "拓展字段")
    private String ext5;

    @ApiModelProperty(value = "拓展字段")
    private Long orgId;

    @ApiModelProperty(value = "拓展字段")
    private String orgPath;

    @ApiModelProperty(value = "父子活动对应关系关联字段")
    private String isRelated;

    @ApiModelProperty(value = "申报书id")
    private String applicationId;

    @ApiModelProperty(value = "数量/频率")
    private String quantityFrenquence;

    @ApiModelProperty(value = "分项支出")
    private String subExpense;

    @ApiModelProperty(value = "价格/标准")
    private String priceStandard;

    @ApiModelProperty(value = "支出计划")
    private String actPlan;

    @ApiModelProperty(value = "备注")
    private String remarks;

    @ApiModelProperty(value = "父活动名称")
    private String actName;

    @ApiModelProperty(value = "父活动描述")
    private String actAbs;

}

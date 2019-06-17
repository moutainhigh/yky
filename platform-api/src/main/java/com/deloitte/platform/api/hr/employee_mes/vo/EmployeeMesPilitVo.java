package com.deloitte.platform.api.hr.employee_mes.vo;
import com.baomidou.mybatisplus.annotation.TableField;
import com.deloitte.platform.common.core.entity.vo.BaseVo;
import lombok.AllArgsConstructor;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.sql.Blob;

/**
 * @Author : ZhongJiang
 * @Date : Create in 2019-05-08
 * @Description : EmployeeMesPilit返回的VO对象
 * @Modified :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeMesPilitVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "政治面貌")
    private String segment1;

    @ApiModelProperty(value = "入团/党日期")
    private LocalDateTime segment2;

    @ApiModelProperty(value = "转正日期")
    private LocalDateTime segment3;

    @ApiModelProperty(value = "介绍人1")
    private String segment4;

    @ApiModelProperty(value = "介绍人2")
    private String segment5;

    @ApiModelProperty(value = "入党所在单位")
    private String segment6;

    @ApiModelProperty(value = "所属党委")
    private String segment7;

    @ApiModelProperty(value = "所属支部")
    private String segment8;

    @ApiModelProperty(value = "党内职务")
    private String segment9;

    @ApiModelProperty(value = "转入时间")
    private LocalDateTime segment10;

    @ApiModelProperty(value = "自何处转入")
    private String segment11;

    @ApiModelProperty(value = "转出时间")
    private LocalDateTime segment12;

    @ApiModelProperty(value = "转出何处")
    private String segment13;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "创建人")
    private String careteBy;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "审批状态")
    private String applyState;

    @ApiModelProperty(value = "员工修改信息表ID")
    private String empMesId;

}
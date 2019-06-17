package com.deloitte.platform.api.srpmp.project.mpr.vo;
import com.deloitte.platform.common.core.entity.vo.BaseVo;
import lombok.AllArgsConstructor;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.sql.Blob;
import java.util.List;

/**
 * @Author : LIJUN
 * @Date : Create in 2019-04-10
 * @Description : MprUnitEvaInfo返回的VO对象
 * @Modified :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MprUnitEvaInfoVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    private String id;

    @ApiModelProperty(value = "项目编号")
    private String projectNo;

    @ApiModelProperty(value = "承担单位（盖章）")
    private String bearerUnit;

    @ApiModelProperty(value = "承担单位负责人（签章）")
    private String bearerUnitManager;

    @ApiModelProperty(value = "报告时间")
    private String reportDate;

    @ApiModelProperty(value = "创建日期")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建者")
    private String createBy;

    @ApiModelProperty(value = "更新日期")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "更新者")
    private String updateBy;

    @ApiModelProperty(value = "审核状态")
    private String processStatus;

    @ApiModelProperty(value = "组织管理情况")
    private String orgManaInfo;

    @ApiModelProperty(value = "服务支撑情况")
    private String serviceSupInfo;

    @ApiModelProperty(value = "监督履责情况")
    private String monitorRespInfo;

    @ApiModelProperty(value = "成果管理情况")
    private String resultManaInfo;

    @ApiModelProperty(value = "实施成效")
    private String implEffect;

    @ApiModelProperty(value = "实施建议")
    private String implAdvice;

    @ApiModelProperty(value = "单位code")
    private String deptCode;

    @ApiModelProperty(value = "单位名称")
    private String deptName;

    @ApiModelProperty(value = "年度")
    private String year;

    @ApiModelProperty(value = "文件信息")
    private MprEvaFileInfoFieldForm fileInfo;

    @ApiModelProperty(value = "审核文件信息")
    private List<MprEvaFileInfoFieldForm> auditFileInfo;

}

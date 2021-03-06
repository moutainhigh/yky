package com.deloitte.platform.api.srpmp.project.apply.vo;
import com.alibaba.fastjson.JSONObject;
import com.deloitte.platform.api.srpmp.common.config.LongJsonSerializer;
import com.deloitte.platform.api.srpmp.project.base.vo.SrpmsProjectAttachmentVo;
import com.deloitte.platform.api.srpmp.project.base.vo.SrpmsProjectPersonJoinVo;
import com.deloitte.platform.common.core.entity.vo.BaseVo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.sql.Blob;
import java.util.List;

/**
 * @Author : lixin
 * @Date : Create in 2019-05-22
 * @Description : SrpmsProjectApplyInnUnit返回的VO对象
 * @Modified :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SrpmsProjectApplyInnUnitVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "项目ID")
    private String id;

    @ApiModelProperty(value = "项目名称")
    private String projectName;

    @ApiModelProperty(value = "英文名称")
    private String projectEgName;

    @ApiModelProperty(value = "学科门类")
    private String subjectCategory;

    @ApiModelProperty(value = "学科名称")
    private String subjectName;

    @ApiModelProperty(value = "活动类型")
    private String achievementType;

    @ApiModelProperty(value = "教育经历")
    private String leadPersonEducationExp;

    @ApiModelProperty(value = "科研经历")
    private String leadPersonResearchExp;

    @ApiModelProperty(value = "主要研究方向与内容简介")
    private String leadPersonIntro;

    @ApiModelProperty(value = "建设的目的和意义")
    private String projectTarget;

    @ApiModelProperty(value = "现有研究工作的基础、水平、标准情况")
    private String situationAndBenifit;

    @ApiModelProperty(value = "国内外本领域发展现状及趋势")
    private String domainSituation;

    @ApiModelProperty(value = "对标情况")
    private String benchMarking;

    @ApiModelProperty(value = "发展前景")
    private String prospect;

    @ApiModelProperty(value = "主要研究方向、研究内容及研究团队构成")
    private String teamDirection;

    @ApiModelProperty(value = "未来5年创新单元建设发展目标")
    private String developmentGoal;

    @ApiModelProperty(value = "未来5年创新单元研发投入计划")
    private String budgetPlan;

    @ApiModelProperty(value = "目前已具备科研条件")
    private String currentConditions;

    @ApiModelProperty(value = "未来5年内科研条件和配套设施改善计划")
    private String futureConditions;

    @ApiModelProperty(value = "创新单元主任、主要骨干简介")
    private String teamIntro;

    @ApiModelProperty(value = "依托单位学术委员会意见")
    private SrpmsProjectAttachmentVo attachmentCommittee;

    @ApiModelProperty(value = "依托单位的意见")
    private SrpmsProjectAttachmentVo attachmentAudit;

    @ApiModelProperty(value = "依托单位诚信申报承诺")
    private SrpmsProjectAttachmentVo attachmentStatement;

    @ApiModelProperty(value = "中国医学科学院意见")
    private SrpmsProjectAttachmentVo attachmentDept;

    @ApiModelProperty(value = "项目总数")
    private String otherProjectAmout;

    @ApiModelProperty(value = "经费总数")
    private String otherBudgetAmout;

    @ApiModelProperty(value = "年度经费")
    private String otherYearBudget;

    @ApiModelProperty(value = "创建日期")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建者")
    private String createBy;

    @ApiModelProperty(value = "更新日期")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "更新者")
    private String updateBy;

    @ApiModelProperty(value = "依托单位信息JSON")
    private JSONObject leadDept;

    @ApiModelProperty(value = "单元主任信息JSON")
    private JSONObject leadPerson;

    @ApiModelProperty(value = "附件")
    private List<SrpmsProjectAttachmentVo> attachmentFile;

    @ApiModelProperty(value = "近5年承担的重要科研项目清单")
    private List<SrpmsProjectPersonJoinVo> topMemberOtherTaskList;

    @ApiModelProperty(value = "主要参与人员")
    private List<SrpmsProjectPersonJoinVo> mainMemberList;

}

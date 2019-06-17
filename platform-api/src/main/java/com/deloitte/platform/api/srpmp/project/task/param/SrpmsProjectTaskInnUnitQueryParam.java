package com.deloitte.platform.api.srpmp.project.task.param;
import com.deloitte.platform.common.core.entity.param.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.sql.Blob;

/**

 * @Author : lixin
 * @Date : Create in 2019-05-22
 * @Description :  SrpmsProjectTaskInnUnit查询参数
 * @Modified :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SrpmsProjectTaskInnUnitQueryParam extends BaseParam {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String projectName;
    private String projectEgName;
    private String subjectCategory;
    private String subjectName;
    private String achievementType;
    private String leadPersonEducationExp;
    private String leadPersonResearchExp;
    private String leadPersonIntro;
    private String projectTarget;
    private String situationAndBenifit;
    private String domainSituation;
    private String benchMarking;
    private String prospect;
    private String teamDirection;
    private String developmentGoal;
    private String budgetPlan;
    private String currentConditions;
    private String futureConditions;
    private String teamIntro;
    private String otherProjectAmout;
    private String otherBudgetAmout;
    private String otherYearBudget;
    private LocalDateTime createTime;
    private String createBy;
    private LocalDateTime updateTime;
    private String updateBy;

}

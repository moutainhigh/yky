package com.deloitte.platform.api.srpmp.project.base.param;
import com.deloitte.platform.common.core.entity.form.BaseQueryForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author : pengchao
 * @Date : Create in 2019-03-11
 * @Description :   SrpmsProject查询from对象
 * @Modified :
 */
@ApiModel("SrpmsProject查询表单")
@Data
public class SrpmsProjectQueryForm extends BaseQueryForm<SrpmsProjectQueryParam>  {

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "项目名称")
    private String projectName;

    @ApiModelProperty(value = "项目编号")
    private String projectNum;

    @ApiModelProperty(value = "申请书编号")
    private String aplNum;

    @ApiModelProperty(value = "预算书编号")
    private String budNum;

    @ApiModelProperty(value = "任务书编号")
    private String tasNum;

    @ApiModelProperty(value = "公示件编号")
    private String pudNum;

    @ApiModelProperty(value = "批复件编号")
    private String apdNum;

    @ApiModelProperty(value = "申报年度")
    private String applyYear;

    @ApiModelProperty(value = "项目类型CODE")
    private String projectCategory;

    @ApiModelProperty(value = "项目类型（最小分类）")
    private String projectType;

    @ApiModelProperty(value = "项目执行期限开始")
    private LocalDateTime projectActionDateStart;

    @ApiModelProperty(value = "项目执行期限结束")
    private LocalDateTime projectActionDateEnd;

    @ApiModelProperty(value = "项目负责人ID")
    private Long leadPersonId;

    @ApiModelProperty(value = "共同首席专家ID")
    private Long bothTopExpertPersonId;

    @ApiModelProperty(value = "负责人信息JSON")
    private String leadPerson;

    @ApiModelProperty(value = "共同负责人信息JSON")
    private String bothTopExpertPerson;

    @ApiModelProperty(value = "承担单位ID")
    private Long leadDeptId;

    @ApiModelProperty(value = "承担单位信息JSON")
    private String leadDept;

    @ApiModelProperty(value = "项目角色CODE")
    private String projectRole;

    @ApiModelProperty(value = "学科分类CODE")
    private String subjectCategory;

    @ApiModelProperty(value = "项目状态 0：未提交 10：已提交(待审核) 15：二级已审核  20：已审核通过  30：已审核拒绝 40：已公示  50：已批复  ")
    private String status;

    @ApiModelProperty(value = "公示时间")
    private LocalDateTime publicTime;

    @ApiModelProperty(value = "批复时间")
    private LocalDateTime approveTime;

    @ApiModelProperty(value = "删除标识位")
    private String delFlg;

    @ApiModelProperty(value = "项目标识位")
    private String projectFlag;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "申请书文件ID")
    private Long applyBookFileId;

    @ApiModelProperty(value = "申请书文件URL")
    private String applyBookFileUrl;

    @ApiModelProperty(value = "申请书文件文件名")
    private String applyBookFileName;

    @ApiModelProperty(value = "预算书申请书文件ID")
    private Long budgetBookFileId;

    @ApiModelProperty(value = "预算申请书文件文件URL")
    private String budgetBookFileUrl;

    @ApiModelProperty(value = "预算申请书文件文件名")
    private String budgetBookFileName;

    @ApiModelProperty(value = "申请书预算书首次打开标志")
    private String budFirstOpenFlg;

    @ApiModelProperty(value = "任务书首次打开标志")
    private String taskFirstOpenFlg;

    @ApiModelProperty(value = "任务书预算书首次打开标志")
    private String taskBudFirstOpenFlg;

    @ApiModelProperty(value = "任务书文件ID")
    private Long taskBookFileId;

    @ApiModelProperty(value = "任务书文件名")
    private String taskBookFileName;

    @ApiModelProperty(value = "任务书文件URL")
    private String taskBookFileUrl;

    @ApiModelProperty(value = "公示文件文件ID")
    private Long publishBookFileId;

    @ApiModelProperty(value = "公示文件文件名")
    private String publishBookFileName;

    @ApiModelProperty(value = "公示文件文件URL")
    private String publishBookFileUrl;

    @ApiModelProperty(value = "批复文件文件ID")
    private Long approveBookFileId;

    @ApiModelProperty(value = "批复文件文件名")
    private String approveBookFileName;

    @ApiModelProperty(value = "批复文件文件URL")
    private String approveBookFileUrl;

    @ApiModelProperty(value = "预算任务书文件ID")
    private Long budgetTaskBookFileId;

    @ApiModelProperty(value = "预算任务书文件文件URL")
    private String budgetTaskBookFileUrl;

    @ApiModelProperty(value = "预算任务书文件文件名")
    private String budgetTaskBookFileName;

    @ApiModelProperty(value = "显示table标识,1-PI，2-管理员")
    private int tableFlag;

    @ApiModelProperty(value = "管理员查询我的数据标识")
    private int selfDataFlag;

    @ApiModelProperty(value = "菜单标识")
    private int menuFlag;

    @ApiModelProperty(value = "项目类型list集合")
    private String[] projectTypeArr;
    @ApiModelProperty(value = "状态list集合")
    private String[] statusArr;
}

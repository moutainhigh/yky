package com.deloitte.platform.api.hr.registrationResultEnquiry.vo;

import com.deloitte.platform.common.core.entity.vo.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author : zengshuai
 * @Date : Create in 2019-04-04
 * @Description : HrGraduateInformation返回的VO对象
 * @Modified :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HrGraduateInformationVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "用户ID")
    private String userId;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "性别：男，女")
    private String gender;

    @ApiModelProperty(value = "民族")
    private String nation;

    @ApiModelProperty(value = "出生年月")
    private LocalDateTime dateOfBirth;

    @ApiModelProperty(value = "身高")
    private Long height;

    @ApiModelProperty(value = "血型")
    private String bloodType;

    @ApiModelProperty(value = "政治面貌")
    private String politicsStatus;

    @ApiModelProperty(value = "婚否")
    private String maritalStatus;

    @ApiModelProperty(value = "最高学历")
    private String highestEducation;

    @ApiModelProperty(value = "证件类型")
    private String certificateType;

    @ApiModelProperty(value = "证件号码")
    private String certificateNumber;

    @ApiModelProperty(value = "最高学位")
    private String highestDegree;

    @ApiModelProperty(value = "毕业院校")
    private String graduateSchool;

    @ApiModelProperty(value = "所学专业")
    private String major;

    @ApiModelProperty(value = "照片地址")
    private String photoPath;

    @ApiModelProperty(value = "外语水平")
    private String foreignLanguageLevel;

    @ApiModelProperty(value = "计算机水平")
    private String computerAbility;

    @ApiModelProperty(value = "户口所在地")
    private String householdLocation;

    @ApiModelProperty(value = "通讯地址及邮编")
    private String mailingAddress;

    @ApiModelProperty(value = "手机号码")
    private String cellPhoneNumber;

    @ApiModelProperty(value = "座机号码")
    private String landlineNumber;

    @ApiModelProperty(value = "家庭住址")
    private String familyAddress;

    @ApiModelProperty(value = "电子邮箱")
    private String emailAddress;

    @ApiModelProperty(value = "应聘岗位及编号")
    private String positionAndNumber;

    @ApiModelProperty(value = "现居住城市")
    private String currentCity;

    @ApiModelProperty(value = "工作单位及主要内容或科研课题及主要成果")
    private String mainAchievements;

    @ApiModelProperty(value = "所获奖励或荣誉名称及授予单位")
    private String rewards;

    @ApiModelProperty(value = "自我评价")
    private String selfAssessment;

    @ApiModelProperty(value = "状态：已提交，未提交")
    private String status;

    @ApiModelProperty(value = "学制（年）")
    private Long schoolingLength;

    @ApiModelProperty(value = "毕业时间")
    private LocalDateTime graduationDate;

    @ApiModelProperty(value = "外语分数")
    private Long foreignLanguageScores;

    @ApiModelProperty(value = "有无工作经验（不含实习）")
    private String workExperience;

    @ApiModelProperty(value = "工作经验累计时间（年）")
    private Long workingTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人")
    private String careteBy;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "主修课程（只填最高学历主修课程）")
    private String majorCourse;

    @ApiModelProperty(value = "组织编码")
    private String orgCode;

}

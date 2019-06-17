package com.deloitte.platform.api.hr.gcc.param;
import com.deloitte.platform.common.core.entity.form.BaseQueryForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author : jianglong
 * @Date : Create in 2019-04-01
 * @Description :   GccExternalHelp查询from对象
 * @Modified :
 */
@ApiModel("GccExternalHelp查询表单")
@Data
public class GccExternalHelpQueryForm extends BaseQueryForm<GccExternalHelpQueryParam>  {


    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "人员编号")
    private Long userId;

    @ApiModelProperty(value = "人员姓名")
    private String userName;

    @ApiModelProperty(value = "援助类型 0西部之光，1 援疆 ，2 博士服务团")
    private String aidType;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "年份")
    private String[] year;

    @ApiModelProperty(value = "接收单位")
    private String[] receiverUnit;

    @ApiModelProperty(value = "推荐省份")
    private String[] recProvinces;

    @ApiModelProperty(value = "研修导师")
    private String graTeacher;

    @ApiModelProperty(value = "项目名称")
    private String projectName;

    @ApiModelProperty(value = "项目批次")
    private String projectBatch;

    @ApiModelProperty(value = "项目类别")
    private String projectCategory;

    @ApiModelProperty(value = "身份证号")
    private String card;

    @ApiModelProperty(value = "出生日期")
    private LocalDateTime birthday;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "民族")
    private String nation;

    @ApiModelProperty(value = "政治面貌")
    private String politics;

    @ApiModelProperty(value = "学历")
    private String education;

    @ApiModelProperty(value = "学位")
    private String degree;

    @ApiModelProperty(value = "工作单位")
    private String organization;

    @ApiModelProperty(value = "从事专业（二级学科）")
    private String[] majorSecond;

    @ApiModelProperty(value = "专业技术职务")
    private String[] professional;

    @ApiModelProperty(value = "行政职务")
    private String adminPost;

    @ApiModelProperty(value = "拟研修专业及具体方向")
    private String majorSpecific;

    @ApiModelProperty(value = "拟研修单位")
    private String majorUnit;

    @ApiModelProperty(value = "拟研修导师")
    private String majorTeacher;

    @ApiModelProperty(value = "是否省级学术技术带头人 0 否，1 是")
    private String technicalLeader;

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "备注")
    private String remarks;

    @ApiModelProperty(value = "组织代码")
    private String orgCode;

    @ApiModelProperty(value = "${field.comment}")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "${field.comment}")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人id")
    private Long createBy;

    @ApiModelProperty(value = "修改人id")
    private Long updateBy;
}

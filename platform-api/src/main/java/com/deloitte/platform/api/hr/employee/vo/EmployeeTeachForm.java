package com.deloitte.platform.api.hr.employee.vo;
import com.deloitte.platform.common.core.entity.form.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * @Author : ZhongJiang
 * @Date : Create in 2019-04-03
 * @Description : EmployeeTeach新增修改form对象
 * @Modified :
 */
@ApiModel("新增EmployeeTeach表单")
@Data
public class EmployeeTeachForm extends BaseForm {
    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "员工基础信息表ID")
    private Long empId;

    @ApiModelProperty(value = "入学时间")
    private LocalDateTime entranceTime;

    @ApiModelProperty(value = "毕业时间")
    private LocalDateTime graduationTime;

    @ApiModelProperty(value = "毕业学校")
    private String graduateSchool;

    @ApiModelProperty(value = "专业名称")
    private String majorName;

    @ApiModelProperty(value = "学历")
    private String education;

    @ApiModelProperty(value = "学位")
    private String academicDegree;

    @ApiModelProperty(value = "详细学位")
    private String detailedDegree;

    @ApiModelProperty(value = "学习形式")
    private String learningForm;

    @ApiModelProperty(value = "学制")
    private String educSystem;

    @ApiModelProperty(value = "${field.comment}")
    private String careteBy;

}

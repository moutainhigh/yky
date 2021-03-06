package com.deloitte.platform.api.hr.employee_mes.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * @author ：Mr.Zhong
 * @Date ：Created in 2019/5/21 13:40
 */
@Data
@ApiModel("员工自助专业技术信息表单")
public class EmployeeMesLogyResultForm {

    private List<EmployeeMesLogyForm> logyForms;

    private String empMesId;

    private String id;

    private String applyState;
}

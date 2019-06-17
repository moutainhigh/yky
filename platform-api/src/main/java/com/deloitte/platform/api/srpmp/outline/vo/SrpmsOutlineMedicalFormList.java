package com.deloitte.platform.api.srpmp.outline.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author : Apeng
 * @Date : Create in 2019-02-15
 * @Description : SrpmsOutlineMedical返回的FORM对象
 * @Modified :
 */
@ApiModel("SrpmsOutlineMedicalFormList")
@Data
public class SrpmsOutlineMedicalFormList {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "题录-新药器械-新增列表")
    private List<SrpmsOutlineMedicalForm> addOutlineList;

    @ApiModelProperty(value = "题录-新药器械-删除列表")
    private List<SrpmsOutlineMedicalForm> deleteOutlineList;

}

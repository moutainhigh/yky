package com.deloitte.platform.api.srpmp.outline.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author : Apeng
 * @Date : Create in 2019-02-15
 * @Description : SrpmsOutlinePaper返回的FORM对象
 * @Modified :
 */
@ApiModel("SrpmsOutlinePaperFormList")
@Data
public class SrpmsOutlinePaperFormList {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "题录-论文-新增列表")
    private List<SrpmsOutlinePaperForm> addOutlineList;

    @ApiModelProperty(value = "题录-论文-删除列表")
    private List<SrpmsOutlinePaperForm> deleteOutlineList;

}

package com.deloitte.platform.api.fssc.base.param;
import com.deloitte.platform.api.fssc.config.LongJsonDeserializer;
import com.deloitte.platform.api.fssc.config.LongJsonSerializer;
import com.deloitte.platform.common.core.entity.form.BaseQueryForm;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Author : hjy
 * @Date : Create in 2019-02-27
 * @Description :   BaseExpenseMainType查询from对象
 * @Modified :
 */
@ApiModel("支出大类查询表单")
@Data
public class BaseExpenseMainTypeQueryForm extends BaseQueryForm<BaseExpenseMainTypeQueryParam>  {


    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "编码")
    private String code;

    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "是否父值")
    private String parentFlag;

    @ApiModelProperty(value = "父值编码")
    private String parentCode;

    @ApiModelProperty(value = "是否有效")
    private String invalidFlag;

    @ApiModelProperty(value = "生效日期")
    private LocalDateTime validDate;

    @ApiModelProperty(value = "失效日期")
    private LocalDateTime invalidDate;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "排序字段")
    private String sort;

    @ApiModelProperty(value = "排序方向")
    private String sortOrder;

    @ApiModelProperty(value = "关联预算科目ID")
    private String budgetAccountId;

    @ApiModelProperty(value = "是否被科目预算选择")
    private boolean selectByBudgetAccount;

    @ApiModelProperty(value = "单位编码")
    private String unitCode;

}

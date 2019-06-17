package com.deloitte.platform.api.srpmp.common.vo;
import com.deloitte.platform.common.core.entity.vo.BaseVo;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author : Apeng
 * @Date : Create in 2019-05-06
 * @Description : SysDict维护返回的VO对象
 * @Modified :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysDictMainTainChildVo extends BaseVo {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "父级ID")
    private Long parentId;

    @ApiModelProperty(value = "字典编号")
    private String dictCode;

    @ApiModelProperty(value = "节点列表")
    private List<SysDictMainTainNodeVo> sysDictVoList;

}

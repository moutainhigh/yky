package com.deloitte.platform.api.contract.param;
import com.deloitte.platform.common.core.entity.param.BaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**

 * @Author : zhengchun
 * @Date : Create in 2019-03-29
 * @Description :  BasicAttamentMap查询参数
 * @Modified :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasicAttamentMapQueryParam extends BaseParam {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long contractId;
    private Long attamentId;
    private LocalDateTime createTime;
    private String createBy;
    private LocalDateTime updateTime;
    private String updateBy;
    private String isUsed;
    private String spareField1;
    private String spareField2;
    private String spareField3;
    private LocalDateTime spareField4;
    private Long spareField5;
    private String fileName;
    private String fileUrl;
    private Long fileSize;
    private LocalDateTime uploadTime;
    private String fileExt;
    private String fileType;

}
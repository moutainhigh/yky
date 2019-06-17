package com.deloitte.platform.api.portal.vo;
import com.deloitte.platform.common.core.entity.form.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * @Author : yidaojun
 * @Date : Create in 2019-04-03
 * @Description : Notice新增修改form对象
 * @Modified :
 */
@ApiModel("新增Notice表单")
@Data
public class NoticeForm extends BaseForm {
    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "自增长id")
    private Long noticeId;

    @ApiModelProperty(value = "标题")
    private String noticeTitle;

    @ApiModelProperty(value = "点击次数")
    private Long noticeHit;

    @ApiModelProperty(value = " 发布时间")
    private LocalDateTime noticeDatetime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime noticeUpdatetime;

    @ApiModelProperty(value = "文章作者")
    private String noticeAuthor;

    @ApiModelProperty(value = "公告内容")
    private String noticeContent;

    @ApiModelProperty(value = "删除状态")
    private String delFlg;

}

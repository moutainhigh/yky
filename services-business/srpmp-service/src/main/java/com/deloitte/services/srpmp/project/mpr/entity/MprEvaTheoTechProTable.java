package com.deloitte.services.srpmp.project.mpr.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 新理论、新技术、新产品等情况表
 * </p>
 *
 * @author LIJUN
 * @since 2019-03-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("MPR_EVA_THEO_TECH_PRO_TABLE")
@ApiModel(value="MprEvaTheoTechProTable对象", description="新理论、新技术、新产品等情况表")
public class MprEvaTheoTechProTable extends Model<MprEvaTheoTechProTable> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键ID")
    @TableId(value = "ID", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "项目编号")
    @TableField("PROJECT_NO")
    private String projectNo;

    @ApiModelProperty(value = "产出类型")
    @TableField("OUTPUT_TYPE")
    private String outputType;

    @ApiModelProperty(value = "产出名称")
    @TableField("OUTPUT_NAME")
    private String outputName;

    @ApiModelProperty(value = "产生意义")
    @TableField("BRING_MEAN")
    private String bringMean;

    @ApiModelProperty(value = "创建日期")
    @TableField(value = "CREATE_TIME", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建者")
    @TableField(value = "CREATE_BY", fill = FieldFill.INSERT)
    private String createBy;

    @ApiModelProperty(value = "更新日期")
    @TableField(value = "UPDATE_TIME", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "更新者")
    @TableField(value = "UPDATE_BY", fill = FieldFill.INSERT_UPDATE)
    private String updateBy;


    public static final String ID = "ID";

    public static final String PROJECT_NO = "PROJECT_NO";

    public static final String OUTPUT_TYPE = "OUTPUT_TYPE";

    public static final String OUTPUT_NAME = "OUTPUT_NAME";

    public static final String BRING_MEAN = "BRING_MEAN";

    public static final String CREATE_TIME = "CREATE_TIME";

    public static final String CREATE_BY = "CREATE_BY";

    public static final String UPDATE_TIME = "UPDATE_TIME";

    public static final String UPDATE_BY = "UPDATE_BY";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

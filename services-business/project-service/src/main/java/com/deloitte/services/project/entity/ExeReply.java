package com.deloitte.services.project.entity;

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
 * 项目执行审批表
 * </p>
 *
 * @author zhengchun
 * @since 2019-06-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("PROJECT_EXE_REPLY")
@ApiModel(value="ExeReply对象", description="项目执行审批表")
public class ExeReply extends Model<ExeReply> {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "ID", type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "执行审批id")
    @TableField("EXE_REPLY_ID")
    private String exeReplyId;

    @ApiModelProperty(value = "项目id")
    @TableField("PROJECT_ID")
    private String projectId;

    @ApiModelProperty(value = "项目变更id")
    @TableField("CHANGE_ID")
    private String changeId;

    @ApiModelProperty(value = "审批结果code")
    @TableField("EXE_REPLY_CODE")
    private String exeReplyCode;

    @ApiModelProperty(value = "审批结果name")
    @TableField("EXE_REPLY_NAME")
    private String exeReplyName;

    @ApiModelProperty(value = "审批意见")
    @TableField("EXE_REPLY_ADV")
    private String exeReplyAdv;

    @ApiModelProperty(value = "创建时间")
    @TableField(value = "CREATE_TIME", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人")
    @TableField(value = "CREATE_BY", fill = FieldFill.INSERT)
    private String createBy;

    @ApiModelProperty(value = "更新时间")
    @TableField(value = "UPDATE_TIME", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "更新人")
    @TableField(value = "UPDATE_BY", fill = FieldFill.INSERT_UPDATE)
    private String updateBy;

    @ApiModelProperty(value = "拓展1")
    @TableField("EXT1")
    private String ext1;

    @ApiModelProperty(value = "拓展2")
    @TableField("EXT2")
    private String ext2;

    @ApiModelProperty(value = "拓展3")
    @TableField("EXT3")
    private String ext3;

    @ApiModelProperty(value = "拓展4")
    @TableField("EXT4")
    private String ext4;

    @ApiModelProperty(value = "维度id")
    @TableField("ORG_ID")
    private Long orgId;

    @ApiModelProperty(value = "维度path")
    @TableField("ORG_PATH")
    private String orgPath;

    @ApiModelProperty(value = "业务单号流水号")
    @TableField("SERVICE_NUM")
    private String serviceNum;

    @ApiModelProperty(value = "审批人id")
    @TableField("REP_PERSON_ID")
    private String repPersonId;

    @ApiModelProperty(value = "审批人name")
    @TableField("REP_PERSON_NAME")
    private String repPersonName;

    @ApiModelProperty(value = "审批部门id")
    @TableField("REP_DEPARTMENT_ID")
    private String repDepartmentId;

    @ApiModelProperty(value = "审批部门name")
    @TableField("REP_DEPARTMENT_NAME")
    private String repDepartmentName;

    @ApiModelProperty(value = "批复id")
    @TableField("REPLY_ID")
    private String replyId;

    @ApiModelProperty(value = "项目维护id")
    @TableField("MAINTENANCE_ID")
    private String maintenanceId;


    public static final String ID = "ID";

    public static final String EXE_REPLY_ID = "EXE_REPLY_ID";

    public static final String PROJECT_ID = "PROJECT_ID";

    public static final String CHANGE_ID = "CHANGE_ID";

    public static final String EXE_REPLY_CODE = "EXE_REPLY_CODE";

    public static final String EXE_REPLY_NAME = "EXE_REPLY_NAME";

    public static final String EXE_REPLY_ADV = "EXE_REPLY_ADV";

    public static final String CREATE_TIME = "CREATE_TIME";

    public static final String CREATE_BY = "CREATE_BY";

    public static final String UPDATE_TIME = "UPDATE_TIME";

    public static final String UPDATE_BY = "UPDATE_BY";

    public static final String EXT1 = "EXT1";

    public static final String EXT2 = "EXT2";

    public static final String EXT3 = "EXT3";

    public static final String EXT4 = "EXT4";

    public static final String ORG_ID = "ORG_ID";

    public static final String ORG_PATH = "ORG_PATH";

    public static final String SERVICE_NUM = "SERVICE_NUM";

    public static final String REP_PERSON_ID = "REP_PERSON_ID";

    public static final String REP_PERSON_NAME = "REP_PERSON_NAME";

    public static final String REP_DEPARTMENT_ID = "REP_DEPARTMENT_ID";

    public static final String REP_DEPARTMENT_NAME = "REP_DEPARTMENT_NAME";

    public static final String REPLY_ID = "REPLY_ID";

    public static final String MAINTENANCE_ID = "MAINTENANCE_ID";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

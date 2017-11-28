package io.chuangshi.common.base;

import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.Version;
import com.baomidou.mybatisplus.enums.FieldFill;

/**
 * 实体父类
 */
public abstract class CoreEntity<T extends Model> extends Model<T> {

    /**
     * 创建人id
     */
    @TableField("system_create_user_id")
    protected String systemCreateUserId;
    /**
     * 创建时间
     */
    @TableField(value = "system_create_time", fill = FieldFill.INSERT)
    protected Date systemCreateTime;
    /**
     * 更新人
     */
    @TableField("system_update_user_id")
    protected String systemUpdateUserId;
    /**
     * 更新时间
     */
    @TableField(value = "system_update_time", fill = FieldFill.INSERT_UPDATE)
    protected Date systemUpdateTime;
    /**
     * 版本号
     */
    @TableField(value = "system_version", fill = FieldFill.INSERT_UPDATE)
    @Version
    protected Integer systemVersion;
    /**
     * 是否删除
     */
    @TableField(value = "system_status", fill = FieldFill.INSERT)
    @TableLogic
    protected Boolean systemStatus;
    
    public String getSystemCreateUserId() {
        return systemCreateUserId;
    }

    public void setSystemCreateUserId(String systemCreateUserId) {
        this.systemCreateUserId = systemCreateUserId;
    }

    public Date getSystemCreateTime() {
        return systemCreateTime;
    }

    public void setSystemCreateTime(Date systemCreateTime) {
        this.systemCreateTime = systemCreateTime;
    }

    public String getSystemUpdateUserId() {
        return systemUpdateUserId;
    }

    public void setSystemUpdateUserId(String systemUpdateUserId) {
        this.systemUpdateUserId = systemUpdateUserId;
    }

    public Date getSystemUpdateTime() {
        return systemUpdateTime;
    }

    public void setSystemUpdateTime(Date systemUpdateTime) {
        this.systemUpdateTime = systemUpdateTime;
    }

    public Integer getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(Integer systemVersion) {
        this.systemVersion = systemVersion;
    }

    public Boolean getSystemStatus() {
        return systemStatus;
    }

    public void setSystemStatus(Boolean systemStatus) {
        this.systemStatus = systemStatus;
    }
    
    public static final String SYSTEM_CREATE_USER_ID = "system_create_user_id";

    public static final String SYSTEM_CREATE_TIME = "system_create_time";

    public static final String SYSTEM_UPDATE_USER_ID = "system_update_user_id";

    public static final String SYSTEM_UPDATE_TIME = "system_update_time";

    public static final String SYSTEM_VERSION = "system_version";

    public static final String SYSTEM_STATUS = "system_status";
    
}

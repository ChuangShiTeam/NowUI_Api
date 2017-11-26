package io.chuangshi.common.base;

import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.Version;

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
    @TableField("system_create_time")
    protected Date systemCreateTime;
    /**
     * 更新人
     */
    @TableField("system_update_user_id")
    protected String systemUpdateUserId;
    /**
     * 更新时间
     */
    @TableField("system_update_time")
    protected Date systemUpdateTime;
    /**
     * 版本号
     */
    @TableField("system_version")
    @Version
    protected Integer systemVersion;
    /**
     * 是否删除
     */
    @TableField("system_status")
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
    
    
}

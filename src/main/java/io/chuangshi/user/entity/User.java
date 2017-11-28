package io.chuangshi.user.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import io.chuangshi.common.base.CoreEntity;
import io.chuangshi.user.entity.enums.UserTypeEnum;

/**
 * <p>
 * 
 * </p>
 *
 * @author marcus
 * @since 2017-11-23
 */
@TableName("table_user")
public class User extends CoreEntity<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId("user_id")
	private String userId;
    /**
     * 应用id
     */
	@TableField("app_id")
	private String appId;
    /**
     * 用户对象id
     */
	@TableField("object_id")
	private String objectId;
    /**
     * 用户类型
     */
	@TableField("user_type")
	private UserTypeEnum userType;
    /**
     * 用户账号
     */
	@TableField("user_account")
	private String userAccount;
    /**
     * 用户手机号码
     */
	@TableField("user_mobile")
	private String userMobile;
    /**
     * 用户邮箱
     */
	@TableField("user_email")
	private String userEmail;
    /**
     * 用户密码
     */
	@TableField("user_password")
	private String userPassword;
    /**
     * 用户名称
     */
	@TableField("user_name")
	private String userName;
    /**
     * 用户头像
     */
	@TableField("user_avatar")
	private String userAvatar;
    /**
     * 微信open_id
     */
	@TableField("wechat_open_id")
	private String wechatOpenId;
    /**
     * 微信union_id
     */
	@TableField("wechat_union_id")
	private String wechatUnionId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public UserTypeEnum getUserType() {
		return userType;
	}

	public void setUserType(UserTypeEnum userType) {
		this.userType = userType;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAvatar() {
		return userAvatar;
	}

	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}

	public String getWechatOpenId() {
		return wechatOpenId;
	}

	public void setWechatOpenId(String wechatOpenId) {
		this.wechatOpenId = wechatOpenId;
	}

	public String getWechatUnionId() {
		return wechatUnionId;
	}

	public void setWechatUnionId(String wechatUnionId) {
		this.wechatUnionId = wechatUnionId;
	}

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

	public static final String USER_ID = "user_id";

	public static final String APP_ID = "app_id";

	public static final String OBJECT_ID = "object_id";

	public static final String USER_TYPE = "user_type";

	public static final String USER_ACCOUNT = "user_account";

	public static final String USER_MOBILE = "user_mobile";

	public static final String USER_EMAIL = "user_email";

	public static final String USER_PASSWORD = "user_password";

	public static final String USER_NAME = "user_name";

	public static final String USER_AVATAR = "user_avatar";

	public static final String WECHAT_OPEN_ID = "wechat_open_id";

	public static final String WECHAT_UNION_ID = "wechat_union_id";

	public static final String SYSTEM_CREATE_USER_ID = "system_create_user_id";

	public static final String SYSTEM_CREATE_TIME = "system_create_time";

	public static final String SYSTEM_UPDATE_USER_ID = "system_update_user_id";

	public static final String SYSTEM_UPDATE_TIME = "system_update_time";

	public static final String SYSTEM_VERSION = "system_version";

	public static final String SYSTEM_STATUS = "system_status";

	@Override
	protected Serializable pkVal() {
		return this.userId;
	}

	@Override
	public String toString() {
		return "User{" +
			"userId=" + userId +
			", appId=" + appId +
			", objectId=" + objectId +
			", userType=" + userType +
			", userAccount=" + userAccount +
			", userMobile=" + userMobile +
			", userEmail=" + userEmail +
			", userPassword=" + userPassword +
			", userName=" + userName +
			", userAvatar=" + userAvatar +
			", wechatOpenId=" + wechatOpenId +
			", wechatUnionId=" + wechatUnionId +
			", systemCreateUserId=" + systemCreateUserId +
			", systemCreateTime=" + systemCreateTime +
			", systemUpdateUserId=" + systemUpdateUserId +
			", systemUpdateTime=" + systemUpdateTime +
			", systemVersion=" + systemVersion +
			", systemStatus=" + systemStatus +
			"}";
	}
}

package io.chuangshi.user.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import io.chuangshi.common.base.CoreEntity;

/**
 * <p>
 * 
 * </p>
 *
 * @author marcus
 * @since 2017-11-23
 */
@TableName("table_user_role")
public class UserRole extends CoreEntity<UserRole> {

    private static final long serialVersionUID = 1L;

    @TableId("user_role_id")
	private String userRoleId;
    /**
     * 用户id
     */
	@TableField("user_id")
	private String userId;
    /**
     * 角色id
     */
	@TableField("role_id")
	private String roleId;

	public String getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(String userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public static final String USER_ROLE_ID = "user_role_id";

	public static final String USER_ID = "user_id";

	public static final String ROLE_ID = "role_id";

	@Override
	protected Serializable pkVal() {
		return this.userRoleId;
	}

	@Override
	public String toString() {
		return "UserRole{" +
			"userRoleId=" + userRoleId +
			", userId=" + userId +
			", roleId=" + roleId +
			", systemCreateUserId=" + systemCreateUserId +
			", systemCreateTime=" + systemCreateTime +
			", systemUpdateUserId=" + systemUpdateUserId +
			", systemUpdateTime=" + systemUpdateTime +
			", systemVersion=" + systemVersion +
			", systemStatus=" + systemStatus +
			"}";
	}
}

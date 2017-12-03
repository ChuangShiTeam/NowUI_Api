package io.chuangshi.role.entity;

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
@TableName("table_role")
public class Role extends CoreEntity<Role> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色id
     */
    @TableId("role_id")
	private String roleId;
    /**
     * 应用id
     */
	@TableField("app_id")
	private String appId;
    /**
     * 角色名称
     */
	@TableField("role_name")
	private String roleName;
    /**
     * 角色编码
     */
	@TableField("role_code")
	private String roleCode;
    /**
     * 角色备注
     */
	@TableField("role_remark")
	private String roleRemark;


	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleRemark() {
		return roleRemark;
	}

	public void setRoleRemark(String roleRemark) {
		this.roleRemark = roleRemark;
	}

	public static final String ROLE_ID = "roleId";

	public static final String APP_ID = "appId";

	public static final String ROLE_NAME = "roleName";

	public static final String ROLE_CODE = "roleCode";

	public static final String ROLE_REMARK = "roleRemark";

	@Override
	protected Serializable pkVal() {
		return this.roleId;
	}

	@Override
	public String toString() {
		return "Role{" +
			"roleId=" + roleId +
			", appId=" + appId +
			", roleName=" + roleName +
			", roleCode=" + roleCode +
			", roleRemark=" + roleRemark +
			"}";
	}
}

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
@TableName("table_role_resource")
public class RoleResource extends CoreEntity<RoleResource> {

    private static final long serialVersionUID = 1L;

    @TableId("role_resource_id")
	private String roleResourceId;
    /**
     * 角色id
     */
	@TableField("role_id")
	private String roleId;
    /**
     * 资源id
     */
	@TableField("resource_id")
	private String resourceId;


	public String getRoleResourceId() {
		return roleResourceId;
	}

	public void setRoleResourceId(String roleResourceId) {
		this.roleResourceId = roleResourceId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public static final String ROLE_RESOURCE_ID = "role_resource_id";

	public static final String ROLE_ID = "role_id";

	public static final String RESOURCE_ID = "resource_id";

	@Override
	protected Serializable pkVal() {
		return this.roleResourceId;
	}

	@Override
	public String toString() {
		return "RoleResource{" +
			"roleResourceId=" + roleResourceId +
			", roleId=" + roleId +
			", resourceId=" + resourceId +
			"}";
	}
}

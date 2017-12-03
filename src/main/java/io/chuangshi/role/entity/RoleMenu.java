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
@TableName("table_role_menu")
public class RoleMenu extends CoreEntity<RoleMenu> {

    private static final long serialVersionUID = 1L;

    @TableId("role_menu_id")
	private String roleMenuId;
    /**
     * 角色id
     */
	@TableField("role_id")
	private String roleId;
    /**
     * 菜单id
     */
	@TableField("menu_id")
	private String menuId;


	public String getRoleMenuId() {
		return roleMenuId;
	}

	public void setRoleMenuId(String roleMenuId) {
		this.roleMenuId = roleMenuId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public static final String ROLE_MENU_ID = "roleMenuId";

	public static final String ROLE_ID = "roleId";

	public static final String MENU_ID = "menuId";

	@Override
	protected Serializable pkVal() {
		return this.roleMenuId;
	}

	@Override
	public String toString() {
		return "RoleMenu{" +
			"roleMenuId=" + roleMenuId +
			", roleId=" + roleId +
			", menuId=" + menuId +
			"}";
	}
}

package io.chuangshi.menu.entity;

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
@TableName("table_menu")
public class Menu extends CoreEntity<Menu> {

    private static final long serialVersionUID = 1L;

    /**
     * 菜单id
     */
    @TableId("menu_id")
	private String menuId;
    /**
     * 应用id
     */
	@TableField("app_id")
	private String appId;
    /**
     * 父菜单id
     */
	@TableField("parent_id")
	private String parentId;
    /**
     * 菜单名称
     */
	@TableField("menu_name")
	private String menuName;
    /**
     * 菜单url
     */
	@TableField("menu_url")
	private String menuUrl;
    /**
     * 菜单类型(菜单、菜单内容)
     */
	@TableField("menu_type")
	private String menuType;


	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public static final String MENU_ID = "menu_id";

	public static final String APP_ID = "app_id";

	public static final String PARENT_ID = "parent_id";

	public static final String MENU_NAME = "menu_name";

	public static final String MENU_URL = "menu_url";

	public static final String MENU_TYPE = "menu_type";

	@Override
	protected Serializable pkVal() {
		return this.menuId;
	}

	@Override
	public String toString() {
		return "Menu{" +
			"menuId=" + menuId +
			", appId=" + appId +
			", parentId=" + parentId +
			", menuName=" + menuName +
			", menuUrl=" + menuUrl +
			", menuType=" + menuType +
			"}";
	}
}

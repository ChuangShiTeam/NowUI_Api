package io.chuangshi.app.entity;

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
 * @since 2017-11-26
 */
@TableName("table_app")
public class App extends CoreEntity<App> {

    private static final long serialVersionUID = 1L;

    /**
     * 应用ID
     */
    @TableId("app_id")
	private String appId;
    /**
     * 应用名称
     */
	@TableField("app_name")
	private String appName;
	@TableField("app_description")
	private String appDescription;


	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppDescription() {
		return appDescription;
	}

	public void setAppDescription(String appDescription) {
		this.appDescription = appDescription;
	}

	public static final String APP_ID = "app_id";

	public static final String APP_NAME = "app_name";

	public static final String APP_DESCRIPTION = "app_description";

	@Override
	protected Serializable pkVal() {
		return this.appId;
	}

	@Override
	public String toString() {
		return "App{" +
			"appId=" + appId +
			", appName=" + appName +
			", appDescription=" + appDescription +
			"}";
	}
}

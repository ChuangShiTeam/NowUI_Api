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
 * @since 2017-12-02
 */
@TableName("table_app_config_category")
public class AppConfigCategory extends CoreEntity<AppConfigCategory> {

    private static final long serialVersionUID = 1L;

    /**
     * 配置分类编号
     */
    @TableId("config_category_id")
	private String configCategoryId;
    /**
     * 应用编号
     */
	@TableField("app_id")
	private String appId;
    /**
     * 名称
     */
	@TableField("config_category_name")
	private String configCategoryName;
    /**
     * 编码
     */
	@TableField("config_category_code")
	private String configCategoryCode;
    /**
     * 描述
     */
	@TableField("config_category_description")
	private String configCategoryDescription;


	public String getConfigCategoryId() {
		return configCategoryId;
	}

	public void setConfigCategoryId(String configCategoryId) {
		this.configCategoryId = configCategoryId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getConfigCategoryName() {
		return configCategoryName;
	}

	public void setConfigCategoryName(String configCategoryName) {
		this.configCategoryName = configCategoryName;
	}

	public String getConfigCategoryCode() {
		return configCategoryCode;
	}

	public void setConfigCategoryCode(String configCategoryCode) {
		this.configCategoryCode = configCategoryCode;
	}

	public String getConfigCategoryDescription() {
		return configCategoryDescription;
	}

	public void setConfigCategoryDescription(String configCategoryDescription) {
		this.configCategoryDescription = configCategoryDescription;
	}

	public static final String CONFIG_CATEGORY_ID = "configCategoryId";

	public static final String APP_ID = "appId";

	public static final String CONFIG_CATEGORY_NAME = "configCategoryName";

	public static final String CONFIG_CATEGORY_CODE = "configCategoryCode";

	public static final String CONFIG_CATEGORY_DESCRIPTION = "configCategoryDescription";

	@Override
	protected Serializable pkVal() {
		return this.configCategoryId;
	}

	@Override
	public String toString() {
		return "AppConfigCategory{" +
			"configCategoryId=" + configCategoryId +
			", appId=" + appId +
			", configCategoryName=" + configCategoryName +
			", configCategoryCode=" + configCategoryCode +
			", configCategoryDescription=" + configCategoryDescription +
			"}";
	}
}

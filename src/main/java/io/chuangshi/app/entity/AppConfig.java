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
@TableName("table_app_config")
public class AppConfig extends CoreEntity<AppConfig> {

    private static final long serialVersionUID = 1L;

    /**
     * 配置编号
     */
    @TableId("config_id")
	private String configId;
    /**
     * 应用编号
     */
	@TableField("app_id")
	private String appId;
    /**
     * 配置分类编号
     */
	@TableField("config_category_id")
	private String configCategoryId;
    /**
     * 键
     */
	@TableField("config_key")
	private String configKey;
    /**
     * 值
     */
	@TableField("config_value")
	private String configValue;
    /**
     * 是否禁用
     */
	@TableField("config_is_disabled")
	private Boolean configIsDisabled;
    /**
     * 描述
     */
	@TableField("config_description")
	private String configDescription;


	public String getConfigId() {
		return configId;
	}

	public void setConfigId(String configId) {
		this.configId = configId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getConfigCategoryId() {
		return configCategoryId;
	}

	public void setConfigCategoryId(String configCategoryId) {
		this.configCategoryId = configCategoryId;
	}

	public String getConfigKey() {
		return configKey;
	}

	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}

	public String getConfigValue() {
		return configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

	public Boolean getConfigIsDisabled() {
		return configIsDisabled;
	}

	public void setConfigIsDisabled(Boolean configIsDisabled) {
		this.configIsDisabled = configIsDisabled;
	}

	public String getConfigDescription() {
		return configDescription;
	}

	public void setConfigDescription(String configDescription) {
		this.configDescription = configDescription;
	}

	public static final String CONFIG_ID = "configId";

	public static final String APP_ID = "appId";

	public static final String CONFIG_CATEGORY_ID = "configCategoryId";

	public static final String CONFIG_KEY = "configKey";

	public static final String CONFIG_VALUE = "configValue";

	public static final String CONFIG_IS_DISABLED = "configIsDisabled";

	public static final String CONFIG_DESCRIPTION = "configDescription";

	@Override
	protected Serializable pkVal() {
		return this.configId;
	}

	@Override
	public String toString() {
		return "AppConfig{" +
			"configId=" + configId +
			", appId=" + appId +
			", configCategoryId=" + configCategoryId +
			", configKey=" + configKey +
			", configValue=" + configValue +
			", configIsDisabled=" + configIsDisabled +
			", configDescription=" + configDescription +
			"}";
	}
}

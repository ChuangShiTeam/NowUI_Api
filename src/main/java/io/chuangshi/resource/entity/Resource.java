package io.chuangshi.resource.entity;

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
@TableName("table_resource")
public class Resource extends CoreEntity<Resource> {

    private static final long serialVersionUID = 1L;

    /**
     * 资源id
     */
    @TableId("resource_id")
	private String resourceId;
    /**
     * 应用id
     */
	@TableField("app_id")
	private String appId;
    /**
     * 资源类型
     */
	@TableField("resource_type")
	private String resourceType;
    /**
     * 资源名称
     */
	@TableField("resource_name")
	private String resourceName;
    /**
     * 资源url
     */
	@TableField("resource_url")
	private String resourceUrl;


	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public static final String RESOURCE_ID = "resource_id";

	public static final String APP_ID = "app_id";

	public static final String RESOURCE_TYPE = "resource_type";

	public static final String RESOURCE_NAME = "resource_name";

	public static final String RESOURCE_URL = "resource_url";

	@Override
	protected Serializable pkVal() {
		return this.resourceId;
	}

	@Override
	public String toString() {
		return "Resource{" +
			"resourceId=" + resourceId +
			", appId=" + appId +
			", resourceType=" + resourceType +
			", resourceName=" + resourceName +
			", resourceUrl=" + resourceUrl +
			"}";
	}
}

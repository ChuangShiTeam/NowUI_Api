package io.chuangshi.file.entity;

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
@TableName("table_file")
public class File extends CoreEntity<File> {

    private static final long serialVersionUID = 1L;

    /**
     * 文件编号
     */
    @TableId("file_id")
	private String fileId;
    /**
     * 应用编号
     */
	@TableField("app_id")
	private String appId;
    /**
     * 文件类型
     */
	@TableField("file_type")
	private String fileType;
    /**
     * 文件名称
     */
	@TableField("file_name")
	private String fileName;
    /**
     * 文件后缀
     */
	@TableField("file_suffix")
	private String fileSuffix;
    /**
     * 文件大小
     */
	@TableField("file_size")
	private Integer fileSize;
    /**
     * 文件路径
     */
	@TableField("file_path")
	private String filePath;
    /**
     * 文件路径
     */
	@TableField("file_thumbnail_path")
	private String fileThumbnailPath;
    /**
     * 文件路径
     */
	@TableField("file_original_path")
	private String fileOriginalPath;
    /**
     * 文件封面
     */
	@TableField("file_image")
	private String fileImage;
    /**
     * 是否外部链接
     */
	@TableField("file_is_external")
	private Boolean fileIsExternal;


	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileSuffix() {
		return fileSuffix;
	}

	public void setFileSuffix(String fileSuffix) {
		this.fileSuffix = fileSuffix;
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileThumbnailPath() {
		return fileThumbnailPath;
	}

	public void setFileThumbnailPath(String fileThumbnailPath) {
		this.fileThumbnailPath = fileThumbnailPath;
	}

	public String getFileOriginalPath() {
		return fileOriginalPath;
	}

	public void setFileOriginalPath(String fileOriginalPath) {
		this.fileOriginalPath = fileOriginalPath;
	}

	public String getFileImage() {
		return fileImage;
	}

	public void setFileImage(String fileImage) {
		this.fileImage = fileImage;
	}

	public Boolean getFileIsExternal() {
		return fileIsExternal;
	}

	public void setFileIsExternal(Boolean fileIsExternal) {
		this.fileIsExternal = fileIsExternal;
	}

	public static final String FILE_ID = "file_id";

	public static final String APP_ID = "app_id";

	public static final String FILE_TYPE = "file_type";

	public static final String FILE_NAME = "file_name";

	public static final String FILE_SUFFIX = "file_suffix";

	public static final String FILE_SIZE = "file_size";

	public static final String FILE_PATH = "file_path";

	public static final String FILE_THUMBNAIL_PATH = "file_thumbnail_path";

	public static final String FILE_ORIGINAL_PATH = "file_original_path";

	public static final String FILE_IMAGE = "file_image";

	public static final String FILE_IS_EXTERNAL = "file_is_external";

	@Override
	protected Serializable pkVal() {
		return this.fileId;
	}

	@Override
	public String toString() {
		return "File{" +
			"fileId=" + fileId +
			", appId=" + appId +
			", fileType=" + fileType +
			", fileName=" + fileName +
			", fileSuffix=" + fileSuffix +
			", fileSize=" + fileSize +
			", filePath=" + filePath +
			", fileThumbnailPath=" + fileThumbnailPath +
			", fileOriginalPath=" + fileOriginalPath +
			", fileImage=" + fileImage +
			", fileIsExternal=" + fileIsExternal +
			"}";
	}
}

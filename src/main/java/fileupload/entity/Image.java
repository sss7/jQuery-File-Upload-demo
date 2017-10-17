package fileupload.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName("IMAGE")
public class Image extends Model<Image>{

	/** 
	 *@Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	 */ 
	private static final long serialVersionUID = 9160993711448043195L;

	@TableId
	@TableField("ID")
    private String id;
	
	@TableField("NAME")
    private String name;
	
	@TableField("THUMBNAILFILENAME")
    private String thumbnailFilename;
	
	@TableField("NEWFILENAME")
    private String newFilename;
	
	@TableField("CONTENTTYPE")
    private String contentType;
	
	@TableField("FILESIZE")
    private Long size;
	
	@TableField("THUMBNAILSIZE")
    private Long thumbnailSize;
	
	@TableField("DATECREATED")
    private String dateCreated;
    
	@TableField(exist=false)
    private String url;
    
	@TableField(exist=false)
    private String thumbnailUrl;
    
	@TableField(exist=false)
    private String deleteUrl;
    
	@TableField(exist=false)
    private String deleteType;
	
	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getThumbnailFilename() {
		return thumbnailFilename;
	}

	public void setThumbnailFilename(String thumbnailFilename) {
		this.thumbnailFilename = thumbnailFilename;
	}

	public String getNewFilename() {
		return newFilename;
	}

	public void setNewFilename(String newFilename) {
		this.newFilename = newFilename;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getThumbnailSize() {
		return thumbnailSize;
	}

	public void setThumbnailSize(Long thumbnailSize) {
		this.thumbnailSize = thumbnailSize;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public String getDeleteUrl() {
		return deleteUrl;
	}

	public void setDeleteUrl(String deleteUrl) {
		this.deleteUrl = deleteUrl;
	}

	public String getDeleteType() {
		return deleteType;
	}

	public void setDeleteType(String deleteType) {
		this.deleteType = deleteType;
	}
	
	
}

package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class GenericFile implements MetafieldReference, com.shopify.types.File, com.shopify.types.Node {
  
  private String alt;

  
  private OffsetDateTime createdAt;

  
  private List<FileError> fileErrors;

  
  private FileStatus fileStatus;

  
  private String id;

  
  private String mimeType;

  
  private Integer originalFileSize;

  
  private MediaPreviewImage preview;

  
  private OffsetDateTime updatedAt;

  
  private String url;

  public GenericFile() {
  }

  
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public List<FileError> getFileErrors() {
    return fileErrors;
  }

  public void setFileErrors(List<FileError> fileErrors) {
    this.fileErrors = fileErrors;
  }

  
  public FileStatus getFileStatus() {
    return fileStatus;
  }

  public void setFileStatus(FileStatus fileStatus) {
    this.fileStatus = fileStatus;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  
  public Integer getOriginalFileSize() {
    return originalFileSize;
  }

  public void setOriginalFileSize(Integer originalFileSize) {
    this.originalFileSize = originalFileSize;
  }

  
  public MediaPreviewImage getPreview() {
    return preview;
  }

  public void setPreview(MediaPreviewImage preview) {
    this.preview = preview;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "GenericFile{alt='" + alt + "', createdAt='" + createdAt + "', fileErrors='" + fileErrors + "', fileStatus='" + fileStatus + "', id='" + id + "', mimeType='" + mimeType + "', originalFileSize='" + originalFileSize + "', preview='" + preview + "', updatedAt='" + updatedAt + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenericFile that = (GenericFile) o;
    return Objects.equals(alt, that.alt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(fileErrors, that.fileErrors) &&
        Objects.equals(fileStatus, that.fileStatus) &&
        Objects.equals(id, that.id) &&
        Objects.equals(mimeType, that.mimeType) &&
        Objects.equals(originalFileSize, that.originalFileSize) &&
        Objects.equals(preview, that.preview) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, createdAt, fileErrors, fileStatus, id, mimeType, originalFileSize, preview, updatedAt, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String alt;

    
    private OffsetDateTime createdAt;

    
    private List<FileError> fileErrors;

    
    private FileStatus fileStatus;

    
    private String id;

    
    private String mimeType;

    
    private Integer originalFileSize;

    
    private MediaPreviewImage preview;

    
    private OffsetDateTime updatedAt;

    
    private String url;

    public GenericFile build() {
      GenericFile result = new GenericFile();
      result.alt = this.alt;
      result.createdAt = this.createdAt;
      result.fileErrors = this.fileErrors;
      result.fileStatus = this.fileStatus;
      result.id = this.id;
      result.mimeType = this.mimeType;
      result.originalFileSize = this.originalFileSize;
      result.preview = this.preview;
      result.updatedAt = this.updatedAt;
      result.url = this.url;
      return result;
    }

    
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder fileErrors(List<FileError> fileErrors) {
      this.fileErrors = fileErrors;
      return this;
    }

    
    public Builder fileStatus(FileStatus fileStatus) {
      this.fileStatus = fileStatus;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder mimeType(String mimeType) {
      this.mimeType = mimeType;
      return this;
    }

    
    public Builder originalFileSize(Integer originalFileSize) {
      this.originalFileSize = originalFileSize;
      return this;
    }

    
    public Builder preview(MediaPreviewImage preview) {
      this.preview = preview;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}

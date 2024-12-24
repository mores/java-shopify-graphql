package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Model3d implements MetafieldReference, com.shopify.types.File, com.shopify.types.Media, com.shopify.types.Node {
  
  private String alt;

  
  private Model3dBoundingBox boundingBox;

  
  private OffsetDateTime createdAt;

  
  private List<FileError> fileErrors;

  
  private FileStatus fileStatus;

  
  private String filename;

  
  private String id;

  
  private MediaContentType mediaContentType;

  
  private List<MediaError> mediaErrors;

  
  private List<MediaWarning> mediaWarnings;

  
  private Model3dSource originalSource;

  
  private MediaPreviewImage preview;

  
  private List<Model3dSource> sources;

  
  private MediaStatus status;

  
  private OffsetDateTime updatedAt;

  public Model3d() {
  }

  
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  
  public Model3dBoundingBox getBoundingBox() {
    return boundingBox;
  }

  public void setBoundingBox(Model3dBoundingBox boundingBox) {
    this.boundingBox = boundingBox;
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

  
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public MediaContentType getMediaContentType() {
    return mediaContentType;
  }

  public void setMediaContentType(MediaContentType mediaContentType) {
    this.mediaContentType = mediaContentType;
  }

  
  public List<MediaError> getMediaErrors() {
    return mediaErrors;
  }

  public void setMediaErrors(List<MediaError> mediaErrors) {
    this.mediaErrors = mediaErrors;
  }

  
  public List<MediaWarning> getMediaWarnings() {
    return mediaWarnings;
  }

  public void setMediaWarnings(List<MediaWarning> mediaWarnings) {
    this.mediaWarnings = mediaWarnings;
  }

  
  public Model3dSource getOriginalSource() {
    return originalSource;
  }

  public void setOriginalSource(Model3dSource originalSource) {
    this.originalSource = originalSource;
  }

  
  public MediaPreviewImage getPreview() {
    return preview;
  }

  public void setPreview(MediaPreviewImage preview) {
    this.preview = preview;
  }

  
  public List<Model3dSource> getSources() {
    return sources;
  }

  public void setSources(List<Model3dSource> sources) {
    this.sources = sources;
  }

  
  public MediaStatus getStatus() {
    return status;
  }

  public void setStatus(MediaStatus status) {
    this.status = status;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Model3d{alt='" + alt + "', boundingBox='" + boundingBox + "', createdAt='" + createdAt + "', fileErrors='" + fileErrors + "', fileStatus='" + fileStatus + "', filename='" + filename + "', id='" + id + "', mediaContentType='" + mediaContentType + "', mediaErrors='" + mediaErrors + "', mediaWarnings='" + mediaWarnings + "', originalSource='" + originalSource + "', preview='" + preview + "', sources='" + sources + "', status='" + status + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Model3d that = (Model3d) o;
    return Objects.equals(alt, that.alt) &&
        Objects.equals(boundingBox, that.boundingBox) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(fileErrors, that.fileErrors) &&
        Objects.equals(fileStatus, that.fileStatus) &&
        Objects.equals(filename, that.filename) &&
        Objects.equals(id, that.id) &&
        Objects.equals(mediaContentType, that.mediaContentType) &&
        Objects.equals(mediaErrors, that.mediaErrors) &&
        Objects.equals(mediaWarnings, that.mediaWarnings) &&
        Objects.equals(originalSource, that.originalSource) &&
        Objects.equals(preview, that.preview) &&
        Objects.equals(sources, that.sources) &&
        Objects.equals(status, that.status) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, boundingBox, createdAt, fileErrors, fileStatus, filename, id, mediaContentType, mediaErrors, mediaWarnings, originalSource, preview, sources, status, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String alt;

    
    private Model3dBoundingBox boundingBox;

    
    private OffsetDateTime createdAt;

    
    private List<FileError> fileErrors;

    
    private FileStatus fileStatus;

    
    private String filename;

    
    private String id;

    
    private MediaContentType mediaContentType;

    
    private List<MediaError> mediaErrors;

    
    private List<MediaWarning> mediaWarnings;

    
    private Model3dSource originalSource;

    
    private MediaPreviewImage preview;

    
    private List<Model3dSource> sources;

    
    private MediaStatus status;

    
    private OffsetDateTime updatedAt;

    public Model3d build() {
      Model3d result = new Model3d();
      result.alt = this.alt;
      result.boundingBox = this.boundingBox;
      result.createdAt = this.createdAt;
      result.fileErrors = this.fileErrors;
      result.fileStatus = this.fileStatus;
      result.filename = this.filename;
      result.id = this.id;
      result.mediaContentType = this.mediaContentType;
      result.mediaErrors = this.mediaErrors;
      result.mediaWarnings = this.mediaWarnings;
      result.originalSource = this.originalSource;
      result.preview = this.preview;
      result.sources = this.sources;
      result.status = this.status;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }

    
    public Builder boundingBox(Model3dBoundingBox boundingBox) {
      this.boundingBox = boundingBox;
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

    
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder mediaContentType(MediaContentType mediaContentType) {
      this.mediaContentType = mediaContentType;
      return this;
    }

    
    public Builder mediaErrors(List<MediaError> mediaErrors) {
      this.mediaErrors = mediaErrors;
      return this;
    }

    
    public Builder mediaWarnings(List<MediaWarning> mediaWarnings) {
      this.mediaWarnings = mediaWarnings;
      return this;
    }

    
    public Builder originalSource(Model3dSource originalSource) {
      this.originalSource = originalSource;
      return this;
    }

    
    public Builder preview(MediaPreviewImage preview) {
      this.preview = preview;
      return this;
    }

    
    public Builder sources(List<Model3dSource> sources) {
      this.sources = sources;
      return this;
    }

    
    public Builder status(MediaStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}

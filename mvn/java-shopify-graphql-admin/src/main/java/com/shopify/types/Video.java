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
public class Video implements MetafieldReference, com.shopify.types.File, com.shopify.types.Media, com.shopify.types.Node {
  
  private String alt;

  
  private OffsetDateTime createdAt;

  
  private Integer duration;

  
  private List<FileError> fileErrors;

  
  private FileStatus fileStatus;

  
  private String filename;

  
  private String id;

  
  private MediaContentType mediaContentType;

  
  private List<MediaError> mediaErrors;

  
  private List<MediaWarning> mediaWarnings;

  
  private VideoSource originalSource;

  
  private MediaPreviewImage preview;

  
  private List<VideoSource> sources;

  
  private MediaStatus status;

  
  private OffsetDateTime updatedAt;

  public Video() {
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

  
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
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

  
  public VideoSource getOriginalSource() {
    return originalSource;
  }

  public void setOriginalSource(VideoSource originalSource) {
    this.originalSource = originalSource;
  }

  
  public MediaPreviewImage getPreview() {
    return preview;
  }

  public void setPreview(MediaPreviewImage preview) {
    this.preview = preview;
  }

  
  public List<VideoSource> getSources() {
    return sources;
  }

  public void setSources(List<VideoSource> sources) {
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
    return "Video{alt='" + alt + "', createdAt='" + createdAt + "', duration='" + duration + "', fileErrors='" + fileErrors + "', fileStatus='" + fileStatus + "', filename='" + filename + "', id='" + id + "', mediaContentType='" + mediaContentType + "', mediaErrors='" + mediaErrors + "', mediaWarnings='" + mediaWarnings + "', originalSource='" + originalSource + "', preview='" + preview + "', sources='" + sources + "', status='" + status + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Video that = (Video) o;
    return Objects.equals(alt, that.alt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(duration, that.duration) &&
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
    return Objects.hash(alt, createdAt, duration, fileErrors, fileStatus, filename, id, mediaContentType, mediaErrors, mediaWarnings, originalSource, preview, sources, status, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String alt;

    
    private OffsetDateTime createdAt;

    
    private Integer duration;

    
    private List<FileError> fileErrors;

    
    private FileStatus fileStatus;

    
    private String filename;

    
    private String id;

    
    private MediaContentType mediaContentType;

    
    private List<MediaError> mediaErrors;

    
    private List<MediaWarning> mediaWarnings;

    
    private VideoSource originalSource;

    
    private MediaPreviewImage preview;

    
    private List<VideoSource> sources;

    
    private MediaStatus status;

    
    private OffsetDateTime updatedAt;

    public Video build() {
      Video result = new Video();
      result.alt = this.alt;
      result.createdAt = this.createdAt;
      result.duration = this.duration;
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

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder duration(Integer duration) {
      this.duration = duration;
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

    
    public Builder originalSource(VideoSource originalSource) {
      this.originalSource = originalSource;
      return this;
    }

    
    public Builder preview(MediaPreviewImage preview) {
      this.preview = preview;
      return this;
    }

    
    public Builder sources(List<VideoSource> sources) {
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

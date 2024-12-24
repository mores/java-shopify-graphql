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
public class ExternalVideo implements com.shopify.types.File, com.shopify.types.Media, com.shopify.types.Node {
  
  private String alt;

  
  private OffsetDateTime createdAt;

  
  private String embedUrl;

  
  private String embeddedUrl;

  
  private List<FileError> fileErrors;

  
  private FileStatus fileStatus;

  
  private MediaHost host;

  
  private String id;

  
  private MediaContentType mediaContentType;

  
  private List<MediaError> mediaErrors;

  
  private List<MediaWarning> mediaWarnings;

  
  private String originUrl;

  
  private MediaPreviewImage preview;

  
  private MediaStatus status;

  
  private OffsetDateTime updatedAt;

  public ExternalVideo() {
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

  
  public String getEmbedUrl() {
    return embedUrl;
  }

  public void setEmbedUrl(String embedUrl) {
    this.embedUrl = embedUrl;
  }

  
  public String getEmbeddedUrl() {
    return embeddedUrl;
  }

  public void setEmbeddedUrl(String embeddedUrl) {
    this.embeddedUrl = embeddedUrl;
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

  
  public MediaHost getHost() {
    return host;
  }

  public void setHost(MediaHost host) {
    this.host = host;
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

  
  public String getOriginUrl() {
    return originUrl;
  }

  public void setOriginUrl(String originUrl) {
    this.originUrl = originUrl;
  }

  
  public MediaPreviewImage getPreview() {
    return preview;
  }

  public void setPreview(MediaPreviewImage preview) {
    this.preview = preview;
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
    return "ExternalVideo{alt='" + alt + "', createdAt='" + createdAt + "', embedUrl='" + embedUrl + "', embeddedUrl='" + embeddedUrl + "', fileErrors='" + fileErrors + "', fileStatus='" + fileStatus + "', host='" + host + "', id='" + id + "', mediaContentType='" + mediaContentType + "', mediaErrors='" + mediaErrors + "', mediaWarnings='" + mediaWarnings + "', originUrl='" + originUrl + "', preview='" + preview + "', status='" + status + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExternalVideo that = (ExternalVideo) o;
    return Objects.equals(alt, that.alt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(embedUrl, that.embedUrl) &&
        Objects.equals(embeddedUrl, that.embeddedUrl) &&
        Objects.equals(fileErrors, that.fileErrors) &&
        Objects.equals(fileStatus, that.fileStatus) &&
        Objects.equals(host, that.host) &&
        Objects.equals(id, that.id) &&
        Objects.equals(mediaContentType, that.mediaContentType) &&
        Objects.equals(mediaErrors, that.mediaErrors) &&
        Objects.equals(mediaWarnings, that.mediaWarnings) &&
        Objects.equals(originUrl, that.originUrl) &&
        Objects.equals(preview, that.preview) &&
        Objects.equals(status, that.status) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, createdAt, embedUrl, embeddedUrl, fileErrors, fileStatus, host, id, mediaContentType, mediaErrors, mediaWarnings, originUrl, preview, status, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String alt;

    
    private OffsetDateTime createdAt;

    
    private String embedUrl;

    
    private String embeddedUrl;

    
    private List<FileError> fileErrors;

    
    private FileStatus fileStatus;

    
    private MediaHost host;

    
    private String id;

    
    private MediaContentType mediaContentType;

    
    private List<MediaError> mediaErrors;

    
    private List<MediaWarning> mediaWarnings;

    
    private String originUrl;

    
    private MediaPreviewImage preview;

    
    private MediaStatus status;

    
    private OffsetDateTime updatedAt;

    public ExternalVideo build() {
      ExternalVideo result = new ExternalVideo();
      result.alt = this.alt;
      result.createdAt = this.createdAt;
      result.embedUrl = this.embedUrl;
      result.embeddedUrl = this.embeddedUrl;
      result.fileErrors = this.fileErrors;
      result.fileStatus = this.fileStatus;
      result.host = this.host;
      result.id = this.id;
      result.mediaContentType = this.mediaContentType;
      result.mediaErrors = this.mediaErrors;
      result.mediaWarnings = this.mediaWarnings;
      result.originUrl = this.originUrl;
      result.preview = this.preview;
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

    
    public Builder embedUrl(String embedUrl) {
      this.embedUrl = embedUrl;
      return this;
    }

    
    public Builder embeddedUrl(String embeddedUrl) {
      this.embeddedUrl = embeddedUrl;
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

    
    public Builder host(MediaHost host) {
      this.host = host;
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

    
    public Builder originUrl(String originUrl) {
      this.originUrl = originUrl;
      return this;
    }

    
    public Builder preview(MediaPreviewImage preview) {
      this.preview = preview;
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

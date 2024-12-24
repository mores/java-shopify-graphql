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
public class MediaImage implements MetafieldReference, com.shopify.types.File, com.shopify.types.HasMetafields, com.shopify.types.Media, com.shopify.types.Node {
  
  private String alt;

  
  private OffsetDateTime createdAt;

  
  private List<FileError> fileErrors;

  
  private FileStatus fileStatus;

  
  private String id;

  
  private Image image;

  
  private MediaContentType mediaContentType;

  
  private List<MediaError> mediaErrors;

  
  private List<MediaWarning> mediaWarnings;

  
  private Metafield metafield;

  
  private MetafieldConnection metafields;

  
  private String mimeType;

  
  private MediaImageOriginalSource originalSource;

  
  private MediaPreviewImage preview;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private MediaStatus status;

  
  private OffsetDateTime updatedAt;

  public MediaImage() {
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

  
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
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

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  
  public MediaImageOriginalSource getOriginalSource() {
    return originalSource;
  }

  public void setOriginalSource(MediaImageOriginalSource originalSource) {
    this.originalSource = originalSource;
  }

  
  public MediaPreviewImage getPreview() {
    return preview;
  }

  public void setPreview(MediaPreviewImage preview) {
    this.preview = preview;
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
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
    return "MediaImage{alt='" + alt + "', createdAt='" + createdAt + "', fileErrors='" + fileErrors + "', fileStatus='" + fileStatus + "', id='" + id + "', image='" + image + "', mediaContentType='" + mediaContentType + "', mediaErrors='" + mediaErrors + "', mediaWarnings='" + mediaWarnings + "', metafield='" + metafield + "', metafields='" + metafields + "', mimeType='" + mimeType + "', originalSource='" + originalSource + "', preview='" + preview + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', status='" + status + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MediaImage that = (MediaImage) o;
    return Objects.equals(alt, that.alt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(fileErrors, that.fileErrors) &&
        Objects.equals(fileStatus, that.fileStatus) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(mediaContentType, that.mediaContentType) &&
        Objects.equals(mediaErrors, that.mediaErrors) &&
        Objects.equals(mediaWarnings, that.mediaWarnings) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(mimeType, that.mimeType) &&
        Objects.equals(originalSource, that.originalSource) &&
        Objects.equals(preview, that.preview) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(status, that.status) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, createdAt, fileErrors, fileStatus, id, image, mediaContentType, mediaErrors, mediaWarnings, metafield, metafields, mimeType, originalSource, preview, privateMetafield, privateMetafields, status, updatedAt);
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

    
    private Image image;

    
    private MediaContentType mediaContentType;

    
    private List<MediaError> mediaErrors;

    
    private List<MediaWarning> mediaWarnings;

    
    private Metafield metafield;

    
    private MetafieldConnection metafields;

    
    private String mimeType;

    
    private MediaImageOriginalSource originalSource;

    
    private MediaPreviewImage preview;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private MediaStatus status;

    
    private OffsetDateTime updatedAt;

    public MediaImage build() {
      MediaImage result = new MediaImage();
      result.alt = this.alt;
      result.createdAt = this.createdAt;
      result.fileErrors = this.fileErrors;
      result.fileStatus = this.fileStatus;
      result.id = this.id;
      result.image = this.image;
      result.mediaContentType = this.mediaContentType;
      result.mediaErrors = this.mediaErrors;
      result.mediaWarnings = this.mediaWarnings;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.mimeType = this.mimeType;
      result.originalSource = this.originalSource;
      result.preview = this.preview;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
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

    
    public Builder image(Image image) {
      this.image = image;
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

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder mimeType(String mimeType) {
      this.mimeType = mimeType;
      return this;
    }

    
    public Builder originalSource(MediaImageOriginalSource originalSource) {
      this.originalSource = originalSource;
      return this;
    }

    
    public Builder preview(MediaPreviewImage preview) {
      this.preview = preview;
      return this;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
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

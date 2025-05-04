package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents a Shopify hosted video.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Video implements MetafieldReference, com.shopify.admin.types.File, com.shopify.admin.types.Media, com.shopify.admin.types.Node {
  /**
   * A word or phrase to share the nature or contents of a media.
   */
  private String alt;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The video's duration in milliseconds. This value is `null` unless the video's status field is
   * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
   */
  private Integer duration;

  /**
   * Any errors that have occurred on the file.
   */
  private List<FileError> fileErrors;

  /**
   * The status of the file.
   */
  private FileStatus fileStatus;

  /**
   * The video's filename.
   */
  private String filename;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The media content type.
   */
  private MediaContentType mediaContentType;

  /**
   * Any errors which have occurred on the media.
   */
  private List<MediaError> mediaErrors;

  /**
   * The warnings attached to the media.
   */
  private List<MediaWarning> mediaWarnings;

  /**
   * The video's original source. This value is `null` unless the video's status field is
   * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
   */
  private VideoSource originalSource;

  /**
   * The preview image for the media.
   */
  private MediaPreviewImage preview;

  /**
   * The video's sources. This value is empty unless the video's status field is
   * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
   */
  private List<VideoSource> sources;

  /**
   * Current status of the media.
   */
  private MediaStatus status;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last updated.
   */
  private OffsetDateTime updatedAt;

  public Video() {
  }

  /**
   * A word or phrase to share the nature or contents of a media.
   */
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The video's duration in milliseconds. This value is `null` unless the video's status field is
   * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
   */
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  /**
   * Any errors that have occurred on the file.
   */
  public List<FileError> getFileErrors() {
    return fileErrors;
  }

  public void setFileErrors(List<FileError> fileErrors) {
    this.fileErrors = fileErrors;
  }

  /**
   * The status of the file.
   */
  public FileStatus getFileStatus() {
    return fileStatus;
  }

  public void setFileStatus(FileStatus fileStatus) {
    this.fileStatus = fileStatus;
  }

  /**
   * The video's filename.
   */
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The media content type.
   */
  public MediaContentType getMediaContentType() {
    return mediaContentType;
  }

  public void setMediaContentType(MediaContentType mediaContentType) {
    this.mediaContentType = mediaContentType;
  }

  /**
   * Any errors which have occurred on the media.
   */
  public List<MediaError> getMediaErrors() {
    return mediaErrors;
  }

  public void setMediaErrors(List<MediaError> mediaErrors) {
    this.mediaErrors = mediaErrors;
  }

  /**
   * The warnings attached to the media.
   */
  public List<MediaWarning> getMediaWarnings() {
    return mediaWarnings;
  }

  public void setMediaWarnings(List<MediaWarning> mediaWarnings) {
    this.mediaWarnings = mediaWarnings;
  }

  /**
   * The video's original source. This value is `null` unless the video's status field is
   * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
   */
  public VideoSource getOriginalSource() {
    return originalSource;
  }

  public void setOriginalSource(VideoSource originalSource) {
    this.originalSource = originalSource;
  }

  /**
   * The preview image for the media.
   */
  public MediaPreviewImage getPreview() {
    return preview;
  }

  public void setPreview(MediaPreviewImage preview) {
    this.preview = preview;
  }

  /**
   * The video's sources. This value is empty unless the video's status field is
   * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
   */
  public List<VideoSource> getSources() {
    return sources;
  }

  public void setSources(List<VideoSource> sources) {
    this.sources = sources;
  }

  /**
   * Current status of the media.
   */
  public MediaStatus getStatus() {
    return status;
  }

  public void setStatus(MediaStatus status) {
    this.status = status;
  }

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last updated.
   */
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
    /**
     * A word or phrase to share the nature or contents of a media.
     */
    private String alt;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The video's duration in milliseconds. This value is `null` unless the video's status field is
     * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
     */
    private Integer duration;

    /**
     * Any errors that have occurred on the file.
     */
    private List<FileError> fileErrors;

    /**
     * The status of the file.
     */
    private FileStatus fileStatus;

    /**
     * The video's filename.
     */
    private String filename;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The media content type.
     */
    private MediaContentType mediaContentType;

    /**
     * Any errors which have occurred on the media.
     */
    private List<MediaError> mediaErrors;

    /**
     * The warnings attached to the media.
     */
    private List<MediaWarning> mediaWarnings;

    /**
     * The video's original source. This value is `null` unless the video's status field is
     * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
     */
    private VideoSource originalSource;

    /**
     * The preview image for the media.
     */
    private MediaPreviewImage preview;

    /**
     * The video's sources. This value is empty unless the video's status field is
     * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
     */
    private List<VideoSource> sources;

    /**
     * Current status of the media.
     */
    private MediaStatus status;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last updated.
     */
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

    /**
     * A word or phrase to share the nature or contents of a media.
     */
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The video's duration in milliseconds. This value is `null` unless the video's status field is
     * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
     */
    public Builder duration(Integer duration) {
      this.duration = duration;
      return this;
    }

    /**
     * Any errors that have occurred on the file.
     */
    public Builder fileErrors(List<FileError> fileErrors) {
      this.fileErrors = fileErrors;
      return this;
    }

    /**
     * The status of the file.
     */
    public Builder fileStatus(FileStatus fileStatus) {
      this.fileStatus = fileStatus;
      return this;
    }

    /**
     * The video's filename.
     */
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The media content type.
     */
    public Builder mediaContentType(MediaContentType mediaContentType) {
      this.mediaContentType = mediaContentType;
      return this;
    }

    /**
     * Any errors which have occurred on the media.
     */
    public Builder mediaErrors(List<MediaError> mediaErrors) {
      this.mediaErrors = mediaErrors;
      return this;
    }

    /**
     * The warnings attached to the media.
     */
    public Builder mediaWarnings(List<MediaWarning> mediaWarnings) {
      this.mediaWarnings = mediaWarnings;
      return this;
    }

    /**
     * The video's original source. This value is `null` unless the video's status field is
     * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
     */
    public Builder originalSource(VideoSource originalSource) {
      this.originalSource = originalSource;
      return this;
    }

    /**
     * The preview image for the media.
     */
    public Builder preview(MediaPreviewImage preview) {
      this.preview = preview;
      return this;
    }

    /**
     * The video's sources. This value is empty unless the video's status field is
     * [READY](https://shopify.dev/api/admin-graphql/latest/enums/MediaStatus#value-ready).
     */
    public Builder sources(List<VideoSource> sources) {
      this.sources = sources;
      return this;
    }

    /**
     * Current status of the media.
     */
    public Builder status(MediaStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}

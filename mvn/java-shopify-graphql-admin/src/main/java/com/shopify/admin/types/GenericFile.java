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
 * Represents any file other than HTML.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class GenericFile implements MetafieldReference, com.shopify.admin.types.File, com.shopify.admin.types.Node {
  /**
   * A word or phrase to describe the contents or the function of a file.
   */
  private String alt;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was created.
   */
  private OffsetDateTime createdAt;

  /**
   * Any errors that have occurred on the file.
   */
  private List<FileError> fileErrors;

  /**
   * The status of the file.
   */
  private FileStatus fileStatus;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The generic file's MIME type.
   */
  private String mimeType;

  /**
   * The generic file's size in bytes.
   */
  private Integer originalFileSize;

  /**
   * The preview image for the media.
   */
  private MediaPreviewImage preview;

  /**
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * The generic file's URL.
   */
  private String url;

  public GenericFile() {
  }

  /**
   * A word or phrase to describe the contents or the function of a file.
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
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The generic file's MIME type.
   */
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * The generic file's size in bytes.
   */
  public Integer getOriginalFileSize() {
    return originalFileSize;
  }

  public void setOriginalFileSize(Integer originalFileSize) {
    this.originalFileSize = originalFileSize;
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
   * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The generic file's URL.
   */
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
    /**
     * A word or phrase to describe the contents or the function of a file.
     */
    private String alt;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was created.
     */
    private OffsetDateTime createdAt;

    /**
     * Any errors that have occurred on the file.
     */
    private List<FileError> fileErrors;

    /**
     * The status of the file.
     */
    private FileStatus fileStatus;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The generic file's MIME type.
     */
    private String mimeType;

    /**
     * The generic file's size in bytes.
     */
    private Integer originalFileSize;

    /**
     * The preview image for the media.
     */
    private MediaPreviewImage preview;

    /**
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * The generic file's URL.
     */
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

    /**
     * A word or phrase to describe the contents or the function of a file.
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
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The generic file's MIME type.
     */
    public Builder mimeType(String mimeType) {
      this.mimeType = mimeType;
      return this;
    }

    /**
     * The generic file's size in bytes.
     */
    public Builder originalFileSize(Integer originalFileSize) {
      this.originalFileSize = originalFileSize;
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
     * The date and time ([ISO 8601 format](http://en.wikipedia.org/wiki/ISO_8601)) when the file was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * The generic file's URL.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}

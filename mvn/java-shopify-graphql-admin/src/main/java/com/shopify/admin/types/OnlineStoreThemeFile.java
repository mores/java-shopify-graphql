package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents a theme file.
 */
public class OnlineStoreThemeFile {
  /**
   * The body of the theme file.
   */
  private OnlineStoreThemeFileBody body;

  /**
   * The md5 digest of the theme file for data integrity.
   */
  private String checksumMd5;

  /**
   * The content type of the theme file.
   */
  private String contentType;

  /**
   * The date and time when the theme file was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The unique identifier of the theme file.
   */
  private String filename;

  /**
   * The size of the theme file in bytes.
   */
  private String size;

  /**
   * The date and time when the theme file was last updated.
   */
  private OffsetDateTime updatedAt;

  public OnlineStoreThemeFile() {
  }

  /**
   * The body of the theme file.
   */
  public OnlineStoreThemeFileBody getBody() {
    return body;
  }

  public void setBody(OnlineStoreThemeFileBody body) {
    this.body = body;
  }

  /**
   * The md5 digest of the theme file for data integrity.
   */
  public String getChecksumMd5() {
    return checksumMd5;
  }

  public void setChecksumMd5(String checksumMd5) {
    this.checksumMd5 = checksumMd5;
  }

  /**
   * The content type of the theme file.
   */
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   * The date and time when the theme file was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The unique identifier of the theme file.
   */
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * The size of the theme file in bytes.
   */
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  /**
   * The date and time when the theme file was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeFile{body='" + body + "', checksumMd5='" + checksumMd5 + "', contentType='" + contentType + "', createdAt='" + createdAt + "', filename='" + filename + "', size='" + size + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFile that = (OnlineStoreThemeFile) o;
    return Objects.equals(body, that.body) &&
        Objects.equals(checksumMd5, that.checksumMd5) &&
        Objects.equals(contentType, that.contentType) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(filename, that.filename) &&
        Objects.equals(size, that.size) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, checksumMd5, contentType, createdAt, filename, size, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The body of the theme file.
     */
    private OnlineStoreThemeFileBody body;

    /**
     * The md5 digest of the theme file for data integrity.
     */
    private String checksumMd5;

    /**
     * The content type of the theme file.
     */
    private String contentType;

    /**
     * The date and time when the theme file was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The unique identifier of the theme file.
     */
    private String filename;

    /**
     * The size of the theme file in bytes.
     */
    private String size;

    /**
     * The date and time when the theme file was last updated.
     */
    private OffsetDateTime updatedAt;

    public OnlineStoreThemeFile build() {
      OnlineStoreThemeFile result = new OnlineStoreThemeFile();
      result.body = this.body;
      result.checksumMd5 = this.checksumMd5;
      result.contentType = this.contentType;
      result.createdAt = this.createdAt;
      result.filename = this.filename;
      result.size = this.size;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The body of the theme file.
     */
    public Builder body(OnlineStoreThemeFileBody body) {
      this.body = body;
      return this;
    }

    /**
     * The md5 digest of the theme file for data integrity.
     */
    public Builder checksumMd5(String checksumMd5) {
      this.checksumMd5 = checksumMd5;
      return this;
    }

    /**
     * The content type of the theme file.
     */
    public Builder contentType(String contentType) {
      this.contentType = contentType;
      return this;
    }

    /**
     * The date and time when the theme file was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The unique identifier of the theme file.
     */
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    /**
     * The size of the theme file in bytes.
     */
    public Builder size(String size) {
      this.size = size;
      return this;
    }

    /**
     * The date and time when the theme file was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}

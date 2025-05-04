package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents the result of a copy, delete, or write operation performed on a theme file.
 */
public class OnlineStoreThemeFileOperationResult {
  /**
   * The md5 digest of the theme file for data integrity.
   */
  private String checksumMd5;

  /**
   * The date and time when the theme file was created.
   */
  private OffsetDateTime createdAt;

  /**
   * Unique identifier of the theme file.
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

  public OnlineStoreThemeFileOperationResult() {
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
   * The date and time when the theme file was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Unique identifier of the theme file.
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
    return "OnlineStoreThemeFileOperationResult{checksumMd5='" + checksumMd5 + "', createdAt='" + createdAt + "', filename='" + filename + "', size='" + size + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFileOperationResult that = (OnlineStoreThemeFileOperationResult) o;
    return Objects.equals(checksumMd5, that.checksumMd5) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(filename, that.filename) &&
        Objects.equals(size, that.size) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checksumMd5, createdAt, filename, size, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The md5 digest of the theme file for data integrity.
     */
    private String checksumMd5;

    /**
     * The date and time when the theme file was created.
     */
    private OffsetDateTime createdAt;

    /**
     * Unique identifier of the theme file.
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

    public OnlineStoreThemeFileOperationResult build() {
      OnlineStoreThemeFileOperationResult result = new OnlineStoreThemeFileOperationResult();
      result.checksumMd5 = this.checksumMd5;
      result.createdAt = this.createdAt;
      result.filename = this.filename;
      result.size = this.size;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The md5 digest of the theme file for data integrity.
     */
    public Builder checksumMd5(String checksumMd5) {
      this.checksumMd5 = checksumMd5;
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
     * Unique identifier of the theme file.
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

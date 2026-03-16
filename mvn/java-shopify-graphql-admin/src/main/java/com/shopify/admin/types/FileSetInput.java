package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create or update a file object.
 */
public class FileSetInput {
  /**
   * The name of the file. If provided, then the file is created with the specified filename.
   * If not provided, then the filename from the `originalSource` is used.
   */
  private String filename;

  /**
   * The file content type. If omitted, then Shopify will attempt to determine the content type during file processing.
   */
  private FileContentType contentType;

  /**
   * The alt text description of the file for screen readers and accessibility.
   */
  private String alt;

  /**
   * How to handle if filename is already in use.
   */
  private FileCreateInputDuplicateResolutionMode duplicateResolutionMode = FileCreateInputDuplicateResolutionMode.APPEND_UUID;

  /**
   * The ID of an existing file.
   */
  private String id;

  /**
   * An external URL (for images only) or a
   * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
   */
  private String originalSource;

  public FileSetInput() {
  }

  /**
   * The name of the file. If provided, then the file is created with the specified filename.
   * If not provided, then the filename from the `originalSource` is used.
   */
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * The file content type. If omitted, then Shopify will attempt to determine the content type during file processing.
   */
  public FileContentType getContentType() {
    return contentType;
  }

  public void setContentType(FileContentType contentType) {
    this.contentType = contentType;
  }

  /**
   * The alt text description of the file for screen readers and accessibility.
   */
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  /**
   * How to handle if filename is already in use.
   */
  public FileCreateInputDuplicateResolutionMode getDuplicateResolutionMode() {
    return duplicateResolutionMode;
  }

  public void setDuplicateResolutionMode(
      FileCreateInputDuplicateResolutionMode duplicateResolutionMode) {
    this.duplicateResolutionMode = duplicateResolutionMode;
  }

  /**
   * The ID of an existing file.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * An external URL (for images only) or a
   * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
   */
  public String getOriginalSource() {
    return originalSource;
  }

  public void setOriginalSource(String originalSource) {
    this.originalSource = originalSource;
  }

  @Override
  public String toString() {
    return "FileSetInput{filename='" + filename + "', contentType='" + contentType + "', alt='" + alt + "', duplicateResolutionMode='" + duplicateResolutionMode + "', id='" + id + "', originalSource='" + originalSource + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileSetInput that = (FileSetInput) o;
    return Objects.equals(filename, that.filename) &&
        Objects.equals(contentType, that.contentType) &&
        Objects.equals(alt, that.alt) &&
        Objects.equals(duplicateResolutionMode, that.duplicateResolutionMode) &&
        Objects.equals(id, that.id) &&
        Objects.equals(originalSource, that.originalSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, contentType, alt, duplicateResolutionMode, id, originalSource);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the file. If provided, then the file is created with the specified filename.
     * If not provided, then the filename from the `originalSource` is used.
     */
    private String filename;

    /**
     * The file content type. If omitted, then Shopify will attempt to determine the content type during file processing.
     */
    private FileContentType contentType;

    /**
     * The alt text description of the file for screen readers and accessibility.
     */
    private String alt;

    /**
     * How to handle if filename is already in use.
     */
    private FileCreateInputDuplicateResolutionMode duplicateResolutionMode = FileCreateInputDuplicateResolutionMode.APPEND_UUID;

    /**
     * The ID of an existing file.
     */
    private String id;

    /**
     * An external URL (for images only) or a
     * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
     */
    private String originalSource;

    public FileSetInput build() {
      FileSetInput result = new FileSetInput();
      result.filename = this.filename;
      result.contentType = this.contentType;
      result.alt = this.alt;
      result.duplicateResolutionMode = this.duplicateResolutionMode;
      result.id = this.id;
      result.originalSource = this.originalSource;
      return result;
    }

    /**
     * The name of the file. If provided, then the file is created with the specified filename.
     * If not provided, then the filename from the `originalSource` is used.
     */
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    /**
     * The file content type. If omitted, then Shopify will attempt to determine the content type during file processing.
     */
    public Builder contentType(FileContentType contentType) {
      this.contentType = contentType;
      return this;
    }

    /**
     * The alt text description of the file for screen readers and accessibility.
     */
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }

    /**
     * How to handle if filename is already in use.
     */
    public Builder duplicateResolutionMode(
        FileCreateInputDuplicateResolutionMode duplicateResolutionMode) {
      this.duplicateResolutionMode = duplicateResolutionMode;
      return this;
    }

    /**
     * The ID of an existing file.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * An external URL (for images only) or a
     * [staged upload URL](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
     */
    public Builder originalSource(String originalSource) {
      this.originalSource = originalSource;
      return this;
    }
  }
}

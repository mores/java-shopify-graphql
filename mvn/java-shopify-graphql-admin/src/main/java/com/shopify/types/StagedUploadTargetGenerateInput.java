package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The required fields and parameters to generate the URL upload an"
 * asset to Shopify.
 *
 * Deprecated in favor of
 * [StagedUploadInput](https://shopify.dev/api/admin-graphql/latest/objects/StagedUploadInput),
 * which is used by the
 * [stagedUploadsCreate mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stagedUploadsCreate).
 */
public class StagedUploadTargetGenerateInput {
  /**
   * The resource type being uploaded.
   */
  private StagedUploadTargetGenerateUploadResource resource;

  /**
   * The filename of the asset being uploaded.
   */
  private String filename;

  /**
   * The MIME type of the asset being uploaded.
   */
  private String mimeType;

  /**
   * The HTTP method to be used by the staged upload.
   */
  private StagedUploadHttpMethodType httpMethod = StagedUploadHttpMethodType.PUT;

  /**
   * The size of the file to upload, in bytes.
   */
  private String fileSize;

  public StagedUploadTargetGenerateInput() {
  }

  /**
   * The resource type being uploaded.
   */
  public StagedUploadTargetGenerateUploadResource getResource() {
    return resource;
  }

  public void setResource(StagedUploadTargetGenerateUploadResource resource) {
    this.resource = resource;
  }

  /**
   * The filename of the asset being uploaded.
   */
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * The MIME type of the asset being uploaded.
   */
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * The HTTP method to be used by the staged upload.
   */
  public StagedUploadHttpMethodType getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(StagedUploadHttpMethodType httpMethod) {
    this.httpMethod = httpMethod;
  }

  /**
   * The size of the file to upload, in bytes.
   */
  public String getFileSize() {
    return fileSize;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

  @Override
  public String toString() {
    return "StagedUploadTargetGenerateInput{resource='" + resource + "', filename='" + filename + "', mimeType='" + mimeType + "', httpMethod='" + httpMethod + "', fileSize='" + fileSize + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StagedUploadTargetGenerateInput that = (StagedUploadTargetGenerateInput) o;
    return Objects.equals(resource, that.resource) &&
        Objects.equals(filename, that.filename) &&
        Objects.equals(mimeType, that.mimeType) &&
        Objects.equals(httpMethod, that.httpMethod) &&
        Objects.equals(fileSize, that.fileSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, filename, mimeType, httpMethod, fileSize);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The resource type being uploaded.
     */
    private StagedUploadTargetGenerateUploadResource resource;

    /**
     * The filename of the asset being uploaded.
     */
    private String filename;

    /**
     * The MIME type of the asset being uploaded.
     */
    private String mimeType;

    /**
     * The HTTP method to be used by the staged upload.
     */
    private StagedUploadHttpMethodType httpMethod = StagedUploadHttpMethodType.PUT;

    /**
     * The size of the file to upload, in bytes.
     */
    private String fileSize;

    public StagedUploadTargetGenerateInput build() {
      StagedUploadTargetGenerateInput result = new StagedUploadTargetGenerateInput();
      result.resource = this.resource;
      result.filename = this.filename;
      result.mimeType = this.mimeType;
      result.httpMethod = this.httpMethod;
      result.fileSize = this.fileSize;
      return result;
    }

    /**
     * The resource type being uploaded.
     */
    public Builder resource(StagedUploadTargetGenerateUploadResource resource) {
      this.resource = resource;
      return this;
    }

    /**
     * The filename of the asset being uploaded.
     */
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    /**
     * The MIME type of the asset being uploaded.
     */
    public Builder mimeType(String mimeType) {
      this.mimeType = mimeType;
      return this;
    }

    /**
     * The HTTP method to be used by the staged upload.
     */
    public Builder httpMethod(StagedUploadHttpMethodType httpMethod) {
      this.httpMethod = httpMethod;
      return this;
    }

    /**
     * The size of the file to upload, in bytes.
     */
    public Builder fileSize(String fileSize) {
      this.fileSize = fileSize;
      return this;
    }
  }
}

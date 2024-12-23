package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for generating staged upload targets.
 */
public class StagedUploadInput {
  /**
   * The file's intended Shopify resource type.
   */
  private StagedUploadTargetGenerateUploadResource resource;

  /**
   * The file's name and extension.
   */
  private String filename;

  /**
   * The file's MIME type.
   */
  private String mimeType;

  /**
   * The HTTP method to be used when sending a request to upload the file using the returned staged
   * upload target.
   */
  private StagedUploadHttpMethodType httpMethod = StagedUploadHttpMethodType.PUT;

  /**
   * The size of the file to upload, in bytes. This is required when the request's resource property is set to
   * [VIDEO](https://shopify.dev/api/admin-graphql/latest/enums/StagedUploadTargetGenerateUploadResource#value-video)
   * or [MODEL_3D](https://shopify.dev/api/admin-graphql/latest/enums/StagedUploadTargetGenerateUploadResource#value-model3d).
   */
  private String fileSize;

  public StagedUploadInput() {
  }

  /**
   * The file's intended Shopify resource type.
   */
  public StagedUploadTargetGenerateUploadResource getResource() {
    return resource;
  }

  public void setResource(StagedUploadTargetGenerateUploadResource resource) {
    this.resource = resource;
  }

  /**
   * The file's name and extension.
   */
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * The file's MIME type.
   */
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * The HTTP method to be used when sending a request to upload the file using the returned staged
   * upload target.
   */
  public StagedUploadHttpMethodType getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(StagedUploadHttpMethodType httpMethod) {
    this.httpMethod = httpMethod;
  }

  /**
   * The size of the file to upload, in bytes. This is required when the request's resource property is set to
   * [VIDEO](https://shopify.dev/api/admin-graphql/latest/enums/StagedUploadTargetGenerateUploadResource#value-video)
   * or [MODEL_3D](https://shopify.dev/api/admin-graphql/latest/enums/StagedUploadTargetGenerateUploadResource#value-model3d).
   */
  public String getFileSize() {
    return fileSize;
  }

  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }

  @Override
  public String toString() {
    return "StagedUploadInput{resource='" + resource + "', filename='" + filename + "', mimeType='" + mimeType + "', httpMethod='" + httpMethod + "', fileSize='" + fileSize + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StagedUploadInput that = (StagedUploadInput) o;
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
     * The file's intended Shopify resource type.
     */
    private StagedUploadTargetGenerateUploadResource resource;

    /**
     * The file's name and extension.
     */
    private String filename;

    /**
     * The file's MIME type.
     */
    private String mimeType;

    /**
     * The HTTP method to be used when sending a request to upload the file using the returned staged
     * upload target.
     */
    private StagedUploadHttpMethodType httpMethod = StagedUploadHttpMethodType.PUT;

    /**
     * The size of the file to upload, in bytes. This is required when the request's resource property is set to
     * [VIDEO](https://shopify.dev/api/admin-graphql/latest/enums/StagedUploadTargetGenerateUploadResource#value-video)
     * or [MODEL_3D](https://shopify.dev/api/admin-graphql/latest/enums/StagedUploadTargetGenerateUploadResource#value-model3d).
     */
    private String fileSize;

    public StagedUploadInput build() {
      StagedUploadInput result = new StagedUploadInput();
      result.resource = this.resource;
      result.filename = this.filename;
      result.mimeType = this.mimeType;
      result.httpMethod = this.httpMethod;
      result.fileSize = this.fileSize;
      return result;
    }

    /**
     * The file's intended Shopify resource type.
     */
    public Builder resource(StagedUploadTargetGenerateUploadResource resource) {
      this.resource = resource;
      return this;
    }

    /**
     * The file's name and extension.
     */
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    /**
     * The file's MIME type.
     */
    public Builder mimeType(String mimeType) {
      this.mimeType = mimeType;
      return this;
    }

    /**
     * The HTTP method to be used when sending a request to upload the file using the returned staged
     * upload target.
     */
    public Builder httpMethod(StagedUploadHttpMethodType httpMethod) {
      this.httpMethod = httpMethod;
      return this;
    }

    /**
     * The size of the file to upload, in bytes. This is required when the request's resource property is set to
     * [VIDEO](https://shopify.dev/api/admin-graphql/latest/enums/StagedUploadTargetGenerateUploadResource#value-video)
     * or [MODEL_3D](https://shopify.dev/api/admin-graphql/latest/enums/StagedUploadTargetGenerateUploadResource#value-model3d).
     */
    public Builder fileSize(String fileSize) {
      this.fileSize = fileSize;
      return this;
    }
  }
}

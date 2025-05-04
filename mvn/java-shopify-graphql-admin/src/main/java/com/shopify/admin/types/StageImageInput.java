package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An image to be uploaded.
 *
 * Deprecated in favor of
 * [StagedUploadInput](https://shopify.dev/api/admin-graphql/latest/objects/StagedUploadInput),
 * which is used by the
 * [stagedUploadsCreate mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stagedUploadsCreate).
 */
public class StageImageInput {
  /**
   * The image resource.
   */
  private StagedUploadTargetGenerateUploadResource resource;

  /**
   * The image filename.
   */
  private String filename;

  /**
   * The image MIME type.
   */
  private String mimeType;

  /**
   * HTTP method to be used by the staged upload.
   */
  private StagedUploadHttpMethodType httpMethod = StagedUploadHttpMethodType.PUT;

  public StageImageInput() {
  }

  /**
   * The image resource.
   */
  public StagedUploadTargetGenerateUploadResource getResource() {
    return resource;
  }

  public void setResource(StagedUploadTargetGenerateUploadResource resource) {
    this.resource = resource;
  }

  /**
   * The image filename.
   */
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  /**
   * The image MIME type.
   */
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * HTTP method to be used by the staged upload.
   */
  public StagedUploadHttpMethodType getHttpMethod() {
    return httpMethod;
  }

  public void setHttpMethod(StagedUploadHttpMethodType httpMethod) {
    this.httpMethod = httpMethod;
  }

  @Override
  public String toString() {
    return "StageImageInput{resource='" + resource + "', filename='" + filename + "', mimeType='" + mimeType + "', httpMethod='" + httpMethod + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StageImageInput that = (StageImageInput) o;
    return Objects.equals(resource, that.resource) &&
        Objects.equals(filename, that.filename) &&
        Objects.equals(mimeType, that.mimeType) &&
        Objects.equals(httpMethod, that.httpMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, filename, mimeType, httpMethod);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The image resource.
     */
    private StagedUploadTargetGenerateUploadResource resource;

    /**
     * The image filename.
     */
    private String filename;

    /**
     * The image MIME type.
     */
    private String mimeType;

    /**
     * HTTP method to be used by the staged upload.
     */
    private StagedUploadHttpMethodType httpMethod = StagedUploadHttpMethodType.PUT;

    public StageImageInput build() {
      StageImageInput result = new StageImageInput();
      result.resource = this.resource;
      result.filename = this.filename;
      result.mimeType = this.mimeType;
      result.httpMethod = this.httpMethod;
      return result;
    }

    /**
     * The image resource.
     */
    public Builder resource(StagedUploadTargetGenerateUploadResource resource) {
      this.resource = resource;
      return this;
    }

    /**
     * The image filename.
     */
    public Builder filename(String filename) {
      this.filename = filename;
      return this;
    }

    /**
     * The image MIME type.
     */
    public Builder mimeType(String mimeType) {
      this.mimeType = mimeType;
      return this;
    }

    /**
     * HTTP method to be used by the staged upload.
     */
    public Builder httpMethod(StagedUploadHttpMethodType httpMethod) {
      this.httpMethod = httpMethod;
      return this;
    }
  }
}

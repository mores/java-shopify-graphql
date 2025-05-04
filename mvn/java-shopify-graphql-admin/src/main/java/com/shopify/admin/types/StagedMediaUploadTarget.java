package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Information about a staged upload target, which should be used to send a request to upload
 * the file.
 *
 * For more information on the upload process, refer to
 * [Upload media to Shopify](https://shopify.dev/apps/online-store/media/products#step-1-upload-media-to-shopify).
 */
public class StagedMediaUploadTarget {
  /**
   * Parameters needed to authenticate a request to upload the file.
   */
  private List<StagedUploadParameter> parameters;

  /**
   * The URL to be passed as `originalSource` in
   * [CreateMediaInput](https://shopify.dev/api/admin-graphql/latest/input-objects/CreateMediaInput)
   * and [FileCreateInput](https://shopify.dev/api/admin-graphql/2022-04/input-objects/FileCreateInput)
   * for the [productCreateMedia](https://shopify.dev/api/admin-graphql/2022-04/mutations/productCreateMedia)
   * and [fileCreate](https://shopify.dev/api/admin-graphql/2022-04/mutations/fileCreate)
   * mutations.
   */
  private String resourceUrl;

  /**
   * The URL to use when sending an request to upload the file. Should be used in conjunction with
   * the parameters field.
   */
  private String url;

  public StagedMediaUploadTarget() {
  }

  /**
   * Parameters needed to authenticate a request to upload the file.
   */
  public List<StagedUploadParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<StagedUploadParameter> parameters) {
    this.parameters = parameters;
  }

  /**
   * The URL to be passed as `originalSource` in
   * [CreateMediaInput](https://shopify.dev/api/admin-graphql/latest/input-objects/CreateMediaInput)
   * and [FileCreateInput](https://shopify.dev/api/admin-graphql/2022-04/input-objects/FileCreateInput)
   * for the [productCreateMedia](https://shopify.dev/api/admin-graphql/2022-04/mutations/productCreateMedia)
   * and [fileCreate](https://shopify.dev/api/admin-graphql/2022-04/mutations/fileCreate)
   * mutations.
   */
  public String getResourceUrl() {
    return resourceUrl;
  }

  public void setResourceUrl(String resourceUrl) {
    this.resourceUrl = resourceUrl;
  }

  /**
   * The URL to use when sending an request to upload the file. Should be used in conjunction with
   * the parameters field.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "StagedMediaUploadTarget{parameters='" + parameters + "', resourceUrl='" + resourceUrl + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StagedMediaUploadTarget that = (StagedMediaUploadTarget) o;
    return Objects.equals(parameters, that.parameters) &&
        Objects.equals(resourceUrl, that.resourceUrl) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, resourceUrl, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Parameters needed to authenticate a request to upload the file.
     */
    private List<StagedUploadParameter> parameters;

    /**
     * The URL to be passed as `originalSource` in
     * [CreateMediaInput](https://shopify.dev/api/admin-graphql/latest/input-objects/CreateMediaInput)
     * and [FileCreateInput](https://shopify.dev/api/admin-graphql/2022-04/input-objects/FileCreateInput)
     * for the [productCreateMedia](https://shopify.dev/api/admin-graphql/2022-04/mutations/productCreateMedia)
     * and [fileCreate](https://shopify.dev/api/admin-graphql/2022-04/mutations/fileCreate)
     * mutations.
     */
    private String resourceUrl;

    /**
     * The URL to use when sending an request to upload the file. Should be used in conjunction with
     * the parameters field.
     */
    private String url;

    public StagedMediaUploadTarget build() {
      StagedMediaUploadTarget result = new StagedMediaUploadTarget();
      result.parameters = this.parameters;
      result.resourceUrl = this.resourceUrl;
      result.url = this.url;
      return result;
    }

    /**
     * Parameters needed to authenticate a request to upload the file.
     */
    public Builder parameters(List<StagedUploadParameter> parameters) {
      this.parameters = parameters;
      return this;
    }

    /**
     * The URL to be passed as `originalSource` in
     * [CreateMediaInput](https://shopify.dev/api/admin-graphql/latest/input-objects/CreateMediaInput)
     * and [FileCreateInput](https://shopify.dev/api/admin-graphql/2022-04/input-objects/FileCreateInput)
     * for the [productCreateMedia](https://shopify.dev/api/admin-graphql/2022-04/mutations/productCreateMedia)
     * and [fileCreate](https://shopify.dev/api/admin-graphql/2022-04/mutations/fileCreate)
     * mutations.
     */
    public Builder resourceUrl(String resourceUrl) {
      this.resourceUrl = resourceUrl;
      return this;
    }

    /**
     * The URL to use when sending an request to upload the file. Should be used in conjunction with
     * the parameters field.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}

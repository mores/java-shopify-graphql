package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Information about the staged target.
 *
 * Deprecated in favor of
 * [StagedMediaUploadTarget](https://shopify.dev/api/admin-graphql/latest/objects/StagedMediaUploadTarget),
 * which is returned by the
 * [stagedUploadsCreate mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stagedUploadsCreate).
 */
public class StagedUploadTarget {
  /**
   * The parameters of an image to be uploaded.
   */
  private List<ImageUploadParameter> parameters;

  /**
   * The image URL.
   */
  private String url;

  public StagedUploadTarget() {
  }

  /**
   * The parameters of an image to be uploaded.
   */
  public List<ImageUploadParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<ImageUploadParameter> parameters) {
    this.parameters = parameters;
  }

  /**
   * The image URL.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "StagedUploadTarget{parameters='" + parameters + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StagedUploadTarget that = (StagedUploadTarget) o;
    return Objects.equals(parameters, that.parameters) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The parameters of an image to be uploaded.
     */
    private List<ImageUploadParameter> parameters;

    /**
     * The image URL.
     */
    private String url;

    public StagedUploadTarget build() {
      StagedUploadTarget result = new StagedUploadTarget();
      result.parameters = this.parameters;
      result.url = this.url;
      return result;
    }

    /**
     * The parameters of an image to be uploaded.
     */
    public Builder parameters(List<ImageUploadParameter> parameters) {
      this.parameters = parameters;
      return this;
    }

    /**
     * The image URL.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}

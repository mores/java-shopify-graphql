package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The parameters required to authenticate a file upload request using a
 * [StagedMediaUploadTarget's url field](https://shopify.dev/api/admin-graphql/latest/objects/StagedMediaUploadTarget#field-stagedmediauploadtarget-url).
 *
 * For more information on the upload process, refer to
 * [Upload media to Shopify](https://shopify.dev/apps/online-store/media/products#step-1-upload-media-to-shopify).
 */
public class StagedUploadParameter {
  /**
   * The parameter's name.
   */
  private String name;

  /**
   * The parameter's value.
   */
  private String value;

  public StagedUploadParameter() {
  }

  /**
   * The parameter's name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The parameter's value.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "StagedUploadParameter{name='" + name + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StagedUploadParameter that = (StagedUploadParameter) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The parameter's name.
     */
    private String name;

    /**
     * The parameter's value.
     */
    private String value;

    public StagedUploadParameter build() {
      StagedUploadParameter result = new StagedUploadParameter();
      result.name = this.name;
      result.value = this.value;
      return result;
    }

    /**
     * The parameter's name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The parameter's value.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}

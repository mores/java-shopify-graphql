package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A parameter to upload an image.
 *
 * Deprecated in favor of
 * [StagedUploadParameter](https://shopify.dev/api/admin-graphql/latest/objects/StagedUploadParameter),
 * which is used in
 * [StagedMediaUploadTarget](https://shopify.dev/api/admin-graphql/latest/objects/StagedMediaUploadTarget)
 * and returned by the
 * [stagedUploadsCreate mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stagedUploadsCreate).
 */
public class ImageUploadParameter {
  /**
   * The parameter name.
   */
  private String name;

  /**
   * The parameter value.
   */
  private String value;

  public ImageUploadParameter() {
  }

  /**
   * The parameter name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The parameter value.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "ImageUploadParameter{name='" + name + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ImageUploadParameter that = (ImageUploadParameter) o;
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
     * The parameter name.
     */
    private String name;

    /**
     * The parameter value.
     */
    private String value;

    public ImageUploadParameter build() {
      ImageUploadParameter result = new ImageUploadParameter();
      result.name = this.name;
      result.value = this.value;
      return result;
    }

    /**
     * The parameter name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The parameter value.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}

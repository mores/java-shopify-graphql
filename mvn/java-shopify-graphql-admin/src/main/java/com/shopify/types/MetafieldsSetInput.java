package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a metafield value to set.
 */
public class MetafieldsSetInput {
  /**
   * The unique ID of the resource that the metafield is attached to.
   */
  private String ownerId;

  /**
   * The container for a group of metafields that the metafield is or will be associated with. Used in tandem
   * with `key` to lookup a metafield on a resource, preventing conflicts with other metafields with the
   * same `key`. If omitted the app-reserved namespace will be used.
   *   
   * Must be 3-255 characters long and can contain alphanumeric, hyphen, and underscore characters.
   */
  private String namespace;

  /**
   * The unique identifier for a metafield within its namespace.
   *   
   * Must be 2-64 characters long and can contain alphanumeric, hyphen, and underscore characters.
   */
  private String key;

  /**
   * The data stored in the metafield. Always stored as a string, regardless of the metafield's type.
   */
  private String value;

  /**
   * The `compareDigest` value obtained from a previous query. Provide this with
   * updates to ensure the metafield is modified safely.
   */
  private String compareDigest;

  /**
   * The type of data that is stored in the metafield.
   * The type must be one of the [supported types](https://shopify.dev/apps/metafields/types).
   *   
   * Required when there is no corresponding definition for the given `namespace`, `key`, and
   * owner resource type (derived from `ownerId`).
   */
  private String type;

  public MetafieldsSetInput() {
  }

  /**
   * The unique ID of the resource that the metafield is attached to.
   */
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  /**
   * The container for a group of metafields that the metafield is or will be associated with. Used in tandem
   * with `key` to lookup a metafield on a resource, preventing conflicts with other metafields with the
   * same `key`. If omitted the app-reserved namespace will be used.
   *   
   * Must be 3-255 characters long and can contain alphanumeric, hyphen, and underscore characters.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The unique identifier for a metafield within its namespace.
   *   
   * Must be 2-64 characters long and can contain alphanumeric, hyphen, and underscore characters.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The data stored in the metafield. Always stored as a string, regardless of the metafield's type.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * The `compareDigest` value obtained from a previous query. Provide this with
   * updates to ensure the metafield is modified safely.
   */
  public String getCompareDigest() {
    return compareDigest;
  }

  public void setCompareDigest(String compareDigest) {
    this.compareDigest = compareDigest;
  }

  /**
   * The type of data that is stored in the metafield.
   * The type must be one of the [supported types](https://shopify.dev/apps/metafields/types).
   *   
   * Required when there is no corresponding definition for the given `namespace`, `key`, and
   * owner resource type (derived from `ownerId`).
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "MetafieldsSetInput{ownerId='" + ownerId + "', namespace='" + namespace + "', key='" + key + "', value='" + value + "', compareDigest='" + compareDigest + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldsSetInput that = (MetafieldsSetInput) o;
    return Objects.equals(ownerId, that.ownerId) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key) &&
        Objects.equals(value, that.value) &&
        Objects.equals(compareDigest, that.compareDigest) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerId, namespace, key, value, compareDigest, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unique ID of the resource that the metafield is attached to.
     */
    private String ownerId;

    /**
     * The container for a group of metafields that the metafield is or will be associated with. Used in tandem
     * with `key` to lookup a metafield on a resource, preventing conflicts with other metafields with the
     * same `key`. If omitted the app-reserved namespace will be used.
     *   
     * Must be 3-255 characters long and can contain alphanumeric, hyphen, and underscore characters.
     */
    private String namespace;

    /**
     * The unique identifier for a metafield within its namespace.
     *   
     * Must be 2-64 characters long and can contain alphanumeric, hyphen, and underscore characters.
     */
    private String key;

    /**
     * The data stored in the metafield. Always stored as a string, regardless of the metafield's type.
     */
    private String value;

    /**
     * The `compareDigest` value obtained from a previous query. Provide this with
     * updates to ensure the metafield is modified safely.
     */
    private String compareDigest;

    /**
     * The type of data that is stored in the metafield.
     * The type must be one of the [supported types](https://shopify.dev/apps/metafields/types).
     *   
     * Required when there is no corresponding definition for the given `namespace`, `key`, and
     * owner resource type (derived from `ownerId`).
     */
    private String type;

    public MetafieldsSetInput build() {
      MetafieldsSetInput result = new MetafieldsSetInput();
      result.ownerId = this.ownerId;
      result.namespace = this.namespace;
      result.key = this.key;
      result.value = this.value;
      result.compareDigest = this.compareDigest;
      result.type = this.type;
      return result;
    }

    /**
     * The unique ID of the resource that the metafield is attached to.
     */
    public Builder ownerId(String ownerId) {
      this.ownerId = ownerId;
      return this;
    }

    /**
     * The container for a group of metafields that the metafield is or will be associated with. Used in tandem
     * with `key` to lookup a metafield on a resource, preventing conflicts with other metafields with the
     * same `key`. If omitted the app-reserved namespace will be used.
     *   
     * Must be 3-255 characters long and can contain alphanumeric, hyphen, and underscore characters.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The unique identifier for a metafield within its namespace.
     *   
     * Must be 2-64 characters long and can contain alphanumeric, hyphen, and underscore characters.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The data stored in the metafield. Always stored as a string, regardless of the metafield's type.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * The `compareDigest` value obtained from a previous query. Provide this with
     * updates to ensure the metafield is modified safely.
     */
    public Builder compareDigest(String compareDigest) {
      this.compareDigest = compareDigest;
      return this;
    }

    /**
     * The type of data that is stored in the metafield.
     * The type must be one of the [supported types](https://shopify.dev/apps/metafields/types).
     *   
     * Required when there is no corresponding definition for the given `namespace`, `key`, and
     * owner resource type (derived from `ownerId`).
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }
}

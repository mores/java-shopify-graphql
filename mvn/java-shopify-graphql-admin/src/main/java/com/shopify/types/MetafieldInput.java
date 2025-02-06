package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to use to create or update a metafield through a mutation on the owning resource.
 * An alternative way to create or update a metafield is by using the
 * [metafieldsSet](https://shopify.dev/api/admin-graphql/latest/mutations/metafieldsSet) mutation.
 */
public class MetafieldInput {
  /**
   * The unique ID of the metafield. Using `owner_id`, `namespace`, and `key` is preferred for creating and updating.
   */
  private String id;

  /**
   * The container for a group of metafields that the metafield is or will be associated with. Used in tandem with
   * `key` to lookup a metafield on a resource, preventing conflicts with other metafields with the same `key`.
   *   
   * Required when creating a metafield, but optional when updating. Used to help identify the metafield when
   * updating, but can't be updated itself.
   *   
   * Must be 3-255 characters long and can contain alphanumeric, hyphen, and underscore characters.
   */
  private String namespace;

  /**
   * The unique identifier for a metafield within its namespace.
   *   
   * Required when creating a metafield, but optional when updating. Used to help identify the metafield when
   * updating, but can't be updated itself.
   *   
   * Must be 2-64 characters long and can contain alphanumeric, hyphen, and underscore characters.
   */
  private String key;

  /**
   * The data stored in the metafield. Always stored as a string, regardless of the metafield's type.
   */
  private String value;

  /**
   * The type of data that is stored in the metafield.
   * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
   *   
   * Required when creating or updating a metafield without a definition.
   */
  private String type;

  public MetafieldInput() {
  }

  /**
   * The unique ID of the metafield. Using `owner_id`, `namespace`, and `key` is preferred for creating and updating.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The container for a group of metafields that the metafield is or will be associated with. Used in tandem with
   * `key` to lookup a metafield on a resource, preventing conflicts with other metafields with the same `key`.
   *   
   * Required when creating a metafield, but optional when updating. Used to help identify the metafield when
   * updating, but can't be updated itself.
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
   * Required when creating a metafield, but optional when updating. Used to help identify the metafield when
   * updating, but can't be updated itself.
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
   * The type of data that is stored in the metafield.
   * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
   *   
   * Required when creating or updating a metafield without a definition.
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "MetafieldInput{id='" + id + "', namespace='" + namespace + "', key='" + key + "', value='" + value + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldInput that = (MetafieldInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key) &&
        Objects.equals(value, that.value) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, namespace, key, value, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unique ID of the metafield. Using `owner_id`, `namespace`, and `key` is preferred for creating and updating.
     */
    private String id;

    /**
     * The container for a group of metafields that the metafield is or will be associated with. Used in tandem with
     * `key` to lookup a metafield on a resource, preventing conflicts with other metafields with the same `key`.
     *   
     * Required when creating a metafield, but optional when updating. Used to help identify the metafield when
     * updating, but can't be updated itself.
     *   
     * Must be 3-255 characters long and can contain alphanumeric, hyphen, and underscore characters.
     */
    private String namespace;

    /**
     * The unique identifier for a metafield within its namespace.
     *   
     * Required when creating a metafield, but optional when updating. Used to help identify the metafield when
     * updating, but can't be updated itself.
     *   
     * Must be 2-64 characters long and can contain alphanumeric, hyphen, and underscore characters.
     */
    private String key;

    /**
     * The data stored in the metafield. Always stored as a string, regardless of the metafield's type.
     */
    private String value;

    /**
     * The type of data that is stored in the metafield.
     * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
     *   
     * Required when creating or updating a metafield without a definition.
     */
    private String type;

    public MetafieldInput build() {
      MetafieldInput result = new MetafieldInput();
      result.id = this.id;
      result.namespace = this.namespace;
      result.key = this.key;
      result.value = this.value;
      result.type = this.type;
      return result;
    }

    /**
     * The unique ID of the metafield. Using `owner_id`, `namespace`, and `key` is preferred for creating and updating.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The container for a group of metafields that the metafield is or will be associated with. Used in tandem with
     * `key` to lookup a metafield on a resource, preventing conflicts with other metafields with the same `key`.
     *   
     * Required when creating a metafield, but optional when updating. Used to help identify the metafield when
     * updating, but can't be updated itself.
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
     * Required when creating a metafield, but optional when updating. Used to help identify the metafield when
     * updating, but can't be updated itself.
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
     * The type of data that is stored in the metafield.
     * Refer to the list of [supported types](https://shopify.dev/apps/metafields/types).
     *   
     * Required when creating or updating a metafield without a definition.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }
}

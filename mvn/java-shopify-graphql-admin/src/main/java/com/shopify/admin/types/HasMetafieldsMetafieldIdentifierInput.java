package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields that identify metafield definitions.
 */
public class HasMetafieldsMetafieldIdentifierInput {
  /**
   * The container for a group of metafields that the metafield definition will be associated with. If omitted, the
   * app-reserved namespace will be used.
   */
  private String namespace;

  /**
   * The unique identifier for the metafield definition within its namespace.
   */
  private String key;

  public HasMetafieldsMetafieldIdentifierInput() {
  }

  /**
   * The container for a group of metafields that the metafield definition will be associated with. If omitted, the
   * app-reserved namespace will be used.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The unique identifier for the metafield definition within its namespace.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  @Override
  public String toString() {
    return "HasMetafieldsMetafieldIdentifierInput{namespace='" + namespace + "', key='" + key + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    HasMetafieldsMetafieldIdentifierInput that = (HasMetafieldsMetafieldIdentifierInput) o;
    return Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, key);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The container for a group of metafields that the metafield definition will be associated with. If omitted, the
     * app-reserved namespace will be used.
     */
    private String namespace;

    /**
     * The unique identifier for the metafield definition within its namespace.
     */
    private String key;

    public HasMetafieldsMetafieldIdentifierInput build() {
      HasMetafieldsMetafieldIdentifierInput result = new HasMetafieldsMetafieldIdentifierInput();
      result.namespace = this.namespace;
      result.key = this.key;
      return result;
    }

    /**
     * The container for a group of metafields that the metafield definition will be associated with. If omitted, the
     * app-reserved namespace will be used.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The unique identifier for the metafield definition within its namespace.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }
  }
}

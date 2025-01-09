package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The identifier for the metafield linked to this option.
 *
 * This API is currently in early access. See [Metafield-linked product options](https://shopify.dev/docs/api/admin/migrate/new-product-model/metafield-linked)
 * for more details.
 */
public class LinkedMetafield {
  /**
   * Key of the metafield the option is linked to.
   */
  private String key;

  /**
   * Namespace of the metafield the option is linked to.
   */
  private String namespace;

  public LinkedMetafield() {
  }

  /**
   * Key of the metafield the option is linked to.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Namespace of the metafield the option is linked to.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  @Override
  public String toString() {
    return "LinkedMetafield{key='" + key + "', namespace='" + namespace + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LinkedMetafield that = (LinkedMetafield) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(namespace, that.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, namespace);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Key of the metafield the option is linked to.
     */
    private String key;

    /**
     * Namespace of the metafield the option is linked to.
     */
    private String namespace;

    public LinkedMetafield build() {
      LinkedMetafield result = new LinkedMetafield();
      result.key = this.key;
      result.namespace = this.namespace;
      return result;
    }

    /**
     * Key of the metafield the option is linked to.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Namespace of the metafield the option is linked to.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }
  }
}

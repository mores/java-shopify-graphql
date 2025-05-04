package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to link a product option to a metafield.
 *
 * This API is currently in early access. See [Metafield-linked product options](https://shopify.dev/docs/api/admin/migrate/new-product-model/metafield-linked)
 * for more details.
 */
public class LinkedMetafieldUpdateInput {
  /**
   * The namespace of the metafield this option is linked to.
   */
  private String namespace;

  /**
   * The key of the metafield this option is linked to.
   */
  private String key;

  public LinkedMetafieldUpdateInput() {
  }

  /**
   * The namespace of the metafield this option is linked to.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The key of the metafield this option is linked to.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  @Override
  public String toString() {
    return "LinkedMetafieldUpdateInput{namespace='" + namespace + "', key='" + key + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LinkedMetafieldUpdateInput that = (LinkedMetafieldUpdateInput) o;
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
     * The namespace of the metafield this option is linked to.
     */
    private String namespace;

    /**
     * The key of the metafield this option is linked to.
     */
    private String key;

    public LinkedMetafieldUpdateInput build() {
      LinkedMetafieldUpdateInput result = new LinkedMetafieldUpdateInput();
      result.namespace = this.namespace;
      result.key = this.key;
      return result;
    }

    /**
     * The namespace of the metafield this option is linked to.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The key of the metafield this option is linked to.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }
  }
}

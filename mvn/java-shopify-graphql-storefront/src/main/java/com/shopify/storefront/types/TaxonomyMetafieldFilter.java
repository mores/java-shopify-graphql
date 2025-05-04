package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A filter used to view a subset of products in a collection matching a specific taxonomy metafield value.
 */
public class TaxonomyMetafieldFilter {
  /**
   * The namespace of the metafield to filter on.
   */
  private String namespace;

  /**
   * The key of the metafield to filter on.
   */
  private String key;

  /**
   * The value of the metafield.
   */
  private String value;

  public TaxonomyMetafieldFilter() {
  }

  /**
   * The namespace of the metafield to filter on.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The key of the metafield to filter on.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The value of the metafield.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "TaxonomyMetafieldFilter{namespace='" + namespace + "', key='" + key + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaxonomyMetafieldFilter that = (TaxonomyMetafieldFilter) o;
    return Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, key, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The namespace of the metafield to filter on.
     */
    private String namespace;

    /**
     * The key of the metafield to filter on.
     */
    private String key;

    /**
     * The value of the metafield.
     */
    private String value;

    public TaxonomyMetafieldFilter build() {
      TaxonomyMetafieldFilter result = new TaxonomyMetafieldFilter();
      result.namespace = this.namespace;
      result.key = this.key;
      result.value = this.value;
      return result;
    }

    /**
     * The namespace of the metafield to filter on.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The key of the metafield to filter on.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The value of the metafield.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}

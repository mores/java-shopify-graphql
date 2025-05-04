package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to identify a metafield on an owner resource by namespace and key.
 */
public class HasMetafieldsIdentifier {
  /**
   * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
   */
  private String namespace;

  /**
   * The identifier for the metafield.
   */
  private String key;

  public HasMetafieldsIdentifier() {
  }

  /**
   * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The identifier for the metafield.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  @Override
  public String toString() {
    return "HasMetafieldsIdentifier{namespace='" + namespace + "', key='" + key + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    HasMetafieldsIdentifier that = (HasMetafieldsIdentifier) o;
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
     * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
     */
    private String namespace;

    /**
     * The identifier for the metafield.
     */
    private String key;

    public HasMetafieldsIdentifier build() {
      HasMetafieldsIdentifier result = new HasMetafieldsIdentifier();
      result.namespace = this.namespace;
      result.key = this.key;
      return result;
    }

    /**
     * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The identifier for the metafield.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }
  }
}

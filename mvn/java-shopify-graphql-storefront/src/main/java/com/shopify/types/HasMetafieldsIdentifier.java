package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to identify a metafield on an owner resource by namespace and key.
 */
public class HasMetafieldsIdentifier {
  /**
   * The identifier for the metafield.
   */
  private String key;

  /**
   * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
   */
  private String namespace;

  public HasMetafieldsIdentifier() {
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

  /**
   * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  @Override
  public String toString() {
    return "HasMetafieldsIdentifier{key='" + key + "', namespace='" + namespace + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    HasMetafieldsIdentifier that = (HasMetafieldsIdentifier) o;
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
     * The identifier for the metafield.
     */
    private String key;

    /**
     * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
     */
    private String namespace;

    public HasMetafieldsIdentifier build() {
      HasMetafieldsIdentifier result = new HasMetafieldsIdentifier();
      result.key = this.key;
      result.namespace = this.namespace;
      return result;
    }

    /**
     * The identifier for the metafield.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }
  }
}

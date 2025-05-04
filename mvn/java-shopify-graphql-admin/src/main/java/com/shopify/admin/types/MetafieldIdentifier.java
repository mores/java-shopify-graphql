package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Identifies a metafield by its owner resource, namespace, and key.
 */
public class MetafieldIdentifier {
  /**
   * The key of the metafield.
   */
  private String key;

  /**
   * The namespace of the metafield.
   */
  private String namespace;

  /**
   * GID of the owner resource that the metafield belongs to.
   */
  private String ownerId;

  public MetafieldIdentifier() {
  }

  /**
   * The key of the metafield.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The namespace of the metafield.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * GID of the owner resource that the metafield belongs to.
   */
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  @Override
  public String toString() {
    return "MetafieldIdentifier{key='" + key + "', namespace='" + namespace + "', ownerId='" + ownerId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldIdentifier that = (MetafieldIdentifier) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(ownerId, that.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, namespace, ownerId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The key of the metafield.
     */
    private String key;

    /**
     * The namespace of the metafield.
     */
    private String namespace;

    /**
     * GID of the owner resource that the metafield belongs to.
     */
    private String ownerId;

    public MetafieldIdentifier build() {
      MetafieldIdentifier result = new MetafieldIdentifier();
      result.key = this.key;
      result.namespace = this.namespace;
      result.ownerId = this.ownerId;
      return result;
    }

    /**
     * The key of the metafield.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The namespace of the metafield.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * GID of the owner resource that the metafield belongs to.
     */
    public Builder ownerId(String ownerId) {
      this.ownerId = ownerId;
      return this;
    }
  }
}

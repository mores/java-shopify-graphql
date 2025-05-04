package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Identifies a metafield definition by its owner type, namespace, and key.
 */
public class MetafieldDefinitionIdentifier {
  /**
   * The unique identifier for the metafield definition within its namespace.
   */
  private String key;

  /**
   * The container for a group of metafields that the metafield definition is associated with.
   */
  private String namespace;

  /**
   * The resource type that the metafield definition is attached to.
   */
  private MetafieldOwnerType ownerType;

  public MetafieldDefinitionIdentifier() {
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

  /**
   * The container for a group of metafields that the metafield definition is associated with.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The resource type that the metafield definition is attached to.
   */
  public MetafieldOwnerType getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(MetafieldOwnerType ownerType) {
    this.ownerType = ownerType;
  }

  @Override
  public String toString() {
    return "MetafieldDefinitionIdentifier{key='" + key + "', namespace='" + namespace + "', ownerType='" + ownerType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDefinitionIdentifier that = (MetafieldDefinitionIdentifier) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(ownerType, that.ownerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, namespace, ownerType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unique identifier for the metafield definition within its namespace.
     */
    private String key;

    /**
     * The container for a group of metafields that the metafield definition is associated with.
     */
    private String namespace;

    /**
     * The resource type that the metafield definition is attached to.
     */
    private MetafieldOwnerType ownerType;

    public MetafieldDefinitionIdentifier build() {
      MetafieldDefinitionIdentifier result = new MetafieldDefinitionIdentifier();
      result.key = this.key;
      result.namespace = this.namespace;
      result.ownerType = this.ownerType;
      return result;
    }

    /**
     * The unique identifier for the metafield definition within its namespace.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The container for a group of metafields that the metafield definition is associated with.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The resource type that the metafield definition is attached to.
     */
    public Builder ownerType(MetafieldOwnerType ownerType) {
      this.ownerType = ownerType;
      return this;
    }
  }
}

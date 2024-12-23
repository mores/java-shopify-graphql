package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the private metafield to delete.
 */
public class PrivateMetafieldDeleteInput {
  /**
   * The ID of the resource that owns the metafield. If the field is blank, then the `Shop` resource owns the metafield.
   */
  private String owner;

  /**
   * The namespace of the private metafield.
   */
  private String namespace;

  /**
   * The key of the private metafield.
   */
  private String key;

  public PrivateMetafieldDeleteInput() {
  }

  /**
   * The ID of the resource that owns the metafield. If the field is blank, then the `Shop` resource owns the metafield.
   */
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  /**
   * The namespace of the private metafield.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The key of the private metafield.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  @Override
  public String toString() {
    return "PrivateMetafieldDeleteInput{owner='" + owner + "', namespace='" + namespace + "', key='" + key + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PrivateMetafieldDeleteInput that = (PrivateMetafieldDeleteInput) o;
    return Objects.equals(owner, that.owner) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, namespace, key);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the resource that owns the metafield. If the field is blank, then the `Shop` resource owns the metafield.
     */
    private String owner;

    /**
     * The namespace of the private metafield.
     */
    private String namespace;

    /**
     * The key of the private metafield.
     */
    private String key;

    public PrivateMetafieldDeleteInput build() {
      PrivateMetafieldDeleteInput result = new PrivateMetafieldDeleteInput();
      result.owner = this.owner;
      result.namespace = this.namespace;
      result.key = this.key;
      return result;
    }

    /**
     * The ID of the resource that owns the metafield. If the field is blank, then the `Shop` resource owns the metafield.
     */
    public Builder owner(String owner) {
      this.owner = owner;
      return this;
    }

    /**
     * The namespace of the private metafield.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The key of the private metafield.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }
  }
}

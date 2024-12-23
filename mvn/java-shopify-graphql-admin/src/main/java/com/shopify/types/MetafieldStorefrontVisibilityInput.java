package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to create a MetafieldStorefrontVisibility record.
 */
public class MetafieldStorefrontVisibilityInput {
  /**
   * The namespace of a metafield to make visible in the Storefront API. If omitted the app reserved namespace will be used.
   */
  private String namespace;

  /**
   * The key of a metafield to make visible in the Storefront API.
   */
  private String key;

  /**
   * The owner type of a metafield to make visible in the Storefront API.
   */
  private MetafieldOwnerType ownerType;

  public MetafieldStorefrontVisibilityInput() {
  }

  /**
   * The namespace of a metafield to make visible in the Storefront API. If omitted the app reserved namespace will be used.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The key of a metafield to make visible in the Storefront API.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The owner type of a metafield to make visible in the Storefront API.
   */
  public MetafieldOwnerType getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(MetafieldOwnerType ownerType) {
    this.ownerType = ownerType;
  }

  @Override
  public String toString() {
    return "MetafieldStorefrontVisibilityInput{namespace='" + namespace + "', key='" + key + "', ownerType='" + ownerType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldStorefrontVisibilityInput that = (MetafieldStorefrontVisibilityInput) o;
    return Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key) &&
        Objects.equals(ownerType, that.ownerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, key, ownerType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The namespace of a metafield to make visible in the Storefront API. If omitted the app reserved namespace will be used.
     */
    private String namespace;

    /**
     * The key of a metafield to make visible in the Storefront API.
     */
    private String key;

    /**
     * The owner type of a metafield to make visible in the Storefront API.
     */
    private MetafieldOwnerType ownerType;

    public MetafieldStorefrontVisibilityInput build() {
      MetafieldStorefrontVisibilityInput result = new MetafieldStorefrontVisibilityInput();
      result.namespace = this.namespace;
      result.key = this.key;
      result.ownerType = this.ownerType;
      return result;
    }

    /**
     * The namespace of a metafield to make visible in the Storefront API. If omitted the app reserved namespace will be used.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The key of a metafield to make visible in the Storefront API.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The owner type of a metafield to make visible in the Storefront API.
     */
    public Builder ownerType(MetafieldOwnerType ownerType) {
      this.ownerType = ownerType;
      return this;
    }
  }
}

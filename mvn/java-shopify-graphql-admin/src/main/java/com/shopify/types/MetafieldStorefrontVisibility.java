package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * By default, the Storefront API can't read metafields. To make specific metafields visible in the Storefront API,
 * you need to create a `MetafieldStorefrontVisibility` record. A `MetafieldStorefrontVisibility` record is a list
 * of the metafields, defined by the `owner_type`, `namespace`, and `key`, to make visible in the Storefront API.
 *
 * Learn about [exposing metafields in the Storefront API]
 * (https://shopify.dev/custom-storefronts/products-collections/metafields)
 * for more details.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MetafieldStorefrontVisibility implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  /**
   * The date and time when the metafield was set to visible in the Storefront API.
   */
  private OffsetDateTime createdAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The key of a metafield to make visible in the Storefront API.
   */
  private String key;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The namespace of a metafield to make visible in the Storefront API.
   */
  private String namespace;

  /**
   * The owner type of a metafield to make visible in the Storefront API.
   */
  private MetafieldOwnerType ownerType;

  /**
   * The date and time when the `MetafieldStorefrontVisilibty` record was updated.
   */
  private OffsetDateTime updatedAt;

  public MetafieldStorefrontVisibility() {
  }

  /**
   * The date and time when the metafield was set to visible in the Storefront API.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  /**
   * The namespace of a metafield to make visible in the Storefront API.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
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

  /**
   * The date and time when the `MetafieldStorefrontVisilibty` record was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "MetafieldStorefrontVisibility{createdAt='" + createdAt + "', id='" + id + "', key='" + key + "', legacyResourceId='" + legacyResourceId + "', namespace='" + namespace + "', ownerType='" + ownerType + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldStorefrontVisibility that = (MetafieldStorefrontVisibility) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(key, that.key) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(namespace, that.namespace) &&
        Objects.equals(ownerType, that.ownerType) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, key, legacyResourceId, namespace, ownerType, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the metafield was set to visible in the Storefront API.
     */
    private OffsetDateTime createdAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The key of a metafield to make visible in the Storefront API.
     */
    private String key;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The namespace of a metafield to make visible in the Storefront API.
     */
    private String namespace;

    /**
     * The owner type of a metafield to make visible in the Storefront API.
     */
    private MetafieldOwnerType ownerType;

    /**
     * The date and time when the `MetafieldStorefrontVisilibty` record was updated.
     */
    private OffsetDateTime updatedAt;

    public MetafieldStorefrontVisibility build() {
      MetafieldStorefrontVisibility result = new MetafieldStorefrontVisibility();
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.key = this.key;
      result.legacyResourceId = this.legacyResourceId;
      result.namespace = this.namespace;
      result.ownerType = this.ownerType;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The date and time when the metafield was set to visible in the Storefront API.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
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
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    /**
     * The namespace of a metafield to make visible in the Storefront API.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The owner type of a metafield to make visible in the Storefront API.
     */
    public Builder ownerType(MetafieldOwnerType ownerType) {
      this.ownerType = ownerType;
      return this;
    }

    /**
     * The date and time when the `MetafieldStorefrontVisilibty` record was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}

package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * An instance of [custom structured
 * data](https://shopify.dev/docs/apps/build/metaobjects) defined by a metaobject
 * definition. Metaobjects store reusable content that extends beyond standard
 * Shopify resources, such as size charts, author profiles, or custom content sections.
 *
 * Each metaobject contains fields that match the types and validation rules
 * specified in its definition.
 * [`Metafield`](https://shopify.dev/docs/api/storefront/current/objects/Metafield)
 * references can point to metaobjects, connecting custom data with products,
 * collections, and other resources. If the definition has the `renderable`
 * capability, then the [`seo`](https://shopify.dev/docs/api/storefront/current/objects/Metaobject#field-Metaobject.fields.seo)
 * field provides SEO metadata. If it has the `online_store` capability, then the [`onlineStoreUrl`](https://shopify.dev/docs/api/storefront/current/objects/Metaobject#field-Metaobject.fields.onlineStoreUrl)
 * field returns the public URL.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Metaobject implements MenuItemResource, MetafieldReference, com.shopify.storefront.types.Node, com.shopify.storefront.types.OnlineStorePublishable {
  /**
   * Accesses a field of the object by key.
   */
  private MetaobjectField field;

  /**
   * All object fields with defined values.
   * Omitted object keys can be assumed null, and no guarantees are made about field order.
   */
  private List<MetaobjectField> fields;

  /**
   * The unique handle of the metaobject. Useful as a custom ID.
   */
  private String handle;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The URL used for viewing the metaobject on the shop's Online Store. Returns
   * `null` if the metaobject definition doesn't have the `online_store` capability.
   */
  private String onlineStoreUrl;

  /**
   * The metaobject's SEO information. Returns `null` if the metaobject definition
   * doesn't have the `renderable` capability.
   */
  private MetaobjectSEO seo;

  /**
   * The type of the metaobject.
   */
  private String type;

  /**
   * The date and time when the metaobject was last updated.
   */
  private OffsetDateTime updatedAt;

  public Metaobject() {
  }

  /**
   * Accesses a field of the object by key.
   */
  public MetaobjectField getField() {
    return field;
  }

  public void setField(MetaobjectField field) {
    this.field = field;
  }

  /**
   * All object fields with defined values.
   * Omitted object keys can be assumed null, and no guarantees are made about field order.
   */
  public List<MetaobjectField> getFields() {
    return fields;
  }

  public void setFields(List<MetaobjectField> fields) {
    this.fields = fields;
  }

  /**
   * The unique handle of the metaobject. Useful as a custom ID.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
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
   * The URL used for viewing the metaobject on the shop's Online Store. Returns
   * `null` if the metaobject definition doesn't have the `online_store` capability.
   */
  public String getOnlineStoreUrl() {
    return onlineStoreUrl;
  }

  public void setOnlineStoreUrl(String onlineStoreUrl) {
    this.onlineStoreUrl = onlineStoreUrl;
  }

  /**
   * The metaobject's SEO information. Returns `null` if the metaobject definition
   * doesn't have the `renderable` capability.
   */
  public MetaobjectSEO getSeo() {
    return seo;
  }

  public void setSeo(MetaobjectSEO seo) {
    this.seo = seo;
  }

  /**
   * The type of the metaobject.
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The date and time when the metaobject was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Metaobject{field='" + field + "', fields='" + fields + "', handle='" + handle + "', id='" + id + "', onlineStoreUrl='" + onlineStoreUrl + "', seo='" + seo + "', type='" + type + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Metaobject that = (Metaobject) o;
    return Objects.equals(field, that.field) &&
        Objects.equals(fields, that.fields) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(onlineStoreUrl, that.onlineStoreUrl) &&
        Objects.equals(seo, that.seo) &&
        Objects.equals(type, that.type) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, fields, handle, id, onlineStoreUrl, seo, type, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Accesses a field of the object by key.
     */
    private MetaobjectField field;

    /**
     * All object fields with defined values.
     * Omitted object keys can be assumed null, and no guarantees are made about field order.
     */
    private List<MetaobjectField> fields;

    /**
     * The unique handle of the metaobject. Useful as a custom ID.
     */
    private String handle;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The URL used for viewing the metaobject on the shop's Online Store. Returns
     * `null` if the metaobject definition doesn't have the `online_store` capability.
     */
    private String onlineStoreUrl;

    /**
     * The metaobject's SEO information. Returns `null` if the metaobject definition
     * doesn't have the `renderable` capability.
     */
    private MetaobjectSEO seo;

    /**
     * The type of the metaobject.
     */
    private String type;

    /**
     * The date and time when the metaobject was last updated.
     */
    private OffsetDateTime updatedAt;

    public Metaobject build() {
      Metaobject result = new Metaobject();
      result.field = this.field;
      result.fields = this.fields;
      result.handle = this.handle;
      result.id = this.id;
      result.onlineStoreUrl = this.onlineStoreUrl;
      result.seo = this.seo;
      result.type = this.type;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * Accesses a field of the object by key.
     */
    public Builder field(MetaobjectField field) {
      this.field = field;
      return this;
    }

    /**
     * All object fields with defined values.
     * Omitted object keys can be assumed null, and no guarantees are made about field order.
     */
    public Builder fields(List<MetaobjectField> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * The unique handle of the metaobject. Useful as a custom ID.
     */
    public Builder handle(String handle) {
      this.handle = handle;
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
     * The URL used for viewing the metaobject on the shop's Online Store. Returns
     * `null` if the metaobject definition doesn't have the `online_store` capability.
     */
    public Builder onlineStoreUrl(String onlineStoreUrl) {
      this.onlineStoreUrl = onlineStoreUrl;
      return this;
    }

    /**
     * The metaobject's SEO information. Returns `null` if the metaobject definition
     * doesn't have the `renderable` capability.
     */
    public Builder seo(MetaobjectSEO seo) {
      this.seo = seo;
      return this;
    }

    /**
     * The type of the metaobject.
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * The date and time when the metaobject was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}

package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A collection represents a grouping of products that a shop owner can create to
 * organize them or make their shops easier to browse.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Collection implements MenuItemResource, MetafieldParentResource, MetafieldReference, com.shopify.types.HasMetafields, com.shopify.types.Node, com.shopify.types.OnlineStorePublishable, com.shopify.types.Trackable {
  /**
   * Stripped description of the collection, single line with HTML tags removed.
   */
  private String description;

  /**
   * The description of the collection, complete with HTML formatting.
   */
  private String descriptionHtml;

  /**
   * A human-friendly unique string for the collection automatically generated from its title.
   * Limit of 255 characters.
   */
  private String handle;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Image associated with the collection.
   */
  private Image image;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  private List<Metafield> metafields;

  /**
   * The URL used for viewing the resource on the shop's Online Store. Returns
   * `null` if the resource is currently not published to the Online Store sales channel.
   */
  private String onlineStoreUrl;

  /**
   * List of products in the collection.
   */
  private ProductConnection products;

  /**
   * The collection's SEO information.
   */
  private SEO seo;

  /**
   * The collection’s name. Limit of 255 characters.
   */
  private String title;

  /**
   * URL parameters to be added to a page URL to track the origin of on-site search
   * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
   * Returns a result when accessed through the
   * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
   * queries, otherwise returns null.
   */
  private String trackingParameters;

  /**
   * The date and time when the collection was last modified.
   */
  private OffsetDateTime updatedAt;

  public Collection() {
  }

  /**
   * Stripped description of the collection, single line with HTML tags removed.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The description of the collection, complete with HTML formatting.
   */
  public String getDescriptionHtml() {
    return descriptionHtml;
  }

  public void setDescriptionHtml(String descriptionHtml) {
    this.descriptionHtml = descriptionHtml;
  }

  /**
   * A human-friendly unique string for the collection automatically generated from its title.
   * Limit of 255 characters.
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
   * Image associated with the collection.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
   * its `namespace` and `key`, that's associated with a Shopify resource for the
   * purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
   */
  public List<Metafield> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<Metafield> metafields) {
    this.metafields = metafields;
  }

  /**
   * The URL used for viewing the resource on the shop's Online Store. Returns
   * `null` if the resource is currently not published to the Online Store sales channel.
   */
  public String getOnlineStoreUrl() {
    return onlineStoreUrl;
  }

  public void setOnlineStoreUrl(String onlineStoreUrl) {
    this.onlineStoreUrl = onlineStoreUrl;
  }

  /**
   * List of products in the collection.
   */
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  /**
   * The collection's SEO information.
   */
  public SEO getSeo() {
    return seo;
  }

  public void setSeo(SEO seo) {
    this.seo = seo;
  }

  /**
   * The collection’s name. Limit of 255 characters.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * URL parameters to be added to a page URL to track the origin of on-site search
   * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
   * Returns a result when accessed through the
   * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
   * queries, otherwise returns null.
   */
  public String getTrackingParameters() {
    return trackingParameters;
  }

  public void setTrackingParameters(String trackingParameters) {
    this.trackingParameters = trackingParameters;
  }

  /**
   * The date and time when the collection was last modified.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Collection{description='" + description + "', descriptionHtml='" + descriptionHtml + "', handle='" + handle + "', id='" + id + "', image='" + image + "', metafield='" + metafield + "', metafields='" + metafields + "', onlineStoreUrl='" + onlineStoreUrl + "', products='" + products + "', seo='" + seo + "', title='" + title + "', trackingParameters='" + trackingParameters + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Collection that = (Collection) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(descriptionHtml, that.descriptionHtml) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(onlineStoreUrl, that.onlineStoreUrl) &&
        Objects.equals(products, that.products) &&
        Objects.equals(seo, that.seo) &&
        Objects.equals(title, that.title) &&
        Objects.equals(trackingParameters, that.trackingParameters) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, descriptionHtml, handle, id, image, metafield, metafields, onlineStoreUrl, products, seo, title, trackingParameters, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Stripped description of the collection, single line with HTML tags removed.
     */
    private String description;

    /**
     * The description of the collection, complete with HTML formatting.
     */
    private String descriptionHtml;

    /**
     * A human-friendly unique string for the collection automatically generated from its title.
     * Limit of 255 characters.
     */
    private String handle;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Image associated with the collection.
     */
    private Image image;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    private List<Metafield> metafields;

    /**
     * The URL used for viewing the resource on the shop's Online Store. Returns
     * `null` if the resource is currently not published to the Online Store sales channel.
     */
    private String onlineStoreUrl;

    /**
     * List of products in the collection.
     */
    private ProductConnection products;

    /**
     * The collection's SEO information.
     */
    private SEO seo;

    /**
     * The collection’s name. Limit of 255 characters.
     */
    private String title;

    /**
     * URL parameters to be added to a page URL to track the origin of on-site search
     * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
     * Returns a result when accessed through the
     * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
     * queries, otherwise returns null.
     */
    private String trackingParameters;

    /**
     * The date and time when the collection was last modified.
     */
    private OffsetDateTime updatedAt;

    public Collection build() {
      Collection result = new Collection();
      result.description = this.description;
      result.descriptionHtml = this.descriptionHtml;
      result.handle = this.handle;
      result.id = this.id;
      result.image = this.image;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.onlineStoreUrl = this.onlineStoreUrl;
      result.products = this.products;
      result.seo = this.seo;
      result.title = this.title;
      result.trackingParameters = this.trackingParameters;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * Stripped description of the collection, single line with HTML tags removed.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The description of the collection, complete with HTML formatting.
     */
    public Builder descriptionHtml(String descriptionHtml) {
      this.descriptionHtml = descriptionHtml;
      return this;
    }

    /**
     * A human-friendly unique string for the collection automatically generated from its title.
     * Limit of 255 characters.
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
     * Image associated with the collection.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data), including
     * its `namespace` and `key`, that's associated with a Shopify resource for the
     * purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](/docs/apps/build/custom-data) that a merchant associates with a Shopify resource.
     */
    public Builder metafields(List<Metafield> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The URL used for viewing the resource on the shop's Online Store. Returns
     * `null` if the resource is currently not published to the Online Store sales channel.
     */
    public Builder onlineStoreUrl(String onlineStoreUrl) {
      this.onlineStoreUrl = onlineStoreUrl;
      return this;
    }

    /**
     * List of products in the collection.
     */
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }

    /**
     * The collection's SEO information.
     */
    public Builder seo(SEO seo) {
      this.seo = seo;
      return this;
    }

    /**
     * The collection’s name. Limit of 255 characters.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * URL parameters to be added to a page URL to track the origin of on-site search
     * traffic for [analytics reporting](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/behaviour-reports).
     * Returns a result when accessed through the
     * [search](https://shopify.dev/docs/api/storefront/current/queries/search) or [predictiveSearch](https://shopify.dev/docs/api/storefront/current/queries/predictiveSearch)
     * queries, otherwise returns null.
     */
    public Builder trackingParameters(String trackingParameters) {
      this.trackingParameters = trackingParameters;
      return this;
    }

    /**
     * The date and time when the collection was last modified.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}

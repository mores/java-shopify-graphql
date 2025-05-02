package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Shopify merchants can create pages to hold static HTML content. Each Page object
 * represents a custom page on the online store.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Page implements MenuItemResource, MetafieldParentResource, MetafieldReference, SearchResultItem, com.shopify.types.HasMetafields, com.shopify.types.Node, com.shopify.types.OnlineStorePublishable, com.shopify.types.Trackable {
  /**
   * The description of the page, complete with HTML formatting.
   */
  private String body;

  /**
   * Summary of the page body.
   */
  private String bodySummary;

  /**
   * The timestamp of the page creation.
   */
  private OffsetDateTime createdAt;

  /**
   * A human-friendly unique string for the page automatically generated from its title.
   */
  private String handle;

  /**
   * A globally-unique ID.
   */
  private String id;

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
   * The page's SEO information.
   */
  private SEO seo;

  /**
   * The title of the page.
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
   * The timestamp of the latest page update.
   */
  private OffsetDateTime updatedAt;

  public Page() {
  }

  /**
   * The description of the page, complete with HTML formatting.
   */
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  /**
   * Summary of the page body.
   */
  public String getBodySummary() {
    return bodySummary;
  }

  public void setBodySummary(String bodySummary) {
    this.bodySummary = bodySummary;
  }

  /**
   * The timestamp of the page creation.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A human-friendly unique string for the page automatically generated from its title.
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
   * The page's SEO information.
   */
  public SEO getSeo() {
    return seo;
  }

  public void setSeo(SEO seo) {
    this.seo = seo;
  }

  /**
   * The title of the page.
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
   * The timestamp of the latest page update.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Page{body='" + body + "', bodySummary='" + bodySummary + "', createdAt='" + createdAt + "', handle='" + handle + "', id='" + id + "', metafield='" + metafield + "', metafields='" + metafields + "', onlineStoreUrl='" + onlineStoreUrl + "', seo='" + seo + "', title='" + title + "', trackingParameters='" + trackingParameters + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Page that = (Page) o;
    return Objects.equals(body, that.body) &&
        Objects.equals(bodySummary, that.bodySummary) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(onlineStoreUrl, that.onlineStoreUrl) &&
        Objects.equals(seo, that.seo) &&
        Objects.equals(title, that.title) &&
        Objects.equals(trackingParameters, that.trackingParameters) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, bodySummary, createdAt, handle, id, metafield, metafields, onlineStoreUrl, seo, title, trackingParameters, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The description of the page, complete with HTML formatting.
     */
    private String body;

    /**
     * Summary of the page body.
     */
    private String bodySummary;

    /**
     * The timestamp of the page creation.
     */
    private OffsetDateTime createdAt;

    /**
     * A human-friendly unique string for the page automatically generated from its title.
     */
    private String handle;

    /**
     * A globally-unique ID.
     */
    private String id;

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
     * The page's SEO information.
     */
    private SEO seo;

    /**
     * The title of the page.
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
     * The timestamp of the latest page update.
     */
    private OffsetDateTime updatedAt;

    public Page build() {
      Page result = new Page();
      result.body = this.body;
      result.bodySummary = this.bodySummary;
      result.createdAt = this.createdAt;
      result.handle = this.handle;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.onlineStoreUrl = this.onlineStoreUrl;
      result.seo = this.seo;
      result.title = this.title;
      result.trackingParameters = this.trackingParameters;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The description of the page, complete with HTML formatting.
     */
    public Builder body(String body) {
      this.body = body;
      return this;
    }

    /**
     * Summary of the page body.
     */
    public Builder bodySummary(String bodySummary) {
      this.bodySummary = bodySummary;
      return this;
    }

    /**
     * The timestamp of the page creation.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A human-friendly unique string for the page automatically generated from its title.
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
     * The page's SEO information.
     */
    public Builder seo(SEO seo) {
      this.seo = seo;
      return this;
    }

    /**
     * The title of the page.
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
     * The timestamp of the latest page update.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}

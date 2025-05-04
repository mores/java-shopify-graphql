package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A list of products with publishing and pricing information associated with markets.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MarketCatalog implements com.shopify.admin.types.Catalog, com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The markets associated with the catalog.
   */
  private MarketConnection markets;

  /**
   * The number of markets associated with the catalog.
   */
  private Count marketsCount;

  /**
   * Most recent catalog operations.
   */
  private List<ResourceOperation> operations;

  /**
   * The price list associated with the catalog.
   */
  private PriceList priceList;

  /**
   * A group of products and collections that's published to a catalog.
   */
  private Publication publication;

  /**
   * The status of the catalog.
   */
  private CatalogStatus status;

  /**
   * The name of the catalog.
   */
  private String title;

  public MarketCatalog() {
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
   * The markets associated with the catalog.
   */
  public MarketConnection getMarkets() {
    return markets;
  }

  public void setMarkets(MarketConnection markets) {
    this.markets = markets;
  }

  /**
   * The number of markets associated with the catalog.
   */
  public Count getMarketsCount() {
    return marketsCount;
  }

  public void setMarketsCount(Count marketsCount) {
    this.marketsCount = marketsCount;
  }

  /**
   * Most recent catalog operations.
   */
  public List<ResourceOperation> getOperations() {
    return operations;
  }

  public void setOperations(List<ResourceOperation> operations) {
    this.operations = operations;
  }

  /**
   * The price list associated with the catalog.
   */
  public PriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(PriceList priceList) {
    this.priceList = priceList;
  }

  /**
   * A group of products and collections that's published to a catalog.
   */
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  /**
   * The status of the catalog.
   */
  public CatalogStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogStatus status) {
    this.status = status;
  }

  /**
   * The name of the catalog.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "MarketCatalog{id='" + id + "', markets='" + markets + "', marketsCount='" + marketsCount + "', operations='" + operations + "', priceList='" + priceList + "', publication='" + publication + "', status='" + status + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketCatalog that = (MarketCatalog) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(markets, that.markets) &&
        Objects.equals(marketsCount, that.marketsCount) &&
        Objects.equals(operations, that.operations) &&
        Objects.equals(priceList, that.priceList) &&
        Objects.equals(publication, that.publication) &&
        Objects.equals(status, that.status) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, markets, marketsCount, operations, priceList, publication, status, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The markets associated with the catalog.
     */
    private MarketConnection markets;

    /**
     * The number of markets associated with the catalog.
     */
    private Count marketsCount;

    /**
     * Most recent catalog operations.
     */
    private List<ResourceOperation> operations;

    /**
     * The price list associated with the catalog.
     */
    private PriceList priceList;

    /**
     * A group of products and collections that's published to a catalog.
     */
    private Publication publication;

    /**
     * The status of the catalog.
     */
    private CatalogStatus status;

    /**
     * The name of the catalog.
     */
    private String title;

    public MarketCatalog build() {
      MarketCatalog result = new MarketCatalog();
      result.id = this.id;
      result.markets = this.markets;
      result.marketsCount = this.marketsCount;
      result.operations = this.operations;
      result.priceList = this.priceList;
      result.publication = this.publication;
      result.status = this.status;
      result.title = this.title;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The markets associated with the catalog.
     */
    public Builder markets(MarketConnection markets) {
      this.markets = markets;
      return this;
    }

    /**
     * The number of markets associated with the catalog.
     */
    public Builder marketsCount(Count marketsCount) {
      this.marketsCount = marketsCount;
      return this;
    }

    /**
     * Most recent catalog operations.
     */
    public Builder operations(List<ResourceOperation> operations) {
      this.operations = operations;
      return this;
    }

    /**
     * The price list associated with the catalog.
     */
    public Builder priceList(PriceList priceList) {
      this.priceList = priceList;
      return this;
    }

    /**
     * A group of products and collections that's published to a catalog.
     */
    public Builder publication(Publication publication) {
      this.publication = publication;
      return this;
    }

    /**
     * The status of the catalog.
     */
    public Builder status(CatalogStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The name of the catalog.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}

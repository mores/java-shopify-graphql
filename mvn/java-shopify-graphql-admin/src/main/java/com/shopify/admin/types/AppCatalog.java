package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A catalog that defines the publication associated with an app.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppCatalog implements com.shopify.admin.types.Catalog, com.shopify.admin.types.Node {
  /**
   * The apps associated with the catalog.
   */
  private AppConnection apps;

  /**
   * A globally-unique ID.
   */
  private String id;

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

  public AppCatalog() {
  }

  /**
   * The apps associated with the catalog.
   */
  public AppConnection getApps() {
    return apps;
  }

  public void setApps(AppConnection apps) {
    this.apps = apps;
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
    return "AppCatalog{apps='" + apps + "', id='" + id + "', operations='" + operations + "', priceList='" + priceList + "', publication='" + publication + "', status='" + status + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppCatalog that = (AppCatalog) o;
    return Objects.equals(apps, that.apps) &&
        Objects.equals(id, that.id) &&
        Objects.equals(operations, that.operations) &&
        Objects.equals(priceList, that.priceList) &&
        Objects.equals(publication, that.publication) &&
        Objects.equals(status, that.status) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, id, operations, priceList, publication, status, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The apps associated with the catalog.
     */
    private AppConnection apps;

    /**
     * A globally-unique ID.
     */
    private String id;

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

    public AppCatalog build() {
      AppCatalog result = new AppCatalog();
      result.apps = this.apps;
      result.id = this.id;
      result.operations = this.operations;
      result.priceList = this.priceList;
      result.publication = this.publication;
      result.status = this.status;
      result.title = this.title;
      return result;
    }

    /**
     * The apps associated with the catalog.
     */
    public Builder apps(AppConnection apps) {
      this.apps = apps;
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

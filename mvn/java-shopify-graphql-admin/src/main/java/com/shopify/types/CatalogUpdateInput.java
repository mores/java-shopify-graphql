package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update a catalog.
 */
public class CatalogUpdateInput {
  /**
   * The name of the catalog.
   */
  private String title;

  /**
   * The status of the catalog.
   */
  private CatalogStatus status;

  /**
   * The context associated with the catalog.
   */
  private CatalogContextInput context;

  /**
   * The ID of the price list to associate to the catalog.
   */
  private String priceListId;

  /**
   * The ID of the publication to associate to the catalog.
   */
  private String publicationId;

  public CatalogUpdateInput() {
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
   * The context associated with the catalog.
   */
  public CatalogContextInput getContext() {
    return context;
  }

  public void setContext(CatalogContextInput context) {
    this.context = context;
  }

  /**
   * The ID of the price list to associate to the catalog.
   */
  public String getPriceListId() {
    return priceListId;
  }

  public void setPriceListId(String priceListId) {
    this.priceListId = priceListId;
  }

  /**
   * The ID of the publication to associate to the catalog.
   */
  public String getPublicationId() {
    return publicationId;
  }

  public void setPublicationId(String publicationId) {
    this.publicationId = publicationId;
  }

  @Override
  public String toString() {
    return "CatalogUpdateInput{title='" + title + "', status='" + status + "', context='" + context + "', priceListId='" + priceListId + "', publicationId='" + publicationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CatalogUpdateInput that = (CatalogUpdateInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(status, that.status) &&
        Objects.equals(context, that.context) &&
        Objects.equals(priceListId, that.priceListId) &&
        Objects.equals(publicationId, that.publicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, status, context, priceListId, publicationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the catalog.
     */
    private String title;

    /**
     * The status of the catalog.
     */
    private CatalogStatus status;

    /**
     * The context associated with the catalog.
     */
    private CatalogContextInput context;

    /**
     * The ID of the price list to associate to the catalog.
     */
    private String priceListId;

    /**
     * The ID of the publication to associate to the catalog.
     */
    private String publicationId;

    public CatalogUpdateInput build() {
      CatalogUpdateInput result = new CatalogUpdateInput();
      result.title = this.title;
      result.status = this.status;
      result.context = this.context;
      result.priceListId = this.priceListId;
      result.publicationId = this.publicationId;
      return result;
    }

    /**
     * The name of the catalog.
     */
    public Builder title(String title) {
      this.title = title;
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
     * The context associated with the catalog.
     */
    public Builder context(CatalogContextInput context) {
      this.context = context;
      return this;
    }

    /**
     * The ID of the price list to associate to the catalog.
     */
    public Builder priceListId(String priceListId) {
      this.priceListId = priceListId;
      return this;
    }

    /**
     * The ID of the publication to associate to the catalog.
     */
    public Builder publicationId(String publicationId) {
      this.publicationId = publicationId;
      return this;
    }
  }
}

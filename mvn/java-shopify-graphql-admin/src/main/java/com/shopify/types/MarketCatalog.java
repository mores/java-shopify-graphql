package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MarketCatalog implements com.shopify.types.Catalog, com.shopify.types.Node {
  
  private String id;

  
  private MarketConnection markets;

  
  private List<ResourceOperation> operations;

  
  private PriceList priceList;

  
  private Publication publication;

  
  private CatalogStatus status;

  
  private String title;

  public MarketCatalog() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public MarketConnection getMarkets() {
    return markets;
  }

  public void setMarkets(MarketConnection markets) {
    this.markets = markets;
  }

  
  public List<ResourceOperation> getOperations() {
    return operations;
  }

  public void setOperations(List<ResourceOperation> operations) {
    this.operations = operations;
  }

  
  public PriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(PriceList priceList) {
    this.priceList = priceList;
  }

  
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  
  public CatalogStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogStatus status) {
    this.status = status;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "MarketCatalog{id='" + id + "', markets='" + markets + "', operations='" + operations + "', priceList='" + priceList + "', publication='" + publication + "', status='" + status + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketCatalog that = (MarketCatalog) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(markets, that.markets) &&
        Objects.equals(operations, that.operations) &&
        Objects.equals(priceList, that.priceList) &&
        Objects.equals(publication, that.publication) &&
        Objects.equals(status, that.status) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, markets, operations, priceList, publication, status, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private MarketConnection markets;

    
    private List<ResourceOperation> operations;

    
    private PriceList priceList;

    
    private Publication publication;

    
    private CatalogStatus status;

    
    private String title;

    public MarketCatalog build() {
      MarketCatalog result = new MarketCatalog();
      result.id = this.id;
      result.markets = this.markets;
      result.operations = this.operations;
      result.priceList = this.priceList;
      result.publication = this.publication;
      result.status = this.status;
      result.title = this.title;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder markets(MarketConnection markets) {
      this.markets = markets;
      return this;
    }

    
    public Builder operations(List<ResourceOperation> operations) {
      this.operations = operations;
      return this;
    }

    
    public Builder priceList(PriceList priceList) {
      this.priceList = priceList;
      return this;
    }

    
    public Builder publication(Publication publication) {
      this.publication = publication;
      return this;
    }

    
    public Builder status(CatalogStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}

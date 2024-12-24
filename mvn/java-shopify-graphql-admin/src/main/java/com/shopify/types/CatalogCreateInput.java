package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CatalogCreateInput {
  
  private String title;

  
  private CatalogStatus status;

  
  private CatalogContextInput context;

  
  private String priceListId;

  
  private String publicationId;

  public CatalogCreateInput() {
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public CatalogStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogStatus status) {
    this.status = status;
  }

  
  public CatalogContextInput getContext() {
    return context;
  }

  public void setContext(CatalogContextInput context) {
    this.context = context;
  }

  
  public String getPriceListId() {
    return priceListId;
  }

  public void setPriceListId(String priceListId) {
    this.priceListId = priceListId;
  }

  
  public String getPublicationId() {
    return publicationId;
  }

  public void setPublicationId(String publicationId) {
    this.publicationId = publicationId;
  }

  @Override
  public String toString() {
    return "CatalogCreateInput{title='" + title + "', status='" + status + "', context='" + context + "', priceListId='" + priceListId + "', publicationId='" + publicationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CatalogCreateInput that = (CatalogCreateInput) o;
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
    
    private String title;

    
    private CatalogStatus status;

    
    private CatalogContextInput context;

    
    private String priceListId;

    
    private String publicationId;

    public CatalogCreateInput build() {
      CatalogCreateInput result = new CatalogCreateInput();
      result.title = this.title;
      result.status = this.status;
      result.context = this.context;
      result.priceListId = this.priceListId;
      result.publicationId = this.publicationId;
      return result;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder status(CatalogStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder context(CatalogContextInput context) {
      this.context = context;
      return this;
    }

    
    public Builder priceListId(String priceListId) {
      this.priceListId = priceListId;
      return this;
    }

    
    public Builder publicationId(String publicationId) {
      this.publicationId = publicationId;
      return this;
    }
  }
}

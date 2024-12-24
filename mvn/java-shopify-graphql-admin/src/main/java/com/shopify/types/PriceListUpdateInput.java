package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PriceListUpdateInput {
  
  private String name;

  
  private CurrencyCode currency;

  
  private PriceListParentUpdateInput _parent;

  
  private String catalogId;

  public PriceListUpdateInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  
  public PriceListParentUpdateInput getParent() {
    return _parent;
  }

  public void setParent(PriceListParentUpdateInput _parent) {
    this._parent = _parent;
  }

  
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  @Override
  public String toString() {
    return "PriceListUpdateInput{name='" + name + "', currency='" + currency + "', parent='" + _parent + "', catalogId='" + catalogId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListUpdateInput that = (PriceListUpdateInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(currency, that.currency) &&
        Objects.equals(_parent, that._parent) &&
        Objects.equals(catalogId, that.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, currency, _parent, catalogId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private CurrencyCode currency;

    
    private PriceListParentUpdateInput _parent;

    
    private String catalogId;

    public PriceListUpdateInput build() {
      PriceListUpdateInput result = new PriceListUpdateInput();
      result.name = this.name;
      result.currency = this.currency;
      result._parent = this._parent;
      result.catalogId = this.catalogId;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }

    
    public Builder _parent(PriceListParentUpdateInput _parent) {
      this._parent = _parent;
      return this;
    }

    
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }
  }
}

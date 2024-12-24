package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PriceList implements com.shopify.types.Node {
  
  private Catalog catalog;

  
  private CurrencyCode currency;

  
  private int fixedPricesCount;

  
  private String id;

  
  private String name;

  
  private PriceListParent _parent;

  
  private PriceListPriceConnection prices;

  
  private QuantityRuleConnection quantityRules;

  public PriceList() {
  }

  
  public Catalog getCatalog() {
    return catalog;
  }

  public void setCatalog(Catalog catalog) {
    this.catalog = catalog;
  }

  
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  
  public int getFixedPricesCount() {
    return fixedPricesCount;
  }

  public void setFixedPricesCount(int fixedPricesCount) {
    this.fixedPricesCount = fixedPricesCount;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public PriceListParent getParent() {
    return _parent;
  }

  public void setParent(PriceListParent _parent) {
    this._parent = _parent;
  }

  
  public PriceListPriceConnection getPrices() {
    return prices;
  }

  public void setPrices(PriceListPriceConnection prices) {
    this.prices = prices;
  }

  
  public QuantityRuleConnection getQuantityRules() {
    return quantityRules;
  }

  public void setQuantityRules(QuantityRuleConnection quantityRules) {
    this.quantityRules = quantityRules;
  }

  @Override
  public String toString() {
    return "PriceList{catalog='" + catalog + "', currency='" + currency + "', fixedPricesCount='" + fixedPricesCount + "', id='" + id + "', name='" + name + "', parent='" + _parent + "', prices='" + prices + "', quantityRules='" + quantityRules + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceList that = (PriceList) o;
    return Objects.equals(catalog, that.catalog) &&
        Objects.equals(currency, that.currency) &&
        fixedPricesCount == that.fixedPricesCount &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(_parent, that._parent) &&
        Objects.equals(prices, that.prices) &&
        Objects.equals(quantityRules, that.quantityRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalog, currency, fixedPricesCount, id, name, _parent, prices, quantityRules);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Catalog catalog;

    
    private CurrencyCode currency;

    
    private int fixedPricesCount;

    
    private String id;

    
    private String name;

    
    private PriceListParent _parent;

    
    private PriceListPriceConnection prices;

    
    private QuantityRuleConnection quantityRules;

    public PriceList build() {
      PriceList result = new PriceList();
      result.catalog = this.catalog;
      result.currency = this.currency;
      result.fixedPricesCount = this.fixedPricesCount;
      result.id = this.id;
      result.name = this.name;
      result._parent = this._parent;
      result.prices = this.prices;
      result.quantityRules = this.quantityRules;
      return result;
    }

    
    public Builder catalog(Catalog catalog) {
      this.catalog = catalog;
      return this;
    }

    
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }

    
    public Builder fixedPricesCount(int fixedPricesCount) {
      this.fixedPricesCount = fixedPricesCount;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder _parent(PriceListParent _parent) {
      this._parent = _parent;
      return this;
    }

    
    public Builder prices(PriceListPriceConnection prices) {
      this.prices = prices;
      return this;
    }

    
    public Builder quantityRules(QuantityRuleConnection quantityRules) {
      this.quantityRules = quantityRules;
      return this;
    }
  }
}

package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RefundLineItem {
  
  private String id;

  
  private LineItem lineItem;

  
  private Location location;

  
  private String price;

  
  private MoneyBag priceSet;

  
  private int quantity;

  
  private RefundLineItemRestockType restockType;

  
  private boolean restocked;

  
  private String subtotal;

  
  private MoneyBag subtotalSet;

  
  private String totalTax;

  
  private MoneyBag totalTaxSet;

  public RefundLineItem() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
  }

  
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  
  public MoneyBag getPriceSet() {
    return priceSet;
  }

  public void setPriceSet(MoneyBag priceSet) {
    this.priceSet = priceSet;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public RefundLineItemRestockType getRestockType() {
    return restockType;
  }

  public void setRestockType(RefundLineItemRestockType restockType) {
    this.restockType = restockType;
  }

  
  public boolean getRestocked() {
    return restocked;
  }

  public void setRestocked(boolean restocked) {
    this.restocked = restocked;
  }

  
  public String getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(String subtotal) {
    this.subtotal = subtotal;
  }

  
  public MoneyBag getSubtotalSet() {
    return subtotalSet;
  }

  public void setSubtotalSet(MoneyBag subtotalSet) {
    this.subtotalSet = subtotalSet;
  }

  
  public String getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(String totalTax) {
    this.totalTax = totalTax;
  }

  
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  @Override
  public String toString() {
    return "RefundLineItem{id='" + id + "', lineItem='" + lineItem + "', location='" + location + "', price='" + price + "', priceSet='" + priceSet + "', quantity='" + quantity + "', restockType='" + restockType + "', restocked='" + restocked + "', subtotal='" + subtotal + "', subtotalSet='" + subtotalSet + "', totalTax='" + totalTax + "', totalTaxSet='" + totalTaxSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundLineItem that = (RefundLineItem) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(lineItem, that.lineItem) &&
        Objects.equals(location, that.location) &&
        Objects.equals(price, that.price) &&
        Objects.equals(priceSet, that.priceSet) &&
        quantity == that.quantity &&
        Objects.equals(restockType, that.restockType) &&
        restocked == that.restocked &&
        Objects.equals(subtotal, that.subtotal) &&
        Objects.equals(subtotalSet, that.subtotalSet) &&
        Objects.equals(totalTax, that.totalTax) &&
        Objects.equals(totalTaxSet, that.totalTaxSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lineItem, location, price, priceSet, quantity, restockType, restocked, subtotal, subtotalSet, totalTax, totalTaxSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private LineItem lineItem;

    
    private Location location;

    
    private String price;

    
    private MoneyBag priceSet;

    
    private int quantity;

    
    private RefundLineItemRestockType restockType;

    
    private boolean restocked;

    
    private String subtotal;

    
    private MoneyBag subtotalSet;

    
    private String totalTax;

    
    private MoneyBag totalTaxSet;

    public RefundLineItem build() {
      RefundLineItem result = new RefundLineItem();
      result.id = this.id;
      result.lineItem = this.lineItem;
      result.location = this.location;
      result.price = this.price;
      result.priceSet = this.priceSet;
      result.quantity = this.quantity;
      result.restockType = this.restockType;
      result.restocked = this.restocked;
      result.subtotal = this.subtotal;
      result.subtotalSet = this.subtotalSet;
      result.totalTax = this.totalTax;
      result.totalTaxSet = this.totalTaxSet;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }

    
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    
    public Builder price(String price) {
      this.price = price;
      return this;
    }

    
    public Builder priceSet(MoneyBag priceSet) {
      this.priceSet = priceSet;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder restockType(RefundLineItemRestockType restockType) {
      this.restockType = restockType;
      return this;
    }

    
    public Builder restocked(boolean restocked) {
      this.restocked = restocked;
      return this;
    }

    
    public Builder subtotal(String subtotal) {
      this.subtotal = subtotal;
      return this;
    }

    
    public Builder subtotalSet(MoneyBag subtotalSet) {
      this.subtotalSet = subtotalSet;
      return this;
    }

    
    public Builder totalTax(String totalTax) {
      this.totalTax = totalTax;
      return this;
    }

    
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }
  }
}

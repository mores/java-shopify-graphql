package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountCustomerBuys {
  
  private DiscountItems items;

  
  private DiscountCustomerBuysValue value;

  public DiscountCustomerBuys() {
  }

  
  public DiscountItems getItems() {
    return items;
  }

  public void setItems(DiscountItems items) {
    this.items = items;
  }

  
  public DiscountCustomerBuysValue getValue() {
    return value;
  }

  public void setValue(DiscountCustomerBuysValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "DiscountCustomerBuys{items='" + items + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerBuys that = (DiscountCustomerBuys) o;
    return Objects.equals(items, that.items) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountItems items;

    
    private DiscountCustomerBuysValue value;

    public DiscountCustomerBuys build() {
      DiscountCustomerBuys result = new DiscountCustomerBuys();
      result.items = this.items;
      result.value = this.value;
      return result;
    }

    
    public Builder items(DiscountItems items) {
      this.items = items;
      return this;
    }

    
    public Builder value(DiscountCustomerBuysValue value) {
      this.value = value;
      return this;
    }
  }
}

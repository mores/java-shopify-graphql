package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountCustomerBuysInput {
  
  private DiscountCustomerBuysValueInput value;

  
  private DiscountItemsInput items;

  public DiscountCustomerBuysInput() {
  }

  
  public DiscountCustomerBuysValueInput getValue() {
    return value;
  }

  public void setValue(DiscountCustomerBuysValueInput value) {
    this.value = value;
  }

  
  public DiscountItemsInput getItems() {
    return items;
  }

  public void setItems(DiscountItemsInput items) {
    this.items = items;
  }

  @Override
  public String toString() {
    return "DiscountCustomerBuysInput{value='" + value + "', items='" + items + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerBuysInput that = (DiscountCustomerBuysInput) o;
    return Objects.equals(value, that.value) &&
        Objects.equals(items, that.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, items);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountCustomerBuysValueInput value;

    
    private DiscountItemsInput items;

    public DiscountCustomerBuysInput build() {
      DiscountCustomerBuysInput result = new DiscountCustomerBuysInput();
      result.value = this.value;
      result.items = this.items;
      return result;
    }

    
    public Builder value(DiscountCustomerBuysValueInput value) {
      this.value = value;
      return this;
    }

    
    public Builder items(DiscountItemsInput items) {
      this.items = items;
      return this;
    }
  }
}

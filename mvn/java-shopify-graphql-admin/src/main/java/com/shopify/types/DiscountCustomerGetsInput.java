package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountCustomerGetsInput {
  
  private DiscountCustomerGetsValueInput value;

  
  private DiscountItemsInput items;

  
  private Boolean appliesOnOneTimePurchase;

  
  private Boolean appliesOnSubscription;

  public DiscountCustomerGetsInput() {
  }

  
  public DiscountCustomerGetsValueInput getValue() {
    return value;
  }

  public void setValue(DiscountCustomerGetsValueInput value) {
    this.value = value;
  }

  
  public DiscountItemsInput getItems() {
    return items;
  }

  public void setItems(DiscountItemsInput items) {
    this.items = items;
  }

  
  public Boolean getAppliesOnOneTimePurchase() {
    return appliesOnOneTimePurchase;
  }

  public void setAppliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
    this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
  }

  
  public Boolean getAppliesOnSubscription() {
    return appliesOnSubscription;
  }

  public void setAppliesOnSubscription(Boolean appliesOnSubscription) {
    this.appliesOnSubscription = appliesOnSubscription;
  }

  @Override
  public String toString() {
    return "DiscountCustomerGetsInput{value='" + value + "', items='" + items + "', appliesOnOneTimePurchase='" + appliesOnOneTimePurchase + "', appliesOnSubscription='" + appliesOnSubscription + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerGetsInput that = (DiscountCustomerGetsInput) o;
    return Objects.equals(value, that.value) &&
        Objects.equals(items, that.items) &&
        Objects.equals(appliesOnOneTimePurchase, that.appliesOnOneTimePurchase) &&
        Objects.equals(appliesOnSubscription, that.appliesOnSubscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, items, appliesOnOneTimePurchase, appliesOnSubscription);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountCustomerGetsValueInput value;

    
    private DiscountItemsInput items;

    
    private Boolean appliesOnOneTimePurchase;

    
    private Boolean appliesOnSubscription;

    public DiscountCustomerGetsInput build() {
      DiscountCustomerGetsInput result = new DiscountCustomerGetsInput();
      result.value = this.value;
      result.items = this.items;
      result.appliesOnOneTimePurchase = this.appliesOnOneTimePurchase;
      result.appliesOnSubscription = this.appliesOnSubscription;
      return result;
    }

    
    public Builder value(DiscountCustomerGetsValueInput value) {
      this.value = value;
      return this;
    }

    
    public Builder items(DiscountItemsInput items) {
      this.items = items;
      return this;
    }

    
    public Builder appliesOnOneTimePurchase(Boolean appliesOnOneTimePurchase) {
      this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
      return this;
    }

    
    public Builder appliesOnSubscription(Boolean appliesOnSubscription) {
      this.appliesOnSubscription = appliesOnSubscription;
      return this;
    }
  }
}

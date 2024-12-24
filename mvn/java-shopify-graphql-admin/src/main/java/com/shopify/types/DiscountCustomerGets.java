package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountCustomerGets {
  
  private boolean appliesOnOneTimePurchase;

  
  private boolean appliesOnSubscription;

  
  private DiscountItems items;

  
  private DiscountCustomerGetsValue value;

  public DiscountCustomerGets() {
  }

  
  public boolean getAppliesOnOneTimePurchase() {
    return appliesOnOneTimePurchase;
  }

  public void setAppliesOnOneTimePurchase(boolean appliesOnOneTimePurchase) {
    this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
  }

  
  public boolean getAppliesOnSubscription() {
    return appliesOnSubscription;
  }

  public void setAppliesOnSubscription(boolean appliesOnSubscription) {
    this.appliesOnSubscription = appliesOnSubscription;
  }

  
  public DiscountItems getItems() {
    return items;
  }

  public void setItems(DiscountItems items) {
    this.items = items;
  }

  
  public DiscountCustomerGetsValue getValue() {
    return value;
  }

  public void setValue(DiscountCustomerGetsValue value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "DiscountCustomerGets{appliesOnOneTimePurchase='" + appliesOnOneTimePurchase + "', appliesOnSubscription='" + appliesOnSubscription + "', items='" + items + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCustomerGets that = (DiscountCustomerGets) o;
    return appliesOnOneTimePurchase == that.appliesOnOneTimePurchase &&
        appliesOnSubscription == that.appliesOnSubscription &&
        Objects.equals(items, that.items) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliesOnOneTimePurchase, appliesOnSubscription, items, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean appliesOnOneTimePurchase;

    
    private boolean appliesOnSubscription;

    
    private DiscountItems items;

    
    private DiscountCustomerGetsValue value;

    public DiscountCustomerGets build() {
      DiscountCustomerGets result = new DiscountCustomerGets();
      result.appliesOnOneTimePurchase = this.appliesOnOneTimePurchase;
      result.appliesOnSubscription = this.appliesOnSubscription;
      result.items = this.items;
      result.value = this.value;
      return result;
    }

    
    public Builder appliesOnOneTimePurchase(boolean appliesOnOneTimePurchase) {
      this.appliesOnOneTimePurchase = appliesOnOneTimePurchase;
      return this;
    }

    
    public Builder appliesOnSubscription(boolean appliesOnSubscription) {
      this.appliesOnSubscription = appliesOnSubscription;
      return this;
    }

    
    public Builder items(DiscountItems items) {
      this.items = items;
      return this;
    }

    
    public Builder value(DiscountCustomerGetsValue value) {
      this.value = value;
      return this;
    }
  }
}

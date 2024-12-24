package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryRateDefinitionInput {
  
  private String id;

  
  private MoneyInput price;

  public DeliveryRateDefinitionInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public MoneyInput getPrice() {
    return price;
  }

  public void setPrice(MoneyInput price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "DeliveryRateDefinitionInput{id='" + id + "', price='" + price + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryRateDefinitionInput that = (DeliveryRateDefinitionInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(price, that.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private MoneyInput price;

    public DeliveryRateDefinitionInput build() {
      DeliveryRateDefinitionInput result = new DeliveryRateDefinitionInput();
      result.id = this.id;
      result.price = this.price;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder price(MoneyInput price) {
      this.price = price;
      return this;
    }
  }
}

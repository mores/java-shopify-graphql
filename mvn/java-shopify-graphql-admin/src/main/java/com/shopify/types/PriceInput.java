package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PriceInput {
  
  private PriceCalculationType calculation;

  
  private String price;

  public PriceInput() {
  }

  
  public PriceCalculationType getCalculation() {
    return calculation;
  }

  public void setCalculation(PriceCalculationType calculation) {
    this.calculation = calculation;
  }

  
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "PriceInput{calculation='" + calculation + "', price='" + price + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceInput that = (PriceInput) o;
    return Objects.equals(calculation, that.calculation) &&
        Objects.equals(price, that.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculation, price);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private PriceCalculationType calculation;

    
    private String price;

    public PriceInput build() {
      PriceInput result = new PriceInput();
      result.calculation = this.calculation;
      result.price = this.price;
      return result;
    }

    
    public Builder calculation(PriceCalculationType calculation) {
      this.calculation = calculation;
      return this;
    }

    
    public Builder price(String price) {
      this.price = price;
      return this;
    }
  }
}

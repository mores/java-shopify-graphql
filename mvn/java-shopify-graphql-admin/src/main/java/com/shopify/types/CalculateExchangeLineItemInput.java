package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CalculateExchangeLineItemInput {
  
  private String variantId;

  
  private int quantity;

  
  private ExchangeLineItemAppliedDiscountInput appliedDiscount;

  public CalculateExchangeLineItemInput() {
  }

  
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public ExchangeLineItemAppliedDiscountInput getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(ExchangeLineItemAppliedDiscountInput appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  @Override
  public String toString() {
    return "CalculateExchangeLineItemInput{variantId='" + variantId + "', quantity='" + quantity + "', appliedDiscount='" + appliedDiscount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculateExchangeLineItemInput that = (CalculateExchangeLineItemInput) o;
    return Objects.equals(variantId, that.variantId) &&
        quantity == that.quantity &&
        Objects.equals(appliedDiscount, that.appliedDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantId, quantity, appliedDiscount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String variantId;

    
    private int quantity;

    
    private ExchangeLineItemAppliedDiscountInput appliedDiscount;

    public CalculateExchangeLineItemInput build() {
      CalculateExchangeLineItemInput result = new CalculateExchangeLineItemInput();
      result.variantId = this.variantId;
      result.quantity = this.quantity;
      result.appliedDiscount = this.appliedDiscount;
      return result;
    }

    
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder appliedDiscount(ExchangeLineItemAppliedDiscountInput appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
      return this;
    }
  }
}

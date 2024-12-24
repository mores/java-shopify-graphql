package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ExchangeLineItemInput {
  
  private List<String> giftCardCodes;

  
  private String variantId;

  
  private int quantity;

  
  private ExchangeLineItemAppliedDiscountInput appliedDiscount;

  public ExchangeLineItemInput() {
  }

  
  public List<String> getGiftCardCodes() {
    return giftCardCodes;
  }

  public void setGiftCardCodes(List<String> giftCardCodes) {
    this.giftCardCodes = giftCardCodes;
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
    return "ExchangeLineItemInput{giftCardCodes='" + giftCardCodes + "', variantId='" + variantId + "', quantity='" + quantity + "', appliedDiscount='" + appliedDiscount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeLineItemInput that = (ExchangeLineItemInput) o;
    return Objects.equals(giftCardCodes, that.giftCardCodes) &&
        Objects.equals(variantId, that.variantId) &&
        quantity == that.quantity &&
        Objects.equals(appliedDiscount, that.appliedDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftCardCodes, variantId, quantity, appliedDiscount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> giftCardCodes;

    
    private String variantId;

    
    private int quantity;

    
    private ExchangeLineItemAppliedDiscountInput appliedDiscount;

    public ExchangeLineItemInput build() {
      ExchangeLineItemInput result = new ExchangeLineItemInput();
      result.giftCardCodes = this.giftCardCodes;
      result.variantId = this.variantId;
      result.quantity = this.quantity;
      result.appliedDiscount = this.appliedDiscount;
      return result;
    }

    
    public Builder giftCardCodes(List<String> giftCardCodes) {
      this.giftCardCodes = giftCardCodes;
      return this;
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

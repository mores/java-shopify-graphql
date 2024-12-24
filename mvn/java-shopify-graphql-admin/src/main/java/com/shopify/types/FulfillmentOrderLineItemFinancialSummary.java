package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FulfillmentOrderLineItemFinancialSummary {
  
  private MoneyBag approximateDiscountedUnitPriceSet;

  
  private List<FinancialSummaryDiscountAllocation> discountAllocations;

  
  private MoneyBag originalUnitPriceSet;

  
  private int quantity;

  public FulfillmentOrderLineItemFinancialSummary() {
  }

  
  public MoneyBag getApproximateDiscountedUnitPriceSet() {
    return approximateDiscountedUnitPriceSet;
  }

  public void setApproximateDiscountedUnitPriceSet(MoneyBag approximateDiscountedUnitPriceSet) {
    this.approximateDiscountedUnitPriceSet = approximateDiscountedUnitPriceSet;
  }

  
  public List<FinancialSummaryDiscountAllocation> getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(List<FinancialSummaryDiscountAllocation> discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderLineItemFinancialSummary{approximateDiscountedUnitPriceSet='" + approximateDiscountedUnitPriceSet + "', discountAllocations='" + discountAllocations + "', originalUnitPriceSet='" + originalUnitPriceSet + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderLineItemFinancialSummary that = (FulfillmentOrderLineItemFinancialSummary) o;
    return Objects.equals(approximateDiscountedUnitPriceSet, that.approximateDiscountedUnitPriceSet) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        quantity == that.quantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(approximateDiscountedUnitPriceSet, discountAllocations, originalUnitPriceSet, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyBag approximateDiscountedUnitPriceSet;

    
    private List<FinancialSummaryDiscountAllocation> discountAllocations;

    
    private MoneyBag originalUnitPriceSet;

    
    private int quantity;

    public FulfillmentOrderLineItemFinancialSummary build() {
      FulfillmentOrderLineItemFinancialSummary result = new FulfillmentOrderLineItemFinancialSummary();
      result.approximateDiscountedUnitPriceSet = this.approximateDiscountedUnitPriceSet;
      result.discountAllocations = this.discountAllocations;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.quantity = this.quantity;
      return result;
    }

    
    public Builder approximateDiscountedUnitPriceSet(MoneyBag approximateDiscountedUnitPriceSet) {
      this.approximateDiscountedUnitPriceSet = approximateDiscountedUnitPriceSet;
      return this;
    }

    
    public Builder discountAllocations(
        List<FinancialSummaryDiscountAllocation> discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}

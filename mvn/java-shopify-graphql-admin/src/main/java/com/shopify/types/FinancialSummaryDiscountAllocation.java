package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FinancialSummaryDiscountAllocation {
  
  private MoneyBag approximateAllocatedAmountPerItem;

  
  private FinancialSummaryDiscountApplication discountApplication;

  public FinancialSummaryDiscountAllocation() {
  }

  
  public MoneyBag getApproximateAllocatedAmountPerItem() {
    return approximateAllocatedAmountPerItem;
  }

  public void setApproximateAllocatedAmountPerItem(MoneyBag approximateAllocatedAmountPerItem) {
    this.approximateAllocatedAmountPerItem = approximateAllocatedAmountPerItem;
  }

  
  public FinancialSummaryDiscountApplication getDiscountApplication() {
    return discountApplication;
  }

  public void setDiscountApplication(FinancialSummaryDiscountApplication discountApplication) {
    this.discountApplication = discountApplication;
  }

  @Override
  public String toString() {
    return "FinancialSummaryDiscountAllocation{approximateAllocatedAmountPerItem='" + approximateAllocatedAmountPerItem + "', discountApplication='" + discountApplication + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FinancialSummaryDiscountAllocation that = (FinancialSummaryDiscountAllocation) o;
    return Objects.equals(approximateAllocatedAmountPerItem, that.approximateAllocatedAmountPerItem) &&
        Objects.equals(discountApplication, that.discountApplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approximateAllocatedAmountPerItem, discountApplication);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyBag approximateAllocatedAmountPerItem;

    
    private FinancialSummaryDiscountApplication discountApplication;

    public FinancialSummaryDiscountAllocation build() {
      FinancialSummaryDiscountAllocation result = new FinancialSummaryDiscountAllocation();
      result.approximateAllocatedAmountPerItem = this.approximateAllocatedAmountPerItem;
      result.discountApplication = this.discountApplication;
      return result;
    }

    
    public Builder approximateAllocatedAmountPerItem(MoneyBag approximateAllocatedAmountPerItem) {
      this.approximateAllocatedAmountPerItem = approximateAllocatedAmountPerItem;
      return this;
    }

    
    public Builder discountApplication(FinancialSummaryDiscountApplication discountApplication) {
      this.discountApplication = discountApplication;
      return this;
    }
  }
}

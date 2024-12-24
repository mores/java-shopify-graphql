package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountAllocation {
  
  private MoneyV2 allocatedAmount;

  
  private MoneyBag allocatedAmountSet;

  
  private DiscountApplication discountApplication;

  public DiscountAllocation() {
  }

  
  public MoneyV2 getAllocatedAmount() {
    return allocatedAmount;
  }

  public void setAllocatedAmount(MoneyV2 allocatedAmount) {
    this.allocatedAmount = allocatedAmount;
  }

  
  public MoneyBag getAllocatedAmountSet() {
    return allocatedAmountSet;
  }

  public void setAllocatedAmountSet(MoneyBag allocatedAmountSet) {
    this.allocatedAmountSet = allocatedAmountSet;
  }

  
  public DiscountApplication getDiscountApplication() {
    return discountApplication;
  }

  public void setDiscountApplication(DiscountApplication discountApplication) {
    this.discountApplication = discountApplication;
  }

  @Override
  public String toString() {
    return "DiscountAllocation{allocatedAmount='" + allocatedAmount + "', allocatedAmountSet='" + allocatedAmountSet + "', discountApplication='" + discountApplication + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAllocation that = (DiscountAllocation) o;
    return Objects.equals(allocatedAmount, that.allocatedAmount) &&
        Objects.equals(allocatedAmountSet, that.allocatedAmountSet) &&
        Objects.equals(discountApplication, that.discountApplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatedAmount, allocatedAmountSet, discountApplication);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 allocatedAmount;

    
    private MoneyBag allocatedAmountSet;

    
    private DiscountApplication discountApplication;

    public DiscountAllocation build() {
      DiscountAllocation result = new DiscountAllocation();
      result.allocatedAmount = this.allocatedAmount;
      result.allocatedAmountSet = this.allocatedAmountSet;
      result.discountApplication = this.discountApplication;
      return result;
    }

    
    public Builder allocatedAmount(MoneyV2 allocatedAmount) {
      this.allocatedAmount = allocatedAmount;
      return this;
    }

    
    public Builder allocatedAmountSet(MoneyBag allocatedAmountSet) {
      this.allocatedAmountSet = allocatedAmountSet;
      return this;
    }

    
    public Builder discountApplication(DiscountApplication discountApplication) {
      this.discountApplication = discountApplication;
      return this;
    }
  }
}

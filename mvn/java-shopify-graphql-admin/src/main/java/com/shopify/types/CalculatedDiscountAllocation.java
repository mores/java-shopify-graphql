package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An amount discounting the line that has been allocated by an associated discount application.
 */
public class CalculatedDiscountAllocation {
  /**
   * The money amount that's allocated by the discount application in shop and presentment currencies.
   */
  private MoneyBag allocatedAmountSet;

  /**
   * The discount that the allocated amount originated from.
   */
  private CalculatedDiscountApplication discountApplication;

  public CalculatedDiscountAllocation() {
  }

  /**
   * The money amount that's allocated by the discount application in shop and presentment currencies.
   */
  public MoneyBag getAllocatedAmountSet() {
    return allocatedAmountSet;
  }

  public void setAllocatedAmountSet(MoneyBag allocatedAmountSet) {
    this.allocatedAmountSet = allocatedAmountSet;
  }

  /**
   * The discount that the allocated amount originated from.
   */
  public CalculatedDiscountApplication getDiscountApplication() {
    return discountApplication;
  }

  public void setDiscountApplication(CalculatedDiscountApplication discountApplication) {
    this.discountApplication = discountApplication;
  }

  @Override
  public String toString() {
    return "CalculatedDiscountAllocation{allocatedAmountSet='" + allocatedAmountSet + "', discountApplication='" + discountApplication + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedDiscountAllocation that = (CalculatedDiscountAllocation) o;
    return Objects.equals(allocatedAmountSet, that.allocatedAmountSet) &&
        Objects.equals(discountApplication, that.discountApplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatedAmountSet, discountApplication);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The money amount that's allocated by the discount application in shop and presentment currencies.
     */
    private MoneyBag allocatedAmountSet;

    /**
     * The discount that the allocated amount originated from.
     */
    private CalculatedDiscountApplication discountApplication;

    public CalculatedDiscountAllocation build() {
      CalculatedDiscountAllocation result = new CalculatedDiscountAllocation();
      result.allocatedAmountSet = this.allocatedAmountSet;
      result.discountApplication = this.discountApplication;
      return result;
    }

    /**
     * The money amount that's allocated by the discount application in shop and presentment currencies.
     */
    public Builder allocatedAmountSet(MoneyBag allocatedAmountSet) {
      this.allocatedAmountSet = allocatedAmountSet;
      return this;
    }

    /**
     * The discount that the allocated amount originated from.
     */
    public Builder discountApplication(CalculatedDiscountApplication discountApplication) {
      this.discountApplication = discountApplication;
      return this;
    }
  }
}

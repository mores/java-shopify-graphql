package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An amount that's allocated to a line based on an associated discount application.
 */
public class DiscountAllocation {
  /**
   * The money amount that's allocated to a line based on the associated discount application.
   */
  private MoneyV2 allocatedAmount;

  /**
   * The money amount that's allocated to a line based on the associated discount
   * application in shop and presentment currencies.
   */
  private MoneyBag allocatedAmountSet;

  /**
   * The discount application that the allocated amount originated from.
   */
  private DiscountApplication discountApplication;

  public DiscountAllocation() {
  }

  /**
   * The money amount that's allocated to a line based on the associated discount application.
   */
  public MoneyV2 getAllocatedAmount() {
    return allocatedAmount;
  }

  public void setAllocatedAmount(MoneyV2 allocatedAmount) {
    this.allocatedAmount = allocatedAmount;
  }

  /**
   * The money amount that's allocated to a line based on the associated discount
   * application in shop and presentment currencies.
   */
  public MoneyBag getAllocatedAmountSet() {
    return allocatedAmountSet;
  }

  public void setAllocatedAmountSet(MoneyBag allocatedAmountSet) {
    this.allocatedAmountSet = allocatedAmountSet;
  }

  /**
   * The discount application that the allocated amount originated from.
   */
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
    /**
     * The money amount that's allocated to a line based on the associated discount application.
     */
    private MoneyV2 allocatedAmount;

    /**
     * The money amount that's allocated to a line based on the associated discount
     * application in shop and presentment currencies.
     */
    private MoneyBag allocatedAmountSet;

    /**
     * The discount application that the allocated amount originated from.
     */
    private DiscountApplication discountApplication;

    public DiscountAllocation build() {
      DiscountAllocation result = new DiscountAllocation();
      result.allocatedAmount = this.allocatedAmount;
      result.allocatedAmountSet = this.allocatedAmountSet;
      result.discountApplication = this.discountApplication;
      return result;
    }

    /**
     * The money amount that's allocated to a line based on the associated discount application.
     */
    public Builder allocatedAmount(MoneyV2 allocatedAmount) {
      this.allocatedAmount = allocatedAmount;
      return this;
    }

    /**
     * The money amount that's allocated to a line based on the associated discount
     * application in shop and presentment currencies.
     */
    public Builder allocatedAmountSet(MoneyBag allocatedAmountSet) {
      this.allocatedAmountSet = allocatedAmountSet;
      return this;
    }

    /**
     * The discount application that the allocated amount originated from.
     */
    public Builder discountApplication(DiscountApplication discountApplication) {
      this.discountApplication = discountApplication;
      return this;
    }
  }
}

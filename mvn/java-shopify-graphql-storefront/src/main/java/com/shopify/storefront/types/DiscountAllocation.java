package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An amount discounting the line that has been allocated by a discount.
 */
public class DiscountAllocation {
  /**
   * Amount of discount allocated.
   */
  private MoneyV2 allocatedAmount;

  /**
   * The discount this allocated amount originated from.
   */
  private DiscountApplication discountApplication;

  public DiscountAllocation() {
  }

  /**
   * Amount of discount allocated.
   */
  public MoneyV2 getAllocatedAmount() {
    return allocatedAmount;
  }

  public void setAllocatedAmount(MoneyV2 allocatedAmount) {
    this.allocatedAmount = allocatedAmount;
  }

  /**
   * The discount this allocated amount originated from.
   */
  public DiscountApplication getDiscountApplication() {
    return discountApplication;
  }

  public void setDiscountApplication(DiscountApplication discountApplication) {
    this.discountApplication = discountApplication;
  }

  @Override
  public String toString() {
    return "DiscountAllocation{allocatedAmount='" + allocatedAmount + "', discountApplication='" + discountApplication + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAllocation that = (DiscountAllocation) o;
    return Objects.equals(allocatedAmount, that.allocatedAmount) &&
        Objects.equals(discountApplication, that.discountApplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatedAmount, discountApplication);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Amount of discount allocated.
     */
    private MoneyV2 allocatedAmount;

    /**
     * The discount this allocated amount originated from.
     */
    private DiscountApplication discountApplication;

    public DiscountAllocation build() {
      DiscountAllocation result = new DiscountAllocation();
      result.allocatedAmount = this.allocatedAmount;
      result.discountApplication = this.discountApplication;
      return result;
    }

    /**
     * Amount of discount allocated.
     */
    public Builder allocatedAmount(MoneyV2 allocatedAmount) {
      this.allocatedAmount = allocatedAmount;
      return this;
    }

    /**
     * The discount this allocated amount originated from.
     */
    public Builder discountApplication(DiscountApplication discountApplication) {
      this.discountApplication = discountApplication;
      return this;
    }
  }
}

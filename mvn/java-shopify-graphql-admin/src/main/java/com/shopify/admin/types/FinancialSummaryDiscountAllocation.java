package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An amount that's allocated to a line item based on an associated discount application.
 */
public class FinancialSummaryDiscountAllocation {
  /**
   * The money amount that's allocated per unit on the associated line based on the
   * discount application in shop and presentment currencies. If the allocated
   * amount for the line cannot be evenly divided by the quantity, then this amount
   * will be an approximate amount, avoiding fractional pennies. For example, if
   * the associated line had a quantity of 3 with a discount of 4 cents, then the
   * discount distribution would be [0.01, 0.01, 0.02]. This field returns the
   * highest number of the distribution. In this example, this would be 0.02.
   */
  private MoneyBag approximateAllocatedAmountPerItem;

  /**
   * The discount application that the allocated amount originated from.
   */
  private FinancialSummaryDiscountApplication discountApplication;

  public FinancialSummaryDiscountAllocation() {
  }

  /**
   * The money amount that's allocated per unit on the associated line based on the
   * discount application in shop and presentment currencies. If the allocated
   * amount for the line cannot be evenly divided by the quantity, then this amount
   * will be an approximate amount, avoiding fractional pennies. For example, if
   * the associated line had a quantity of 3 with a discount of 4 cents, then the
   * discount distribution would be [0.01, 0.01, 0.02]. This field returns the
   * highest number of the distribution. In this example, this would be 0.02.
   */
  public MoneyBag getApproximateAllocatedAmountPerItem() {
    return approximateAllocatedAmountPerItem;
  }

  public void setApproximateAllocatedAmountPerItem(MoneyBag approximateAllocatedAmountPerItem) {
    this.approximateAllocatedAmountPerItem = approximateAllocatedAmountPerItem;
  }

  /**
   * The discount application that the allocated amount originated from.
   */
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
    /**
     * The money amount that's allocated per unit on the associated line based on the
     * discount application in shop and presentment currencies. If the allocated
     * amount for the line cannot be evenly divided by the quantity, then this amount
     * will be an approximate amount, avoiding fractional pennies. For example, if
     * the associated line had a quantity of 3 with a discount of 4 cents, then the
     * discount distribution would be [0.01, 0.01, 0.02]. This field returns the
     * highest number of the distribution. In this example, this would be 0.02.
     */
    private MoneyBag approximateAllocatedAmountPerItem;

    /**
     * The discount application that the allocated amount originated from.
     */
    private FinancialSummaryDiscountApplication discountApplication;

    public FinancialSummaryDiscountAllocation build() {
      FinancialSummaryDiscountAllocation result = new FinancialSummaryDiscountAllocation();
      result.approximateAllocatedAmountPerItem = this.approximateAllocatedAmountPerItem;
      result.discountApplication = this.discountApplication;
      return result;
    }

    /**
     * The money amount that's allocated per unit on the associated line based on the
     * discount application in shop and presentment currencies. If the allocated
     * amount for the line cannot be evenly divided by the quantity, then this amount
     * will be an approximate amount, avoiding fractional pennies. For example, if
     * the associated line had a quantity of 3 with a discount of 4 cents, then the
     * discount distribution would be [0.01, 0.01, 0.02]. This field returns the
     * highest number of the distribution. In this example, this would be 0.02.
     */
    public Builder approximateAllocatedAmountPerItem(MoneyBag approximateAllocatedAmountPerItem) {
      this.approximateAllocatedAmountPerItem = approximateAllocatedAmountPerItem;
      return this;
    }

    /**
     * The discount application that the allocated amount originated from.
     */
    public Builder discountApplication(FinancialSummaryDiscountApplication discountApplication) {
      this.discountApplication = discountApplication;
      return this;
    }
  }
}

package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A fixed amount that's deducted from the original variant price. For example, $10.00 off.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanFixedAmountPriceAdjustment implements SellingPlanPriceAdjustmentValue {
  /**
   * The money value of the price adjustment.
   */
  private MoneyV2 adjustmentAmount;

  public SellingPlanFixedAmountPriceAdjustment() {
  }

  /**
   * The money value of the price adjustment.
   */
  public MoneyV2 getAdjustmentAmount() {
    return adjustmentAmount;
  }

  public void setAdjustmentAmount(MoneyV2 adjustmentAmount) {
    this.adjustmentAmount = adjustmentAmount;
  }

  @Override
  public String toString() {
    return "SellingPlanFixedAmountPriceAdjustment{adjustmentAmount='" + adjustmentAmount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanFixedAmountPriceAdjustment that = (SellingPlanFixedAmountPriceAdjustment) o;
    return Objects.equals(adjustmentAmount, that.adjustmentAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentAmount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The money value of the price adjustment.
     */
    private MoneyV2 adjustmentAmount;

    public SellingPlanFixedAmountPriceAdjustment build() {
      SellingPlanFixedAmountPriceAdjustment result = new SellingPlanFixedAmountPriceAdjustment();
      result.adjustmentAmount = this.adjustmentAmount;
      return result;
    }

    /**
     * The money value of the price adjustment.
     */
    public Builder adjustmentAmount(MoneyV2 adjustmentAmount) {
      this.adjustmentAmount = adjustmentAmount;
      return this;
    }
  }
}

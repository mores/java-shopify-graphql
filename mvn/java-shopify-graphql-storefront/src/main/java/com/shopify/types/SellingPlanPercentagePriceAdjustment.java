package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A percentage amount that's deducted from the original variant price. For example, 10% off.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanPercentagePriceAdjustment implements SellingPlanPriceAdjustmentValue {
  /**
   * The percentage value of the price adjustment.
   */
  private double adjustmentPercentage;

  public SellingPlanPercentagePriceAdjustment() {
  }

  /**
   * The percentage value of the price adjustment.
   */
  public double getAdjustmentPercentage() {
    return adjustmentPercentage;
  }

  public void setAdjustmentPercentage(double adjustmentPercentage) {
    this.adjustmentPercentage = adjustmentPercentage;
  }

  @Override
  public String toString() {
    return "SellingPlanPercentagePriceAdjustment{adjustmentPercentage='" + adjustmentPercentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanPercentagePriceAdjustment that = (SellingPlanPercentagePriceAdjustment) o;
    return adjustmentPercentage == that.adjustmentPercentage;
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustmentPercentage);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The percentage value of the price adjustment.
     */
    private double adjustmentPercentage;

    public SellingPlanPercentagePriceAdjustment build() {
      SellingPlanPercentagePriceAdjustment result = new SellingPlanPercentagePriceAdjustment();
      result.adjustmentPercentage = this.adjustmentPercentage;
      return result;
    }

    /**
     * The percentage value of the price adjustment.
     */
    public Builder adjustmentPercentage(double adjustmentPercentage) {
      this.adjustmentPercentage = adjustmentPercentage;
      return this;
    }
  }
}

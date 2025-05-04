package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The percentage value of a selling plan pricing policy percentage type.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanPricingPolicyPercentageValue implements SellingPlanPricingPolicyAdjustmentValue {
  /**
   * The percentage value.
   */
  private double percentage;

  public SellingPlanPricingPolicyPercentageValue() {
  }

  /**
   * The percentage value.
   */
  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "SellingPlanPricingPolicyPercentageValue{percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanPricingPolicyPercentageValue that = (SellingPlanPricingPolicyPercentageValue) o;
    return percentage == that.percentage;
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The percentage value.
     */
    private double percentage;

    public SellingPlanPricingPolicyPercentageValue build() {
      SellingPlanPricingPolicyPercentageValue result = new SellingPlanPricingPolicyPercentageValue();
      result.percentage = this.percentage;
      return result;
    }

    /**
     * The percentage value.
     */
    public Builder percentage(double percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}

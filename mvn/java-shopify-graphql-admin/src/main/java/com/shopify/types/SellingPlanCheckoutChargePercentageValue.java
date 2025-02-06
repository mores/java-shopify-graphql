package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The percentage value of the price used for checkout charge.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanCheckoutChargePercentageValue implements SellingPlanCheckoutChargeValue {
  /**
   * The percentage value of the price used for checkout charge.
   */
  private double percentage;

  public SellingPlanCheckoutChargePercentageValue() {
  }

  /**
   * The percentage value of the price used for checkout charge.
   */
  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "SellingPlanCheckoutChargePercentageValue{percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanCheckoutChargePercentageValue that = (SellingPlanCheckoutChargePercentageValue) o;
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
     * The percentage value of the price used for checkout charge.
     */
    private double percentage;

    public SellingPlanCheckoutChargePercentageValue build() {
      SellingPlanCheckoutChargePercentageValue result = new SellingPlanCheckoutChargePercentageValue();
      result.percentage = this.percentage;
      return result;
    }

    /**
     * The percentage value of the price used for checkout charge.
     */
    public Builder percentage(double percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}

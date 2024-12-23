package com.shopify.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create or update an checkout charge value.
 */
public class SellingPlanCheckoutChargeValueInput {
  /**
   * The percentage value.
   */
  private Double percentage;

  /**
   * The fixed value for an checkout charge.
   */
  private String fixedValue;

  public SellingPlanCheckoutChargeValueInput() {
  }

  /**
   * The percentage value.
   */
  public Double getPercentage() {
    return percentage;
  }

  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }

  /**
   * The fixed value for an checkout charge.
   */
  public String getFixedValue() {
    return fixedValue;
  }

  public void setFixedValue(String fixedValue) {
    this.fixedValue = fixedValue;
  }

  @Override
  public String toString() {
    return "SellingPlanCheckoutChargeValueInput{percentage='" + percentage + "', fixedValue='" + fixedValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanCheckoutChargeValueInput that = (SellingPlanCheckoutChargeValueInput) o;
    return Objects.equals(percentage, that.percentage) &&
        Objects.equals(fixedValue, that.fixedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage, fixedValue);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The percentage value.
     */
    private Double percentage;

    /**
     * The fixed value for an checkout charge.
     */
    private String fixedValue;

    public SellingPlanCheckoutChargeValueInput build() {
      SellingPlanCheckoutChargeValueInput result = new SellingPlanCheckoutChargeValueInput();
      result.percentage = this.percentage;
      result.fixedValue = this.fixedValue;
      return result;
    }

    /**
     * The percentage value.
     */
    public Builder percentage(Double percentage) {
      this.percentage = percentage;
      return this;
    }

    /**
     * The fixed value for an checkout charge.
     */
    public Builder fixedValue(String fixedValue) {
      this.fixedValue = fixedValue;
      return this;
    }
  }
}

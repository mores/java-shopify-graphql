package com.shopify.admin.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create or update a pricing policy adjustment value.
 */
public class SellingPlanPricingPolicyValueInput {
  /**
   * The percentage value.
   */
  private Double percentage;

  /**
   * The fixed value for an fixed amount off or a new policy price.
   */
  private String fixedValue;

  public SellingPlanPricingPolicyValueInput() {
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
   * The fixed value for an fixed amount off or a new policy price.
   */
  public String getFixedValue() {
    return fixedValue;
  }

  public void setFixedValue(String fixedValue) {
    this.fixedValue = fixedValue;
  }

  @Override
  public String toString() {
    return "SellingPlanPricingPolicyValueInput{percentage='" + percentage + "', fixedValue='" + fixedValue + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanPricingPolicyValueInput that = (SellingPlanPricingPolicyValueInput) o;
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
     * The fixed value for an fixed amount off or a new policy price.
     */
    private String fixedValue;

    public SellingPlanPricingPolicyValueInput build() {
      SellingPlanPricingPolicyValueInput result = new SellingPlanPricingPolicyValueInput();
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
     * The fixed value for an fixed amount off or a new policy price.
     */
    public Builder fixedValue(String fixedValue) {
      this.fixedValue = fixedValue;
      return this;
    }
  }
}

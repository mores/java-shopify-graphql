package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The value of a percent price rule.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PriceRulePercentValue implements PriceRuleValue {
  /**
   * The percent value of the price rule.
   */
  private double percentage;

  public PriceRulePercentValue() {
  }

  /**
   * The percent value of the price rule.
   */
  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "PriceRulePercentValue{percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRulePercentValue that = (PriceRulePercentValue) o;
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
     * The percent value of the price rule.
     */
    private double percentage;

    public PriceRulePercentValue build() {
      PriceRulePercentValue result = new PriceRulePercentValue();
      result.percentage = this.percentage;
      return result;
    }

    /**
     * The percent value of the price rule.
     */
    public Builder percentage(double percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}

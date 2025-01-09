package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A discount effect that gives customers a percentage off of specified items on their order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountPercentage implements DiscountCustomerGetsValue, DiscountEffect {
  /**
   * The percentage value of the discount.
   */
  private double percentage;

  public DiscountPercentage() {
  }

  /**
   * The percentage value of the discount.
   */
  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "DiscountPercentage{percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountPercentage that = (DiscountPercentage) o;
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
     * The percentage value of the discount.
     */
    private double percentage;

    public DiscountPercentage build() {
      DiscountPercentage result = new DiscountPercentage();
      result.percentage = this.percentage;
      return result;
    }

    /**
     * The percentage value of the discount.
     */
    public Builder percentage(double percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}

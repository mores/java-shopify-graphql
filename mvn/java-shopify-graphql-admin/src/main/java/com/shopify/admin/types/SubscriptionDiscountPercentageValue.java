package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The percentage value of the discount.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionDiscountPercentageValue implements SubscriptionDiscountValue {
  /**
   * The percentage value of the discount.
   */
  private int percentage;

  public SubscriptionDiscountPercentageValue() {
  }

  /**
   * The percentage value of the discount.
   */
  public int getPercentage() {
    return percentage;
  }

  public void setPercentage(int percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "SubscriptionDiscountPercentageValue{percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDiscountPercentageValue that = (SubscriptionDiscountPercentageValue) o;
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
    private int percentage;

    public SubscriptionDiscountPercentageValue build() {
      SubscriptionDiscountPercentageValue result = new SubscriptionDiscountPercentageValue();
      result.percentage = this.percentage;
      return result;
    }

    /**
     * The percentage value of the discount.
     */
    public Builder percentage(int percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}

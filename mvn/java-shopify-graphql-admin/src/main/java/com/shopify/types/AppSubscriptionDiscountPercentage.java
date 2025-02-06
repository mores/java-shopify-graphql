package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The percentage value of a discount.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppSubscriptionDiscountPercentage implements AppSubscriptionDiscountValue {
  /**
   * The percentage value of a discount.
   */
  private double percentage;

  public AppSubscriptionDiscountPercentage() {
  }

  /**
   * The percentage value of a discount.
   */
  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "AppSubscriptionDiscountPercentage{percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionDiscountPercentage that = (AppSubscriptionDiscountPercentage) o;
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
     * The percentage value of a discount.
     */
    private double percentage;

    public AppSubscriptionDiscountPercentage build() {
      AppSubscriptionDiscountPercentage result = new AppSubscriptionDiscountPercentage();
      result.percentage = this.percentage;
      return result;
    }

    /**
     * The percentage value of a discount.
     */
    public Builder percentage(double percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}

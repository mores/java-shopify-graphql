package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A fixed price adjustment for a variant that's purchased with a selling plan.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlanFixedPriceAdjustment implements SellingPlanPriceAdjustmentValue {
  /**
   * A new price of the variant when it's purchased with the selling plan.
   */
  private MoneyV2 price;

  public SellingPlanFixedPriceAdjustment() {
  }

  /**
   * A new price of the variant when it's purchased with the selling plan.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "SellingPlanFixedPriceAdjustment{price='" + price + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanFixedPriceAdjustment that = (SellingPlanFixedPriceAdjustment) o;
    return Objects.equals(price, that.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A new price of the variant when it's purchased with the selling plan.
     */
    private MoneyV2 price;

    public SellingPlanFixedPriceAdjustment build() {
      SellingPlanFixedPriceAdjustment result = new SellingPlanFixedPriceAdjustment();
      result.price = this.price;
      return result;
    }

    /**
     * A new price of the variant when it's purchased with the selling plan.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }
  }
}

package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents relative adjustments from one price list to other prices.
 *   You can use a `PriceListParent` to specify an adjusted relative price using a percentage-based
 *   adjustment. Adjusted prices work in conjunction with exchange rules and rounding.
 *
 *   [Adjustment types](https://shopify.dev/api/admin-graphql/latest/enums/pricelistadjustmenttype)
 *   support both percentage increases and decreases.
 */
public class PriceListParent {
  /**
   * A price list adjustment.
   */
  private PriceListAdjustment adjustment;

  /**
   * A price list's settings for adjustment.
   */
  private PriceListAdjustmentSettings settings;

  public PriceListParent() {
  }

  /**
   * A price list adjustment.
   */
  public PriceListAdjustment getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(PriceListAdjustment adjustment) {
    this.adjustment = adjustment;
  }

  /**
   * A price list's settings for adjustment.
   */
  public PriceListAdjustmentSettings getSettings() {
    return settings;
  }

  public void setSettings(PriceListAdjustmentSettings settings) {
    this.settings = settings;
  }

  @Override
  public String toString() {
    return "PriceListParent{adjustment='" + adjustment + "', settings='" + settings + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListParent that = (PriceListParent) o;
    return Objects.equals(adjustment, that.adjustment) &&
        Objects.equals(settings, that.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adjustment, settings);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A price list adjustment.
     */
    private PriceListAdjustment adjustment;

    /**
     * A price list's settings for adjustment.
     */
    private PriceListAdjustmentSettings settings;

    public PriceListParent build() {
      PriceListParent result = new PriceListParent();
      result.adjustment = this.adjustment;
      result.settings = this.settings;
      return result;
    }

    /**
     * A price list adjustment.
     */
    public Builder adjustment(PriceListAdjustment adjustment) {
      this.adjustment = adjustment;
      return this;
    }

    /**
     * A price list's settings for adjustment.
     */
    public Builder settings(PriceListAdjustmentSettings settings) {
      this.settings = settings;
      return this;
    }
  }
}

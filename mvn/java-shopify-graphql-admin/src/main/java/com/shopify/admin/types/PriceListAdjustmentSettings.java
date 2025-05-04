package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the settings of price list adjustments.
 */
public class PriceListAdjustmentSettings {
  /**
   * The type of price list adjustment setting for compare at price.
   */
  private PriceListCompareAtMode compareAtMode;

  public PriceListAdjustmentSettings() {
  }

  /**
   * The type of price list adjustment setting for compare at price.
   */
  public PriceListCompareAtMode getCompareAtMode() {
    return compareAtMode;
  }

  public void setCompareAtMode(PriceListCompareAtMode compareAtMode) {
    this.compareAtMode = compareAtMode;
  }

  @Override
  public String toString() {
    return "PriceListAdjustmentSettings{compareAtMode='" + compareAtMode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListAdjustmentSettings that = (PriceListAdjustmentSettings) o;
    return Objects.equals(compareAtMode, that.compareAtMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compareAtMode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The type of price list adjustment setting for compare at price.
     */
    private PriceListCompareAtMode compareAtMode;

    public PriceListAdjustmentSettings build() {
      PriceListAdjustmentSettings result = new PriceListAdjustmentSettings();
      result.compareAtMode = this.compareAtMode;
      return result;
    }

    /**
     * The type of price list adjustment setting for compare at price.
     */
    public Builder compareAtMode(PriceListCompareAtMode compareAtMode) {
      this.compareAtMode = compareAtMode;
      return this;
    }
  }
}

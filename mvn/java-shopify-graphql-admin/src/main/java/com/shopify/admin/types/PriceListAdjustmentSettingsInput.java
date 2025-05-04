package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to set a price list's adjustment settings.
 */
public class PriceListAdjustmentSettingsInput {
  /**
   * Determines how adjustments are applied to compare at prices.
   */
  private PriceListCompareAtMode compareAtMode = PriceListCompareAtMode.ADJUSTED;

  public PriceListAdjustmentSettingsInput() {
  }

  /**
   * Determines how adjustments are applied to compare at prices.
   */
  public PriceListCompareAtMode getCompareAtMode() {
    return compareAtMode;
  }

  public void setCompareAtMode(PriceListCompareAtMode compareAtMode) {
    this.compareAtMode = compareAtMode;
  }

  @Override
  public String toString() {
    return "PriceListAdjustmentSettingsInput{compareAtMode='" + compareAtMode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListAdjustmentSettingsInput that = (PriceListAdjustmentSettingsInput) o;
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
     * Determines how adjustments are applied to compare at prices.
     */
    private PriceListCompareAtMode compareAtMode = PriceListCompareAtMode.ADJUSTED;

    public PriceListAdjustmentSettingsInput build() {
      PriceListAdjustmentSettingsInput result = new PriceListAdjustmentSettingsInput();
      result.compareAtMode = this.compareAtMode;
      return result;
    }

    /**
     * Determines how adjustments are applied to compare at prices.
     */
    public Builder compareAtMode(PriceListCompareAtMode compareAtMode) {
      this.compareAtMode = compareAtMode;
      return this;
    }
  }
}

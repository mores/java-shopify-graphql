package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to create a price list adjustment.
 */
public class PriceListParentCreateInput {
  /**
   * The relative adjustments to other prices.
   */
  private PriceListAdjustmentInput adjustment;

  /**
   * The price list adjustment settings.
   */
  private PriceListAdjustmentSettingsInput settings;

  public PriceListParentCreateInput() {
  }

  /**
   * The relative adjustments to other prices.
   */
  public PriceListAdjustmentInput getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(PriceListAdjustmentInput adjustment) {
    this.adjustment = adjustment;
  }

  /**
   * The price list adjustment settings.
   */
  public PriceListAdjustmentSettingsInput getSettings() {
    return settings;
  }

  public void setSettings(PriceListAdjustmentSettingsInput settings) {
    this.settings = settings;
  }

  @Override
  public String toString() {
    return "PriceListParentCreateInput{adjustment='" + adjustment + "', settings='" + settings + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListParentCreateInput that = (PriceListParentCreateInput) o;
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
     * The relative adjustments to other prices.
     */
    private PriceListAdjustmentInput adjustment;

    /**
     * The price list adjustment settings.
     */
    private PriceListAdjustmentSettingsInput settings;

    public PriceListParentCreateInput build() {
      PriceListParentCreateInput result = new PriceListParentCreateInput();
      result.adjustment = this.adjustment;
      result.settings = this.settings;
      return result;
    }

    /**
     * The relative adjustments to other prices.
     */
    public Builder adjustment(PriceListAdjustmentInput adjustment) {
      this.adjustment = adjustment;
      return this;
    }

    /**
     * The price list adjustment settings.
     */
    public Builder settings(PriceListAdjustmentSettingsInput settings) {
      this.settings = settings;
      return this;
    }
  }
}

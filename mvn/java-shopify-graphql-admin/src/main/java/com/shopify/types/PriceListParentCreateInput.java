package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PriceListParentCreateInput {
  
  private PriceListAdjustmentInput adjustment;

  
  private PriceListAdjustmentSettingsInput settings;

  public PriceListParentCreateInput() {
  }

  
  public PriceListAdjustmentInput getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(PriceListAdjustmentInput adjustment) {
    this.adjustment = adjustment;
  }

  
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
    
    private PriceListAdjustmentInput adjustment;

    
    private PriceListAdjustmentSettingsInput settings;

    public PriceListParentCreateInput build() {
      PriceListParentCreateInput result = new PriceListParentCreateInput();
      result.adjustment = this.adjustment;
      result.settings = this.settings;
      return result;
    }

    
    public Builder adjustment(PriceListAdjustmentInput adjustment) {
      this.adjustment = adjustment;
      return this;
    }

    
    public Builder settings(PriceListAdjustmentSettingsInput settings) {
      this.settings = settings;
      return this;
    }
  }
}

package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PriceListParent {
  
  private PriceListAdjustment adjustment;

  
  private PriceListAdjustmentSettings settings;

  public PriceListParent() {
  }

  
  public PriceListAdjustment getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(PriceListAdjustment adjustment) {
    this.adjustment = adjustment;
  }

  
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
    
    private PriceListAdjustment adjustment;

    
    private PriceListAdjustmentSettings settings;

    public PriceListParent build() {
      PriceListParent result = new PriceListParent();
      result.adjustment = this.adjustment;
      result.settings = this.settings;
      return result;
    }

    
    public Builder adjustment(PriceListAdjustment adjustment) {
      this.adjustment = adjustment;
      return this;
    }

    
    public Builder settings(PriceListAdjustmentSettings settings) {
      this.settings = settings;
      return this;
    }
  }
}

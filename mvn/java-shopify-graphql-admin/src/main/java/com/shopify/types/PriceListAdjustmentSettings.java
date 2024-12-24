package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PriceListAdjustmentSettings {
  
  private PriceListCompareAtMode compareAtMode;

  public PriceListAdjustmentSettings() {
  }

  
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
    
    private PriceListCompareAtMode compareAtMode;

    public PriceListAdjustmentSettings build() {
      PriceListAdjustmentSettings result = new PriceListAdjustmentSettings();
      result.compareAtMode = this.compareAtMode;
      return result;
    }

    
    public Builder compareAtMode(PriceListCompareAtMode compareAtMode) {
      this.compareAtMode = compareAtMode;
      return this;
    }
  }
}

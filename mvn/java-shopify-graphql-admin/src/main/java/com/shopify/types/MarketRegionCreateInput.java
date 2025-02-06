package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for creating a market region with exactly one required option.
 */
public class MarketRegionCreateInput {
  /**
   * A country code for the region.
   */
  private CountryCode countryCode;

  public MarketRegionCreateInput() {
  }

  /**
   * A country code for the region.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  @Override
  public String toString() {
    return "MarketRegionCreateInput{countryCode='" + countryCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketRegionCreateInput that = (MarketRegionCreateInput) o;
    return Objects.equals(countryCode, that.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A country code for the region.
     */
    private CountryCode countryCode;

    public MarketRegionCreateInput build() {
      MarketRegionCreateInput result = new MarketRegionCreateInput();
      result.countryCode = this.countryCode;
      return result;
    }

    /**
     * A country code for the region.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }
  }
}

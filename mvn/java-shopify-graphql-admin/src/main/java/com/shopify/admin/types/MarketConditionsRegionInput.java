package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to specify a region condition.
 */
public class MarketConditionsRegionInput {
  /**
   * A country code to which this condition should apply.
   */
  private CountryCode countryCode;

  public MarketConditionsRegionInput() {
  }

  /**
   * A country code to which this condition should apply.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  @Override
  public String toString() {
    return "MarketConditionsRegionInput{countryCode='" + countryCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketConditionsRegionInput that = (MarketConditionsRegionInput) o;
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
     * A country code to which this condition should apply.
     */
    private CountryCode countryCode;

    public MarketConditionsRegionInput build() {
      MarketConditionsRegionInput result = new MarketConditionsRegionInput();
      result.countryCode = this.countryCode;
      return result;
    }

    /**
     * A country code to which this condition should apply.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }
  }
}

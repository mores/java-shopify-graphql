package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MarketRegionCreateInput {
  
  private CountryCode countryCode;

  public MarketRegionCreateInput() {
  }

  
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
    
    private CountryCode countryCode;

    public MarketRegionCreateInput build() {
      MarketRegionCreateInput result = new MarketRegionCreateInput();
      result.countryCode = this.countryCode;
      return result;
    }

    
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }
  }
}

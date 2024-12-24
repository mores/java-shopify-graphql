package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CountryHarmonizedSystemCode {
  
  private CountryCode countryCode;

  
  private String harmonizedSystemCode;

  public CountryHarmonizedSystemCode() {
  }

  
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  
  public String getHarmonizedSystemCode() {
    return harmonizedSystemCode;
  }

  public void setHarmonizedSystemCode(String harmonizedSystemCode) {
    this.harmonizedSystemCode = harmonizedSystemCode;
  }

  @Override
  public String toString() {
    return "CountryHarmonizedSystemCode{countryCode='" + countryCode + "', harmonizedSystemCode='" + harmonizedSystemCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CountryHarmonizedSystemCode that = (CountryHarmonizedSystemCode) o;
    return Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(harmonizedSystemCode, that.harmonizedSystemCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, harmonizedSystemCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CountryCode countryCode;

    
    private String harmonizedSystemCode;

    public CountryHarmonizedSystemCode build() {
      CountryHarmonizedSystemCode result = new CountryHarmonizedSystemCode();
      result.countryCode = this.countryCode;
      result.harmonizedSystemCode = this.harmonizedSystemCode;
      return result;
    }

    
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    
    public Builder harmonizedSystemCode(String harmonizedSystemCode) {
      this.harmonizedSystemCode = harmonizedSystemCode;
      return this;
    }
  }
}

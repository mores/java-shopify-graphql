package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CountryHarmonizedSystemCodeInput {
  
  private String harmonizedSystemCode;

  
  private CountryCode countryCode;

  public CountryHarmonizedSystemCodeInput() {
  }

  
  public String getHarmonizedSystemCode() {
    return harmonizedSystemCode;
  }

  public void setHarmonizedSystemCode(String harmonizedSystemCode) {
    this.harmonizedSystemCode = harmonizedSystemCode;
  }

  
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  @Override
  public String toString() {
    return "CountryHarmonizedSystemCodeInput{harmonizedSystemCode='" + harmonizedSystemCode + "', countryCode='" + countryCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CountryHarmonizedSystemCodeInput that = (CountryHarmonizedSystemCodeInput) o;
    return Objects.equals(harmonizedSystemCode, that.harmonizedSystemCode) &&
        Objects.equals(countryCode, that.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(harmonizedSystemCode, countryCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String harmonizedSystemCode;

    
    private CountryCode countryCode;

    public CountryHarmonizedSystemCodeInput build() {
      CountryHarmonizedSystemCodeInput result = new CountryHarmonizedSystemCodeInput();
      result.harmonizedSystemCode = this.harmonizedSystemCode;
      result.countryCode = this.countryCode;
      return result;
    }

    
    public Builder harmonizedSystemCode(String harmonizedSystemCode) {
      this.harmonizedSystemCode = harmonizedSystemCode;
      return this;
    }

    
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The country-specific harmonized system code and ISO country code for an inventory item.
 */
public class CountryHarmonizedSystemCode {
  /**
   * The ISO 3166-1 alpha-2 country code for the country that issued the specified harmonized system code.
   */
  private CountryCode countryCode;

  /**
   * The country-specific harmonized system code. These are usually longer than 6 digits.
   */
  private String harmonizedSystemCode;

  public CountryHarmonizedSystemCode() {
  }

  /**
   * The ISO 3166-1 alpha-2 country code for the country that issued the specified harmonized system code.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The country-specific harmonized system code. These are usually longer than 6 digits.
   */
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
    /**
     * The ISO 3166-1 alpha-2 country code for the country that issued the specified harmonized system code.
     */
    private CountryCode countryCode;

    /**
     * The country-specific harmonized system code. These are usually longer than 6 digits.
     */
    private String harmonizedSystemCode;

    public CountryHarmonizedSystemCode build() {
      CountryHarmonizedSystemCode result = new CountryHarmonizedSystemCode();
      result.countryCode = this.countryCode;
      result.harmonizedSystemCode = this.harmonizedSystemCode;
      return result;
    }

    /**
     * The ISO 3166-1 alpha-2 country code for the country that issued the specified harmonized system code.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The country-specific harmonized system code. These are usually longer than 6 digits.
     */
    public Builder harmonizedSystemCode(String harmonizedSystemCode) {
      this.harmonizedSystemCode = harmonizedSystemCode;
      return this;
    }
  }
}

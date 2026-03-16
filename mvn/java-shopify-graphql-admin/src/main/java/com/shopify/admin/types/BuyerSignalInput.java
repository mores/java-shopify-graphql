package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a buyer signal.
 */
public class BuyerSignalInput {
  /**
   * The country code of the buyer.
   */
  private CountryCode countryCode;

  public BuyerSignalInput() {
  }

  /**
   * The country code of the buyer.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  @Override
  public String toString() {
    return "BuyerSignalInput{countryCode='" + countryCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BuyerSignalInput that = (BuyerSignalInput) o;
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
     * The country code of the buyer.
     */
    private CountryCode countryCode;

    public BuyerSignalInput build() {
      BuyerSignalInput result = new BuyerSignalInput();
      result.countryCode = this.countryCode;
      return result;
    }

    /**
     * The country code of the buyer.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }
  }
}

package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents a suggested address for a location.
 */
public class LocationSuggestedAddress {
  /**
   * The first line of the suggested address.
   */
  private String address1;

  /**
   * The second line of the suggested address.
   */
  private String address2;

  /**
   * The city of the suggested address.
   */
  private String city;

  /**
   * The country of the suggested address.
   */
  private String country;

  /**
   * The country code of the suggested address.
   */
  private CountryCode countryCode;

  /**
   * A formatted version of the suggested address.
   */
  private List<String> formatted;

  /**
   * The province of the suggested address.
   */
  private String province;

  /**
   * The code for the province, state, or district of the suggested address.
   */
  private String provinceCode;

  /**
   * The ZIP code of the suggested address.
   */
  private String zip;

  public LocationSuggestedAddress() {
  }

  /**
   * The first line of the suggested address.
   */
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  /**
   * The second line of the suggested address.
   */
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  /**
   * The city of the suggested address.
   */
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The country of the suggested address.
   */
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The country code of the suggested address.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * A formatted version of the suggested address.
   */
  public List<String> getFormatted() {
    return formatted;
  }

  public void setFormatted(List<String> formatted) {
    this.formatted = formatted;
  }

  /**
   * The province of the suggested address.
   */
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  /**
   * The code for the province, state, or district of the suggested address.
   */
  public String getProvinceCode() {
    return provinceCode;
  }

  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }

  /**
   * The ZIP code of the suggested address.
   */
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return "LocationSuggestedAddress{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', country='" + country + "', countryCode='" + countryCode + "', formatted='" + formatted + "', province='" + province + "', provinceCode='" + provinceCode + "', zip='" + zip + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationSuggestedAddress that = (LocationSuggestedAddress) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(country, that.country) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(formatted, that.formatted) &&
        Objects.equals(province, that.province) &&
        Objects.equals(provinceCode, that.provinceCode) &&
        Objects.equals(zip, that.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, country, countryCode, formatted, province, provinceCode, zip);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The first line of the suggested address.
     */
    private String address1;

    /**
     * The second line of the suggested address.
     */
    private String address2;

    /**
     * The city of the suggested address.
     */
    private String city;

    /**
     * The country of the suggested address.
     */
    private String country;

    /**
     * The country code of the suggested address.
     */
    private CountryCode countryCode;

    /**
     * A formatted version of the suggested address.
     */
    private List<String> formatted;

    /**
     * The province of the suggested address.
     */
    private String province;

    /**
     * The code for the province, state, or district of the suggested address.
     */
    private String provinceCode;

    /**
     * The ZIP code of the suggested address.
     */
    private String zip;

    public LocationSuggestedAddress build() {
      LocationSuggestedAddress result = new LocationSuggestedAddress();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.country = this.country;
      result.countryCode = this.countryCode;
      result.formatted = this.formatted;
      result.province = this.province;
      result.provinceCode = this.provinceCode;
      result.zip = this.zip;
      return result;
    }

    /**
     * The first line of the suggested address.
     */
    public Builder address1(String address1) {
      this.address1 = address1;
      return this;
    }

    /**
     * The second line of the suggested address.
     */
    public Builder address2(String address2) {
      this.address2 = address2;
      return this;
    }

    /**
     * The city of the suggested address.
     */
    public Builder city(String city) {
      this.city = city;
      return this;
    }

    /**
     * The country of the suggested address.
     */
    public Builder country(String country) {
      this.country = country;
      return this;
    }

    /**
     * The country code of the suggested address.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * A formatted version of the suggested address.
     */
    public Builder formatted(List<String> formatted) {
      this.formatted = formatted;
      return this;
    }

    /**
     * The province of the suggested address.
     */
    public Builder province(String province) {
      this.province = province;
      return this;
    }

    /**
     * The code for the province, state, or district of the suggested address.
     */
    public Builder provinceCode(String provinceCode) {
      this.provinceCode = provinceCode;
      return this;
    }

    /**
     * The ZIP code of the suggested address.
     */
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }
  }
}

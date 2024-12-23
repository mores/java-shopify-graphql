package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to use to specify the address while adding a location.
 */
public class LocationAddAddressInput {
  /**
   * The first line of the address.
   */
  private String address1;

  /**
   * The second line of the address.
   */
  private String address2;

  /**
   * The name of the city, district, village, or town.
   */
  private String city;

  /**
   * The phone number of the location.
   */
  private String phone;

  /**
   * The ZIP code or postal code of the address.
   */
  private String zip;

  /**
   * The two-letter code of country for the address.
   */
  private CountryCode countryCode;

  /**
   * The code for the region of the address, such as the state, province, or district.
   * For example CA for California, United States.
   */
  private String provinceCode;

  public LocationAddAddressInput() {
  }

  /**
   * The first line of the address.
   */
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  /**
   * The second line of the address.
   */
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  /**
   * The name of the city, district, village, or town.
   */
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The phone number of the location.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The ZIP code or postal code of the address.
   */
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  /**
   * The two-letter code of country for the address.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The code for the region of the address, such as the state, province, or district.
   * For example CA for California, United States.
   */
  public String getProvinceCode() {
    return provinceCode;
  }

  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }

  @Override
  public String toString() {
    return "LocationAddAddressInput{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', phone='" + phone + "', zip='" + zip + "', countryCode='" + countryCode + "', provinceCode='" + provinceCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationAddAddressInput that = (LocationAddAddressInput) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(zip, that.zip) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(provinceCode, that.provinceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, phone, zip, countryCode, provinceCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The first line of the address.
     */
    private String address1;

    /**
     * The second line of the address.
     */
    private String address2;

    /**
     * The name of the city, district, village, or town.
     */
    private String city;

    /**
     * The phone number of the location.
     */
    private String phone;

    /**
     * The ZIP code or postal code of the address.
     */
    private String zip;

    /**
     * The two-letter code of country for the address.
     */
    private CountryCode countryCode;

    /**
     * The code for the region of the address, such as the state, province, or district.
     * For example CA for California, United States.
     */
    private String provinceCode;

    public LocationAddAddressInput build() {
      LocationAddAddressInput result = new LocationAddAddressInput();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.phone = this.phone;
      result.zip = this.zip;
      result.countryCode = this.countryCode;
      result.provinceCode = this.provinceCode;
      return result;
    }

    /**
     * The first line of the address.
     */
    public Builder address1(String address1) {
      this.address1 = address1;
      return this;
    }

    /**
     * The second line of the address.
     */
    public Builder address2(String address2) {
      this.address2 = address2;
      return this;
    }

    /**
     * The name of the city, district, village, or town.
     */
    public Builder city(String city) {
      this.city = city;
      return this;
    }

    /**
     * The phone number of the location.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The ZIP code or postal code of the address.
     */
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }

    /**
     * The two-letter code of country for the address.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The code for the region of the address, such as the state, province, or district.
     * For example CA for California, United States.
     */
    public Builder provinceCode(String provinceCode) {
      this.provinceCode = provinceCode;
      return this;
    }
  }
}

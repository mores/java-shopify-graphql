package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The billing address of a payment instrument.
 */
public class CustomerPaymentInstrumentBillingAddress {
  /**
   * The first line of the address. Typically the street address or PO Box number.
   */
  private String address1;

  /**
   * The name of the city, district, village, or town.
   */
  private String city;

  /**
   * The name of the country.
   */
  private String country;

  /**
   * The two-letter code for the country of the address.
   * For example, US.
   */
  private CountryCode countryCode;

  /**
   * The name of the buyer of the address.
   */
  private String name;

  /**
   * The region of the address, such as the province, state, or district.
   */
  private String province;

  /**
   * The alphanumeric code for the region.
   * For example, ON.
   */
  private String provinceCode;

  /**
   * The zip or postal code of the address.
   */
  private String zip;

  public CustomerPaymentInstrumentBillingAddress() {
  }

  /**
   * The first line of the address. Typically the street address or PO Box number.
   */
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
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
   * The name of the country.
   */
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The two-letter code for the country of the address.
   * For example, US.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The name of the buyer of the address.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The region of the address, such as the province, state, or district.
   */
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  /**
   * The alphanumeric code for the region.
   * For example, ON.
   */
  public String getProvinceCode() {
    return provinceCode;
  }

  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }

  /**
   * The zip or postal code of the address.
   */
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return "CustomerPaymentInstrumentBillingAddress{address1='" + address1 + "', city='" + city + "', country='" + country + "', countryCode='" + countryCode + "', name='" + name + "', province='" + province + "', provinceCode='" + provinceCode + "', zip='" + zip + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaymentInstrumentBillingAddress that = (CustomerPaymentInstrumentBillingAddress) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(city, that.city) &&
        Objects.equals(country, that.country) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(name, that.name) &&
        Objects.equals(province, that.province) &&
        Objects.equals(provinceCode, that.provinceCode) &&
        Objects.equals(zip, that.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, city, country, countryCode, name, province, provinceCode, zip);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The first line of the address. Typically the street address or PO Box number.
     */
    private String address1;

    /**
     * The name of the city, district, village, or town.
     */
    private String city;

    /**
     * The name of the country.
     */
    private String country;

    /**
     * The two-letter code for the country of the address.
     * For example, US.
     */
    private CountryCode countryCode;

    /**
     * The name of the buyer of the address.
     */
    private String name;

    /**
     * The region of the address, such as the province, state, or district.
     */
    private String province;

    /**
     * The alphanumeric code for the region.
     * For example, ON.
     */
    private String provinceCode;

    /**
     * The zip or postal code of the address.
     */
    private String zip;

    public CustomerPaymentInstrumentBillingAddress build() {
      CustomerPaymentInstrumentBillingAddress result = new CustomerPaymentInstrumentBillingAddress();
      result.address1 = this.address1;
      result.city = this.city;
      result.country = this.country;
      result.countryCode = this.countryCode;
      result.name = this.name;
      result.province = this.province;
      result.provinceCode = this.provinceCode;
      result.zip = this.zip;
      return result;
    }

    /**
     * The first line of the address. Typically the street address or PO Box number.
     */
    public Builder address1(String address1) {
      this.address1 = address1;
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
     * The name of the country.
     */
    public Builder country(String country) {
      this.country = country;
      return this;
    }

    /**
     * The two-letter code for the country of the address.
     * For example, US.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The name of the buyer of the address.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The region of the address, such as the province, state, or district.
     */
    public Builder province(String province) {
      this.province = province;
      return this;
    }

    /**
     * The alphanumeric code for the region.
     * For example, ON.
     */
    public Builder provinceCode(String provinceCode) {
      this.provinceCode = provinceCode;
      return this;
    }

    /**
     * The zip or postal code of the address.
     */
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }
  }
}

package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The address at which the fulfillment occurred. This object is intended for tax
 * purposes, as a full address is required for tax providers to accurately
 * calculate taxes. Typically this is the address of the warehouse or fulfillment
 * center. To retrieve a fulfillment location's address, use the `assignedLocation` field on the
 * [`FulfillmentOrder`](/docs/api/admin-graphql/latest/objects/FulfillmentOrder)
 * object instead.
 */
public class FulfillmentOriginAddress {
  /**
   * The street address of the fulfillment location.
   */
  private String address1;

  /**
   * The second line of the address. Typically the number of the apartment, suite, or unit.
   */
  private String address2;

  /**
   * The city in which the fulfillment location is located.
   */
  private String city;

  /**
   * The country code of the fulfillment location.
   */
  private String countryCode;

  /**
   * The province code of the fulfillment location.
   */
  private String provinceCode;

  /**
   * The zip code of the fulfillment location.
   */
  private String zip;

  public FulfillmentOriginAddress() {
  }

  /**
   * The street address of the fulfillment location.
   */
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  /**
   * The second line of the address. Typically the number of the apartment, suite, or unit.
   */
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  /**
   * The city in which the fulfillment location is located.
   */
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The country code of the fulfillment location.
   */
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The province code of the fulfillment location.
   */
  public String getProvinceCode() {
    return provinceCode;
  }

  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }

  /**
   * The zip code of the fulfillment location.
   */
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return "FulfillmentOriginAddress{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', countryCode='" + countryCode + "', provinceCode='" + provinceCode + "', zip='" + zip + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOriginAddress that = (FulfillmentOriginAddress) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(provinceCode, that.provinceCode) &&
        Objects.equals(zip, that.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, countryCode, provinceCode, zip);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The street address of the fulfillment location.
     */
    private String address1;

    /**
     * The second line of the address. Typically the number of the apartment, suite, or unit.
     */
    private String address2;

    /**
     * The city in which the fulfillment location is located.
     */
    private String city;

    /**
     * The country code of the fulfillment location.
     */
    private String countryCode;

    /**
     * The province code of the fulfillment location.
     */
    private String provinceCode;

    /**
     * The zip code of the fulfillment location.
     */
    private String zip;

    public FulfillmentOriginAddress build() {
      FulfillmentOriginAddress result = new FulfillmentOriginAddress();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.countryCode = this.countryCode;
      result.provinceCode = this.provinceCode;
      result.zip = this.zip;
      return result;
    }

    /**
     * The street address of the fulfillment location.
     */
    public Builder address1(String address1) {
      this.address1 = address1;
      return this;
    }

    /**
     * The second line of the address. Typically the number of the apartment, suite, or unit.
     */
    public Builder address2(String address2) {
      this.address2 = address2;
      return this;
    }

    /**
     * The city in which the fulfillment location is located.
     */
    public Builder city(String city) {
      this.city = city;
      return this;
    }

    /**
     * The country code of the fulfillment location.
     */
    public Builder countryCode(String countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The province code of the fulfillment location.
     */
    public Builder provinceCode(String provinceCode) {
      this.provinceCode = provinceCode;
      return this;
    }

    /**
     * The zip code of the fulfillment location.
     */
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }
  }
}

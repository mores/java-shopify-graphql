package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A Shopify Payments address.
 */
public class ShopifyPaymentsAddressBasic {
  /**
   * Line 1 of the address.
   */
  private String addressLine1;

  /**
   * Line 2 of the address.
   */
  private String addressLine2;

  /**
   * The address city.
   */
  private String city;

  /**
   * The address country.
   */
  private String country;

  /**
   * The address postal code.
   */
  private String postalCode;

  /**
   * The address state/province/zone.
   */
  private String zone;

  public ShopifyPaymentsAddressBasic() {
  }

  /**
   * Line 1 of the address.
   */
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  /**
   * Line 2 of the address.
   */
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  /**
   * The address city.
   */
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The address country.
   */
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The address postal code.
   */
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * The address state/province/zone.
   */
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsAddressBasic{addressLine1='" + addressLine1 + "', addressLine2='" + addressLine2 + "', city='" + city + "', country='" + country + "', postalCode='" + postalCode + "', zone='" + zone + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsAddressBasic that = (ShopifyPaymentsAddressBasic) o;
    return Objects.equals(addressLine1, that.addressLine1) &&
        Objects.equals(addressLine2, that.addressLine2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(country, that.country) &&
        Objects.equals(postalCode, that.postalCode) &&
        Objects.equals(zone, that.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, city, country, postalCode, zone);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Line 1 of the address.
     */
    private String addressLine1;

    /**
     * Line 2 of the address.
     */
    private String addressLine2;

    /**
     * The address city.
     */
    private String city;

    /**
     * The address country.
     */
    private String country;

    /**
     * The address postal code.
     */
    private String postalCode;

    /**
     * The address state/province/zone.
     */
    private String zone;

    public ShopifyPaymentsAddressBasic build() {
      ShopifyPaymentsAddressBasic result = new ShopifyPaymentsAddressBasic();
      result.addressLine1 = this.addressLine1;
      result.addressLine2 = this.addressLine2;
      result.city = this.city;
      result.country = this.country;
      result.postalCode = this.postalCode;
      result.zone = this.zone;
      return result;
    }

    /**
     * Line 1 of the address.
     */
    public Builder addressLine1(String addressLine1) {
      this.addressLine1 = addressLine1;
      return this;
    }

    /**
     * Line 2 of the address.
     */
    public Builder addressLine2(String addressLine2) {
      this.addressLine2 = addressLine2;
      return this;
    }

    /**
     * The address city.
     */
    public Builder city(String city) {
      this.city = city;
      return this;
    }

    /**
     * The address country.
     */
    public Builder country(String country) {
      this.country = country;
      return this;
    }

    /**
     * The address postal code.
     */
    public Builder postalCode(String postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    /**
     * The address state/province/zone.
     */
    public Builder zone(String zone) {
      this.zone = zone;
      return this;
    }
  }
}

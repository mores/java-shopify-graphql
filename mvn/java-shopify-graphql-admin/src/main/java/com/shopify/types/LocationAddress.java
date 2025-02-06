package com.shopify.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents the address of a location.
 */
public class LocationAddress {
  /**
   * The first line of the address for the location.
   */
  private String address1;

  /**
   * The second line of the address for the location.
   */
  private String address2;

  /**
   * The city of the location.
   */
  private String city;

  /**
   * The country of the location.
   */
  private String country;

  /**
   * The country code of the location.
   */
  private String countryCode;

  /**
   * A formatted version of the address for the location.
   */
  private List<String> formatted;

  /**
   * The approximate latitude coordinates of the location.
   */
  private Double latitude;

  /**
   * The approximate longitude coordinates of the location.
   */
  private Double longitude;

  /**
   * The phone number of the location.
   */
  private String phone;

  /**
   * The province of the location.
   */
  private String province;

  /**
   * The code for the province, state, or district of the address of the location.
   */
  private String provinceCode;

  /**
   * The ZIP code of the location.
   */
  private String zip;

  public LocationAddress() {
  }

  /**
   * The first line of the address for the location.
   */
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  /**
   * The second line of the address for the location.
   */
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  /**
   * The city of the location.
   */
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The country of the location.
   */
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The country code of the location.
   */
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * A formatted version of the address for the location.
   */
  public List<String> getFormatted() {
    return formatted;
  }

  public void setFormatted(List<String> formatted) {
    this.formatted = formatted;
  }

  /**
   * The approximate latitude coordinates of the location.
   */
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   * The approximate longitude coordinates of the location.
   */
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
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
   * The province of the location.
   */
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  /**
   * The code for the province, state, or district of the address of the location.
   */
  public String getProvinceCode() {
    return provinceCode;
  }

  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }

  /**
   * The ZIP code of the location.
   */
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public String toString() {
    return "LocationAddress{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', country='" + country + "', countryCode='" + countryCode + "', formatted='" + formatted + "', latitude='" + latitude + "', longitude='" + longitude + "', phone='" + phone + "', province='" + province + "', provinceCode='" + provinceCode + "', zip='" + zip + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationAddress that = (LocationAddress) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(country, that.country) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(formatted, that.formatted) &&
        Objects.equals(latitude, that.latitude) &&
        Objects.equals(longitude, that.longitude) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(province, that.province) &&
        Objects.equals(provinceCode, that.provinceCode) &&
        Objects.equals(zip, that.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, country, countryCode, formatted, latitude, longitude, phone, province, provinceCode, zip);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The first line of the address for the location.
     */
    private String address1;

    /**
     * The second line of the address for the location.
     */
    private String address2;

    /**
     * The city of the location.
     */
    private String city;

    /**
     * The country of the location.
     */
    private String country;

    /**
     * The country code of the location.
     */
    private String countryCode;

    /**
     * A formatted version of the address for the location.
     */
    private List<String> formatted;

    /**
     * The approximate latitude coordinates of the location.
     */
    private Double latitude;

    /**
     * The approximate longitude coordinates of the location.
     */
    private Double longitude;

    /**
     * The phone number of the location.
     */
    private String phone;

    /**
     * The province of the location.
     */
    private String province;

    /**
     * The code for the province, state, or district of the address of the location.
     */
    private String provinceCode;

    /**
     * The ZIP code of the location.
     */
    private String zip;

    public LocationAddress build() {
      LocationAddress result = new LocationAddress();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.country = this.country;
      result.countryCode = this.countryCode;
      result.formatted = this.formatted;
      result.latitude = this.latitude;
      result.longitude = this.longitude;
      result.phone = this.phone;
      result.province = this.province;
      result.provinceCode = this.provinceCode;
      result.zip = this.zip;
      return result;
    }

    /**
     * The first line of the address for the location.
     */
    public Builder address1(String address1) {
      this.address1 = address1;
      return this;
    }

    /**
     * The second line of the address for the location.
     */
    public Builder address2(String address2) {
      this.address2 = address2;
      return this;
    }

    /**
     * The city of the location.
     */
    public Builder city(String city) {
      this.city = city;
      return this;
    }

    /**
     * The country of the location.
     */
    public Builder country(String country) {
      this.country = country;
      return this;
    }

    /**
     * The country code of the location.
     */
    public Builder countryCode(String countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * A formatted version of the address for the location.
     */
    public Builder formatted(List<String> formatted) {
      this.formatted = formatted;
      return this;
    }

    /**
     * The approximate latitude coordinates of the location.
     */
    public Builder latitude(Double latitude) {
      this.latitude = latitude;
      return this;
    }

    /**
     * The approximate longitude coordinates of the location.
     */
    public Builder longitude(Double longitude) {
      this.longitude = longitude;
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
     * The province of the location.
     */
    public Builder province(String province) {
      this.province = province;
      return this;
    }

    /**
     * The code for the province, state, or district of the address of the location.
     */
    public Builder provinceCode(String provinceCode) {
      this.provinceCode = provinceCode;
      return this;
    }

    /**
     * The ZIP code of the location.
     */
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }
  }
}

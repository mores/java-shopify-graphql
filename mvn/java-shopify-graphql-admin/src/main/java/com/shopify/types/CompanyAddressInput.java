package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to create or update the address of a company location.
 */
public class CompanyAddressInput {
  /**
   * The first line of the address. Typically the street address or PO Box number.
   */
  private String address1;

  /**
   * The second line of the address. Typically the number of the apartment, suite, or unit.
   */
  private String address2;

  /**
   * The name of the city, district, village, or town.
   */
  private String city;

  /**
   * The zip or postal code of the address.
   */
  private String zip;

  /**
   * The identity of the recipient e.g. 'Receiving Department'.
   */
  private String recipient;

  /**
   * The first name of the recipient.
   */
  private String firstName;

  /**
   * The last name of the recipient.
   */
  private String lastName;

  /**
   * A phone number for the recipient. Formatted using E.164 standard. For example, _+16135551111_.
   */
  private String phone;

  /**
   * The alphanumeric code for the region of the address, such as the province,
   * state, or district. For example, `ON` for Ontario, Canada.
   */
  private String zoneCode;

  /**
   * The two-letter code ([ISO 3166-1
   * alpha-2]](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format) for the
   * country of the address. For example, `US`` for the United States.
   */
  private CountryCode countryCode;

  public CompanyAddressInput() {
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
   * The second line of the address. Typically the number of the apartment, suite, or unit.
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
   * The zip or postal code of the address.
   */
  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  /**
   * The identity of the recipient e.g. 'Receiving Department'.
   */
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  /**
   * The first name of the recipient.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The last name of the recipient.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * A phone number for the recipient. Formatted using E.164 standard. For example, _+16135551111_.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The alphanumeric code for the region of the address, such as the province,
   * state, or district. For example, `ON` for Ontario, Canada.
   */
  public String getZoneCode() {
    return zoneCode;
  }

  public void setZoneCode(String zoneCode) {
    this.zoneCode = zoneCode;
  }

  /**
   * The two-letter code ([ISO 3166-1
   * alpha-2]](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format) for the
   * country of the address. For example, `US`` for the United States.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  @Override
  public String toString() {
    return "CompanyAddressInput{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', zip='" + zip + "', recipient='" + recipient + "', firstName='" + firstName + "', lastName='" + lastName + "', phone='" + phone + "', zoneCode='" + zoneCode + "', countryCode='" + countryCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyAddressInput that = (CompanyAddressInput) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(zip, that.zip) &&
        Objects.equals(recipient, that.recipient) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(zoneCode, that.zoneCode) &&
        Objects.equals(countryCode, that.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, zip, recipient, firstName, lastName, phone, zoneCode, countryCode);
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
     * The second line of the address. Typically the number of the apartment, suite, or unit.
     */
    private String address2;

    /**
     * The name of the city, district, village, or town.
     */
    private String city;

    /**
     * The zip or postal code of the address.
     */
    private String zip;

    /**
     * The identity of the recipient e.g. 'Receiving Department'.
     */
    private String recipient;

    /**
     * The first name of the recipient.
     */
    private String firstName;

    /**
     * The last name of the recipient.
     */
    private String lastName;

    /**
     * A phone number for the recipient. Formatted using E.164 standard. For example, _+16135551111_.
     */
    private String phone;

    /**
     * The alphanumeric code for the region of the address, such as the province,
     * state, or district. For example, `ON` for Ontario, Canada.
     */
    private String zoneCode;

    /**
     * The two-letter code ([ISO 3166-1
     * alpha-2]](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format) for the
     * country of the address. For example, `US`` for the United States.
     */
    private CountryCode countryCode;

    public CompanyAddressInput build() {
      CompanyAddressInput result = new CompanyAddressInput();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.zip = this.zip;
      result.recipient = this.recipient;
      result.firstName = this.firstName;
      result.lastName = this.lastName;
      result.phone = this.phone;
      result.zoneCode = this.zoneCode;
      result.countryCode = this.countryCode;
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
     * The second line of the address. Typically the number of the apartment, suite, or unit.
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
     * The zip or postal code of the address.
     */
    public Builder zip(String zip) {
      this.zip = zip;
      return this;
    }

    /**
     * The identity of the recipient e.g. 'Receiving Department'.
     */
    public Builder recipient(String recipient) {
      this.recipient = recipient;
      return this;
    }

    /**
     * The first name of the recipient.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * The last name of the recipient.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * A phone number for the recipient. Formatted using E.164 standard. For example, _+16135551111_.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The alphanumeric code for the region of the address, such as the province,
     * state, or district. For example, `ON` for Ontario, Canada.
     */
    public Builder zoneCode(String zoneCode) {
      this.zoneCode = zoneCode;
      return this;
    }

    /**
     * The two-letter code ([ISO 3166-1
     * alpha-2]](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format) for the
     * country of the address. For example, `US`` for the United States.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }
  }
}

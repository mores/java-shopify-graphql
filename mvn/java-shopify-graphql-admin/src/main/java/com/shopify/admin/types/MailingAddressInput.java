package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to create or update a mailing address.
 */
public class MailingAddressInput {
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
   * The name of the customer's company or organization.
   */
  private String company;

  /**
   * The two-letter code for the country of the address.
   */
  private CountryCode countryCode;

  /**
   * The first name of the customer.
   */
  private String firstName;

  /**
   * The last name of the customer.
   */
  private String lastName;

  /**
   * A unique phone number for the customer.
   *   
   * Formatted using E.164 standard. For example, _+16135551111_.
   */
  private String phone;

  /**
   * The code for the region of the address, such as the province, state, or district.
   * For example QC for Quebec, Canada.
   */
  private String provinceCode;

  /**
   * The zip or postal code of the address.
   */
  private String zip;

  public MailingAddressInput() {
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
   * The name of the customer's company or organization.
   */
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  /**
   * The two-letter code for the country of the address.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The first name of the customer.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The last name of the customer.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * A unique phone number for the customer.
   *   
   * Formatted using E.164 standard. For example, _+16135551111_.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The code for the region of the address, such as the province, state, or district.
   * For example QC for Quebec, Canada.
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
    return "MailingAddressInput{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', company='" + company + "', countryCode='" + countryCode + "', firstName='" + firstName + "', lastName='" + lastName + "', phone='" + phone + "', provinceCode='" + provinceCode + "', zip='" + zip + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MailingAddressInput that = (MailingAddressInput) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(company, that.company) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(provinceCode, that.provinceCode) &&
        Objects.equals(zip, that.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, company, countryCode, firstName, lastName, phone, provinceCode, zip);
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
     * The name of the customer's company or organization.
     */
    private String company;

    /**
     * The two-letter code for the country of the address.
     */
    private CountryCode countryCode;

    /**
     * The first name of the customer.
     */
    private String firstName;

    /**
     * The last name of the customer.
     */
    private String lastName;

    /**
     * A unique phone number for the customer.
     *   
     * Formatted using E.164 standard. For example, _+16135551111_.
     */
    private String phone;

    /**
     * The code for the region of the address, such as the province, state, or district.
     * For example QC for Quebec, Canada.
     */
    private String provinceCode;

    /**
     * The zip or postal code of the address.
     */
    private String zip;

    public MailingAddressInput build() {
      MailingAddressInput result = new MailingAddressInput();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.company = this.company;
      result.countryCode = this.countryCode;
      result.firstName = this.firstName;
      result.lastName = this.lastName;
      result.phone = this.phone;
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
     * The name of the customer's company or organization.
     */
    public Builder company(String company) {
      this.company = company;
      return this;
    }

    /**
     * The two-letter code for the country of the address.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The first name of the customer.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * The last name of the customer.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * A unique phone number for the customer.
     *   
     * Formatted using E.164 standard. For example, _+16135551111_.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The code for the region of the address, such as the province, state, or district.
     * For example QC for Quebec, Canada.
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

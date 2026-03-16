package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a contact field for a Shop Pay payment request.
 */
public class ShopPayPaymentRequestContactField {
  /**
   * The first address line of the contact field.
   */
  private String address1;

  /**
   * The second address line of the contact field.
   */
  private String address2;

  /**
   * The city of the contact field.
   */
  private String city;

  /**
   * The company name of the contact field.
   */
  private String companyName;

  /**
   * The country of the contact field.
   */
  private String countryCode;

  /**
   * The email of the contact field.
   */
  private String email;

  /**
   * The first name of the contact field.
   */
  private String firstName;

  /**
   * The last name of the contact field.
   */
  private String lastName;

  /**
   * The phone number of the contact field.
   */
  private String phone;

  /**
   * The postal code of the contact field.
   */
  private String postalCode;

  /**
   * The province of the contact field.
   */
  private String provinceCode;

  public ShopPayPaymentRequestContactField() {
  }

  /**
   * The first address line of the contact field.
   */
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  /**
   * The second address line of the contact field.
   */
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  /**
   * The city of the contact field.
   */
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  /**
   * The company name of the contact field.
   */
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  /**
   * The country of the contact field.
   */
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The email of the contact field.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The first name of the contact field.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The last name of the contact field.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The phone number of the contact field.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The postal code of the contact field.
   */
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * The province of the contact field.
   */
  public String getProvinceCode() {
    return provinceCode;
  }

  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestContactField{address1='" + address1 + "', address2='" + address2 + "', city='" + city + "', companyName='" + companyName + "', countryCode='" + countryCode + "', email='" + email + "', firstName='" + firstName + "', lastName='" + lastName + "', phone='" + phone + "', postalCode='" + postalCode + "', provinceCode='" + provinceCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestContactField that = (ShopPayPaymentRequestContactField) o;
    return Objects.equals(address1, that.address1) &&
        Objects.equals(address2, that.address2) &&
        Objects.equals(city, that.city) &&
        Objects.equals(companyName, that.companyName) &&
        Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(email, that.email) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(postalCode, that.postalCode) &&
        Objects.equals(provinceCode, that.provinceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, companyName, countryCode, email, firstName, lastName, phone, postalCode, provinceCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The first address line of the contact field.
     */
    private String address1;

    /**
     * The second address line of the contact field.
     */
    private String address2;

    /**
     * The city of the contact field.
     */
    private String city;

    /**
     * The company name of the contact field.
     */
    private String companyName;

    /**
     * The country of the contact field.
     */
    private String countryCode;

    /**
     * The email of the contact field.
     */
    private String email;

    /**
     * The first name of the contact field.
     */
    private String firstName;

    /**
     * The last name of the contact field.
     */
    private String lastName;

    /**
     * The phone number of the contact field.
     */
    private String phone;

    /**
     * The postal code of the contact field.
     */
    private String postalCode;

    /**
     * The province of the contact field.
     */
    private String provinceCode;

    public ShopPayPaymentRequestContactField build() {
      ShopPayPaymentRequestContactField result = new ShopPayPaymentRequestContactField();
      result.address1 = this.address1;
      result.address2 = this.address2;
      result.city = this.city;
      result.companyName = this.companyName;
      result.countryCode = this.countryCode;
      result.email = this.email;
      result.firstName = this.firstName;
      result.lastName = this.lastName;
      result.phone = this.phone;
      result.postalCode = this.postalCode;
      result.provinceCode = this.provinceCode;
      return result;
    }

    /**
     * The first address line of the contact field.
     */
    public Builder address1(String address1) {
      this.address1 = address1;
      return this;
    }

    /**
     * The second address line of the contact field.
     */
    public Builder address2(String address2) {
      this.address2 = address2;
      return this;
    }

    /**
     * The city of the contact field.
     */
    public Builder city(String city) {
      this.city = city;
      return this;
    }

    /**
     * The company name of the contact field.
     */
    public Builder companyName(String companyName) {
      this.companyName = companyName;
      return this;
    }

    /**
     * The country of the contact field.
     */
    public Builder countryCode(String countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The email of the contact field.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The first name of the contact field.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * The last name of the contact field.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * The phone number of the contact field.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The postal code of the contact field.
     */
    public Builder postalCode(String postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    /**
     * The province of the contact field.
     */
    public Builder provinceCode(String provinceCode) {
      this.provinceCode = provinceCode;
      return this;
    }
  }
}

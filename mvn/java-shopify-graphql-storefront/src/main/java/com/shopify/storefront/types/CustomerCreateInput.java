package com.shopify.storefront.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to create a new customer.
 */
public class CustomerCreateInput {
  /**
   * The customer’s first name.
   */
  private String firstName;

  /**
   * The customer’s last name.
   */
  private String lastName;

  /**
   * The customer’s email.
   */
  private String email;

  /**
   * A unique phone number for the customer.
   *   
   * Formatted using E.164 standard. For example, _+16135551111_.
   */
  private String phone;

  /**
   * The login password used by the customer.
   */
  private String password;

  /**
   * Indicates whether the customer has consented to be sent marketing material via email.
   */
  private Boolean acceptsMarketing;

  public CustomerCreateInput() {
  }

  /**
   * The customer’s first name.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The customer’s last name.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The customer’s email.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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
   * The login password used by the customer.
   */
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Indicates whether the customer has consented to be sent marketing material via email.
   */
  public Boolean getAcceptsMarketing() {
    return acceptsMarketing;
  }

  public void setAcceptsMarketing(Boolean acceptsMarketing) {
    this.acceptsMarketing = acceptsMarketing;
  }

  @Override
  public String toString() {
    return "CustomerCreateInput{firstName='" + firstName + "', lastName='" + lastName + "', email='" + email + "', phone='" + phone + "', password='" + password + "', acceptsMarketing='" + acceptsMarketing + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerCreateInput that = (CustomerCreateInput) o;
    return Objects.equals(firstName, that.firstName) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(email, that.email) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(password, that.password) &&
        Objects.equals(acceptsMarketing, that.acceptsMarketing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, phone, password, acceptsMarketing);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customer’s first name.
     */
    private String firstName;

    /**
     * The customer’s last name.
     */
    private String lastName;

    /**
     * The customer’s email.
     */
    private String email;

    /**
     * A unique phone number for the customer.
     *   
     * Formatted using E.164 standard. For example, _+16135551111_.
     */
    private String phone;

    /**
     * The login password used by the customer.
     */
    private String password;

    /**
     * Indicates whether the customer has consented to be sent marketing material via email.
     */
    private Boolean acceptsMarketing;

    public CustomerCreateInput build() {
      CustomerCreateInput result = new CustomerCreateInput();
      result.firstName = this.firstName;
      result.lastName = this.lastName;
      result.email = this.email;
      result.phone = this.phone;
      result.password = this.password;
      result.acceptsMarketing = this.acceptsMarketing;
      return result;
    }

    /**
     * The customer’s first name.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * The customer’s last name.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * The customer’s email.
     */
    public Builder email(String email) {
      this.email = email;
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
     * The login password used by the customer.
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * Indicates whether the customer has consented to be sent marketing material via email.
     */
    public Builder acceptsMarketing(Boolean acceptsMarketing) {
      this.acceptsMarketing = acceptsMarketing;
      return this;
    }
  }
}

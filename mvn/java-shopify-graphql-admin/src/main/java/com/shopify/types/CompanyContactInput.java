package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for company contact attributes when creating or updating a company contact.
 */
public class CompanyContactInput {
  /**
   * The company contact's first name.
   */
  private String firstName;

  /**
   * The company contact's last name.
   */
  private String lastName;

  /**
   * The unique email address of the company contact.
   */
  private String email;

  /**
   * The title of the company contact.
   */
  private String title;

  /**
   * The contact's locale.
   */
  private String locale;

  /**
   * The phone number of the company contact.
   */
  private String phone;

  public CompanyContactInput() {
  }

  /**
   * The company contact's first name.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * The company contact's last name.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The unique email address of the company contact.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The title of the company contact.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The contact's locale.
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * The phone number of the company contact.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "CompanyContactInput{firstName='" + firstName + "', lastName='" + lastName + "', email='" + email + "', title='" + title + "', locale='" + locale + "', phone='" + phone + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyContactInput that = (CompanyContactInput) o;
    return Objects.equals(firstName, that.firstName) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(email, that.email) &&
        Objects.equals(title, that.title) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(phone, that.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, title, locale, phone);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The company contact's first name.
     */
    private String firstName;

    /**
     * The company contact's last name.
     */
    private String lastName;

    /**
     * The unique email address of the company contact.
     */
    private String email;

    /**
     * The title of the company contact.
     */
    private String title;

    /**
     * The contact's locale.
     */
    private String locale;

    /**
     * The phone number of the company contact.
     */
    private String phone;

    public CompanyContactInput build() {
      CompanyContactInput result = new CompanyContactInput();
      result.firstName = this.firstName;
      result.lastName = this.lastName;
      result.email = this.email;
      result.title = this.title;
      result.locale = this.locale;
      result.phone = this.phone;
      return result;
    }

    /**
     * The company contact's first name.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * The company contact's last name.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * The unique email address of the company contact.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The title of the company contact.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The contact's locale.
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * The phone number of the company contact.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the shop owner information for financial KYC purposes.
 */
public class FinancialKycShopOwner {
  /**
   * The email of the shop owner.
   */
  private String email;

  /**
   * The first name of the shop owner.
   */
  private String firstName;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The last name of the shop owner.
   */
  private String lastName;

  /**
   * The phone number of the shop owner.
   */
  private String phone;

  public FinancialKycShopOwner() {
  }

  /**
   * The email of the shop owner.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The first name of the shop owner.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The last name of the shop owner.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The phone number of the shop owner.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public String toString() {
    return "FinancialKycShopOwner{email='" + email + "', firstName='" + firstName + "', id='" + id + "', lastName='" + lastName + "', phone='" + phone + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FinancialKycShopOwner that = (FinancialKycShopOwner) o;
    return Objects.equals(email, that.email) &&
        Objects.equals(firstName, that.firstName) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(phone, that.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, id, lastName, phone);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The email of the shop owner.
     */
    private String email;

    /**
     * The first name of the shop owner.
     */
    private String firstName;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The last name of the shop owner.
     */
    private String lastName;

    /**
     * The phone number of the shop owner.
     */
    private String phone;

    public FinancialKycShopOwner build() {
      FinancialKycShopOwner result = new FinancialKycShopOwner();
      result.email = this.email;
      result.firstName = this.firstName;
      result.id = this.id;
      result.lastName = this.lastName;
      result.phone = this.phone;
      return result;
    }

    /**
     * The email of the shop owner.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The first name of the shop owner.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The last name of the shop owner.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * The phone number of the shop owner.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }
  }
}

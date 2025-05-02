package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create a customer access token.
 */
public class CustomerAccessTokenCreateInput {
  /**
   * The email associated to the customer.
   */
  private String email;

  /**
   * The login password to be used by the customer.
   */
  private String password;

  public CustomerAccessTokenCreateInput() {
  }

  /**
   * The email associated to the customer.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The login password to be used by the customer.
   */
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "CustomerAccessTokenCreateInput{email='" + email + "', password='" + password + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerAccessTokenCreateInput that = (CustomerAccessTokenCreateInput) o;
    return Objects.equals(email, that.email) &&
        Objects.equals(password, that.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The email associated to the customer.
     */
    private String email;

    /**
     * The login password to be used by the customer.
     */
    private String password;

    public CustomerAccessTokenCreateInput build() {
      CustomerAccessTokenCreateInput result = new CustomerAccessTokenCreateInput();
      result.email = this.email;
      result.password = this.password;
      return result;
    }

    /**
     * The email associated to the customer.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The login password to be used by the customer.
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }
  }
}

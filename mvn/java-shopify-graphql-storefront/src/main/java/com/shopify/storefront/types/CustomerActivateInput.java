package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to activate a customer.
 */
public class CustomerActivateInput {
  /**
   * The activation token required to activate the customer.
   */
  private String activationToken;

  /**
   * New password that will be set during activation.
   */
  private String password;

  public CustomerActivateInput() {
  }

  /**
   * The activation token required to activate the customer.
   */
  public String getActivationToken() {
    return activationToken;
  }

  public void setActivationToken(String activationToken) {
    this.activationToken = activationToken;
  }

  /**
   * New password that will be set during activation.
   */
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "CustomerActivateInput{activationToken='" + activationToken + "', password='" + password + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerActivateInput that = (CustomerActivateInput) o;
    return Objects.equals(activationToken, that.activationToken) &&
        Objects.equals(password, that.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationToken, password);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The activation token required to activate the customer.
     */
    private String activationToken;

    /**
     * New password that will be set during activation.
     */
    private String password;

    public CustomerActivateInput build() {
      CustomerActivateInput result = new CustomerActivateInput();
      result.activationToken = this.activationToken;
      result.password = this.password;
      return result;
    }

    /**
     * The activation token required to activate the customer.
     */
    public Builder activationToken(String activationToken) {
      this.activationToken = activationToken;
      return this;
    }

    /**
     * New password that will be set during activation.
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }
  }
}

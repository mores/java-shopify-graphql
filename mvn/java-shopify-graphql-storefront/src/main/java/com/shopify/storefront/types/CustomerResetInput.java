package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to reset a customer's password.
 */
public class CustomerResetInput {
  /**
   * The reset token required to reset the customer’s password.
   */
  private String resetToken;

  /**
   * New password that will be set as part of the reset password process.
   */
  private String password;

  public CustomerResetInput() {
  }

  /**
   * The reset token required to reset the customer’s password.
   */
  public String getResetToken() {
    return resetToken;
  }

  public void setResetToken(String resetToken) {
    this.resetToken = resetToken;
  }

  /**
   * New password that will be set as part of the reset password process.
   */
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "CustomerResetInput{resetToken='" + resetToken + "', password='" + password + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerResetInput that = (CustomerResetInput) o;
    return Objects.equals(resetToken, that.resetToken) &&
        Objects.equals(password, that.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resetToken, password);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The reset token required to reset the customer’s password.
     */
    private String resetToken;

    /**
     * New password that will be set as part of the reset password process.
     */
    private String password;

    public CustomerResetInput build() {
      CustomerResetInput result = new CustomerResetInput();
      result.resetToken = this.resetToken;
      result.password = this.password;
      return result;
    }

    /**
     * The reset token required to reset the customer’s password.
     */
    public Builder resetToken(String resetToken) {
      this.resetToken = resetToken;
      return this;
    }

    /**
     * New password that will be set as part of the reset password process.
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }
  }
}

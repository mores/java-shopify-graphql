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
   * New password that will be set as part of the reset password process.
   */
  private String password;

  /**
   * The reset token required to reset the customer’s password.
   */
  private String resetToken;

  public CustomerResetInput() {
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

  /**
   * The reset token required to reset the customer’s password.
   */
  public String getResetToken() {
    return resetToken;
  }

  public void setResetToken(String resetToken) {
    this.resetToken = resetToken;
  }

  @Override
  public String toString() {
    return "CustomerResetInput{password='" + password + "', resetToken='" + resetToken + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerResetInput that = (CustomerResetInput) o;
    return Objects.equals(password, that.password) &&
        Objects.equals(resetToken, that.resetToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, resetToken);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * New password that will be set as part of the reset password process.
     */
    private String password;

    /**
     * The reset token required to reset the customer’s password.
     */
    private String resetToken;

    public CustomerResetInput build() {
      CustomerResetInput result = new CustomerResetInput();
      result.password = this.password;
      result.resetToken = this.resetToken;
      return result;
    }

    /**
     * New password that will be set as part of the reset password process.
     */
    public Builder password(String password) {
      this.password = password;
      return this;
    }

    /**
     * The reset token required to reset the customer’s password.
     */
    public Builder resetToken(String resetToken) {
      this.resetToken = resetToken;
      return this;
    }
  }
}

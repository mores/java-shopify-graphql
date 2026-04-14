package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An error that occurs during the execution of a mutation for managing checkout and accounts configurations.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CheckoutAndAccountsConfigurationUserError implements com.shopify.admin.types.DisplayableError {
  /**
   * The error code.
   */
  private CheckoutAndAccountsConfigurationUserErrorCode code;

  /**
   * The path to the input field that caused the error.
   */
  private List<String> field;

  /**
   * The error message.
   */
  private String message;

  /**
   * The reason for the error.
   */
  private String reason;

  public CheckoutAndAccountsConfigurationUserError() {
  }

  /**
   * The error code.
   */
  public CheckoutAndAccountsConfigurationUserErrorCode getCode() {
    return code;
  }

  public void setCode(CheckoutAndAccountsConfigurationUserErrorCode code) {
    this.code = code;
  }

  /**
   * The path to the input field that caused the error.
   */
  public List<String> getField() {
    return field;
  }

  public void setField(List<String> field) {
    this.field = field;
  }

  /**
   * The error message.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The reason for the error.
   */
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationUserError{code='" + code + "', field='" + field + "', message='" + message + "', reason='" + reason + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationUserError that = (CheckoutAndAccountsConfigurationUserError) o;
    return Objects.equals(code, that.code) &&
        Objects.equals(field, that.field) &&
        Objects.equals(message, that.message) &&
        Objects.equals(reason, that.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, field, message, reason);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The error code.
     */
    private CheckoutAndAccountsConfigurationUserErrorCode code;

    /**
     * The path to the input field that caused the error.
     */
    private List<String> field;

    /**
     * The error message.
     */
    private String message;

    /**
     * The reason for the error.
     */
    private String reason;

    public CheckoutAndAccountsConfigurationUserError build() {
      CheckoutAndAccountsConfigurationUserError result = new CheckoutAndAccountsConfigurationUserError();
      result.code = this.code;
      result.field = this.field;
      result.message = this.message;
      result.reason = this.reason;
      return result;
    }

    /**
     * The error code.
     */
    public Builder code(CheckoutAndAccountsConfigurationUserErrorCode code) {
      this.code = code;
      return this;
    }

    /**
     * The path to the input field that caused the error.
     */
    public Builder field(List<String> field) {
      this.field = field;
      return this;
    }

    /**
     * The error message.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * The reason for the error.
     */
    public Builder reason(String reason) {
      this.reason = reason;
      return this;
    }
  }
}

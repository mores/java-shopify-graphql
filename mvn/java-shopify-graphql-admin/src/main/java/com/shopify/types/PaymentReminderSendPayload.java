package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `paymentReminderSend` mutation.
 */
public class PaymentReminderSendPayload {
  /**
   * Whether the payment reminder email was successfully sent.
   */
  private Boolean success;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PaymentReminderSendUserError> userErrors;

  public PaymentReminderSendPayload() {
  }

  /**
   * Whether the payment reminder email was successfully sent.
   */
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<PaymentReminderSendUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PaymentReminderSendUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PaymentReminderSendPayload{success='" + success + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentReminderSendPayload that = (PaymentReminderSendPayload) o;
    return Objects.equals(success, that.success) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the payment reminder email was successfully sent.
     */
    private Boolean success;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PaymentReminderSendUserError> userErrors;

    public PaymentReminderSendPayload build() {
      PaymentReminderSendPayload result = new PaymentReminderSendPayload();
      result.success = this.success;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * Whether the payment reminder email was successfully sent.
     */
    public Builder success(Boolean success) {
      this.success = success;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PaymentReminderSendUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

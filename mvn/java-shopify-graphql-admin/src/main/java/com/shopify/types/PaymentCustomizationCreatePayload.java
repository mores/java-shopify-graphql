package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `paymentCustomizationCreate` mutation.
 */
public class PaymentCustomizationCreatePayload {
  /**
   * Returns the created payment customization.
   */
  private PaymentCustomization paymentCustomization;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PaymentCustomizationError> userErrors;

  public PaymentCustomizationCreatePayload() {
  }

  /**
   * Returns the created payment customization.
   */
  public PaymentCustomization getPaymentCustomization() {
    return paymentCustomization;
  }

  public void setPaymentCustomization(PaymentCustomization paymentCustomization) {
    this.paymentCustomization = paymentCustomization;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<PaymentCustomizationError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PaymentCustomizationError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PaymentCustomizationCreatePayload{paymentCustomization='" + paymentCustomization + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentCustomizationCreatePayload that = (PaymentCustomizationCreatePayload) o;
    return Objects.equals(paymentCustomization, that.paymentCustomization) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentCustomization, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Returns the created payment customization.
     */
    private PaymentCustomization paymentCustomization;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PaymentCustomizationError> userErrors;

    public PaymentCustomizationCreatePayload build() {
      PaymentCustomizationCreatePayload result = new PaymentCustomizationCreatePayload();
      result.paymentCustomization = this.paymentCustomization;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * Returns the created payment customization.
     */
    public Builder paymentCustomization(PaymentCustomization paymentCustomization) {
      this.paymentCustomization = paymentCustomization;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PaymentCustomizationError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

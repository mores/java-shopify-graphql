package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerPaymentMethodCreditCardCreate` mutation.
 */
public class CustomerPaymentMethodCreditCardCreatePayload {
  /**
   * The customer payment method.
   */
  private CustomerPaymentMethod customerPaymentMethod;

  /**
   * If the card verification result is processing. When this is true, customer_payment_method will be null.
   */
  private Boolean processing;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CustomerPaymentMethodCreditCardCreatePayload() {
  }

  /**
   * The customer payment method.
   */
  public CustomerPaymentMethod getCustomerPaymentMethod() {
    return customerPaymentMethod;
  }

  public void setCustomerPaymentMethod(CustomerPaymentMethod customerPaymentMethod) {
    this.customerPaymentMethod = customerPaymentMethod;
  }

  /**
   * If the card verification result is processing. When this is true, customer_payment_method will be null.
   */
  public Boolean getProcessing() {
    return processing;
  }

  public void setProcessing(Boolean processing) {
    this.processing = processing;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerPaymentMethodCreditCardCreatePayload{customerPaymentMethod='" + customerPaymentMethod + "', processing='" + processing + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaymentMethodCreditCardCreatePayload that = (CustomerPaymentMethodCreditCardCreatePayload) o;
    return Objects.equals(customerPaymentMethod, that.customerPaymentMethod) &&
        Objects.equals(processing, that.processing) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerPaymentMethod, processing, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customer payment method.
     */
    private CustomerPaymentMethod customerPaymentMethod;

    /**
     * If the card verification result is processing. When this is true, customer_payment_method will be null.
     */
    private Boolean processing;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CustomerPaymentMethodCreditCardCreatePayload build() {
      CustomerPaymentMethodCreditCardCreatePayload result = new CustomerPaymentMethodCreditCardCreatePayload();
      result.customerPaymentMethod = this.customerPaymentMethod;
      result.processing = this.processing;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The customer payment method.
     */
    public Builder customerPaymentMethod(CustomerPaymentMethod customerPaymentMethod) {
      this.customerPaymentMethod = customerPaymentMethod;
      return this;
    }

    /**
     * If the card verification result is processing. When this is true, customer_payment_method will be null.
     */
    public Builder processing(Boolean processing) {
      this.processing = processing;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

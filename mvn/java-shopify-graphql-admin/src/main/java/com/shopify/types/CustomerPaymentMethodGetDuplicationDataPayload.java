package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `customerPaymentMethodGetDuplicationData` mutation.
 */
public class CustomerPaymentMethodGetDuplicationDataPayload {
  /**
   * The encrypted data from the payment method to be duplicated.
   */
  private String encryptedDuplicationData;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CustomerPaymentMethodGetDuplicationDataUserError> userErrors;

  public CustomerPaymentMethodGetDuplicationDataPayload() {
  }

  /**
   * The encrypted data from the payment method to be duplicated.
   */
  public String getEncryptedDuplicationData() {
    return encryptedDuplicationData;
  }

  public void setEncryptedDuplicationData(String encryptedDuplicationData) {
    this.encryptedDuplicationData = encryptedDuplicationData;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CustomerPaymentMethodGetDuplicationDataUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CustomerPaymentMethodGetDuplicationDataUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CustomerPaymentMethodGetDuplicationDataPayload{encryptedDuplicationData='" + encryptedDuplicationData + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerPaymentMethodGetDuplicationDataPayload that = (CustomerPaymentMethodGetDuplicationDataPayload) o;
    return Objects.equals(encryptedDuplicationData, that.encryptedDuplicationData) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptedDuplicationData, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The encrypted data from the payment method to be duplicated.
     */
    private String encryptedDuplicationData;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CustomerPaymentMethodGetDuplicationDataUserError> userErrors;

    public CustomerPaymentMethodGetDuplicationDataPayload build() {
      CustomerPaymentMethodGetDuplicationDataPayload result = new CustomerPaymentMethodGetDuplicationDataPayload();
      result.encryptedDuplicationData = this.encryptedDuplicationData;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The encrypted data from the payment method to be duplicated.
     */
    public Builder encryptedDuplicationData(String encryptedDuplicationData) {
      this.encryptedDuplicationData = encryptedDuplicationData;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CustomerPaymentMethodGetDuplicationDataUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

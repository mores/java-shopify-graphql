package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `paymentCustomizationActivation` mutation.
 */
public class PaymentCustomizationActivationPayload {
  /**
   * The IDs of the updated payment customizations.
   */
  private List<String> ids;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PaymentCustomizationError> userErrors;

  public PaymentCustomizationActivationPayload() {
  }

  /**
   * The IDs of the updated payment customizations.
   */
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
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
    return "PaymentCustomizationActivationPayload{ids='" + ids + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentCustomizationActivationPayload that = (PaymentCustomizationActivationPayload) o;
    return Objects.equals(ids, that.ids) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The IDs of the updated payment customizations.
     */
    private List<String> ids;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PaymentCustomizationError> userErrors;

    public PaymentCustomizationActivationPayload build() {
      PaymentCustomizationActivationPayload result = new PaymentCustomizationActivationPayload();
      result.ids = this.ids;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The IDs of the updated payment customizations.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
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

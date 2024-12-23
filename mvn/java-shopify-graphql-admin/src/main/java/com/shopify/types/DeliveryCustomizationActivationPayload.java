package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `deliveryCustomizationActivation` mutation.
 */
public class DeliveryCustomizationActivationPayload {
  /**
   * The IDs of the updated delivery customizations.
   */
  private List<String> ids;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<DeliveryCustomizationError> userErrors;

  public DeliveryCustomizationActivationPayload() {
  }

  /**
   * The IDs of the updated delivery customizations.
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
  public List<DeliveryCustomizationError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DeliveryCustomizationError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DeliveryCustomizationActivationPayload{ids='" + ids + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCustomizationActivationPayload that = (DeliveryCustomizationActivationPayload) o;
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
     * The IDs of the updated delivery customizations.
     */
    private List<String> ids;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<DeliveryCustomizationError> userErrors;

    public DeliveryCustomizationActivationPayload build() {
      DeliveryCustomizationActivationPayload result = new DeliveryCustomizationActivationPayload();
      result.ids = this.ids;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The IDs of the updated delivery customizations.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<DeliveryCustomizationError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

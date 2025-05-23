package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `deliveryCustomizationUpdate` mutation.
 */
public class DeliveryCustomizationUpdatePayload {
  /**
   * Returns the updated delivery customization.
   */
  private DeliveryCustomization deliveryCustomization;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<DeliveryCustomizationError> userErrors;

  public DeliveryCustomizationUpdatePayload() {
  }

  /**
   * Returns the updated delivery customization.
   */
  public DeliveryCustomization getDeliveryCustomization() {
    return deliveryCustomization;
  }

  public void setDeliveryCustomization(DeliveryCustomization deliveryCustomization) {
    this.deliveryCustomization = deliveryCustomization;
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
    return "DeliveryCustomizationUpdatePayload{deliveryCustomization='" + deliveryCustomization + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCustomizationUpdatePayload that = (DeliveryCustomizationUpdatePayload) o;
    return Objects.equals(deliveryCustomization, that.deliveryCustomization) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryCustomization, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Returns the updated delivery customization.
     */
    private DeliveryCustomization deliveryCustomization;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<DeliveryCustomizationError> userErrors;

    public DeliveryCustomizationUpdatePayload build() {
      DeliveryCustomizationUpdatePayload result = new DeliveryCustomizationUpdatePayload();
      result.deliveryCustomization = this.deliveryCustomization;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * Returns the updated delivery customization.
     */
    public Builder deliveryCustomization(DeliveryCustomization deliveryCustomization) {
      this.deliveryCustomization = deliveryCustomization;
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

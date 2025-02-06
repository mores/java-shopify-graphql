package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `deliveryPromiseProviderUpsert` mutation.
 */
public class DeliveryPromiseProviderUpsertPayload {
  /**
   * The created or updated delivery promise provider.
   */
  private DeliveryPromiseProvider deliveryPromiseProvider;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<DeliveryPromiseProviderUpsertUserError> userErrors;

  public DeliveryPromiseProviderUpsertPayload() {
  }

  /**
   * The created or updated delivery promise provider.
   */
  public DeliveryPromiseProvider getDeliveryPromiseProvider() {
    return deliveryPromiseProvider;
  }

  public void setDeliveryPromiseProvider(DeliveryPromiseProvider deliveryPromiseProvider) {
    this.deliveryPromiseProvider = deliveryPromiseProvider;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<DeliveryPromiseProviderUpsertUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DeliveryPromiseProviderUpsertUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DeliveryPromiseProviderUpsertPayload{deliveryPromiseProvider='" + deliveryPromiseProvider + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryPromiseProviderUpsertPayload that = (DeliveryPromiseProviderUpsertPayload) o;
    return Objects.equals(deliveryPromiseProvider, that.deliveryPromiseProvider) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryPromiseProvider, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The created or updated delivery promise provider.
     */
    private DeliveryPromiseProvider deliveryPromiseProvider;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<DeliveryPromiseProviderUpsertUserError> userErrors;

    public DeliveryPromiseProviderUpsertPayload build() {
      DeliveryPromiseProviderUpsertPayload result = new DeliveryPromiseProviderUpsertPayload();
      result.deliveryPromiseProvider = this.deliveryPromiseProvider;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created or updated delivery promise provider.
     */
    public Builder deliveryPromiseProvider(DeliveryPromiseProvider deliveryPromiseProvider) {
      this.deliveryPromiseProvider = deliveryPromiseProvider;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<DeliveryPromiseProviderUpsertUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

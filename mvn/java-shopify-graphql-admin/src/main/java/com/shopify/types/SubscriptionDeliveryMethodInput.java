package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Specifies delivery method fields for a subscription draft.
 * This is an input union: one, and only one, field can be provided.
 * The field provided will determine which delivery method is to be used.
 */
public class SubscriptionDeliveryMethodInput {
  /**
   * The input fields for the shipping delivery method.
   */
  private SubscriptionDeliveryMethodShippingInput shipping;

  /**
   * The input fields for the local delivery method.
   */
  private SubscriptionDeliveryMethodLocalDeliveryInput localDelivery;

  /**
   * The input fields for the pickup delivery method.
   */
  private SubscriptionDeliveryMethodPickupInput pickup;

  public SubscriptionDeliveryMethodInput() {
  }

  /**
   * The input fields for the shipping delivery method.
   */
  public SubscriptionDeliveryMethodShippingInput getShipping() {
    return shipping;
  }

  public void setShipping(SubscriptionDeliveryMethodShippingInput shipping) {
    this.shipping = shipping;
  }

  /**
   * The input fields for the local delivery method.
   */
  public SubscriptionDeliveryMethodLocalDeliveryInput getLocalDelivery() {
    return localDelivery;
  }

  public void setLocalDelivery(SubscriptionDeliveryMethodLocalDeliveryInput localDelivery) {
    this.localDelivery = localDelivery;
  }

  /**
   * The input fields for the pickup delivery method.
   */
  public SubscriptionDeliveryMethodPickupInput getPickup() {
    return pickup;
  }

  public void setPickup(SubscriptionDeliveryMethodPickupInput pickup) {
    this.pickup = pickup;
  }

  @Override
  public String toString() {
    return "SubscriptionDeliveryMethodInput{shipping='" + shipping + "', localDelivery='" + localDelivery + "', pickup='" + pickup + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDeliveryMethodInput that = (SubscriptionDeliveryMethodInput) o;
    return Objects.equals(shipping, that.shipping) &&
        Objects.equals(localDelivery, that.localDelivery) &&
        Objects.equals(pickup, that.pickup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipping, localDelivery, pickup);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The input fields for the shipping delivery method.
     */
    private SubscriptionDeliveryMethodShippingInput shipping;

    /**
     * The input fields for the local delivery method.
     */
    private SubscriptionDeliveryMethodLocalDeliveryInput localDelivery;

    /**
     * The input fields for the pickup delivery method.
     */
    private SubscriptionDeliveryMethodPickupInput pickup;

    public SubscriptionDeliveryMethodInput build() {
      SubscriptionDeliveryMethodInput result = new SubscriptionDeliveryMethodInput();
      result.shipping = this.shipping;
      result.localDelivery = this.localDelivery;
      result.pickup = this.pickup;
      return result;
    }

    /**
     * The input fields for the shipping delivery method.
     */
    public Builder shipping(SubscriptionDeliveryMethodShippingInput shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * The input fields for the local delivery method.
     */
    public Builder localDelivery(SubscriptionDeliveryMethodLocalDeliveryInput localDelivery) {
      this.localDelivery = localDelivery;
      return this;
    }

    /**
     * The input fields for the pickup delivery method.
     */
    public Builder pickup(SubscriptionDeliveryMethodPickupInput pickup) {
      this.pickup = pickup;
      return this;
    }
  }
}

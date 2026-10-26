package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for delivery used during a contract calculation.
 * This is a oneOf input: one, and only one, field can be provided.
 *
 * Provide `shipping`, `localDelivery`, or `pickup` to set the committed delivery method.
 * Provide `none` to explicitly set no delivery method (digital-only subscriptions).
 * Provide `fetchAvailableDeliveryOptions` to discover the available delivery options for an
 * address without changing the contract's committed delivery method. The resulting calculation
 * can't be committed. Create a new calculation with the chosen delivery method, then commit it.
 */
public class SubscriptionContractCalculationDeliveryMethodInput {
  /**
   * The input fields for the shipping delivery method.
   */
  private SubscriptionContractCalculationDeliveryMethodShippingInput shipping;

  /**
   * The input fields for the local delivery method.
   */
  private SubscriptionContractCalculationDeliveryMethodLocalDeliveryInput localDelivery;

  /**
   * The input fields for the pickup delivery method.
   */
  private SubscriptionContractCalculationDeliveryMethodPickupInput pickup;

  /**
   * Explicitly set no delivery method (digital-only subscriptions). Must be `true`.
   */
  private Boolean none;

  /**
   * Discover the available delivery options for an address without changing the
   * contract's committed delivery method. The resulting calculation can't be
   * committed. Create a new calculation with the chosen delivery method, then
   * commit it. Mutually exclusive with setting a delivery method.
   */
  private SubscriptionContractCalculationFetchDeliveryOptionsInput fetchAvailableDeliveryOptions;

  public SubscriptionContractCalculationDeliveryMethodInput() {
  }

  /**
   * The input fields for the shipping delivery method.
   */
  public SubscriptionContractCalculationDeliveryMethodShippingInput getShipping() {
    return shipping;
  }

  public void setShipping(SubscriptionContractCalculationDeliveryMethodShippingInput shipping) {
    this.shipping = shipping;
  }

  /**
   * The input fields for the local delivery method.
   */
  public SubscriptionContractCalculationDeliveryMethodLocalDeliveryInput getLocalDelivery() {
    return localDelivery;
  }

  public void setLocalDelivery(
      SubscriptionContractCalculationDeliveryMethodLocalDeliveryInput localDelivery) {
    this.localDelivery = localDelivery;
  }

  /**
   * The input fields for the pickup delivery method.
   */
  public SubscriptionContractCalculationDeliveryMethodPickupInput getPickup() {
    return pickup;
  }

  public void setPickup(SubscriptionContractCalculationDeliveryMethodPickupInput pickup) {
    this.pickup = pickup;
  }

  /**
   * Explicitly set no delivery method (digital-only subscriptions). Must be `true`.
   */
  public Boolean getNone() {
    return none;
  }

  public void setNone(Boolean none) {
    this.none = none;
  }

  /**
   * Discover the available delivery options for an address without changing the
   * contract's committed delivery method. The resulting calculation can't be
   * committed. Create a new calculation with the chosen delivery method, then
   * commit it. Mutually exclusive with setting a delivery method.
   */
  public SubscriptionContractCalculationFetchDeliveryOptionsInput getFetchAvailableDeliveryOptions(
      ) {
    return fetchAvailableDeliveryOptions;
  }

  public void setFetchAvailableDeliveryOptions(
      SubscriptionContractCalculationFetchDeliveryOptionsInput fetchAvailableDeliveryOptions) {
    this.fetchAvailableDeliveryOptions = fetchAvailableDeliveryOptions;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationDeliveryMethodInput{shipping='" + shipping + "', localDelivery='" + localDelivery + "', pickup='" + pickup + "', none='" + none + "', fetchAvailableDeliveryOptions='" + fetchAvailableDeliveryOptions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationDeliveryMethodInput that = (SubscriptionContractCalculationDeliveryMethodInput) o;
    return Objects.equals(shipping, that.shipping) &&
        Objects.equals(localDelivery, that.localDelivery) &&
        Objects.equals(pickup, that.pickup) &&
        Objects.equals(none, that.none) &&
        Objects.equals(fetchAvailableDeliveryOptions, that.fetchAvailableDeliveryOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipping, localDelivery, pickup, none, fetchAvailableDeliveryOptions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The input fields for the shipping delivery method.
     */
    private SubscriptionContractCalculationDeliveryMethodShippingInput shipping;

    /**
     * The input fields for the local delivery method.
     */
    private SubscriptionContractCalculationDeliveryMethodLocalDeliveryInput localDelivery;

    /**
     * The input fields for the pickup delivery method.
     */
    private SubscriptionContractCalculationDeliveryMethodPickupInput pickup;

    /**
     * Explicitly set no delivery method (digital-only subscriptions). Must be `true`.
     */
    private Boolean none;

    /**
     * Discover the available delivery options for an address without changing the
     * contract's committed delivery method. The resulting calculation can't be
     * committed. Create a new calculation with the chosen delivery method, then
     * commit it. Mutually exclusive with setting a delivery method.
     */
    private SubscriptionContractCalculationFetchDeliveryOptionsInput fetchAvailableDeliveryOptions;

    public SubscriptionContractCalculationDeliveryMethodInput build() {
      SubscriptionContractCalculationDeliveryMethodInput result = new SubscriptionContractCalculationDeliveryMethodInput();
      result.shipping = this.shipping;
      result.localDelivery = this.localDelivery;
      result.pickup = this.pickup;
      result.none = this.none;
      result.fetchAvailableDeliveryOptions = this.fetchAvailableDeliveryOptions;
      return result;
    }

    /**
     * The input fields for the shipping delivery method.
     */
    public Builder shipping(SubscriptionContractCalculationDeliveryMethodShippingInput shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * The input fields for the local delivery method.
     */
    public Builder localDelivery(
        SubscriptionContractCalculationDeliveryMethodLocalDeliveryInput localDelivery) {
      this.localDelivery = localDelivery;
      return this;
    }

    /**
     * The input fields for the pickup delivery method.
     */
    public Builder pickup(SubscriptionContractCalculationDeliveryMethodPickupInput pickup) {
      this.pickup = pickup;
      return this;
    }

    /**
     * Explicitly set no delivery method (digital-only subscriptions). Must be `true`.
     */
    public Builder none(Boolean none) {
      this.none = none;
      return this;
    }

    /**
     * Discover the available delivery options for an address without changing the
     * contract's committed delivery method. The resulting calculation can't be
     * committed. Create a new calculation with the chosen delivery method, then
     * commit it. Mutually exclusive with setting a delivery method.
     */
    public Builder fetchAvailableDeliveryOptions(
        SubscriptionContractCalculationFetchDeliveryOptionsInput fetchAvailableDeliveryOptions) {
      this.fetchAvailableDeliveryOptions = fetchAvailableDeliveryOptions;
      return this;
    }
  }
}

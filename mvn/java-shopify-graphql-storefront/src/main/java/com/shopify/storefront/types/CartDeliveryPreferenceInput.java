package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Delivery preferences can be used to prefill the delivery section at checkout.
 */
public class CartDeliveryPreferenceInput {
  /**
   * The coordinates of a delivery location in order of preference.
   */
  private CartDeliveryCoordinatesPreferenceInput coordinates;

  /**
   * The preferred delivery methods such as shipping, local pickup or through pickup points.
   *   
   * The input must not contain more than `250` values.
   */
  private List<PreferenceDeliveryMethodType> deliveryMethod;

  /**
   * The pickup handle prefills checkout fields with the location for either local pickup or pickup points delivery methods.
   * It accepts both location ID for local pickup and external IDs for pickup points.
   *   
   * The input must not contain more than `250` values.
   */
  private List<String> pickupHandle;

  public CartDeliveryPreferenceInput() {
  }

  /**
   * The coordinates of a delivery location in order of preference.
   */
  public CartDeliveryCoordinatesPreferenceInput getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(CartDeliveryCoordinatesPreferenceInput coordinates) {
    this.coordinates = coordinates;
  }

  /**
   * The preferred delivery methods such as shipping, local pickup or through pickup points.
   *   
   * The input must not contain more than `250` values.
   */
  public List<PreferenceDeliveryMethodType> getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(List<PreferenceDeliveryMethodType> deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  /**
   * The pickup handle prefills checkout fields with the location for either local pickup or pickup points delivery methods.
   * It accepts both location ID for local pickup and external IDs for pickup points.
   *   
   * The input must not contain more than `250` values.
   */
  public List<String> getPickupHandle() {
    return pickupHandle;
  }

  public void setPickupHandle(List<String> pickupHandle) {
    this.pickupHandle = pickupHandle;
  }

  @Override
  public String toString() {
    return "CartDeliveryPreferenceInput{coordinates='" + coordinates + "', deliveryMethod='" + deliveryMethod + "', pickupHandle='" + pickupHandle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartDeliveryPreferenceInput that = (CartDeliveryPreferenceInput) o;
    return Objects.equals(coordinates, that.coordinates) &&
        Objects.equals(deliveryMethod, that.deliveryMethod) &&
        Objects.equals(pickupHandle, that.pickupHandle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, deliveryMethod, pickupHandle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The coordinates of a delivery location in order of preference.
     */
    private CartDeliveryCoordinatesPreferenceInput coordinates;

    /**
     * The preferred delivery methods such as shipping, local pickup or through pickup points.
     *   
     * The input must not contain more than `250` values.
     */
    private List<PreferenceDeliveryMethodType> deliveryMethod;

    /**
     * The pickup handle prefills checkout fields with the location for either local pickup or pickup points delivery methods.
     * It accepts both location ID for local pickup and external IDs for pickup points.
     *   
     * The input must not contain more than `250` values.
     */
    private List<String> pickupHandle;

    public CartDeliveryPreferenceInput build() {
      CartDeliveryPreferenceInput result = new CartDeliveryPreferenceInput();
      result.coordinates = this.coordinates;
      result.deliveryMethod = this.deliveryMethod;
      result.pickupHandle = this.pickupHandle;
      return result;
    }

    /**
     * The coordinates of a delivery location in order of preference.
     */
    public Builder coordinates(CartDeliveryCoordinatesPreferenceInput coordinates) {
      this.coordinates = coordinates;
      return this;
    }

    /**
     * The preferred delivery methods such as shipping, local pickup or through pickup points.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder deliveryMethod(List<PreferenceDeliveryMethodType> deliveryMethod) {
      this.deliveryMethod = deliveryMethod;
      return this;
    }

    /**
     * The pickup handle prefills checkout fields with the location for either local pickup or pickup points delivery methods.
     * It accepts both location ID for local pickup and external IDs for pickup points.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder pickupHandle(List<String> pickupHandle) {
      this.pickupHandle = pickupHandle;
      return this;
    }
  }
}

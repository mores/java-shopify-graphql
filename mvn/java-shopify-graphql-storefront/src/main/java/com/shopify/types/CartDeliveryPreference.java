package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A set of preferences tied to the buyer interacting with the cart. Preferences
 * are used to prefill fields in at checkout to streamline information collection. 
 * Preferences are not synced back to the cart if they are overwritten.
 */
public class CartDeliveryPreference {
  /**
   * Preferred location used to find the closest pick up point based on coordinates.
   */
  private CartDeliveryCoordinatesPreference coordinates;

  /**
   * The preferred delivery methods such as shipping, local pickup or through pickup points.
   */
  private List<PreferenceDeliveryMethodType> deliveryMethod;

  /**
   * The pickup handle prefills checkout fields with the location for either local pickup or pickup points delivery methods.
   * It accepts both location ID for local pickup and external IDs for pickup points.
   */
  private List<String> pickupHandle;

  public CartDeliveryPreference() {
  }

  /**
   * Preferred location used to find the closest pick up point based on coordinates.
   */
  public CartDeliveryCoordinatesPreference getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(CartDeliveryCoordinatesPreference coordinates) {
    this.coordinates = coordinates;
  }

  /**
   * The preferred delivery methods such as shipping, local pickup or through pickup points.
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
   */
  public List<String> getPickupHandle() {
    return pickupHandle;
  }

  public void setPickupHandle(List<String> pickupHandle) {
    this.pickupHandle = pickupHandle;
  }

  @Override
  public String toString() {
    return "CartDeliveryPreference{coordinates='" + coordinates + "', deliveryMethod='" + deliveryMethod + "', pickupHandle='" + pickupHandle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartDeliveryPreference that = (CartDeliveryPreference) o;
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
     * Preferred location used to find the closest pick up point based on coordinates.
     */
    private CartDeliveryCoordinatesPreference coordinates;

    /**
     * The preferred delivery methods such as shipping, local pickup or through pickup points.
     */
    private List<PreferenceDeliveryMethodType> deliveryMethod;

    /**
     * The pickup handle prefills checkout fields with the location for either local pickup or pickup points delivery methods.
     * It accepts both location ID for local pickup and external IDs for pickup points.
     */
    private List<String> pickupHandle;

    public CartDeliveryPreference build() {
      CartDeliveryPreference result = new CartDeliveryPreference();
      result.coordinates = this.coordinates;
      result.deliveryMethod = this.deliveryMethod;
      result.pickupHandle = this.pickupHandle;
      return result;
    }

    /**
     * Preferred location used to find the closest pick up point based on coordinates.
     */
    public Builder coordinates(CartDeliveryCoordinatesPreference coordinates) {
      this.coordinates = coordinates;
      return this;
    }

    /**
     * The preferred delivery methods such as shipping, local pickup or through pickup points.
     */
    public Builder deliveryMethod(List<PreferenceDeliveryMethodType> deliveryMethod) {
      this.deliveryMethod = deliveryMethod;
      return this;
    }

    /**
     * The pickup handle prefills checkout fields with the location for either local pickup or pickup points delivery methods.
     * It accepts both location ID for local pickup and external IDs for pickup points.
     */
    public Builder pickupHandle(List<String> pickupHandle) {
      this.pickupHandle = pickupHandle;
      return this;
    }
  }
}

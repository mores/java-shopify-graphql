package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to provide exactly one of a variety of delivery address types.
 */
public class CartAddressInput {
  /**
   * Copies details from the customer address to an address on this cart.
   */
  private String copyFromCustomerAddressId;

  /**
   * A delivery address stored on this cart.
   */
  private CartDeliveryAddressInput deliveryAddress;

  public CartAddressInput() {
  }

  /**
   * Copies details from the customer address to an address on this cart.
   */
  public String getCopyFromCustomerAddressId() {
    return copyFromCustomerAddressId;
  }

  public void setCopyFromCustomerAddressId(String copyFromCustomerAddressId) {
    this.copyFromCustomerAddressId = copyFromCustomerAddressId;
  }

  /**
   * A delivery address stored on this cart.
   */
  public CartDeliveryAddressInput getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(CartDeliveryAddressInput deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  @Override
  public String toString() {
    return "CartAddressInput{copyFromCustomerAddressId='" + copyFromCustomerAddressId + "', deliveryAddress='" + deliveryAddress + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartAddressInput that = (CartAddressInput) o;
    return Objects.equals(copyFromCustomerAddressId, that.copyFromCustomerAddressId) &&
        Objects.equals(deliveryAddress, that.deliveryAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyFromCustomerAddressId, deliveryAddress);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Copies details from the customer address to an address on this cart.
     */
    private String copyFromCustomerAddressId;

    /**
     * A delivery address stored on this cart.
     */
    private CartDeliveryAddressInput deliveryAddress;

    public CartAddressInput build() {
      CartAddressInput result = new CartAddressInput();
      result.copyFromCustomerAddressId = this.copyFromCustomerAddressId;
      result.deliveryAddress = this.deliveryAddress;
      return result;
    }

    /**
     * Copies details from the customer address to an address on this cart.
     */
    public Builder copyFromCustomerAddressId(String copyFromCustomerAddressId) {
      this.copyFromCustomerAddressId = copyFromCustomerAddressId;
      return this;
    }

    /**
     * A delivery address stored on this cart.
     */
    public Builder deliveryAddress(CartDeliveryAddressInput deliveryAddress) {
      this.deliveryAddress = deliveryAddress;
      return this;
    }
  }
}

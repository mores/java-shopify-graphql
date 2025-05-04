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
   * A delivery address stored on this cart.
   */
  private CartDeliveryAddressInput deliveryAddress;

  /**
   * Copies details from the customer address to an address on this cart.
   */
  private String copyFromCustomerAddressId;

  public CartAddressInput() {
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

  /**
   * Copies details from the customer address to an address on this cart.
   */
  public String getCopyFromCustomerAddressId() {
    return copyFromCustomerAddressId;
  }

  public void setCopyFromCustomerAddressId(String copyFromCustomerAddressId) {
    this.copyFromCustomerAddressId = copyFromCustomerAddressId;
  }

  @Override
  public String toString() {
    return "CartAddressInput{deliveryAddress='" + deliveryAddress + "', copyFromCustomerAddressId='" + copyFromCustomerAddressId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartAddressInput that = (CartAddressInput) o;
    return Objects.equals(deliveryAddress, that.deliveryAddress) &&
        Objects.equals(copyFromCustomerAddressId, that.copyFromCustomerAddressId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryAddress, copyFromCustomerAddressId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A delivery address stored on this cart.
     */
    private CartDeliveryAddressInput deliveryAddress;

    /**
     * Copies details from the customer address to an address on this cart.
     */
    private String copyFromCustomerAddressId;

    public CartAddressInput build() {
      CartAddressInput result = new CartAddressInput();
      result.deliveryAddress = this.deliveryAddress;
      result.copyFromCustomerAddressId = this.copyFromCustomerAddressId;
      return result;
    }

    /**
     * A delivery address stored on this cart.
     */
    public Builder deliveryAddress(CartDeliveryAddressInput deliveryAddress) {
      this.deliveryAddress = deliveryAddress;
      return this;
    }

    /**
     * Copies details from the customer address to an address on this cart.
     */
    public Builder copyFromCustomerAddressId(String copyFromCustomerAddressId) {
      this.copyFromCustomerAddressId = copyFromCustomerAddressId;
      return this;
    }
  }
}

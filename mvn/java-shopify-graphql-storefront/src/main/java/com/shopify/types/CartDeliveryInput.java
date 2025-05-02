package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for the cart's delivery properties.
 */
public class CartDeliveryInput {
  /**
   * Selectable addresses to present to the buyer on the cart.
   *   
   * The input must not contain more than `250` values.
   */
  private List<CartSelectableAddressInput> addresses;

  public CartDeliveryInput() {
  }

  /**
   * Selectable addresses to present to the buyer on the cart.
   *   
   * The input must not contain more than `250` values.
   */
  public List<CartSelectableAddressInput> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<CartSelectableAddressInput> addresses) {
    this.addresses = addresses;
  }

  @Override
  public String toString() {
    return "CartDeliveryInput{addresses='" + addresses + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartDeliveryInput that = (CartDeliveryInput) o;
    return Objects.equals(addresses, that.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Selectable addresses to present to the buyer on the cart.
     *   
     * The input must not contain more than `250` values.
     */
    private List<CartSelectableAddressInput> addresses;

    public CartDeliveryInput build() {
      CartDeliveryInput result = new CartDeliveryInput();
      result.addresses = this.addresses;
      return result;
    }

    /**
     * Selectable addresses to present to the buyer on the cart.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder addresses(List<CartSelectableAddressInput> addresses) {
      this.addresses = addresses;
      return this;
    }
  }
}

package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The delivery properties of the cart.
 */
public class CartDelivery {
  /**
   * Selectable addresses to present to the buyer on the cart.
   */
  private List<CartSelectableAddress> addresses;

  public CartDelivery() {
  }

  /**
   * Selectable addresses to present to the buyer on the cart.
   */
  public List<CartSelectableAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<CartSelectableAddress> addresses) {
    this.addresses = addresses;
  }

  @Override
  public String toString() {
    return "CartDelivery{addresses='" + addresses + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartDelivery that = (CartDelivery) o;
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
     */
    private List<CartSelectableAddress> addresses;

    public CartDelivery build() {
      CartDelivery result = new CartDelivery();
      result.addresses = this.addresses;
      return result;
    }

    /**
     * Selectable addresses to present to the buyer on the cart.
     */
    public Builder addresses(List<CartSelectableAddress> addresses) {
      this.addresses = addresses;
      return this;
    }
  }
}

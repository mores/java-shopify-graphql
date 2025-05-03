package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Cart is ready for payment update and completion.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CartStatusReady implements CartPrepareForCompletionResult {
  /**
   * The result of cart preparation for completion.
   */
  private Cart cart;

  public CartStatusReady() {
  }

  /**
   * The result of cart preparation for completion.
   */
  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }

  @Override
  public String toString() {
    return "CartStatusReady{cart='" + cart + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartStatusReady that = (CartStatusReady) o;
    return Objects.equals(cart, that.cart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cart);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The result of cart preparation for completion.
     */
    private Cart cart;

    public CartStatusReady build() {
      CartStatusReady result = new CartStatusReady();
      result.cart = this.cart;
      return result;
    }

    /**
     * The result of cart preparation for completion.
     */
    public Builder cart(Cart cart) {
      this.cart = cart;
      return this;
    }
  }
}

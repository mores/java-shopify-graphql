package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response signifying that the access to cart request is currently being throttled.
 * The client can retry after `poll_after`.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CartThrottled implements CartPrepareForCompletionResult {
  /**
   * The result of cart preparation for completion.
   */
  private Cart cart;

  /**
   * The polling delay.
   */
  private OffsetDateTime pollAfter;

  public CartThrottled() {
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

  /**
   * The polling delay.
   */
  public OffsetDateTime getPollAfter() {
    return pollAfter;
  }

  public void setPollAfter(OffsetDateTime pollAfter) {
    this.pollAfter = pollAfter;
  }

  @Override
  public String toString() {
    return "CartThrottled{cart='" + cart + "', pollAfter='" + pollAfter + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartThrottled that = (CartThrottled) o;
    return Objects.equals(cart, that.cart) &&
        Objects.equals(pollAfter, that.pollAfter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cart, pollAfter);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The result of cart preparation for completion.
     */
    private Cart cart;

    /**
     * The polling delay.
     */
    private OffsetDateTime pollAfter;

    public CartThrottled build() {
      CartThrottled result = new CartThrottled();
      result.cart = this.cart;
      result.pollAfter = this.pollAfter;
      return result;
    }

    /**
     * The result of cart preparation for completion.
     */
    public Builder cart(Cart cart) {
      this.cart = cart;
      return this;
    }

    /**
     * The polling delay.
     */
    public Builder pollAfter(OffsetDateTime pollAfter) {
      this.pollAfter = pollAfter;
      return this;
    }
  }
}

package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Cart is not ready for payment update and completion.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CartStatusNotReady implements CartPrepareForCompletionResult {
  /**
   * The result of cart preparation for completion.
   */
  private Cart cart;

  /**
   * The list of errors that caused the cart to not be ready for payment update and completion.
   */
  private List<CartOperationError> errors;

  public CartStatusNotReady() {
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
   * The list of errors that caused the cart to not be ready for payment update and completion.
   */
  public List<CartOperationError> getErrors() {
    return errors;
  }

  public void setErrors(List<CartOperationError> errors) {
    this.errors = errors;
  }

  @Override
  public String toString() {
    return "CartStatusNotReady{cart='" + cart + "', errors='" + errors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartStatusNotReady that = (CartStatusNotReady) o;
    return Objects.equals(cart, that.cart) &&
        Objects.equals(errors, that.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cart, errors);
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
     * The list of errors that caused the cart to not be ready for payment update and completion.
     */
    private List<CartOperationError> errors;

    public CartStatusNotReady build() {
      CartStatusNotReady result = new CartStatusNotReady();
      result.cart = this.cart;
      result.errors = this.errors;
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
     * The list of errors that caused the cart to not be ready for payment update and completion.
     */
    public Builder errors(List<CartOperationError> errors) {
      this.errors = errors;
      return this;
    }
  }
}

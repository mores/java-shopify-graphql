package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `cartTransformCreate` mutation.
 */
public class CartTransformCreatePayload {
  /**
   * The newly created cart transform function.
   */
  private CartTransform cartTransform;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CartTransformCreateUserError> userErrors;

  public CartTransformCreatePayload() {
  }

  /**
   * The newly created cart transform function.
   */
  public CartTransform getCartTransform() {
    return cartTransform;
  }

  public void setCartTransform(CartTransform cartTransform) {
    this.cartTransform = cartTransform;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CartTransformCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CartTransformCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CartTransformCreatePayload{cartTransform='" + cartTransform + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartTransformCreatePayload that = (CartTransformCreatePayload) o;
    return Objects.equals(cartTransform, that.cartTransform) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartTransform, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The newly created cart transform function.
     */
    private CartTransform cartTransform;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CartTransformCreateUserError> userErrors;

    public CartTransformCreatePayload build() {
      CartTransformCreatePayload result = new CartTransformCreatePayload();
      result.cartTransform = this.cartTransform;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The newly created cart transform function.
     */
    public Builder cartTransform(CartTransform cartTransform) {
      this.cartTransform = cartTransform;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CartTransformCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

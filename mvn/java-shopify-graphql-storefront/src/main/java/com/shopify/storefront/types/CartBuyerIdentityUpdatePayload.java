package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `cartBuyerIdentityUpdate` mutation.
 */
public class CartBuyerIdentityUpdatePayload {
  /**
   * The updated cart.
   */
  private Cart cart;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CartUserError> userErrors;

  /**
   * A list of warnings that occurred during the mutation.
   */
  private List<CartWarning> warnings;

  public CartBuyerIdentityUpdatePayload() {
  }

  /**
   * The updated cart.
   */
  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CartUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CartUserError> userErrors) {
    this.userErrors = userErrors;
  }

  /**
   * A list of warnings that occurred during the mutation.
   */
  public List<CartWarning> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<CartWarning> warnings) {
    this.warnings = warnings;
  }

  @Override
  public String toString() {
    return "CartBuyerIdentityUpdatePayload{cart='" + cart + "', userErrors='" + userErrors + "', warnings='" + warnings + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartBuyerIdentityUpdatePayload that = (CartBuyerIdentityUpdatePayload) o;
    return Objects.equals(cart, that.cart) &&
        Objects.equals(userErrors, that.userErrors) &&
        Objects.equals(warnings, that.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cart, userErrors, warnings);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated cart.
     */
    private Cart cart;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CartUserError> userErrors;

    /**
     * A list of warnings that occurred during the mutation.
     */
    private List<CartWarning> warnings;

    public CartBuyerIdentityUpdatePayload build() {
      CartBuyerIdentityUpdatePayload result = new CartBuyerIdentityUpdatePayload();
      result.cart = this.cart;
      result.userErrors = this.userErrors;
      result.warnings = this.warnings;
      return result;
    }

    /**
     * The updated cart.
     */
    public Builder cart(Cart cart) {
      this.cart = cart;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CartUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }

    /**
     * A list of warnings that occurred during the mutation.
     */
    public Builder warnings(List<CartWarning> warnings) {
      this.warnings = warnings;
      return this;
    }
  }
}

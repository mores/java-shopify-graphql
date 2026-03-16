package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents instructions for a cart line item.
 */
public class CartLineInstructions {
  /**
   * Whether the line item can be removed from the cart.
   */
  private boolean canRemove;

  /**
   * Whether the line item quantity can be updated.
   */
  private boolean canUpdateQuantity;

  public CartLineInstructions() {
  }

  /**
   * Whether the line item can be removed from the cart.
   */
  public boolean getCanRemove() {
    return canRemove;
  }

  public void setCanRemove(boolean canRemove) {
    this.canRemove = canRemove;
  }

  /**
   * Whether the line item quantity can be updated.
   */
  public boolean getCanUpdateQuantity() {
    return canUpdateQuantity;
  }

  public void setCanUpdateQuantity(boolean canUpdateQuantity) {
    this.canUpdateQuantity = canUpdateQuantity;
  }

  @Override
  public String toString() {
    return "CartLineInstructions{canRemove='" + canRemove + "', canUpdateQuantity='" + canUpdateQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartLineInstructions that = (CartLineInstructions) o;
    return canRemove == that.canRemove &&
        canUpdateQuantity == that.canUpdateQuantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(canRemove, canUpdateQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the line item can be removed from the cart.
     */
    private boolean canRemove;

    /**
     * Whether the line item quantity can be updated.
     */
    private boolean canUpdateQuantity;

    public CartLineInstructions build() {
      CartLineInstructions result = new CartLineInstructions();
      result.canRemove = this.canRemove;
      result.canUpdateQuantity = this.canUpdateQuantity;
      return result;
    }

    /**
     * Whether the line item can be removed from the cart.
     */
    public Builder canRemove(boolean canRemove) {
      this.canRemove = canRemove;
      return this;
    }

    /**
     * Whether the line item quantity can be updated.
     */
    public Builder canUpdateQuantity(boolean canUpdateQuantity) {
      this.canUpdateQuantity = canUpdateQuantity;
      return this;
    }
  }
}

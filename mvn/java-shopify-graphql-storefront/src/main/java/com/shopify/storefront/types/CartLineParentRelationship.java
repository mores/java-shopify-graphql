package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the parent relationship of a cart line.
 */
public class CartLineParentRelationship {
  /**
   * The parent cart line.
   */
  private CartLine _parent;

  public CartLineParentRelationship() {
  }

  /**
   * The parent cart line.
   */
  public CartLine getParent() {
    return _parent;
  }

  public void setParent(CartLine _parent) {
    this._parent = _parent;
  }

  @Override
  public String toString() {
    return "CartLineParentRelationship{parent='" + _parent + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartLineParentRelationship that = (CartLineParentRelationship) o;
    return Objects.equals(_parent, that._parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_parent);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The parent cart line.
     */
    private CartLine _parent;

    public CartLineParentRelationship build() {
      CartLineParentRelationship result = new CartLineParentRelationship();
      result._parent = this._parent;
      return result;
    }

    /**
     * The parent cart line.
     */
    public Builder _parent(CartLine _parent) {
      this._parent = _parent;
      return this;
    }
  }
}

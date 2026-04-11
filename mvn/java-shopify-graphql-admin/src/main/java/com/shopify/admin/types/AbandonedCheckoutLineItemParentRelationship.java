package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The line relationship between two line items in an abandoned checkout.
 */
public class AbandonedCheckoutLineItemParentRelationship {
  /**
   * The parent line item of the current line item.
   */
  private AbandonedCheckoutLineItem _parent;

  public AbandonedCheckoutLineItemParentRelationship() {
  }

  /**
   * The parent line item of the current line item.
   */
  public AbandonedCheckoutLineItem getParent() {
    return _parent;
  }

  public void setParent(AbandonedCheckoutLineItem _parent) {
    this._parent = _parent;
  }

  @Override
  public String toString() {
    return "AbandonedCheckoutLineItemParentRelationship{parent='" + _parent + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbandonedCheckoutLineItemParentRelationship that = (AbandonedCheckoutLineItemParentRelationship) o;
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
     * The parent line item of the current line item.
     */
    private AbandonedCheckoutLineItem _parent;

    public AbandonedCheckoutLineItemParentRelationship build() {
      AbandonedCheckoutLineItemParentRelationship result = new AbandonedCheckoutLineItemParentRelationship();
      result._parent = this._parent;
      return result;
    }

    /**
     * The parent line item of the current line item.
     */
    public Builder _parent(AbandonedCheckoutLineItem _parent) {
      this._parent = _parent;
      return this;
    }
  }
}

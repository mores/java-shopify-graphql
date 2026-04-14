package com.shopify.storefront.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for adding a merchandise line to a cart. Each line represents a [`ProductVariant`](https://shopify.dev/docs/api/storefront/current/objects/ProductVariant)
 * the buyer intends to purchase, along with the quantity and optional [`SellingPlan`](https://shopify.dev/docs/api/storefront/current/objects/SellingPlan)
 * for subscriptions.
 *
 * Used by the [`cartCreate`](https://shopify.dev/docs/api/storefront/current/mutations/cartCreate) mutation when creating a cart with initial items, and the [`cartLinesAdd`](https://shopify.dev/docs/api/storefront/current/mutations/cartLinesAdd)
 * mutation when adding items to an existing cart.
 */
public class CartLineInput {
  /**
   * An array of key-value pairs that contains additional information about the merchandise line.
   *   
   * The input must not contain more than `250` values.
   */
  private List<AttributeInput> attributes;

  /**
   * The quantity of the merchandise.
   */
  private Integer quantity = 1;

  /**
   * The ID of the merchandise that the buyer intends to purchase.
   */
  private String merchandiseId;

  /**
   * The ID of the selling plan that the merchandise is being purchased with.
   */
  private String sellingPlanId;

  /**
   * The parent line item of the cart line.
   */
  private CartLineParentInput _parent;

  public CartLineInput() {
  }

  /**
   * An array of key-value pairs that contains additional information about the merchandise line.
   *   
   * The input must not contain more than `250` values.
   */
  public List<AttributeInput> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AttributeInput> attributes) {
    this.attributes = attributes;
  }

  /**
   * The quantity of the merchandise.
   */
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * The ID of the merchandise that the buyer intends to purchase.
   */
  public String getMerchandiseId() {
    return merchandiseId;
  }

  public void setMerchandiseId(String merchandiseId) {
    this.merchandiseId = merchandiseId;
  }

  /**
   * The ID of the selling plan that the merchandise is being purchased with.
   */
  public String getSellingPlanId() {
    return sellingPlanId;
  }

  public void setSellingPlanId(String sellingPlanId) {
    this.sellingPlanId = sellingPlanId;
  }

  /**
   * The parent line item of the cart line.
   */
  public CartLineParentInput getParent() {
    return _parent;
  }

  public void setParent(CartLineParentInput _parent) {
    this._parent = _parent;
  }

  @Override
  public String toString() {
    return "CartLineInput{attributes='" + attributes + "', quantity='" + quantity + "', merchandiseId='" + merchandiseId + "', sellingPlanId='" + sellingPlanId + "', parent='" + _parent + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartLineInput that = (CartLineInput) o;
    return Objects.equals(attributes, that.attributes) &&
        Objects.equals(quantity, that.quantity) &&
        Objects.equals(merchandiseId, that.merchandiseId) &&
        Objects.equals(sellingPlanId, that.sellingPlanId) &&
        Objects.equals(_parent, that._parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, quantity, merchandiseId, sellingPlanId, _parent);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * An array of key-value pairs that contains additional information about the merchandise line.
     *   
     * The input must not contain more than `250` values.
     */
    private List<AttributeInput> attributes;

    /**
     * The quantity of the merchandise.
     */
    private Integer quantity = 1;

    /**
     * The ID of the merchandise that the buyer intends to purchase.
     */
    private String merchandiseId;

    /**
     * The ID of the selling plan that the merchandise is being purchased with.
     */
    private String sellingPlanId;

    /**
     * The parent line item of the cart line.
     */
    private CartLineParentInput _parent;

    public CartLineInput build() {
      CartLineInput result = new CartLineInput();
      result.attributes = this.attributes;
      result.quantity = this.quantity;
      result.merchandiseId = this.merchandiseId;
      result.sellingPlanId = this.sellingPlanId;
      result._parent = this._parent;
      return result;
    }

    /**
     * An array of key-value pairs that contains additional information about the merchandise line.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder attributes(List<AttributeInput> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * The quantity of the merchandise.
     */
    public Builder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The ID of the merchandise that the buyer intends to purchase.
     */
    public Builder merchandiseId(String merchandiseId) {
      this.merchandiseId = merchandiseId;
      return this;
    }

    /**
     * The ID of the selling plan that the merchandise is being purchased with.
     */
    public Builder sellingPlanId(String sellingPlanId) {
      this.sellingPlanId = sellingPlanId;
      return this;
    }

    /**
     * The parent line item of the cart line.
     */
    public Builder _parent(CartLineParentInput _parent) {
      this._parent = _parent;
      return this;
    }
  }
}

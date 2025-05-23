package com.shopify.storefront.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields to update a line item on a cart.
 */
public class CartLineUpdateInput {
  /**
   * The ID of the merchandise line.
   */
  private String id;

  /**
   * The quantity of the line item.
   */
  private Integer quantity;

  /**
   * The ID of the merchandise for the line item.
   */
  private String merchandiseId;

  /**
   * An array of key-value pairs that contains additional information about the merchandise line.
   *   
   * The input must not contain more than `250` values.
   */
  private List<AttributeInput> attributes;

  /**
   * The ID of the selling plan that the merchandise is being purchased with.
   */
  private String sellingPlanId;

  public CartLineUpdateInput() {
  }

  /**
   * The ID of the merchandise line.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The quantity of the line item.
   */
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  /**
   * The ID of the merchandise for the line item.
   */
  public String getMerchandiseId() {
    return merchandiseId;
  }

  public void setMerchandiseId(String merchandiseId) {
    this.merchandiseId = merchandiseId;
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
   * The ID of the selling plan that the merchandise is being purchased with.
   */
  public String getSellingPlanId() {
    return sellingPlanId;
  }

  public void setSellingPlanId(String sellingPlanId) {
    this.sellingPlanId = sellingPlanId;
  }

  @Override
  public String toString() {
    return "CartLineUpdateInput{id='" + id + "', quantity='" + quantity + "', merchandiseId='" + merchandiseId + "', attributes='" + attributes + "', sellingPlanId='" + sellingPlanId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartLineUpdateInput that = (CartLineUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(quantity, that.quantity) &&
        Objects.equals(merchandiseId, that.merchandiseId) &&
        Objects.equals(attributes, that.attributes) &&
        Objects.equals(sellingPlanId, that.sellingPlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, quantity, merchandiseId, attributes, sellingPlanId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the merchandise line.
     */
    private String id;

    /**
     * The quantity of the line item.
     */
    private Integer quantity;

    /**
     * The ID of the merchandise for the line item.
     */
    private String merchandiseId;

    /**
     * An array of key-value pairs that contains additional information about the merchandise line.
     *   
     * The input must not contain more than `250` values.
     */
    private List<AttributeInput> attributes;

    /**
     * The ID of the selling plan that the merchandise is being purchased with.
     */
    private String sellingPlanId;

    public CartLineUpdateInput build() {
      CartLineUpdateInput result = new CartLineUpdateInput();
      result.id = this.id;
      result.quantity = this.quantity;
      result.merchandiseId = this.merchandiseId;
      result.attributes = this.attributes;
      result.sellingPlanId = this.sellingPlanId;
      return result;
    }

    /**
     * The ID of the merchandise line.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The quantity of the line item.
     */
    public Builder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The ID of the merchandise for the line item.
     */
    public Builder merchandiseId(String merchandiseId) {
      this.merchandiseId = merchandiseId;
      return this;
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
     * The ID of the selling plan that the merchandise is being purchased with.
     */
    public Builder sellingPlanId(String sellingPlanId) {
      this.sellingPlanId = sellingPlanId;
      return this;
    }
  }
}

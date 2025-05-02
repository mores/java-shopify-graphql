package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents information about the merchandise in the cart.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CartLine implements com.shopify.types.BaseCartLine, com.shopify.types.Node {
  /**
   * An attribute associated with the cart line.
   */
  private Attribute attribute;

  /**
   * The attributes associated with the cart line. Attributes are represented as key-value pairs.
   */
  private List<Attribute> attributes;

  /**
   * The cost of the merchandise that the buyer will pay for at checkout. The costs
   * are subject to change and changes will be reflected at checkout.
   */
  private CartLineCost cost;

  /**
   * The discounts that have been applied to the cart line.
   */
  private List<CartDiscountAllocation> discountAllocations;

  /**
   * The estimated cost of the merchandise that the buyer will pay for at checkout.
   * The estimated costs are subject to change and changes will be reflected at checkout.
   */
  private CartLineEstimatedCost estimatedCost;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The merchandise that the buyer intends to purchase.
   */
  private Merchandise merchandise;

  /**
   * The quantity of the merchandise that the customer intends to purchase.
   */
  private int quantity;

  /**
   * The selling plan associated with the cart line and the effect that each
   * selling plan has on variants when they're purchased.
   */
  private SellingPlanAllocation sellingPlanAllocation;

  public CartLine() {
  }

  /**
   * An attribute associated with the cart line.
   */
  public Attribute getAttribute() {
    return attribute;
  }

  public void setAttribute(Attribute attribute) {
    this.attribute = attribute;
  }

  /**
   * The attributes associated with the cart line. Attributes are represented as key-value pairs.
   */
  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

  /**
   * The cost of the merchandise that the buyer will pay for at checkout. The costs
   * are subject to change and changes will be reflected at checkout.
   */
  public CartLineCost getCost() {
    return cost;
  }

  public void setCost(CartLineCost cost) {
    this.cost = cost;
  }

  /**
   * The discounts that have been applied to the cart line.
   */
  public List<CartDiscountAllocation> getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(List<CartDiscountAllocation> discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  /**
   * The estimated cost of the merchandise that the buyer will pay for at checkout.
   * The estimated costs are subject to change and changes will be reflected at checkout.
   */
  public CartLineEstimatedCost getEstimatedCost() {
    return estimatedCost;
  }

  public void setEstimatedCost(CartLineEstimatedCost estimatedCost) {
    this.estimatedCost = estimatedCost;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The merchandise that the buyer intends to purchase.
   */
  public Merchandise getMerchandise() {
    return merchandise;
  }

  public void setMerchandise(Merchandise merchandise) {
    this.merchandise = merchandise;
  }

  /**
   * The quantity of the merchandise that the customer intends to purchase.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The selling plan associated with the cart line and the effect that each
   * selling plan has on variants when they're purchased.
   */
  public SellingPlanAllocation getSellingPlanAllocation() {
    return sellingPlanAllocation;
  }

  public void setSellingPlanAllocation(SellingPlanAllocation sellingPlanAllocation) {
    this.sellingPlanAllocation = sellingPlanAllocation;
  }

  @Override
  public String toString() {
    return "CartLine{attribute='" + attribute + "', attributes='" + attributes + "', cost='" + cost + "', discountAllocations='" + discountAllocations + "', estimatedCost='" + estimatedCost + "', id='" + id + "', merchandise='" + merchandise + "', quantity='" + quantity + "', sellingPlanAllocation='" + sellingPlanAllocation + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartLine that = (CartLine) o;
    return Objects.equals(attribute, that.attribute) &&
        Objects.equals(attributes, that.attributes) &&
        Objects.equals(cost, that.cost) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(estimatedCost, that.estimatedCost) &&
        Objects.equals(id, that.id) &&
        Objects.equals(merchandise, that.merchandise) &&
        quantity == that.quantity &&
        Objects.equals(sellingPlanAllocation, that.sellingPlanAllocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, attributes, cost, discountAllocations, estimatedCost, id, merchandise, quantity, sellingPlanAllocation);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * An attribute associated with the cart line.
     */
    private Attribute attribute;

    /**
     * The attributes associated with the cart line. Attributes are represented as key-value pairs.
     */
    private List<Attribute> attributes;

    /**
     * The cost of the merchandise that the buyer will pay for at checkout. The costs
     * are subject to change and changes will be reflected at checkout.
     */
    private CartLineCost cost;

    /**
     * The discounts that have been applied to the cart line.
     */
    private List<CartDiscountAllocation> discountAllocations;

    /**
     * The estimated cost of the merchandise that the buyer will pay for at checkout.
     * The estimated costs are subject to change and changes will be reflected at checkout.
     */
    private CartLineEstimatedCost estimatedCost;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The merchandise that the buyer intends to purchase.
     */
    private Merchandise merchandise;

    /**
     * The quantity of the merchandise that the customer intends to purchase.
     */
    private int quantity;

    /**
     * The selling plan associated with the cart line and the effect that each
     * selling plan has on variants when they're purchased.
     */
    private SellingPlanAllocation sellingPlanAllocation;

    public CartLine build() {
      CartLine result = new CartLine();
      result.attribute = this.attribute;
      result.attributes = this.attributes;
      result.cost = this.cost;
      result.discountAllocations = this.discountAllocations;
      result.estimatedCost = this.estimatedCost;
      result.id = this.id;
      result.merchandise = this.merchandise;
      result.quantity = this.quantity;
      result.sellingPlanAllocation = this.sellingPlanAllocation;
      return result;
    }

    /**
     * An attribute associated with the cart line.
     */
    public Builder attribute(Attribute attribute) {
      this.attribute = attribute;
      return this;
    }

    /**
     * The attributes associated with the cart line. Attributes are represented as key-value pairs.
     */
    public Builder attributes(List<Attribute> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * The cost of the merchandise that the buyer will pay for at checkout. The costs
     * are subject to change and changes will be reflected at checkout.
     */
    public Builder cost(CartLineCost cost) {
      this.cost = cost;
      return this;
    }

    /**
     * The discounts that have been applied to the cart line.
     */
    public Builder discountAllocations(List<CartDiscountAllocation> discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    /**
     * The estimated cost of the merchandise that the buyer will pay for at checkout.
     * The estimated costs are subject to change and changes will be reflected at checkout.
     */
    public Builder estimatedCost(CartLineEstimatedCost estimatedCost) {
      this.estimatedCost = estimatedCost;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The merchandise that the buyer intends to purchase.
     */
    public Builder merchandise(Merchandise merchandise) {
      this.merchandise = merchandise;
      return this;
    }

    /**
     * The quantity of the merchandise that the customer intends to purchase.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The selling plan associated with the cart line and the effect that each
     * selling plan has on variants when they're purchased.
     */
    public Builder sellingPlanAllocation(SellingPlanAllocation sellingPlanAllocation) {
      this.sellingPlanAllocation = sellingPlanAllocation;
      return this;
    }
  }
}

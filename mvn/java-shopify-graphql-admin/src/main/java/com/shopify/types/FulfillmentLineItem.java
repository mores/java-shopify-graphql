package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a line item from an order that's included in a fulfillment.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class FulfillmentLineItem implements com.shopify.types.Node {
  /**
   * The total price after discounts are applied.
   */
  private String discountedTotal;

  /**
   * The total price after discounts are applied in shop and presentment currencies.
   */
  private MoneyBag discountedTotalSet;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The associated order's line item.
   */
  private LineItem lineItem;

  /**
   * The total price before discounts are applied.
   */
  private String originalTotal;

  /**
   * The total price before discounts are applied in shop and presentment currencies.
   */
  private MoneyBag originalTotalSet;

  /**
   * Number of line items in the fulfillment.
   */
  private Integer quantity;

  public FulfillmentLineItem() {
  }

  /**
   * The total price after discounts are applied.
   */
  public String getDiscountedTotal() {
    return discountedTotal;
  }

  public void setDiscountedTotal(String discountedTotal) {
    this.discountedTotal = discountedTotal;
  }

  /**
   * The total price after discounts are applied in shop and presentment currencies.
   */
  public MoneyBag getDiscountedTotalSet() {
    return discountedTotalSet;
  }

  public void setDiscountedTotalSet(MoneyBag discountedTotalSet) {
    this.discountedTotalSet = discountedTotalSet;
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
   * The associated order's line item.
   */
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
  }

  /**
   * The total price before discounts are applied.
   */
  public String getOriginalTotal() {
    return originalTotal;
  }

  public void setOriginalTotal(String originalTotal) {
    this.originalTotal = originalTotal;
  }

  /**
   * The total price before discounts are applied in shop and presentment currencies.
   */
  public MoneyBag getOriginalTotalSet() {
    return originalTotalSet;
  }

  public void setOriginalTotalSet(MoneyBag originalTotalSet) {
    this.originalTotalSet = originalTotalSet;
  }

  /**
   * Number of line items in the fulfillment.
   */
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return "FulfillmentLineItem{discountedTotal='" + discountedTotal + "', discountedTotalSet='" + discountedTotalSet + "', id='" + id + "', lineItem='" + lineItem + "', originalTotal='" + originalTotal + "', originalTotalSet='" + originalTotalSet + "', quantity='" + quantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentLineItem that = (FulfillmentLineItem) o;
    return Objects.equals(discountedTotal, that.discountedTotal) &&
        Objects.equals(discountedTotalSet, that.discountedTotalSet) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineItem, that.lineItem) &&
        Objects.equals(originalTotal, that.originalTotal) &&
        Objects.equals(originalTotalSet, that.originalTotalSet) &&
        Objects.equals(quantity, that.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountedTotal, discountedTotalSet, id, lineItem, originalTotal, originalTotalSet, quantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The total price after discounts are applied.
     */
    private String discountedTotal;

    /**
     * The total price after discounts are applied in shop and presentment currencies.
     */
    private MoneyBag discountedTotalSet;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The associated order's line item.
     */
    private LineItem lineItem;

    /**
     * The total price before discounts are applied.
     */
    private String originalTotal;

    /**
     * The total price before discounts are applied in shop and presentment currencies.
     */
    private MoneyBag originalTotalSet;

    /**
     * Number of line items in the fulfillment.
     */
    private Integer quantity;

    public FulfillmentLineItem build() {
      FulfillmentLineItem result = new FulfillmentLineItem();
      result.discountedTotal = this.discountedTotal;
      result.discountedTotalSet = this.discountedTotalSet;
      result.id = this.id;
      result.lineItem = this.lineItem;
      result.originalTotal = this.originalTotal;
      result.originalTotalSet = this.originalTotalSet;
      result.quantity = this.quantity;
      return result;
    }

    /**
     * The total price after discounts are applied.
     */
    public Builder discountedTotal(String discountedTotal) {
      this.discountedTotal = discountedTotal;
      return this;
    }

    /**
     * The total price after discounts are applied in shop and presentment currencies.
     */
    public Builder discountedTotalSet(MoneyBag discountedTotalSet) {
      this.discountedTotalSet = discountedTotalSet;
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
     * The associated order's line item.
     */
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }

    /**
     * The total price before discounts are applied.
     */
    public Builder originalTotal(String originalTotal) {
      this.originalTotal = originalTotal;
      return this;
    }

    /**
     * The total price before discounts are applied in shop and presentment currencies.
     */
    public Builder originalTotalSet(MoneyBag originalTotalSet) {
      this.originalTotalSet = originalTotalSet;
      return this;
    }

    /**
     * Number of line items in the fulfillment.
     */
    public Builder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }
  }
}

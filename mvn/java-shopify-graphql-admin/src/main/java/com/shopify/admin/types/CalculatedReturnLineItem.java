package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A calculated return line item.
 */
public class CalculatedReturnLineItem {
  /**
   * The fulfillment line item from which items are returned.
   */
  private FulfillmentLineItem fulfillmentLineItem;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The quantity being returned.
   */
  private int quantity;

  /**
   * The restocking fee of the return line item.
   */
  private CalculatedRestockingFee restockingFee;

  /**
   * The subtotal of the return line item before order discounts.
   */
  private MoneyBag subtotalBeforeOrderDiscountsSet;

  /**
   * The subtotal of the return line item.
   */
  private MoneyBag subtotalSet;

  /**
   * The total tax of the return line item.
   */
  private MoneyBag totalTaxSet;

  public CalculatedReturnLineItem() {
  }

  /**
   * The fulfillment line item from which items are returned.
   */
  public FulfillmentLineItem getFulfillmentLineItem() {
    return fulfillmentLineItem;
  }

  public void setFulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
    this.fulfillmentLineItem = fulfillmentLineItem;
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
   * The quantity being returned.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The restocking fee of the return line item.
   */
  public CalculatedRestockingFee getRestockingFee() {
    return restockingFee;
  }

  public void setRestockingFee(CalculatedRestockingFee restockingFee) {
    this.restockingFee = restockingFee;
  }

  /**
   * The subtotal of the return line item before order discounts.
   */
  public MoneyBag getSubtotalBeforeOrderDiscountsSet() {
    return subtotalBeforeOrderDiscountsSet;
  }

  public void setSubtotalBeforeOrderDiscountsSet(MoneyBag subtotalBeforeOrderDiscountsSet) {
    this.subtotalBeforeOrderDiscountsSet = subtotalBeforeOrderDiscountsSet;
  }

  /**
   * The subtotal of the return line item.
   */
  public MoneyBag getSubtotalSet() {
    return subtotalSet;
  }

  public void setSubtotalSet(MoneyBag subtotalSet) {
    this.subtotalSet = subtotalSet;
  }

  /**
   * The total tax of the return line item.
   */
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  @Override
  public String toString() {
    return "CalculatedReturnLineItem{fulfillmentLineItem='" + fulfillmentLineItem + "', id='" + id + "', quantity='" + quantity + "', restockingFee='" + restockingFee + "', subtotalBeforeOrderDiscountsSet='" + subtotalBeforeOrderDiscountsSet + "', subtotalSet='" + subtotalSet + "', totalTaxSet='" + totalTaxSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedReturnLineItem that = (CalculatedReturnLineItem) o;
    return Objects.equals(fulfillmentLineItem, that.fulfillmentLineItem) &&
        Objects.equals(id, that.id) &&
        quantity == that.quantity &&
        Objects.equals(restockingFee, that.restockingFee) &&
        Objects.equals(subtotalBeforeOrderDiscountsSet, that.subtotalBeforeOrderDiscountsSet) &&
        Objects.equals(subtotalSet, that.subtotalSet) &&
        Objects.equals(totalTaxSet, that.totalTaxSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentLineItem, id, quantity, restockingFee, subtotalBeforeOrderDiscountsSet, subtotalSet, totalTaxSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The fulfillment line item from which items are returned.
     */
    private FulfillmentLineItem fulfillmentLineItem;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The quantity being returned.
     */
    private int quantity;

    /**
     * The restocking fee of the return line item.
     */
    private CalculatedRestockingFee restockingFee;

    /**
     * The subtotal of the return line item before order discounts.
     */
    private MoneyBag subtotalBeforeOrderDiscountsSet;

    /**
     * The subtotal of the return line item.
     */
    private MoneyBag subtotalSet;

    /**
     * The total tax of the return line item.
     */
    private MoneyBag totalTaxSet;

    public CalculatedReturnLineItem build() {
      CalculatedReturnLineItem result = new CalculatedReturnLineItem();
      result.fulfillmentLineItem = this.fulfillmentLineItem;
      result.id = this.id;
      result.quantity = this.quantity;
      result.restockingFee = this.restockingFee;
      result.subtotalBeforeOrderDiscountsSet = this.subtotalBeforeOrderDiscountsSet;
      result.subtotalSet = this.subtotalSet;
      result.totalTaxSet = this.totalTaxSet;
      return result;
    }

    /**
     * The fulfillment line item from which items are returned.
     */
    public Builder fulfillmentLineItem(FulfillmentLineItem fulfillmentLineItem) {
      this.fulfillmentLineItem = fulfillmentLineItem;
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
     * The quantity being returned.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The restocking fee of the return line item.
     */
    public Builder restockingFee(CalculatedRestockingFee restockingFee) {
      this.restockingFee = restockingFee;
      return this;
    }

    /**
     * The subtotal of the return line item before order discounts.
     */
    public Builder subtotalBeforeOrderDiscountsSet(MoneyBag subtotalBeforeOrderDiscountsSet) {
      this.subtotalBeforeOrderDiscountsSet = subtotalBeforeOrderDiscountsSet;
      return this;
    }

    /**
     * The subtotal of the return line item.
     */
    public Builder subtotalSet(MoneyBag subtotalSet) {
      this.subtotalSet = subtotalSet;
      return this;
    }

    /**
     * The total tax of the return line item.
     */
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }
  }
}

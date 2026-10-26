package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The line item being processed for a requested order edit and its calculated monetary values.
 */
public class CalculatedRequestedOrderEditLineItem {
  /**
   * The line item being processed for a requested order edit.
   */
  private LineItem lineItem;

  /**
   * The quantity being edited.
   */
  private int quantity;

  /**
   * The subtotal of the edit line item.
   */
  private MoneyBag subtotalSet;

  /**
   * The total tax of the edit line item.
   */
  private MoneyBag totalTaxSet;

  public CalculatedRequestedOrderEditLineItem() {
  }

  /**
   * The line item being processed for a requested order edit.
   */
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
  }

  /**
   * The quantity being edited.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The subtotal of the edit line item.
   */
  public MoneyBag getSubtotalSet() {
    return subtotalSet;
  }

  public void setSubtotalSet(MoneyBag subtotalSet) {
    this.subtotalSet = subtotalSet;
  }

  /**
   * The total tax of the edit line item.
   */
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  @Override
  public String toString() {
    return "CalculatedRequestedOrderEditLineItem{lineItem='" + lineItem + "', quantity='" + quantity + "', subtotalSet='" + subtotalSet + "', totalTaxSet='" + totalTaxSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedRequestedOrderEditLineItem that = (CalculatedRequestedOrderEditLineItem) o;
    return Objects.equals(lineItem, that.lineItem) &&
        quantity == that.quantity &&
        Objects.equals(subtotalSet, that.subtotalSet) &&
        Objects.equals(totalTaxSet, that.totalTaxSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItem, quantity, subtotalSet, totalTaxSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The line item being processed for a requested order edit.
     */
    private LineItem lineItem;

    /**
     * The quantity being edited.
     */
    private int quantity;

    /**
     * The subtotal of the edit line item.
     */
    private MoneyBag subtotalSet;

    /**
     * The total tax of the edit line item.
     */
    private MoneyBag totalTaxSet;

    public CalculatedRequestedOrderEditLineItem build() {
      CalculatedRequestedOrderEditLineItem result = new CalculatedRequestedOrderEditLineItem();
      result.lineItem = this.lineItem;
      result.quantity = this.quantity;
      result.subtotalSet = this.subtotalSet;
      result.totalTaxSet = this.totalTaxSet;
      return result;
    }

    /**
     * The line item being processed for a requested order edit.
     */
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }

    /**
     * The quantity being edited.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The subtotal of the edit line item.
     */
    public Builder subtotalSet(MoneyBag subtotalSet) {
      this.subtotalSet = subtotalSet;
      return this;
    }

    /**
     * The total tax of the edit line item.
     */
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }
  }
}

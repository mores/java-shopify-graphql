package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The financial breakdown of the requested order edit.
 */
public class RequestedOrderEditFinancialSummary {
  /**
   * The sum of all order level discounts that are target_all.
   */
  private MoneyBag editOrderLevelDiscountSubtotalSet;

  /**
   * The subtotal of all edit line items excluding target_all discounts.
   */
  private MoneyBag editSubtotalBeforeTargetAllDiscountsSet;

  /**
   * The subtotal of all edit line items.
   */
  private MoneyBag editSubtotalSet;

  /**
   * The subtotal of all edit line items with order level discounts applied.
   */
  private MoneyBag editSubtotalWithCartDiscountSet;

  /**
   * The total sum of all edit line items, including subtotals and taxes.
   */
  private MoneyBag editTotalSet;

  /**
   * The total tax sum of all edit line items.
   */
  private MoneyBag editTotalTaxSet;

  public RequestedOrderEditFinancialSummary() {
  }

  /**
   * The sum of all order level discounts that are target_all.
   */
  public MoneyBag getEditOrderLevelDiscountSubtotalSet() {
    return editOrderLevelDiscountSubtotalSet;
  }

  public void setEditOrderLevelDiscountSubtotalSet(MoneyBag editOrderLevelDiscountSubtotalSet) {
    this.editOrderLevelDiscountSubtotalSet = editOrderLevelDiscountSubtotalSet;
  }

  /**
   * The subtotal of all edit line items excluding target_all discounts.
   */
  public MoneyBag getEditSubtotalBeforeTargetAllDiscountsSet() {
    return editSubtotalBeforeTargetAllDiscountsSet;
  }

  public void setEditSubtotalBeforeTargetAllDiscountsSet(
      MoneyBag editSubtotalBeforeTargetAllDiscountsSet) {
    this.editSubtotalBeforeTargetAllDiscountsSet = editSubtotalBeforeTargetAllDiscountsSet;
  }

  /**
   * The subtotal of all edit line items.
   */
  public MoneyBag getEditSubtotalSet() {
    return editSubtotalSet;
  }

  public void setEditSubtotalSet(MoneyBag editSubtotalSet) {
    this.editSubtotalSet = editSubtotalSet;
  }

  /**
   * The subtotal of all edit line items with order level discounts applied.
   */
  public MoneyBag getEditSubtotalWithCartDiscountSet() {
    return editSubtotalWithCartDiscountSet;
  }

  public void setEditSubtotalWithCartDiscountSet(MoneyBag editSubtotalWithCartDiscountSet) {
    this.editSubtotalWithCartDiscountSet = editSubtotalWithCartDiscountSet;
  }

  /**
   * The total sum of all edit line items, including subtotals and taxes.
   */
  public MoneyBag getEditTotalSet() {
    return editTotalSet;
  }

  public void setEditTotalSet(MoneyBag editTotalSet) {
    this.editTotalSet = editTotalSet;
  }

  /**
   * The total tax sum of all edit line items.
   */
  public MoneyBag getEditTotalTaxSet() {
    return editTotalTaxSet;
  }

  public void setEditTotalTaxSet(MoneyBag editTotalTaxSet) {
    this.editTotalTaxSet = editTotalTaxSet;
  }

  @Override
  public String toString() {
    return "RequestedOrderEditFinancialSummary{editOrderLevelDiscountSubtotalSet='" + editOrderLevelDiscountSubtotalSet + "', editSubtotalBeforeTargetAllDiscountsSet='" + editSubtotalBeforeTargetAllDiscountsSet + "', editSubtotalSet='" + editSubtotalSet + "', editSubtotalWithCartDiscountSet='" + editSubtotalWithCartDiscountSet + "', editTotalSet='" + editTotalSet + "', editTotalTaxSet='" + editTotalTaxSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RequestedOrderEditFinancialSummary that = (RequestedOrderEditFinancialSummary) o;
    return Objects.equals(editOrderLevelDiscountSubtotalSet, that.editOrderLevelDiscountSubtotalSet) &&
        Objects.equals(editSubtotalBeforeTargetAllDiscountsSet, that.editSubtotalBeforeTargetAllDiscountsSet) &&
        Objects.equals(editSubtotalSet, that.editSubtotalSet) &&
        Objects.equals(editSubtotalWithCartDiscountSet, that.editSubtotalWithCartDiscountSet) &&
        Objects.equals(editTotalSet, that.editTotalSet) &&
        Objects.equals(editTotalTaxSet, that.editTotalTaxSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editOrderLevelDiscountSubtotalSet, editSubtotalBeforeTargetAllDiscountsSet, editSubtotalSet, editSubtotalWithCartDiscountSet, editTotalSet, editTotalTaxSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The sum of all order level discounts that are target_all.
     */
    private MoneyBag editOrderLevelDiscountSubtotalSet;

    /**
     * The subtotal of all edit line items excluding target_all discounts.
     */
    private MoneyBag editSubtotalBeforeTargetAllDiscountsSet;

    /**
     * The subtotal of all edit line items.
     */
    private MoneyBag editSubtotalSet;

    /**
     * The subtotal of all edit line items with order level discounts applied.
     */
    private MoneyBag editSubtotalWithCartDiscountSet;

    /**
     * The total sum of all edit line items, including subtotals and taxes.
     */
    private MoneyBag editTotalSet;

    /**
     * The total tax sum of all edit line items.
     */
    private MoneyBag editTotalTaxSet;

    public RequestedOrderEditFinancialSummary build() {
      RequestedOrderEditFinancialSummary result = new RequestedOrderEditFinancialSummary();
      result.editOrderLevelDiscountSubtotalSet = this.editOrderLevelDiscountSubtotalSet;
      result.editSubtotalBeforeTargetAllDiscountsSet = this.editSubtotalBeforeTargetAllDiscountsSet;
      result.editSubtotalSet = this.editSubtotalSet;
      result.editSubtotalWithCartDiscountSet = this.editSubtotalWithCartDiscountSet;
      result.editTotalSet = this.editTotalSet;
      result.editTotalTaxSet = this.editTotalTaxSet;
      return result;
    }

    /**
     * The sum of all order level discounts that are target_all.
     */
    public Builder editOrderLevelDiscountSubtotalSet(MoneyBag editOrderLevelDiscountSubtotalSet) {
      this.editOrderLevelDiscountSubtotalSet = editOrderLevelDiscountSubtotalSet;
      return this;
    }

    /**
     * The subtotal of all edit line items excluding target_all discounts.
     */
    public Builder editSubtotalBeforeTargetAllDiscountsSet(
        MoneyBag editSubtotalBeforeTargetAllDiscountsSet) {
      this.editSubtotalBeforeTargetAllDiscountsSet = editSubtotalBeforeTargetAllDiscountsSet;
      return this;
    }

    /**
     * The subtotal of all edit line items.
     */
    public Builder editSubtotalSet(MoneyBag editSubtotalSet) {
      this.editSubtotalSet = editSubtotalSet;
      return this;
    }

    /**
     * The subtotal of all edit line items with order level discounts applied.
     */
    public Builder editSubtotalWithCartDiscountSet(MoneyBag editSubtotalWithCartDiscountSet) {
      this.editSubtotalWithCartDiscountSet = editSubtotalWithCartDiscountSet;
      return this;
    }

    /**
     * The total sum of all edit line items, including subtotals and taxes.
     */
    public Builder editTotalSet(MoneyBag editTotalSet) {
      this.editTotalSet = editTotalSet;
      return this;
    }

    /**
     * The total tax sum of all edit line items.
     */
    public Builder editTotalTaxSet(MoneyBag editTotalTaxSet) {
      this.editTotalTaxSet = editTotalTaxSet;
      return this;
    }
  }
}

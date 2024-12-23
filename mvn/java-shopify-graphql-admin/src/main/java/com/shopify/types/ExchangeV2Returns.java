package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return items associated to the exchange.
 */
public class ExchangeV2Returns {
  /**
   * The list of return items for the exchange.
   */
  private List<ExchangeV2LineItem> lineItems;

  /**
   * The amount of the order-level discount for the items and shipping being
   * returned, which doesn't contain any line item discounts.
   */
  private MoneyBag orderDiscountAmountSet;

  /**
   * The amount of money to be refunded for shipping.
   */
  private MoneyBag shippingRefundAmountSet;

  /**
   * The subtotal of the items being returned.
   */
  private MoneyBag subtotalPriceSet;

  /**
   * The summary of all taxes of the items being returned.
   */
  private List<TaxLine> taxLines;

  /**
   * The amount of money to be refunded for tip.
   */
  private MoneyBag tipRefundAmountSet;

  /**
   * The total value of the items being returned.
   */
  private MoneyBag totalPriceSet;

  public ExchangeV2Returns() {
  }

  /**
   * The list of return items for the exchange.
   */
  public List<ExchangeV2LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<ExchangeV2LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The amount of the order-level discount for the items and shipping being
   * returned, which doesn't contain any line item discounts.
   */
  public MoneyBag getOrderDiscountAmountSet() {
    return orderDiscountAmountSet;
  }

  public void setOrderDiscountAmountSet(MoneyBag orderDiscountAmountSet) {
    this.orderDiscountAmountSet = orderDiscountAmountSet;
  }

  /**
   * The amount of money to be refunded for shipping.
   */
  public MoneyBag getShippingRefundAmountSet() {
    return shippingRefundAmountSet;
  }

  public void setShippingRefundAmountSet(MoneyBag shippingRefundAmountSet) {
    this.shippingRefundAmountSet = shippingRefundAmountSet;
  }

  /**
   * The subtotal of the items being returned.
   */
  public MoneyBag getSubtotalPriceSet() {
    return subtotalPriceSet;
  }

  public void setSubtotalPriceSet(MoneyBag subtotalPriceSet) {
    this.subtotalPriceSet = subtotalPriceSet;
  }

  /**
   * The summary of all taxes of the items being returned.
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * The amount of money to be refunded for tip.
   */
  public MoneyBag getTipRefundAmountSet() {
    return tipRefundAmountSet;
  }

  public void setTipRefundAmountSet(MoneyBag tipRefundAmountSet) {
    this.tipRefundAmountSet = tipRefundAmountSet;
  }

  /**
   * The total value of the items being returned.
   */
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  @Override
  public String toString() {
    return "ExchangeV2Returns{lineItems='" + lineItems + "', orderDiscountAmountSet='" + orderDiscountAmountSet + "', shippingRefundAmountSet='" + shippingRefundAmountSet + "', subtotalPriceSet='" + subtotalPriceSet + "', taxLines='" + taxLines + "', tipRefundAmountSet='" + tipRefundAmountSet + "', totalPriceSet='" + totalPriceSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeV2Returns that = (ExchangeV2Returns) o;
    return Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(orderDiscountAmountSet, that.orderDiscountAmountSet) &&
        Objects.equals(shippingRefundAmountSet, that.shippingRefundAmountSet) &&
        Objects.equals(subtotalPriceSet, that.subtotalPriceSet) &&
        Objects.equals(taxLines, that.taxLines) &&
        Objects.equals(tipRefundAmountSet, that.tipRefundAmountSet) &&
        Objects.equals(totalPriceSet, that.totalPriceSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItems, orderDiscountAmountSet, shippingRefundAmountSet, subtotalPriceSet, taxLines, tipRefundAmountSet, totalPriceSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of return items for the exchange.
     */
    private List<ExchangeV2LineItem> lineItems;

    /**
     * The amount of the order-level discount for the items and shipping being
     * returned, which doesn't contain any line item discounts.
     */
    private MoneyBag orderDiscountAmountSet;

    /**
     * The amount of money to be refunded for shipping.
     */
    private MoneyBag shippingRefundAmountSet;

    /**
     * The subtotal of the items being returned.
     */
    private MoneyBag subtotalPriceSet;

    /**
     * The summary of all taxes of the items being returned.
     */
    private List<TaxLine> taxLines;

    /**
     * The amount of money to be refunded for tip.
     */
    private MoneyBag tipRefundAmountSet;

    /**
     * The total value of the items being returned.
     */
    private MoneyBag totalPriceSet;

    public ExchangeV2Returns build() {
      ExchangeV2Returns result = new ExchangeV2Returns();
      result.lineItems = this.lineItems;
      result.orderDiscountAmountSet = this.orderDiscountAmountSet;
      result.shippingRefundAmountSet = this.shippingRefundAmountSet;
      result.subtotalPriceSet = this.subtotalPriceSet;
      result.taxLines = this.taxLines;
      result.tipRefundAmountSet = this.tipRefundAmountSet;
      result.totalPriceSet = this.totalPriceSet;
      return result;
    }

    /**
     * The list of return items for the exchange.
     */
    public Builder lineItems(List<ExchangeV2LineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The amount of the order-level discount for the items and shipping being
     * returned, which doesn't contain any line item discounts.
     */
    public Builder orderDiscountAmountSet(MoneyBag orderDiscountAmountSet) {
      this.orderDiscountAmountSet = orderDiscountAmountSet;
      return this;
    }

    /**
     * The amount of money to be refunded for shipping.
     */
    public Builder shippingRefundAmountSet(MoneyBag shippingRefundAmountSet) {
      this.shippingRefundAmountSet = shippingRefundAmountSet;
      return this;
    }

    /**
     * The subtotal of the items being returned.
     */
    public Builder subtotalPriceSet(MoneyBag subtotalPriceSet) {
      this.subtotalPriceSet = subtotalPriceSet;
      return this;
    }

    /**
     * The summary of all taxes of the items being returned.
     */
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    /**
     * The amount of money to be refunded for tip.
     */
    public Builder tipRefundAmountSet(MoneyBag tipRefundAmountSet) {
      this.tipRefundAmountSet = tipRefundAmountSet;
      return this;
    }

    /**
     * The total value of the items being returned.
     */
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }
  }
}

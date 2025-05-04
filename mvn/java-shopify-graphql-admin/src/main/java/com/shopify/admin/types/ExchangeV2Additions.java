package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * New items associated to the exchange.
 */
public class ExchangeV2Additions {
  /**
   * The list of new items for the exchange.
   */
  private List<ExchangeV2LineItem> lineItems;

  /**
   * The subtotal of the items being added, including discounts.
   */
  private MoneyBag subtotalPriceSet;

  /**
   * The summary of all taxes of the items being added.
   */
  private List<TaxLine> taxLines;

  /**
   * The total price of the items being added, including discounts and taxes.
   */
  private MoneyBag totalPriceSet;

  public ExchangeV2Additions() {
  }

  /**
   * The list of new items for the exchange.
   */
  public List<ExchangeV2LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<ExchangeV2LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The subtotal of the items being added, including discounts.
   */
  public MoneyBag getSubtotalPriceSet() {
    return subtotalPriceSet;
  }

  public void setSubtotalPriceSet(MoneyBag subtotalPriceSet) {
    this.subtotalPriceSet = subtotalPriceSet;
  }

  /**
   * The summary of all taxes of the items being added.
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * The total price of the items being added, including discounts and taxes.
   */
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  @Override
  public String toString() {
    return "ExchangeV2Additions{lineItems='" + lineItems + "', subtotalPriceSet='" + subtotalPriceSet + "', taxLines='" + taxLines + "', totalPriceSet='" + totalPriceSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeV2Additions that = (ExchangeV2Additions) o;
    return Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(subtotalPriceSet, that.subtotalPriceSet) &&
        Objects.equals(taxLines, that.taxLines) &&
        Objects.equals(totalPriceSet, that.totalPriceSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineItems, subtotalPriceSet, taxLines, totalPriceSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of new items for the exchange.
     */
    private List<ExchangeV2LineItem> lineItems;

    /**
     * The subtotal of the items being added, including discounts.
     */
    private MoneyBag subtotalPriceSet;

    /**
     * The summary of all taxes of the items being added.
     */
    private List<TaxLine> taxLines;

    /**
     * The total price of the items being added, including discounts and taxes.
     */
    private MoneyBag totalPriceSet;

    public ExchangeV2Additions build() {
      ExchangeV2Additions result = new ExchangeV2Additions();
      result.lineItems = this.lineItems;
      result.subtotalPriceSet = this.subtotalPriceSet;
      result.taxLines = this.taxLines;
      result.totalPriceSet = this.totalPriceSet;
      return result;
    }

    /**
     * The list of new items for the exchange.
     */
    public Builder lineItems(List<ExchangeV2LineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The subtotal of the items being added, including discounts.
     */
    public Builder subtotalPriceSet(MoneyBag subtotalPriceSet) {
      this.subtotalPriceSet = subtotalPriceSet;
      return this;
    }

    /**
     * The summary of all taxes of the items being added.
     */
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    /**
     * The total price of the items being added, including discounts and taxes.
     */
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }
  }
}

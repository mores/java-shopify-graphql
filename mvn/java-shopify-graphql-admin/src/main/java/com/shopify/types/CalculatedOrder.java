package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * An order with edits applied but not saved.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CalculatedOrder implements com.shopify.types.Node {
  /**
   * Returns only the new discount applications being added to the order in the current edit.
   */
  private CalculatedDiscountApplicationConnection addedDiscountApplications;

  /**
   * Returns only the new line items being added to the order during the current edit.
   */
  private CalculatedLineItemConnection addedLineItems;

  /**
   * Amount of the order-level discount (doesn't contain any line item discounts) in shop and presentment currencies.
   */
  private MoneyBag cartDiscountAmountSet;

  /**
   * Whether the changes have been applied and saved to the order.
   */
  private boolean committed;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Returns all items on the order that existed before starting the edit.
   * Will include any changes that have been made.
   * Will not include line items added during the current edit.
   */
  private CalculatedLineItemConnection lineItems;

  /**
   * The HTML of the customer notification for the order edit.
   */
  private String notificationPreviewHtml;

  /**
   * The customer notification title.
   */
  private String notificationPreviewTitle;

  /**
   * The order without any changes applied.
   */
  private Order originalOrder;

  /**
   * Returns the shipping lines on the order that existed before starting the edit.
   * Will include any changes that have been made as well as shipping lines added during the current edit.
   * Returns only the first 250 shipping lines.
   */
  private List<CalculatedShippingLine> shippingLines;

  /**
   * List of changes made to the order during the current edit.
   */
  private OrderStagedChangeConnection stagedChanges;

  /**
   * The sum of the quantities for the line items that contribute to the order's subtotal.
   */
  private int subtotalLineItemsQuantity;

  /**
   * The subtotal of the line items, in shop and presentment currencies, after all
   * the discounts are applied.  The subtotal doesn't include shipping.  The
   * subtotal includes taxes for taxes-included orders and excludes taxes for
   * taxes-excluded orders.
   */
  private MoneyBag subtotalPriceSet;

  /**
   * Taxes charged for the line item.
   */
  private List<TaxLine> taxLines;

  /**
   * Total price of the order less the total amount received from the customer in shop and presentment currencies.
   */
  private MoneyBag totalOutstandingSet;

  /**
   * Total amount of the order (includes taxes and discounts) in shop and presentment currencies.
   */
  private MoneyBag totalPriceSet;

  public CalculatedOrder() {
  }

  /**
   * Returns only the new discount applications being added to the order in the current edit.
   */
  public CalculatedDiscountApplicationConnection getAddedDiscountApplications() {
    return addedDiscountApplications;
  }

  public void setAddedDiscountApplications(
      CalculatedDiscountApplicationConnection addedDiscountApplications) {
    this.addedDiscountApplications = addedDiscountApplications;
  }

  /**
   * Returns only the new line items being added to the order during the current edit.
   */
  public CalculatedLineItemConnection getAddedLineItems() {
    return addedLineItems;
  }

  public void setAddedLineItems(CalculatedLineItemConnection addedLineItems) {
    this.addedLineItems = addedLineItems;
  }

  /**
   * Amount of the order-level discount (doesn't contain any line item discounts) in shop and presentment currencies.
   */
  public MoneyBag getCartDiscountAmountSet() {
    return cartDiscountAmountSet;
  }

  public void setCartDiscountAmountSet(MoneyBag cartDiscountAmountSet) {
    this.cartDiscountAmountSet = cartDiscountAmountSet;
  }

  /**
   * Whether the changes have been applied and saved to the order.
   */
  public boolean getCommitted() {
    return committed;
  }

  public void setCommitted(boolean committed) {
    this.committed = committed;
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
   * Returns all items on the order that existed before starting the edit.
   * Will include any changes that have been made.
   * Will not include line items added during the current edit.
   */
  public CalculatedLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(CalculatedLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The HTML of the customer notification for the order edit.
   */
  public String getNotificationPreviewHtml() {
    return notificationPreviewHtml;
  }

  public void setNotificationPreviewHtml(String notificationPreviewHtml) {
    this.notificationPreviewHtml = notificationPreviewHtml;
  }

  /**
   * The customer notification title.
   */
  public String getNotificationPreviewTitle() {
    return notificationPreviewTitle;
  }

  public void setNotificationPreviewTitle(String notificationPreviewTitle) {
    this.notificationPreviewTitle = notificationPreviewTitle;
  }

  /**
   * The order without any changes applied.
   */
  public Order getOriginalOrder() {
    return originalOrder;
  }

  public void setOriginalOrder(Order originalOrder) {
    this.originalOrder = originalOrder;
  }

  /**
   * Returns the shipping lines on the order that existed before starting the edit.
   * Will include any changes that have been made as well as shipping lines added during the current edit.
   * Returns only the first 250 shipping lines.
   */
  public List<CalculatedShippingLine> getShippingLines() {
    return shippingLines;
  }

  public void setShippingLines(List<CalculatedShippingLine> shippingLines) {
    this.shippingLines = shippingLines;
  }

  /**
   * List of changes made to the order during the current edit.
   */
  public OrderStagedChangeConnection getStagedChanges() {
    return stagedChanges;
  }

  public void setStagedChanges(OrderStagedChangeConnection stagedChanges) {
    this.stagedChanges = stagedChanges;
  }

  /**
   * The sum of the quantities for the line items that contribute to the order's subtotal.
   */
  public int getSubtotalLineItemsQuantity() {
    return subtotalLineItemsQuantity;
  }

  public void setSubtotalLineItemsQuantity(int subtotalLineItemsQuantity) {
    this.subtotalLineItemsQuantity = subtotalLineItemsQuantity;
  }

  /**
   * The subtotal of the line items, in shop and presentment currencies, after all
   * the discounts are applied.  The subtotal doesn't include shipping.  The
   * subtotal includes taxes for taxes-included orders and excludes taxes for
   * taxes-excluded orders.
   */
  public MoneyBag getSubtotalPriceSet() {
    return subtotalPriceSet;
  }

  public void setSubtotalPriceSet(MoneyBag subtotalPriceSet) {
    this.subtotalPriceSet = subtotalPriceSet;
  }

  /**
   * Taxes charged for the line item.
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * Total price of the order less the total amount received from the customer in shop and presentment currencies.
   */
  public MoneyBag getTotalOutstandingSet() {
    return totalOutstandingSet;
  }

  public void setTotalOutstandingSet(MoneyBag totalOutstandingSet) {
    this.totalOutstandingSet = totalOutstandingSet;
  }

  /**
   * Total amount of the order (includes taxes and discounts) in shop and presentment currencies.
   */
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  @Override
  public String toString() {
    return "CalculatedOrder{addedDiscountApplications='" + addedDiscountApplications + "', addedLineItems='" + addedLineItems + "', cartDiscountAmountSet='" + cartDiscountAmountSet + "', committed='" + committed + "', id='" + id + "', lineItems='" + lineItems + "', notificationPreviewHtml='" + notificationPreviewHtml + "', notificationPreviewTitle='" + notificationPreviewTitle + "', originalOrder='" + originalOrder + "', shippingLines='" + shippingLines + "', stagedChanges='" + stagedChanges + "', subtotalLineItemsQuantity='" + subtotalLineItemsQuantity + "', subtotalPriceSet='" + subtotalPriceSet + "', taxLines='" + taxLines + "', totalOutstandingSet='" + totalOutstandingSet + "', totalPriceSet='" + totalPriceSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedOrder that = (CalculatedOrder) o;
    return Objects.equals(addedDiscountApplications, that.addedDiscountApplications) &&
        Objects.equals(addedLineItems, that.addedLineItems) &&
        Objects.equals(cartDiscountAmountSet, that.cartDiscountAmountSet) &&
        committed == that.committed &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(notificationPreviewHtml, that.notificationPreviewHtml) &&
        Objects.equals(notificationPreviewTitle, that.notificationPreviewTitle) &&
        Objects.equals(originalOrder, that.originalOrder) &&
        Objects.equals(shippingLines, that.shippingLines) &&
        Objects.equals(stagedChanges, that.stagedChanges) &&
        subtotalLineItemsQuantity == that.subtotalLineItemsQuantity &&
        Objects.equals(subtotalPriceSet, that.subtotalPriceSet) &&
        Objects.equals(taxLines, that.taxLines) &&
        Objects.equals(totalOutstandingSet, that.totalOutstandingSet) &&
        Objects.equals(totalPriceSet, that.totalPriceSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedDiscountApplications, addedLineItems, cartDiscountAmountSet, committed, id, lineItems, notificationPreviewHtml, notificationPreviewTitle, originalOrder, shippingLines, stagedChanges, subtotalLineItemsQuantity, subtotalPriceSet, taxLines, totalOutstandingSet, totalPriceSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Returns only the new discount applications being added to the order in the current edit.
     */
    private CalculatedDiscountApplicationConnection addedDiscountApplications;

    /**
     * Returns only the new line items being added to the order during the current edit.
     */
    private CalculatedLineItemConnection addedLineItems;

    /**
     * Amount of the order-level discount (doesn't contain any line item discounts) in shop and presentment currencies.
     */
    private MoneyBag cartDiscountAmountSet;

    /**
     * Whether the changes have been applied and saved to the order.
     */
    private boolean committed;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Returns all items on the order that existed before starting the edit.
     * Will include any changes that have been made.
     * Will not include line items added during the current edit.
     */
    private CalculatedLineItemConnection lineItems;

    /**
     * The HTML of the customer notification for the order edit.
     */
    private String notificationPreviewHtml;

    /**
     * The customer notification title.
     */
    private String notificationPreviewTitle;

    /**
     * The order without any changes applied.
     */
    private Order originalOrder;

    /**
     * Returns the shipping lines on the order that existed before starting the edit.
     * Will include any changes that have been made as well as shipping lines added during the current edit.
     * Returns only the first 250 shipping lines.
     */
    private List<CalculatedShippingLine> shippingLines;

    /**
     * List of changes made to the order during the current edit.
     */
    private OrderStagedChangeConnection stagedChanges;

    /**
     * The sum of the quantities for the line items that contribute to the order's subtotal.
     */
    private int subtotalLineItemsQuantity;

    /**
     * The subtotal of the line items, in shop and presentment currencies, after all
     * the discounts are applied.  The subtotal doesn't include shipping.  The
     * subtotal includes taxes for taxes-included orders and excludes taxes for
     * taxes-excluded orders.
     */
    private MoneyBag subtotalPriceSet;

    /**
     * Taxes charged for the line item.
     */
    private List<TaxLine> taxLines;

    /**
     * Total price of the order less the total amount received from the customer in shop and presentment currencies.
     */
    private MoneyBag totalOutstandingSet;

    /**
     * Total amount of the order (includes taxes and discounts) in shop and presentment currencies.
     */
    private MoneyBag totalPriceSet;

    public CalculatedOrder build() {
      CalculatedOrder result = new CalculatedOrder();
      result.addedDiscountApplications = this.addedDiscountApplications;
      result.addedLineItems = this.addedLineItems;
      result.cartDiscountAmountSet = this.cartDiscountAmountSet;
      result.committed = this.committed;
      result.id = this.id;
      result.lineItems = this.lineItems;
      result.notificationPreviewHtml = this.notificationPreviewHtml;
      result.notificationPreviewTitle = this.notificationPreviewTitle;
      result.originalOrder = this.originalOrder;
      result.shippingLines = this.shippingLines;
      result.stagedChanges = this.stagedChanges;
      result.subtotalLineItemsQuantity = this.subtotalLineItemsQuantity;
      result.subtotalPriceSet = this.subtotalPriceSet;
      result.taxLines = this.taxLines;
      result.totalOutstandingSet = this.totalOutstandingSet;
      result.totalPriceSet = this.totalPriceSet;
      return result;
    }

    /**
     * Returns only the new discount applications being added to the order in the current edit.
     */
    public Builder addedDiscountApplications(
        CalculatedDiscountApplicationConnection addedDiscountApplications) {
      this.addedDiscountApplications = addedDiscountApplications;
      return this;
    }

    /**
     * Returns only the new line items being added to the order during the current edit.
     */
    public Builder addedLineItems(CalculatedLineItemConnection addedLineItems) {
      this.addedLineItems = addedLineItems;
      return this;
    }

    /**
     * Amount of the order-level discount (doesn't contain any line item discounts) in shop and presentment currencies.
     */
    public Builder cartDiscountAmountSet(MoneyBag cartDiscountAmountSet) {
      this.cartDiscountAmountSet = cartDiscountAmountSet;
      return this;
    }

    /**
     * Whether the changes have been applied and saved to the order.
     */
    public Builder committed(boolean committed) {
      this.committed = committed;
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
     * Returns all items on the order that existed before starting the edit.
     * Will include any changes that have been made.
     * Will not include line items added during the current edit.
     */
    public Builder lineItems(CalculatedLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The HTML of the customer notification for the order edit.
     */
    public Builder notificationPreviewHtml(String notificationPreviewHtml) {
      this.notificationPreviewHtml = notificationPreviewHtml;
      return this;
    }

    /**
     * The customer notification title.
     */
    public Builder notificationPreviewTitle(String notificationPreviewTitle) {
      this.notificationPreviewTitle = notificationPreviewTitle;
      return this;
    }

    /**
     * The order without any changes applied.
     */
    public Builder originalOrder(Order originalOrder) {
      this.originalOrder = originalOrder;
      return this;
    }

    /**
     * Returns the shipping lines on the order that existed before starting the edit.
     * Will include any changes that have been made as well as shipping lines added during the current edit.
     * Returns only the first 250 shipping lines.
     */
    public Builder shippingLines(List<CalculatedShippingLine> shippingLines) {
      this.shippingLines = shippingLines;
      return this;
    }

    /**
     * List of changes made to the order during the current edit.
     */
    public Builder stagedChanges(OrderStagedChangeConnection stagedChanges) {
      this.stagedChanges = stagedChanges;
      return this;
    }

    /**
     * The sum of the quantities for the line items that contribute to the order's subtotal.
     */
    public Builder subtotalLineItemsQuantity(int subtotalLineItemsQuantity) {
      this.subtotalLineItemsQuantity = subtotalLineItemsQuantity;
      return this;
    }

    /**
     * The subtotal of the line items, in shop and presentment currencies, after all
     * the discounts are applied.  The subtotal doesn't include shipping.  The
     * subtotal includes taxes for taxes-included orders and excludes taxes for
     * taxes-excluded orders.
     */
    public Builder subtotalPriceSet(MoneyBag subtotalPriceSet) {
      this.subtotalPriceSet = subtotalPriceSet;
      return this;
    }

    /**
     * Taxes charged for the line item.
     */
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    /**
     * Total price of the order less the total amount received from the customer in shop and presentment currencies.
     */
    public Builder totalOutstandingSet(MoneyBag totalOutstandingSet) {
      this.totalOutstandingSet = totalOutstandingSet;
      return this;
    }

    /**
     * Total amount of the order (includes taxes and discounts) in shop and presentment currencies.
     */
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }
  }
}

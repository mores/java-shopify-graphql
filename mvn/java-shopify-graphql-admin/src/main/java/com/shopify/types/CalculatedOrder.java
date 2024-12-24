package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CalculatedOrder implements com.shopify.types.Node {
  
  private CalculatedDiscountApplicationConnection addedDiscountApplications;

  
  private CalculatedLineItemConnection addedLineItems;

  
  private MoneyBag cartDiscountAmountSet;

  
  private boolean committed;

  
  private String id;

  
  private CalculatedLineItemConnection lineItems;

  
  private String notificationPreviewHtml;

  
  private String notificationPreviewTitle;

  
  private Order originalOrder;

  
  private List<CalculatedShippingLine> shippingLines;

  
  private OrderStagedChangeConnection stagedChanges;

  
  private int subtotalLineItemsQuantity;

  
  private MoneyBag subtotalPriceSet;

  
  private List<TaxLine> taxLines;

  
  private MoneyBag totalOutstandingSet;

  
  private MoneyBag totalPriceSet;

  public CalculatedOrder() {
  }

  
  public CalculatedDiscountApplicationConnection getAddedDiscountApplications() {
    return addedDiscountApplications;
  }

  public void setAddedDiscountApplications(
      CalculatedDiscountApplicationConnection addedDiscountApplications) {
    this.addedDiscountApplications = addedDiscountApplications;
  }

  
  public CalculatedLineItemConnection getAddedLineItems() {
    return addedLineItems;
  }

  public void setAddedLineItems(CalculatedLineItemConnection addedLineItems) {
    this.addedLineItems = addedLineItems;
  }

  
  public MoneyBag getCartDiscountAmountSet() {
    return cartDiscountAmountSet;
  }

  public void setCartDiscountAmountSet(MoneyBag cartDiscountAmountSet) {
    this.cartDiscountAmountSet = cartDiscountAmountSet;
  }

  
  public boolean getCommitted() {
    return committed;
  }

  public void setCommitted(boolean committed) {
    this.committed = committed;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public CalculatedLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(CalculatedLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  
  public String getNotificationPreviewHtml() {
    return notificationPreviewHtml;
  }

  public void setNotificationPreviewHtml(String notificationPreviewHtml) {
    this.notificationPreviewHtml = notificationPreviewHtml;
  }

  
  public String getNotificationPreviewTitle() {
    return notificationPreviewTitle;
  }

  public void setNotificationPreviewTitle(String notificationPreviewTitle) {
    this.notificationPreviewTitle = notificationPreviewTitle;
  }

  
  public Order getOriginalOrder() {
    return originalOrder;
  }

  public void setOriginalOrder(Order originalOrder) {
    this.originalOrder = originalOrder;
  }

  
  public List<CalculatedShippingLine> getShippingLines() {
    return shippingLines;
  }

  public void setShippingLines(List<CalculatedShippingLine> shippingLines) {
    this.shippingLines = shippingLines;
  }

  
  public OrderStagedChangeConnection getStagedChanges() {
    return stagedChanges;
  }

  public void setStagedChanges(OrderStagedChangeConnection stagedChanges) {
    this.stagedChanges = stagedChanges;
  }

  
  public int getSubtotalLineItemsQuantity() {
    return subtotalLineItemsQuantity;
  }

  public void setSubtotalLineItemsQuantity(int subtotalLineItemsQuantity) {
    this.subtotalLineItemsQuantity = subtotalLineItemsQuantity;
  }

  
  public MoneyBag getSubtotalPriceSet() {
    return subtotalPriceSet;
  }

  public void setSubtotalPriceSet(MoneyBag subtotalPriceSet) {
    this.subtotalPriceSet = subtotalPriceSet;
  }

  
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  
  public MoneyBag getTotalOutstandingSet() {
    return totalOutstandingSet;
  }

  public void setTotalOutstandingSet(MoneyBag totalOutstandingSet) {
    this.totalOutstandingSet = totalOutstandingSet;
  }

  
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
    
    private CalculatedDiscountApplicationConnection addedDiscountApplications;

    
    private CalculatedLineItemConnection addedLineItems;

    
    private MoneyBag cartDiscountAmountSet;

    
    private boolean committed;

    
    private String id;

    
    private CalculatedLineItemConnection lineItems;

    
    private String notificationPreviewHtml;

    
    private String notificationPreviewTitle;

    
    private Order originalOrder;

    
    private List<CalculatedShippingLine> shippingLines;

    
    private OrderStagedChangeConnection stagedChanges;

    
    private int subtotalLineItemsQuantity;

    
    private MoneyBag subtotalPriceSet;

    
    private List<TaxLine> taxLines;

    
    private MoneyBag totalOutstandingSet;

    
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

    
    public Builder addedDiscountApplications(
        CalculatedDiscountApplicationConnection addedDiscountApplications) {
      this.addedDiscountApplications = addedDiscountApplications;
      return this;
    }

    
    public Builder addedLineItems(CalculatedLineItemConnection addedLineItems) {
      this.addedLineItems = addedLineItems;
      return this;
    }

    
    public Builder cartDiscountAmountSet(MoneyBag cartDiscountAmountSet) {
      this.cartDiscountAmountSet = cartDiscountAmountSet;
      return this;
    }

    
    public Builder committed(boolean committed) {
      this.committed = committed;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder lineItems(CalculatedLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    
    public Builder notificationPreviewHtml(String notificationPreviewHtml) {
      this.notificationPreviewHtml = notificationPreviewHtml;
      return this;
    }

    
    public Builder notificationPreviewTitle(String notificationPreviewTitle) {
      this.notificationPreviewTitle = notificationPreviewTitle;
      return this;
    }

    
    public Builder originalOrder(Order originalOrder) {
      this.originalOrder = originalOrder;
      return this;
    }

    
    public Builder shippingLines(List<CalculatedShippingLine> shippingLines) {
      this.shippingLines = shippingLines;
      return this;
    }

    
    public Builder stagedChanges(OrderStagedChangeConnection stagedChanges) {
      this.stagedChanges = stagedChanges;
      return this;
    }

    
    public Builder subtotalLineItemsQuantity(int subtotalLineItemsQuantity) {
      this.subtotalLineItemsQuantity = subtotalLineItemsQuantity;
      return this;
    }

    
    public Builder subtotalPriceSet(MoneyBag subtotalPriceSet) {
      this.subtotalPriceSet = subtotalPriceSet;
      return this;
    }

    
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    
    public Builder totalOutstandingSet(MoneyBag totalOutstandingSet) {
      this.totalOutstandingSet = totalOutstandingSet;
      return this;
    }

    
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }
  }
}

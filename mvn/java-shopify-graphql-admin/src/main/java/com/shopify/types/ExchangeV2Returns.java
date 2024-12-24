package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ExchangeV2Returns {
  
  private List<ExchangeV2LineItem> lineItems;

  
  private MoneyBag orderDiscountAmountSet;

  
  private MoneyBag shippingRefundAmountSet;

  
  private MoneyBag subtotalPriceSet;

  
  private List<TaxLine> taxLines;

  
  private MoneyBag tipRefundAmountSet;

  
  private MoneyBag totalPriceSet;

  public ExchangeV2Returns() {
  }

  
  public List<ExchangeV2LineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<ExchangeV2LineItem> lineItems) {
    this.lineItems = lineItems;
  }

  
  public MoneyBag getOrderDiscountAmountSet() {
    return orderDiscountAmountSet;
  }

  public void setOrderDiscountAmountSet(MoneyBag orderDiscountAmountSet) {
    this.orderDiscountAmountSet = orderDiscountAmountSet;
  }

  
  public MoneyBag getShippingRefundAmountSet() {
    return shippingRefundAmountSet;
  }

  public void setShippingRefundAmountSet(MoneyBag shippingRefundAmountSet) {
    this.shippingRefundAmountSet = shippingRefundAmountSet;
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

  
  public MoneyBag getTipRefundAmountSet() {
    return tipRefundAmountSet;
  }

  public void setTipRefundAmountSet(MoneyBag tipRefundAmountSet) {
    this.tipRefundAmountSet = tipRefundAmountSet;
  }

  
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
    
    private List<ExchangeV2LineItem> lineItems;

    
    private MoneyBag orderDiscountAmountSet;

    
    private MoneyBag shippingRefundAmountSet;

    
    private MoneyBag subtotalPriceSet;

    
    private List<TaxLine> taxLines;

    
    private MoneyBag tipRefundAmountSet;

    
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

    
    public Builder lineItems(List<ExchangeV2LineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    
    public Builder orderDiscountAmountSet(MoneyBag orderDiscountAmountSet) {
      this.orderDiscountAmountSet = orderDiscountAmountSet;
      return this;
    }

    
    public Builder shippingRefundAmountSet(MoneyBag shippingRefundAmountSet) {
      this.shippingRefundAmountSet = shippingRefundAmountSet;
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

    
    public Builder tipRefundAmountSet(MoneyBag tipRefundAmountSet) {
      this.tipRefundAmountSet = tipRefundAmountSet;
      return this;
    }

    
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }
  }
}

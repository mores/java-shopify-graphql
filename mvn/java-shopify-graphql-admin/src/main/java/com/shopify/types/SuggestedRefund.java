package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SuggestedRefund {
  
  private String amount;

  
  private MoneyBag amountSet;

  
  private MoneyBag discountedSubtotalSet;

  
  private String maximumRefundable;

  
  private MoneyBag maximumRefundableSet;

  
  private List<RefundDuty> refundDuties;

  
  private List<RefundLineItem> refundLineItems;

  
  private ShippingRefund shipping;

  
  private String subtotal;

  
  private MoneyBag subtotalSet;

  
  private List<SuggestedOrderTransaction> suggestedTransactions;

  
  private MoneyBag totalCartDiscountAmountSet;

  
  private MoneyBag totalDutiesSet;

  
  private MoneyBag totalTaxSet;

  
  private String totalTaxes;

  public SuggestedRefund() {
  }

  
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  
  public MoneyBag getDiscountedSubtotalSet() {
    return discountedSubtotalSet;
  }

  public void setDiscountedSubtotalSet(MoneyBag discountedSubtotalSet) {
    this.discountedSubtotalSet = discountedSubtotalSet;
  }

  
  public String getMaximumRefundable() {
    return maximumRefundable;
  }

  public void setMaximumRefundable(String maximumRefundable) {
    this.maximumRefundable = maximumRefundable;
  }

  
  public MoneyBag getMaximumRefundableSet() {
    return maximumRefundableSet;
  }

  public void setMaximumRefundableSet(MoneyBag maximumRefundableSet) {
    this.maximumRefundableSet = maximumRefundableSet;
  }

  
  public List<RefundDuty> getRefundDuties() {
    return refundDuties;
  }

  public void setRefundDuties(List<RefundDuty> refundDuties) {
    this.refundDuties = refundDuties;
  }

  
  public List<RefundLineItem> getRefundLineItems() {
    return refundLineItems;
  }

  public void setRefundLineItems(List<RefundLineItem> refundLineItems) {
    this.refundLineItems = refundLineItems;
  }

  
  public ShippingRefund getShipping() {
    return shipping;
  }

  public void setShipping(ShippingRefund shipping) {
    this.shipping = shipping;
  }

  
  public String getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(String subtotal) {
    this.subtotal = subtotal;
  }

  
  public MoneyBag getSubtotalSet() {
    return subtotalSet;
  }

  public void setSubtotalSet(MoneyBag subtotalSet) {
    this.subtotalSet = subtotalSet;
  }

  
  public List<SuggestedOrderTransaction> getSuggestedTransactions() {
    return suggestedTransactions;
  }

  public void setSuggestedTransactions(List<SuggestedOrderTransaction> suggestedTransactions) {
    this.suggestedTransactions = suggestedTransactions;
  }

  
  public MoneyBag getTotalCartDiscountAmountSet() {
    return totalCartDiscountAmountSet;
  }

  public void setTotalCartDiscountAmountSet(MoneyBag totalCartDiscountAmountSet) {
    this.totalCartDiscountAmountSet = totalCartDiscountAmountSet;
  }

  
  public MoneyBag getTotalDutiesSet() {
    return totalDutiesSet;
  }

  public void setTotalDutiesSet(MoneyBag totalDutiesSet) {
    this.totalDutiesSet = totalDutiesSet;
  }

  
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  
  public String getTotalTaxes() {
    return totalTaxes;
  }

  public void setTotalTaxes(String totalTaxes) {
    this.totalTaxes = totalTaxes;
  }

  @Override
  public String toString() {
    return "SuggestedRefund{amount='" + amount + "', amountSet='" + amountSet + "', discountedSubtotalSet='" + discountedSubtotalSet + "', maximumRefundable='" + maximumRefundable + "', maximumRefundableSet='" + maximumRefundableSet + "', refundDuties='" + refundDuties + "', refundLineItems='" + refundLineItems + "', shipping='" + shipping + "', subtotal='" + subtotal + "', subtotalSet='" + subtotalSet + "', suggestedTransactions='" + suggestedTransactions + "', totalCartDiscountAmountSet='" + totalCartDiscountAmountSet + "', totalDutiesSet='" + totalDutiesSet + "', totalTaxSet='" + totalTaxSet + "', totalTaxes='" + totalTaxes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SuggestedRefund that = (SuggestedRefund) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(discountedSubtotalSet, that.discountedSubtotalSet) &&
        Objects.equals(maximumRefundable, that.maximumRefundable) &&
        Objects.equals(maximumRefundableSet, that.maximumRefundableSet) &&
        Objects.equals(refundDuties, that.refundDuties) &&
        Objects.equals(refundLineItems, that.refundLineItems) &&
        Objects.equals(shipping, that.shipping) &&
        Objects.equals(subtotal, that.subtotal) &&
        Objects.equals(subtotalSet, that.subtotalSet) &&
        Objects.equals(suggestedTransactions, that.suggestedTransactions) &&
        Objects.equals(totalCartDiscountAmountSet, that.totalCartDiscountAmountSet) &&
        Objects.equals(totalDutiesSet, that.totalDutiesSet) &&
        Objects.equals(totalTaxSet, that.totalTaxSet) &&
        Objects.equals(totalTaxes, that.totalTaxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountSet, discountedSubtotalSet, maximumRefundable, maximumRefundableSet, refundDuties, refundLineItems, shipping, subtotal, subtotalSet, suggestedTransactions, totalCartDiscountAmountSet, totalDutiesSet, totalTaxSet, totalTaxes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String amount;

    
    private MoneyBag amountSet;

    
    private MoneyBag discountedSubtotalSet;

    
    private String maximumRefundable;

    
    private MoneyBag maximumRefundableSet;

    
    private List<RefundDuty> refundDuties;

    
    private List<RefundLineItem> refundLineItems;

    
    private ShippingRefund shipping;

    
    private String subtotal;

    
    private MoneyBag subtotalSet;

    
    private List<SuggestedOrderTransaction> suggestedTransactions;

    
    private MoneyBag totalCartDiscountAmountSet;

    
    private MoneyBag totalDutiesSet;

    
    private MoneyBag totalTaxSet;

    
    private String totalTaxes;

    public SuggestedRefund build() {
      SuggestedRefund result = new SuggestedRefund();
      result.amount = this.amount;
      result.amountSet = this.amountSet;
      result.discountedSubtotalSet = this.discountedSubtotalSet;
      result.maximumRefundable = this.maximumRefundable;
      result.maximumRefundableSet = this.maximumRefundableSet;
      result.refundDuties = this.refundDuties;
      result.refundLineItems = this.refundLineItems;
      result.shipping = this.shipping;
      result.subtotal = this.subtotal;
      result.subtotalSet = this.subtotalSet;
      result.suggestedTransactions = this.suggestedTransactions;
      result.totalCartDiscountAmountSet = this.totalCartDiscountAmountSet;
      result.totalDutiesSet = this.totalDutiesSet;
      result.totalTaxSet = this.totalTaxSet;
      result.totalTaxes = this.totalTaxes;
      return result;
    }

    
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    
    public Builder discountedSubtotalSet(MoneyBag discountedSubtotalSet) {
      this.discountedSubtotalSet = discountedSubtotalSet;
      return this;
    }

    
    public Builder maximumRefundable(String maximumRefundable) {
      this.maximumRefundable = maximumRefundable;
      return this;
    }

    
    public Builder maximumRefundableSet(MoneyBag maximumRefundableSet) {
      this.maximumRefundableSet = maximumRefundableSet;
      return this;
    }

    
    public Builder refundDuties(List<RefundDuty> refundDuties) {
      this.refundDuties = refundDuties;
      return this;
    }

    
    public Builder refundLineItems(List<RefundLineItem> refundLineItems) {
      this.refundLineItems = refundLineItems;
      return this;
    }

    
    public Builder shipping(ShippingRefund shipping) {
      this.shipping = shipping;
      return this;
    }

    
    public Builder subtotal(String subtotal) {
      this.subtotal = subtotal;
      return this;
    }

    
    public Builder subtotalSet(MoneyBag subtotalSet) {
      this.subtotalSet = subtotalSet;
      return this;
    }

    
    public Builder suggestedTransactions(List<SuggestedOrderTransaction> suggestedTransactions) {
      this.suggestedTransactions = suggestedTransactions;
      return this;
    }

    
    public Builder totalCartDiscountAmountSet(MoneyBag totalCartDiscountAmountSet) {
      this.totalCartDiscountAmountSet = totalCartDiscountAmountSet;
      return this;
    }

    
    public Builder totalDutiesSet(MoneyBag totalDutiesSet) {
      this.totalDutiesSet = totalDutiesSet;
      return this;
    }

    
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }

    
    public Builder totalTaxes(String totalTaxes) {
      this.totalTaxes = totalTaxes;
      return this;
    }
  }
}

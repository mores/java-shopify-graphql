package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SuggestedReturnRefund {
  
  private MoneyBag amount;

  
  private MoneyBag discountedSubtotal;

  
  private MoneyBag maximumRefundable;

  
  private List<RefundDuty> refundDuties;

  
  private ShippingRefund shipping;

  
  private MoneyBag subtotal;

  
  private List<SuggestedOrderTransaction> suggestedTransactions;

  
  private MoneyBag totalCartDiscountAmount;

  
  private MoneyBag totalDuties;

  
  private MoneyBag totalTax;

  public SuggestedReturnRefund() {
  }

  
  public MoneyBag getAmount() {
    return amount;
  }

  public void setAmount(MoneyBag amount) {
    this.amount = amount;
  }

  
  public MoneyBag getDiscountedSubtotal() {
    return discountedSubtotal;
  }

  public void setDiscountedSubtotal(MoneyBag discountedSubtotal) {
    this.discountedSubtotal = discountedSubtotal;
  }

  
  public MoneyBag getMaximumRefundable() {
    return maximumRefundable;
  }

  public void setMaximumRefundable(MoneyBag maximumRefundable) {
    this.maximumRefundable = maximumRefundable;
  }

  
  public List<RefundDuty> getRefundDuties() {
    return refundDuties;
  }

  public void setRefundDuties(List<RefundDuty> refundDuties) {
    this.refundDuties = refundDuties;
  }

  
  public ShippingRefund getShipping() {
    return shipping;
  }

  public void setShipping(ShippingRefund shipping) {
    this.shipping = shipping;
  }

  
  public MoneyBag getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(MoneyBag subtotal) {
    this.subtotal = subtotal;
  }

  
  public List<SuggestedOrderTransaction> getSuggestedTransactions() {
    return suggestedTransactions;
  }

  public void setSuggestedTransactions(List<SuggestedOrderTransaction> suggestedTransactions) {
    this.suggestedTransactions = suggestedTransactions;
  }

  
  public MoneyBag getTotalCartDiscountAmount() {
    return totalCartDiscountAmount;
  }

  public void setTotalCartDiscountAmount(MoneyBag totalCartDiscountAmount) {
    this.totalCartDiscountAmount = totalCartDiscountAmount;
  }

  
  public MoneyBag getTotalDuties() {
    return totalDuties;
  }

  public void setTotalDuties(MoneyBag totalDuties) {
    this.totalDuties = totalDuties;
  }

  
  public MoneyBag getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(MoneyBag totalTax) {
    this.totalTax = totalTax;
  }

  @Override
  public String toString() {
    return "SuggestedReturnRefund{amount='" + amount + "', discountedSubtotal='" + discountedSubtotal + "', maximumRefundable='" + maximumRefundable + "', refundDuties='" + refundDuties + "', shipping='" + shipping + "', subtotal='" + subtotal + "', suggestedTransactions='" + suggestedTransactions + "', totalCartDiscountAmount='" + totalCartDiscountAmount + "', totalDuties='" + totalDuties + "', totalTax='" + totalTax + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SuggestedReturnRefund that = (SuggestedReturnRefund) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(discountedSubtotal, that.discountedSubtotal) &&
        Objects.equals(maximumRefundable, that.maximumRefundable) &&
        Objects.equals(refundDuties, that.refundDuties) &&
        Objects.equals(shipping, that.shipping) &&
        Objects.equals(subtotal, that.subtotal) &&
        Objects.equals(suggestedTransactions, that.suggestedTransactions) &&
        Objects.equals(totalCartDiscountAmount, that.totalCartDiscountAmount) &&
        Objects.equals(totalDuties, that.totalDuties) &&
        Objects.equals(totalTax, that.totalTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, discountedSubtotal, maximumRefundable, refundDuties, shipping, subtotal, suggestedTransactions, totalCartDiscountAmount, totalDuties, totalTax);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyBag amount;

    
    private MoneyBag discountedSubtotal;

    
    private MoneyBag maximumRefundable;

    
    private List<RefundDuty> refundDuties;

    
    private ShippingRefund shipping;

    
    private MoneyBag subtotal;

    
    private List<SuggestedOrderTransaction> suggestedTransactions;

    
    private MoneyBag totalCartDiscountAmount;

    
    private MoneyBag totalDuties;

    
    private MoneyBag totalTax;

    public SuggestedReturnRefund build() {
      SuggestedReturnRefund result = new SuggestedReturnRefund();
      result.amount = this.amount;
      result.discountedSubtotal = this.discountedSubtotal;
      result.maximumRefundable = this.maximumRefundable;
      result.refundDuties = this.refundDuties;
      result.shipping = this.shipping;
      result.subtotal = this.subtotal;
      result.suggestedTransactions = this.suggestedTransactions;
      result.totalCartDiscountAmount = this.totalCartDiscountAmount;
      result.totalDuties = this.totalDuties;
      result.totalTax = this.totalTax;
      return result;
    }

    
    public Builder amount(MoneyBag amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder discountedSubtotal(MoneyBag discountedSubtotal) {
      this.discountedSubtotal = discountedSubtotal;
      return this;
    }

    
    public Builder maximumRefundable(MoneyBag maximumRefundable) {
      this.maximumRefundable = maximumRefundable;
      return this;
    }

    
    public Builder refundDuties(List<RefundDuty> refundDuties) {
      this.refundDuties = refundDuties;
      return this;
    }

    
    public Builder shipping(ShippingRefund shipping) {
      this.shipping = shipping;
      return this;
    }

    
    public Builder subtotal(MoneyBag subtotal) {
      this.subtotal = subtotal;
      return this;
    }

    
    public Builder suggestedTransactions(List<SuggestedOrderTransaction> suggestedTransactions) {
      this.suggestedTransactions = suggestedTransactions;
      return this;
    }

    
    public Builder totalCartDiscountAmount(MoneyBag totalCartDiscountAmount) {
      this.totalCartDiscountAmount = totalCartDiscountAmount;
      return this;
    }

    
    public Builder totalDuties(MoneyBag totalDuties) {
      this.totalDuties = totalDuties;
      return this;
    }

    
    public Builder totalTax(MoneyBag totalTax) {
      this.totalTax = totalTax;
      return this;
    }
  }
}

package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShippingRefund {
  
  private String amount;

  
  private MoneyBag amountSet;

  
  private String maximumRefundable;

  
  private MoneyBag maximumRefundableSet;

  
  private String tax;

  
  private MoneyBag taxSet;

  public ShippingRefund() {
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

  
  public String getTax() {
    return tax;
  }

  public void setTax(String tax) {
    this.tax = tax;
  }

  
  public MoneyBag getTaxSet() {
    return taxSet;
  }

  public void setTaxSet(MoneyBag taxSet) {
    this.taxSet = taxSet;
  }

  @Override
  public String toString() {
    return "ShippingRefund{amount='" + amount + "', amountSet='" + amountSet + "', maximumRefundable='" + maximumRefundable + "', maximumRefundableSet='" + maximumRefundableSet + "', tax='" + tax + "', taxSet='" + taxSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingRefund that = (ShippingRefund) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(maximumRefundable, that.maximumRefundable) &&
        Objects.equals(maximumRefundableSet, that.maximumRefundableSet) &&
        Objects.equals(tax, that.tax) &&
        Objects.equals(taxSet, that.taxSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, amountSet, maximumRefundable, maximumRefundableSet, tax, taxSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String amount;

    
    private MoneyBag amountSet;

    
    private String maximumRefundable;

    
    private MoneyBag maximumRefundableSet;

    
    private String tax;

    
    private MoneyBag taxSet;

    public ShippingRefund build() {
      ShippingRefund result = new ShippingRefund();
      result.amount = this.amount;
      result.amountSet = this.amountSet;
      result.maximumRefundable = this.maximumRefundable;
      result.maximumRefundableSet = this.maximumRefundableSet;
      result.tax = this.tax;
      result.taxSet = this.taxSet;
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

    
    public Builder maximumRefundable(String maximumRefundable) {
      this.maximumRefundable = maximumRefundable;
      return this;
    }

    
    public Builder maximumRefundableSet(MoneyBag maximumRefundableSet) {
      this.maximumRefundableSet = maximumRefundableSet;
      return this;
    }

    
    public Builder tax(String tax) {
      this.tax = tax;
      return this;
    }

    
    public Builder taxSet(MoneyBag taxSet) {
      this.taxSet = taxSet;
      return this;
    }
  }
}

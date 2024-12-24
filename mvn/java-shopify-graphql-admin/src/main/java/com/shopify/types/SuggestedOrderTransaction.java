package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SuggestedOrderTransaction {
  
  private String accountNumber;

  
  private String amount;

  
  private MoneyBag amountSet;

  
  private String formattedGateway;

  
  private String gateway;

  
  private SuggestedOrderTransactionKind kind;

  
  private String maximumRefundable;

  
  private MoneyBag maximumRefundableSet;

  /**
   * The associated parent transaction, for example the authorization of a capture.
   */
  private OrderTransaction parentTransaction;

  
  private PaymentDetails paymentDetails;

  public SuggestedOrderTransaction() {
  }

  
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
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

  
  public String getFormattedGateway() {
    return formattedGateway;
  }

  public void setFormattedGateway(String formattedGateway) {
    this.formattedGateway = formattedGateway;
  }

  
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  
  public SuggestedOrderTransactionKind getKind() {
    return kind;
  }

  public void setKind(SuggestedOrderTransactionKind kind) {
    this.kind = kind;
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

  /**
   * The associated parent transaction, for example the authorization of a capture.
   */
  public OrderTransaction getParentTransaction() {
    return parentTransaction;
  }

  public void setParentTransaction(OrderTransaction parentTransaction) {
    this.parentTransaction = parentTransaction;
  }

  
  public PaymentDetails getPaymentDetails() {
    return paymentDetails;
  }

  public void setPaymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
  }

  @Override
  public String toString() {
    return "SuggestedOrderTransaction{accountNumber='" + accountNumber + "', amount='" + amount + "', amountSet='" + amountSet + "', formattedGateway='" + formattedGateway + "', gateway='" + gateway + "', kind='" + kind + "', maximumRefundable='" + maximumRefundable + "', maximumRefundableSet='" + maximumRefundableSet + "', parentTransaction='" + parentTransaction + "', paymentDetails='" + paymentDetails + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SuggestedOrderTransaction that = (SuggestedOrderTransaction) o;
    return Objects.equals(accountNumber, that.accountNumber) &&
        Objects.equals(amount, that.amount) &&
        Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(formattedGateway, that.formattedGateway) &&
        Objects.equals(gateway, that.gateway) &&
        Objects.equals(kind, that.kind) &&
        Objects.equals(maximumRefundable, that.maximumRefundable) &&
        Objects.equals(maximumRefundableSet, that.maximumRefundableSet) &&
        Objects.equals(parentTransaction, that.parentTransaction) &&
        Objects.equals(paymentDetails, that.paymentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, amount, amountSet, formattedGateway, gateway, kind, maximumRefundable, maximumRefundableSet, parentTransaction, paymentDetails);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String accountNumber;

    
    private String amount;

    
    private MoneyBag amountSet;

    
    private String formattedGateway;

    
    private String gateway;

    
    private SuggestedOrderTransactionKind kind;

    
    private String maximumRefundable;

    
    private MoneyBag maximumRefundableSet;

    /**
     * The associated parent transaction, for example the authorization of a capture.
     */
    private OrderTransaction parentTransaction;

    
    private PaymentDetails paymentDetails;

    public SuggestedOrderTransaction build() {
      SuggestedOrderTransaction result = new SuggestedOrderTransaction();
      result.accountNumber = this.accountNumber;
      result.amount = this.amount;
      result.amountSet = this.amountSet;
      result.formattedGateway = this.formattedGateway;
      result.gateway = this.gateway;
      result.kind = this.kind;
      result.maximumRefundable = this.maximumRefundable;
      result.maximumRefundableSet = this.maximumRefundableSet;
      result.parentTransaction = this.parentTransaction;
      result.paymentDetails = this.paymentDetails;
      return result;
    }

    
    public Builder accountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
      return this;
    }

    
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    
    public Builder formattedGateway(String formattedGateway) {
      this.formattedGateway = formattedGateway;
      return this;
    }

    
    public Builder gateway(String gateway) {
      this.gateway = gateway;
      return this;
    }

    
    public Builder kind(SuggestedOrderTransactionKind kind) {
      this.kind = kind;
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

    /**
     * The associated parent transaction, for example the authorization of a capture.
     */
    public Builder parentTransaction(OrderTransaction parentTransaction) {
      this.parentTransaction = parentTransaction;
      return this;
    }

    
    public Builder paymentDetails(PaymentDetails paymentDetails) {
      this.paymentDetails = paymentDetails;
      return this;
    }
  }
}

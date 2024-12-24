package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderPaymentStatus {
  
  private String errorMessage;

  
  private String paymentReferenceId;

  
  private OrderPaymentStatusResult status;

  
  private List<OrderTransaction> transactions;

  
  private String translatedErrorMessage;

  public OrderPaymentStatus() {
  }

  
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  public String getPaymentReferenceId() {
    return paymentReferenceId;
  }

  public void setPaymentReferenceId(String paymentReferenceId) {
    this.paymentReferenceId = paymentReferenceId;
  }

  
  public OrderPaymentStatusResult getStatus() {
    return status;
  }

  public void setStatus(OrderPaymentStatusResult status) {
    this.status = status;
  }

  
  public List<OrderTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<OrderTransaction> transactions) {
    this.transactions = transactions;
  }

  
  public String getTranslatedErrorMessage() {
    return translatedErrorMessage;
  }

  public void setTranslatedErrorMessage(String translatedErrorMessage) {
    this.translatedErrorMessage = translatedErrorMessage;
  }

  @Override
  public String toString() {
    return "OrderPaymentStatus{errorMessage='" + errorMessage + "', paymentReferenceId='" + paymentReferenceId + "', status='" + status + "', transactions='" + transactions + "', translatedErrorMessage='" + translatedErrorMessage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderPaymentStatus that = (OrderPaymentStatus) o;
    return Objects.equals(errorMessage, that.errorMessage) &&
        Objects.equals(paymentReferenceId, that.paymentReferenceId) &&
        Objects.equals(status, that.status) &&
        Objects.equals(transactions, that.transactions) &&
        Objects.equals(translatedErrorMessage, that.translatedErrorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, paymentReferenceId, status, transactions, translatedErrorMessage);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String errorMessage;

    
    private String paymentReferenceId;

    
    private OrderPaymentStatusResult status;

    
    private List<OrderTransaction> transactions;

    
    private String translatedErrorMessage;

    public OrderPaymentStatus build() {
      OrderPaymentStatus result = new OrderPaymentStatus();
      result.errorMessage = this.errorMessage;
      result.paymentReferenceId = this.paymentReferenceId;
      result.status = this.status;
      result.transactions = this.transactions;
      result.translatedErrorMessage = this.translatedErrorMessage;
      return result;
    }

    
    public Builder errorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
      return this;
    }

    
    public Builder paymentReferenceId(String paymentReferenceId) {
      this.paymentReferenceId = paymentReferenceId;
      return this;
    }

    
    public Builder status(OrderPaymentStatusResult status) {
      this.status = status;
      return this;
    }

    
    public Builder transactions(List<OrderTransaction> transactions) {
      this.transactions = transactions;
      return this;
    }

    
    public Builder translatedErrorMessage(String translatedErrorMessage) {
      this.translatedErrorMessage = translatedErrorMessage;
      return this;
    }
  }
}

package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class TransactionVoidPayload {
  
  private OrderTransaction transaction;

  
  private List<TransactionVoidUserError> userErrors;

  public TransactionVoidPayload() {
  }

  
  public OrderTransaction getTransaction() {
    return transaction;
  }

  public void setTransaction(OrderTransaction transaction) {
    this.transaction = transaction;
  }

  
  public List<TransactionVoidUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<TransactionVoidUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "TransactionVoidPayload{transaction='" + transaction + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransactionVoidPayload that = (TransactionVoidPayload) o;
    return Objects.equals(transaction, that.transaction) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transaction, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OrderTransaction transaction;

    
    private List<TransactionVoidUserError> userErrors;

    public TransactionVoidPayload build() {
      TransactionVoidPayload result = new TransactionVoidPayload();
      result.transaction = this.transaction;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder transaction(OrderTransaction transaction) {
      this.transaction = transaction;
      return this;
    }

    
    public Builder userErrors(List<TransactionVoidUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

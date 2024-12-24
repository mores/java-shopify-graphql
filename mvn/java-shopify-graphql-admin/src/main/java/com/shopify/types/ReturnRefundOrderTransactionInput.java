package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ReturnRefundOrderTransactionInput {
  
  private MoneyInput transactionAmount;

  
  private String parentId;

  public ReturnRefundOrderTransactionInput() {
  }

  
  public MoneyInput getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(MoneyInput transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  @Override
  public String toString() {
    return "ReturnRefundOrderTransactionInput{transactionAmount='" + transactionAmount + "', parentId='" + parentId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnRefundOrderTransactionInput that = (ReturnRefundOrderTransactionInput) o;
    return Objects.equals(transactionAmount, that.transactionAmount) &&
        Objects.equals(parentId, that.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionAmount, parentId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyInput transactionAmount;

    
    private String parentId;

    public ReturnRefundOrderTransactionInput build() {
      ReturnRefundOrderTransactionInput result = new ReturnRefundOrderTransactionInput();
      result.transactionAmount = this.transactionAmount;
      result.parentId = this.parentId;
      return result;
    }

    
    public Builder transactionAmount(MoneyInput transactionAmount) {
      this.transactionAmount = transactionAmount;
      return this;
    }

    
    public Builder parentId(String parentId) {
      this.parentId = parentId;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to create order transactions when refunding a return.
 */
public class ReturnRefundOrderTransactionInput {
  /**
   * The amount of money for the transaction in the presentment currency of the order.
   */
  private MoneyInput transactionAmount;

  /**
   * The ID of the parent order transaction. The transaction must be of kind `CAPTURE` or a `SALE`.
   */
  private String parentId;

  public ReturnRefundOrderTransactionInput() {
  }

  /**
   * The amount of money for the transaction in the presentment currency of the order.
   */
  public MoneyInput getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(MoneyInput transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  /**
   * The ID of the parent order transaction. The transaction must be of kind `CAPTURE` or a `SALE`.
   */
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
    /**
     * The amount of money for the transaction in the presentment currency of the order.
     */
    private MoneyInput transactionAmount;

    /**
     * The ID of the parent order transaction. The transaction must be of kind `CAPTURE` or a `SALE`.
     */
    private String parentId;

    public ReturnRefundOrderTransactionInput build() {
      ReturnRefundOrderTransactionInput result = new ReturnRefundOrderTransactionInput();
      result.transactionAmount = this.transactionAmount;
      result.parentId = this.parentId;
      return result;
    }

    /**
     * The amount of money for the transaction in the presentment currency of the order.
     */
    public Builder transactionAmount(MoneyInput transactionAmount) {
      this.transactionAmount = transactionAmount;
      return this;
    }

    /**
     * The ID of the parent order transaction. The transaction must be of kind `CAPTURE` or a `SALE`.
     */
    public Builder parentId(String parentId) {
      this.parentId = parentId;
      return this;
    }
  }
}

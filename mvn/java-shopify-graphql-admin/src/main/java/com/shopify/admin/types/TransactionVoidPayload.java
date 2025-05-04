package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `transactionVoid` mutation.
 */
public class TransactionVoidPayload {
  /**
   * The created void transaction.
   */
  private OrderTransaction transaction;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<TransactionVoidUserError> userErrors;

  public TransactionVoidPayload() {
  }

  /**
   * The created void transaction.
   */
  public OrderTransaction getTransaction() {
    return transaction;
  }

  public void setTransaction(OrderTransaction transaction) {
    this.transaction = transaction;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
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
    /**
     * The created void transaction.
     */
    private OrderTransaction transaction;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<TransactionVoidUserError> userErrors;

    public TransactionVoidPayload build() {
      TransactionVoidPayload result = new TransactionVoidPayload();
      result.transaction = this.transaction;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created void transaction.
     */
    public Builder transaction(OrderTransaction transaction) {
      this.transaction = transaction;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<TransactionVoidUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

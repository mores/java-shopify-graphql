package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `storeCreditAccountDebit` mutation.
 */
public class StoreCreditAccountDebitPayload {
  /**
   * The store credit account transaction that was created.
   */
  private StoreCreditAccountDebitTransaction storeCreditAccountTransaction;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<StoreCreditAccountDebitUserError> userErrors;

  public StoreCreditAccountDebitPayload() {
  }

  /**
   * The store credit account transaction that was created.
   */
  public StoreCreditAccountDebitTransaction getStoreCreditAccountTransaction() {
    return storeCreditAccountTransaction;
  }

  public void setStoreCreditAccountTransaction(
      StoreCreditAccountDebitTransaction storeCreditAccountTransaction) {
    this.storeCreditAccountTransaction = storeCreditAccountTransaction;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<StoreCreditAccountDebitUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<StoreCreditAccountDebitUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "StoreCreditAccountDebitPayload{storeCreditAccountTransaction='" + storeCreditAccountTransaction + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StoreCreditAccountDebitPayload that = (StoreCreditAccountDebitPayload) o;
    return Objects.equals(storeCreditAccountTransaction, that.storeCreditAccountTransaction) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeCreditAccountTransaction, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The store credit account transaction that was created.
     */
    private StoreCreditAccountDebitTransaction storeCreditAccountTransaction;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<StoreCreditAccountDebitUserError> userErrors;

    public StoreCreditAccountDebitPayload build() {
      StoreCreditAccountDebitPayload result = new StoreCreditAccountDebitPayload();
      result.storeCreditAccountTransaction = this.storeCreditAccountTransaction;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The store credit account transaction that was created.
     */
    public Builder storeCreditAccountTransaction(
        StoreCreditAccountDebitTransaction storeCreditAccountTransaction) {
      this.storeCreditAccountTransaction = storeCreditAccountTransaction;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<StoreCreditAccountDebitUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

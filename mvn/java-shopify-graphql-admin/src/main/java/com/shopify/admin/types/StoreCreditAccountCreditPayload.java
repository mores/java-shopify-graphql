package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `storeCreditAccountCredit` mutation.
 */
public class StoreCreditAccountCreditPayload {
  /**
   * The store credit account transaction that was created.
   */
  private StoreCreditAccountCreditTransaction storeCreditAccountTransaction;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<StoreCreditAccountCreditUserError> userErrors;

  public StoreCreditAccountCreditPayload() {
  }

  /**
   * The store credit account transaction that was created.
   */
  public StoreCreditAccountCreditTransaction getStoreCreditAccountTransaction() {
    return storeCreditAccountTransaction;
  }

  public void setStoreCreditAccountTransaction(
      StoreCreditAccountCreditTransaction storeCreditAccountTransaction) {
    this.storeCreditAccountTransaction = storeCreditAccountTransaction;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<StoreCreditAccountCreditUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<StoreCreditAccountCreditUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "StoreCreditAccountCreditPayload{storeCreditAccountTransaction='" + storeCreditAccountTransaction + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StoreCreditAccountCreditPayload that = (StoreCreditAccountCreditPayload) o;
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
    private StoreCreditAccountCreditTransaction storeCreditAccountTransaction;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<StoreCreditAccountCreditUserError> userErrors;

    public StoreCreditAccountCreditPayload build() {
      StoreCreditAccountCreditPayload result = new StoreCreditAccountCreditPayload();
      result.storeCreditAccountTransaction = this.storeCreditAccountTransaction;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The store credit account transaction that was created.
     */
    public Builder storeCreditAccountTransaction(
        StoreCreditAccountCreditTransaction storeCreditAccountTransaction) {
      this.storeCreditAccountTransaction = storeCreditAccountTransaction;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<StoreCreditAccountCreditUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `giftCardDebit` mutation.
 */
public class GiftCardDebitPayload {
  /**
   * The gift card debit transaction that was created.
   */
  private GiftCardDebitTransaction giftCardDebitTransaction;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<GiftCardTransactionUserError> userErrors;

  public GiftCardDebitPayload() {
  }

  /**
   * The gift card debit transaction that was created.
   */
  public GiftCardDebitTransaction getGiftCardDebitTransaction() {
    return giftCardDebitTransaction;
  }

  public void setGiftCardDebitTransaction(GiftCardDebitTransaction giftCardDebitTransaction) {
    this.giftCardDebitTransaction = giftCardDebitTransaction;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<GiftCardTransactionUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<GiftCardTransactionUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "GiftCardDebitPayload{giftCardDebitTransaction='" + giftCardDebitTransaction + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardDebitPayload that = (GiftCardDebitPayload) o;
    return Objects.equals(giftCardDebitTransaction, that.giftCardDebitTransaction) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftCardDebitTransaction, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The gift card debit transaction that was created.
     */
    private GiftCardDebitTransaction giftCardDebitTransaction;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<GiftCardTransactionUserError> userErrors;

    public GiftCardDebitPayload build() {
      GiftCardDebitPayload result = new GiftCardDebitPayload();
      result.giftCardDebitTransaction = this.giftCardDebitTransaction;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The gift card debit transaction that was created.
     */
    public Builder giftCardDebitTransaction(GiftCardDebitTransaction giftCardDebitTransaction) {
      this.giftCardDebitTransaction = giftCardDebitTransaction;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<GiftCardTransactionUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

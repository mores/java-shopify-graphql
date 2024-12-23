package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `giftCardCredit` mutation.
 */
public class GiftCardCreditPayload {
  /**
   * The gift card credit transaction that was created.
   */
  private GiftCardCreditTransaction giftCardCreditTransaction;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<GiftCardTransactionUserError> userErrors;

  public GiftCardCreditPayload() {
  }

  /**
   * The gift card credit transaction that was created.
   */
  public GiftCardCreditTransaction getGiftCardCreditTransaction() {
    return giftCardCreditTransaction;
  }

  public void setGiftCardCreditTransaction(GiftCardCreditTransaction giftCardCreditTransaction) {
    this.giftCardCreditTransaction = giftCardCreditTransaction;
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
    return "GiftCardCreditPayload{giftCardCreditTransaction='" + giftCardCreditTransaction + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardCreditPayload that = (GiftCardCreditPayload) o;
    return Objects.equals(giftCardCreditTransaction, that.giftCardCreditTransaction) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftCardCreditTransaction, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The gift card credit transaction that was created.
     */
    private GiftCardCreditTransaction giftCardCreditTransaction;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<GiftCardTransactionUserError> userErrors;

    public GiftCardCreditPayload build() {
      GiftCardCreditPayload result = new GiftCardCreditPayload();
      result.giftCardCreditTransaction = this.giftCardCreditTransaction;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The gift card credit transaction that was created.
     */
    public Builder giftCardCreditTransaction(GiftCardCreditTransaction giftCardCreditTransaction) {
      this.giftCardCreditTransaction = giftCardCreditTransaction;
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

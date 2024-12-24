package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class GiftCardDebitPayload {
  
  private GiftCardDebitTransaction giftCardDebitTransaction;

  
  private List<GiftCardTransactionUserError> userErrors;

  public GiftCardDebitPayload() {
  }

  
  public GiftCardDebitTransaction getGiftCardDebitTransaction() {
    return giftCardDebitTransaction;
  }

  public void setGiftCardDebitTransaction(GiftCardDebitTransaction giftCardDebitTransaction) {
    this.giftCardDebitTransaction = giftCardDebitTransaction;
  }

  
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
    
    private GiftCardDebitTransaction giftCardDebitTransaction;

    
    private List<GiftCardTransactionUserError> userErrors;

    public GiftCardDebitPayload build() {
      GiftCardDebitPayload result = new GiftCardDebitPayload();
      result.giftCardDebitTransaction = this.giftCardDebitTransaction;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder giftCardDebitTransaction(GiftCardDebitTransaction giftCardDebitTransaction) {
      this.giftCardDebitTransaction = giftCardDebitTransaction;
      return this;
    }

    
    public Builder userErrors(List<GiftCardTransactionUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

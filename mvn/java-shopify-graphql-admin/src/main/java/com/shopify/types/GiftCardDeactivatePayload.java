package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class GiftCardDeactivatePayload {
  
  private GiftCard giftCard;

  
  private List<GiftCardDeactivateUserError> userErrors;

  public GiftCardDeactivatePayload() {
  }

  
  public GiftCard getGiftCard() {
    return giftCard;
  }

  public void setGiftCard(GiftCard giftCard) {
    this.giftCard = giftCard;
  }

  
  public List<GiftCardDeactivateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<GiftCardDeactivateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "GiftCardDeactivatePayload{giftCard='" + giftCard + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardDeactivatePayload that = (GiftCardDeactivatePayload) o;
    return Objects.equals(giftCard, that.giftCard) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftCard, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private GiftCard giftCard;

    
    private List<GiftCardDeactivateUserError> userErrors;

    public GiftCardDeactivatePayload build() {
      GiftCardDeactivatePayload result = new GiftCardDeactivatePayload();
      result.giftCard = this.giftCard;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder giftCard(GiftCard giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    
    public Builder userErrors(List<GiftCardDeactivateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

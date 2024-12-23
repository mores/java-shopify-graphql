package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `giftCardUpdate` mutation.
 */
public class GiftCardUpdatePayload {
  /**
   * The updated gift card.
   */
  private GiftCard giftCard;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public GiftCardUpdatePayload() {
  }

  /**
   * The updated gift card.
   */
  public GiftCard getGiftCard() {
    return giftCard;
  }

  public void setGiftCard(GiftCard giftCard) {
    this.giftCard = giftCard;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "GiftCardUpdatePayload{giftCard='" + giftCard + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardUpdatePayload that = (GiftCardUpdatePayload) o;
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
    /**
     * The updated gift card.
     */
    private GiftCard giftCard;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public GiftCardUpdatePayload build() {
      GiftCardUpdatePayload result = new GiftCardUpdatePayload();
      result.giftCard = this.giftCard;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated gift card.
     */
    public Builder giftCard(GiftCard giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

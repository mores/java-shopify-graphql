package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `giftCardDeactivate` mutation.
 */
public class GiftCardDeactivatePayload {
  /**
   * The deactivated gift card.
   */
  private GiftCard giftCard;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<GiftCardDeactivateUserError> userErrors;

  public GiftCardDeactivatePayload() {
  }

  /**
   * The deactivated gift card.
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
    /**
     * The deactivated gift card.
     */
    private GiftCard giftCard;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<GiftCardDeactivateUserError> userErrors;

    public GiftCardDeactivatePayload build() {
      GiftCardDeactivatePayload result = new GiftCardDeactivatePayload();
      result.giftCard = this.giftCard;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The deactivated gift card.
     */
    public Builder giftCard(GiftCard giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<GiftCardDeactivateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `giftCardSendNotificationToCustomer` mutation.
 */
public class GiftCardSendNotificationToCustomerPayload {
  /**
   * The gift card that was sent.
   */
  private GiftCard giftCard;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<GiftCardSendNotificationToCustomerUserError> userErrors;

  public GiftCardSendNotificationToCustomerPayload() {
  }

  /**
   * The gift card that was sent.
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
  public List<GiftCardSendNotificationToCustomerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<GiftCardSendNotificationToCustomerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "GiftCardSendNotificationToCustomerPayload{giftCard='" + giftCard + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardSendNotificationToCustomerPayload that = (GiftCardSendNotificationToCustomerPayload) o;
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
     * The gift card that was sent.
     */
    private GiftCard giftCard;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<GiftCardSendNotificationToCustomerUserError> userErrors;

    public GiftCardSendNotificationToCustomerPayload build() {
      GiftCardSendNotificationToCustomerPayload result = new GiftCardSendNotificationToCustomerPayload();
      result.giftCard = this.giftCard;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The gift card that was sent.
     */
    public Builder giftCard(GiftCard giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<GiftCardSendNotificationToCustomerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

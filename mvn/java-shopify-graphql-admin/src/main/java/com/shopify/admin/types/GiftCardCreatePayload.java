package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `giftCardCreate` mutation.
 */
public class GiftCardCreatePayload {
  /**
   * The created gift card.
   */
  private GiftCard giftCard;

  /**
   * The created gift card's code.
   */
  private String giftCardCode;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<GiftCardUserError> userErrors;

  public GiftCardCreatePayload() {
  }

  /**
   * The created gift card.
   */
  public GiftCard getGiftCard() {
    return giftCard;
  }

  public void setGiftCard(GiftCard giftCard) {
    this.giftCard = giftCard;
  }

  /**
   * The created gift card's code.
   */
  public String getGiftCardCode() {
    return giftCardCode;
  }

  public void setGiftCardCode(String giftCardCode) {
    this.giftCardCode = giftCardCode;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<GiftCardUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<GiftCardUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "GiftCardCreatePayload{giftCard='" + giftCard + "', giftCardCode='" + giftCardCode + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardCreatePayload that = (GiftCardCreatePayload) o;
    return Objects.equals(giftCard, that.giftCard) &&
        Objects.equals(giftCardCode, that.giftCardCode) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftCard, giftCardCode, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The created gift card.
     */
    private GiftCard giftCard;

    /**
     * The created gift card's code.
     */
    private String giftCardCode;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<GiftCardUserError> userErrors;

    public GiftCardCreatePayload build() {
      GiftCardCreatePayload result = new GiftCardCreatePayload();
      result.giftCard = this.giftCard;
      result.giftCardCode = this.giftCardCode;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created gift card.
     */
    public Builder giftCard(GiftCard giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    /**
     * The created gift card's code.
     */
    public Builder giftCardCode(String giftCardCode) {
      this.giftCardCode = giftCardCode;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<GiftCardUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

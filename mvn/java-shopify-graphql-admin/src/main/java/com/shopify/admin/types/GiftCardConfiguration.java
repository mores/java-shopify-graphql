package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents information about the configuration of gift cards on the shop.
 */
public class GiftCardConfiguration {
  /**
   * The default expiration configuration of gift cards on the shop. This field is
   * null if the shop hasn't set a default expiration for gift cards.
   */
  private GiftCardExpirationConfiguration expirationConfiguration;

  /**
   * The issue limit for gift cards in the default shop currency.
   */
  private MoneyV2 issueLimit;

  /**
   * The purchase limit for gift cards in the default shop currency.
   */
  private MoneyV2 purchaseLimit;

  public GiftCardConfiguration() {
  }

  /**
   * The default expiration configuration of gift cards on the shop. This field is
   * null if the shop hasn't set a default expiration for gift cards.
   */
  public GiftCardExpirationConfiguration getExpirationConfiguration() {
    return expirationConfiguration;
  }

  public void setExpirationConfiguration(GiftCardExpirationConfiguration expirationConfiguration) {
    this.expirationConfiguration = expirationConfiguration;
  }

  /**
   * The issue limit for gift cards in the default shop currency.
   */
  public MoneyV2 getIssueLimit() {
    return issueLimit;
  }

  public void setIssueLimit(MoneyV2 issueLimit) {
    this.issueLimit = issueLimit;
  }

  /**
   * The purchase limit for gift cards in the default shop currency.
   */
  public MoneyV2 getPurchaseLimit() {
    return purchaseLimit;
  }

  public void setPurchaseLimit(MoneyV2 purchaseLimit) {
    this.purchaseLimit = purchaseLimit;
  }

  @Override
  public String toString() {
    return "GiftCardConfiguration{expirationConfiguration='" + expirationConfiguration + "', issueLimit='" + issueLimit + "', purchaseLimit='" + purchaseLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardConfiguration that = (GiftCardConfiguration) o;
    return Objects.equals(expirationConfiguration, that.expirationConfiguration) &&
        Objects.equals(issueLimit, that.issueLimit) &&
        Objects.equals(purchaseLimit, that.purchaseLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationConfiguration, issueLimit, purchaseLimit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The default expiration configuration of gift cards on the shop. This field is
     * null if the shop hasn't set a default expiration for gift cards.
     */
    private GiftCardExpirationConfiguration expirationConfiguration;

    /**
     * The issue limit for gift cards in the default shop currency.
     */
    private MoneyV2 issueLimit;

    /**
     * The purchase limit for gift cards in the default shop currency.
     */
    private MoneyV2 purchaseLimit;

    public GiftCardConfiguration build() {
      GiftCardConfiguration result = new GiftCardConfiguration();
      result.expirationConfiguration = this.expirationConfiguration;
      result.issueLimit = this.issueLimit;
      result.purchaseLimit = this.purchaseLimit;
      return result;
    }

    /**
     * The default expiration configuration of gift cards on the shop. This field is
     * null if the shop hasn't set a default expiration for gift cards.
     */
    public Builder expirationConfiguration(
        GiftCardExpirationConfiguration expirationConfiguration) {
      this.expirationConfiguration = expirationConfiguration;
      return this;
    }

    /**
     * The issue limit for gift cards in the default shop currency.
     */
    public Builder issueLimit(MoneyV2 issueLimit) {
      this.issueLimit = issueLimit;
      return this;
    }

    /**
     * The purchase limit for gift cards in the default shop currency.
     */
    public Builder purchaseLimit(MoneyV2 purchaseLimit) {
      this.purchaseLimit = purchaseLimit;
      return this;
    }
  }
}

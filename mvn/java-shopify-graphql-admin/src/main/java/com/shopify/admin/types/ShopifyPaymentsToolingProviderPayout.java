package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Relevant reference information for an alternate currency payout.
 */
public class ShopifyPaymentsToolingProviderPayout {
  /**
   * The balance amount the alternate currency payout was created for.
   */
  private MoneyV2 amount;

  /**
   * A timestamp for the arrival of the alternate currency payout.
   */
  private OffsetDateTime arrivalDate;

  /**
   * A timestamp for the creation of the alternate currency payout.
   */
  private OffsetDateTime createdAt;

  /**
   * The currency alternate currency payout was created in.
   */
  private String currency;

  /**
   * The remote ID for the alternate currency payout.
   */
  private String remoteId;

  public ShopifyPaymentsToolingProviderPayout() {
  }

  /**
   * The balance amount the alternate currency payout was created for.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * A timestamp for the arrival of the alternate currency payout.
   */
  public OffsetDateTime getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(OffsetDateTime arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  /**
   * A timestamp for the creation of the alternate currency payout.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The currency alternate currency payout was created in.
   */
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * The remote ID for the alternate currency payout.
   */
  public String getRemoteId() {
    return remoteId;
  }

  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsToolingProviderPayout{amount='" + amount + "', arrivalDate='" + arrivalDate + "', createdAt='" + createdAt + "', currency='" + currency + "', remoteId='" + remoteId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsToolingProviderPayout that = (ShopifyPaymentsToolingProviderPayout) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(arrivalDate, that.arrivalDate) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currency, that.currency) &&
        Objects.equals(remoteId, that.remoteId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, arrivalDate, createdAt, currency, remoteId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The balance amount the alternate currency payout was created for.
     */
    private MoneyV2 amount;

    /**
     * A timestamp for the arrival of the alternate currency payout.
     */
    private OffsetDateTime arrivalDate;

    /**
     * A timestamp for the creation of the alternate currency payout.
     */
    private OffsetDateTime createdAt;

    /**
     * The currency alternate currency payout was created in.
     */
    private String currency;

    /**
     * The remote ID for the alternate currency payout.
     */
    private String remoteId;

    public ShopifyPaymentsToolingProviderPayout build() {
      ShopifyPaymentsToolingProviderPayout result = new ShopifyPaymentsToolingProviderPayout();
      result.amount = this.amount;
      result.arrivalDate = this.arrivalDate;
      result.createdAt = this.createdAt;
      result.currency = this.currency;
      result.remoteId = this.remoteId;
      return result;
    }

    /**
     * The balance amount the alternate currency payout was created for.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * A timestamp for the arrival of the alternate currency payout.
     */
    public Builder arrivalDate(OffsetDateTime arrivalDate) {
      this.arrivalDate = arrivalDate;
      return this;
    }

    /**
     * A timestamp for the creation of the alternate currency payout.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The currency alternate currency payout was created in.
     */
    public Builder currency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * The remote ID for the alternate currency payout.
     */
    public Builder remoteId(String remoteId) {
      this.remoteId = remoteId;
      return this;
    }
  }
}

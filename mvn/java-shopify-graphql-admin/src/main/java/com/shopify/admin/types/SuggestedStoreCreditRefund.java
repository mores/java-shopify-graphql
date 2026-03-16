package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The suggested values for a refund to store credit.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SuggestedStoreCreditRefund implements com.shopify.admin.types.SuggestedRefundMethod {
  /**
   * The suggested amount to refund in shop and presentment currencies.
   */
  private MoneyBag amount;

  /**
   * The suggested expiration date for the store credit.
   */
  private OffsetDateTime expiresAt;

  /**
   * The maximum available amount to refund in shop and presentment currencies.
   */
  private MoneyBag maximumRefundable;

  public SuggestedStoreCreditRefund() {
  }

  /**
   * The suggested amount to refund in shop and presentment currencies.
   */
  public MoneyBag getAmount() {
    return amount;
  }

  public void setAmount(MoneyBag amount) {
    this.amount = amount;
  }

  /**
   * The suggested expiration date for the store credit.
   */
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The maximum available amount to refund in shop and presentment currencies.
   */
  public MoneyBag getMaximumRefundable() {
    return maximumRefundable;
  }

  public void setMaximumRefundable(MoneyBag maximumRefundable) {
    this.maximumRefundable = maximumRefundable;
  }

  @Override
  public String toString() {
    return "SuggestedStoreCreditRefund{amount='" + amount + "', expiresAt='" + expiresAt + "', maximumRefundable='" + maximumRefundable + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SuggestedStoreCreditRefund that = (SuggestedStoreCreditRefund) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(expiresAt, that.expiresAt) &&
        Objects.equals(maximumRefundable, that.maximumRefundable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, expiresAt, maximumRefundable);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The suggested amount to refund in shop and presentment currencies.
     */
    private MoneyBag amount;

    /**
     * The suggested expiration date for the store credit.
     */
    private OffsetDateTime expiresAt;

    /**
     * The maximum available amount to refund in shop and presentment currencies.
     */
    private MoneyBag maximumRefundable;

    public SuggestedStoreCreditRefund build() {
      SuggestedStoreCreditRefund result = new SuggestedStoreCreditRefund();
      result.amount = this.amount;
      result.expiresAt = this.expiresAt;
      result.maximumRefundable = this.maximumRefundable;
      return result;
    }

    /**
     * The suggested amount to refund in shop and presentment currencies.
     */
    public Builder amount(MoneyBag amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The suggested expiration date for the store credit.
     */
    public Builder expiresAt(OffsetDateTime expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * The maximum available amount to refund in shop and presentment currencies.
     */
    public Builder maximumRefundable(MoneyBag maximumRefundable) {
      this.maximumRefundable = maximumRefundable;
      return this;
    }
  }
}

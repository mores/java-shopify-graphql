package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields to process a refund to store credit.
 */
public class StoreCreditRefundInput {
  /**
   * The amount to be issued as store credit.
   */
  private MoneyInput amount;

  /**
   * An optional expiration date for the store credit being issued.
   */
  private OffsetDateTime expiresAt;

  public StoreCreditRefundInput() {
  }

  /**
   * The amount to be issued as store credit.
   */
  public MoneyInput getAmount() {
    return amount;
  }

  public void setAmount(MoneyInput amount) {
    this.amount = amount;
  }

  /**
   * An optional expiration date for the store credit being issued.
   */
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  @Override
  public String toString() {
    return "StoreCreditRefundInput{amount='" + amount + "', expiresAt='" + expiresAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StoreCreditRefundInput that = (StoreCreditRefundInput) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(expiresAt, that.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, expiresAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount to be issued as store credit.
     */
    private MoneyInput amount;

    /**
     * An optional expiration date for the store credit being issued.
     */
    private OffsetDateTime expiresAt;

    public StoreCreditRefundInput build() {
      StoreCreditRefundInput result = new StoreCreditRefundInput();
      result.amount = this.amount;
      result.expiresAt = this.expiresAt;
      return result;
    }

    /**
     * The amount to be issued as store credit.
     */
    public Builder amount(MoneyInput amount) {
      this.amount = amount;
      return this;
    }

    /**
     * An optional expiration date for the store credit being issued.
     */
    public Builder expiresAt(OffsetDateTime expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields used to refund to store credit.
 */
public class OrderCancelStoreCreditRefundInput {
  /**
   * The expiration date of the store credit.
   */
  private OffsetDateTime expiresAt;

  public OrderCancelStoreCreditRefundInput() {
  }

  /**
   * The expiration date of the store credit.
   */
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  @Override
  public String toString() {
    return "OrderCancelStoreCreditRefundInput{expiresAt='" + expiresAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCancelStoreCreditRefundInput that = (OrderCancelStoreCreditRefundInput) o;
    return Objects.equals(expiresAt, that.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The expiration date of the store credit.
     */
    private OffsetDateTime expiresAt;

    public OrderCancelStoreCreditRefundInput build() {
      OrderCancelStoreCreditRefundInput result = new OrderCancelStoreCreditRefundInput();
      result.expiresAt = this.expiresAt;
      return result;
    }

    /**
     * The expiration date of the store credit.
     */
    public Builder expiresAt(OffsetDateTime expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }
  }
}

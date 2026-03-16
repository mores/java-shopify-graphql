package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for processing the financial outcome of a refund.
 */
public class RefundMethodInput {
  /**
   * The details of the refund to store credit.
   */
  private StoreCreditRefundInput storeCreditRefund;

  public RefundMethodInput() {
  }

  /**
   * The details of the refund to store credit.
   */
  public StoreCreditRefundInput getStoreCreditRefund() {
    return storeCreditRefund;
  }

  public void setStoreCreditRefund(StoreCreditRefundInput storeCreditRefund) {
    this.storeCreditRefund = storeCreditRefund;
  }

  @Override
  public String toString() {
    return "RefundMethodInput{storeCreditRefund='" + storeCreditRefund + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundMethodInput that = (RefundMethodInput) o;
    return Objects.equals(storeCreditRefund, that.storeCreditRefund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeCreditRefund);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The details of the refund to store credit.
     */
    private StoreCreditRefundInput storeCreditRefund;

    public RefundMethodInput build() {
      RefundMethodInput result = new RefundMethodInput();
      result.storeCreditRefund = this.storeCreditRefund;
      return result;
    }

    /**
     * The details of the refund to store credit.
     */
    public Builder storeCreditRefund(StoreCreditRefundInput storeCreditRefund) {
      this.storeCreditRefund = storeCreditRefund;
      return this;
    }
  }
}

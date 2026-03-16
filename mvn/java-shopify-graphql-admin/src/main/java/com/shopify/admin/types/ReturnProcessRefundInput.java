package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for the refund for the return.
 */
public class ReturnProcessRefundInput {
  /**
   * Whether to allow the total refunded amount to surpass the amount paid for the order.
   */
  private Boolean allowOverRefunding = false;

  /**
   * The order transactions for the refund.
   */
  private List<ReturnRefundOrderTransactionInput> orderTransactions;

  /**
   * A list of instructions to process the financial outcome of the refund.
   */
  private List<RefundMethodInput> refundMethods = Collections.emptyList();

  public ReturnProcessRefundInput() {
  }

  /**
   * Whether to allow the total refunded amount to surpass the amount paid for the order.
   */
  public Boolean getAllowOverRefunding() {
    return allowOverRefunding;
  }

  public void setAllowOverRefunding(Boolean allowOverRefunding) {
    this.allowOverRefunding = allowOverRefunding;
  }

  /**
   * The order transactions for the refund.
   */
  public List<ReturnRefundOrderTransactionInput> getOrderTransactions() {
    return orderTransactions;
  }

  public void setOrderTransactions(List<ReturnRefundOrderTransactionInput> orderTransactions) {
    this.orderTransactions = orderTransactions;
  }

  /**
   * A list of instructions to process the financial outcome of the refund.
   */
  public List<RefundMethodInput> getRefundMethods() {
    return refundMethods;
  }

  public void setRefundMethods(List<RefundMethodInput> refundMethods) {
    this.refundMethods = refundMethods;
  }

  @Override
  public String toString() {
    return "ReturnProcessRefundInput{allowOverRefunding='" + allowOverRefunding + "', orderTransactions='" + orderTransactions + "', refundMethods='" + refundMethods + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnProcessRefundInput that = (ReturnProcessRefundInput) o;
    return Objects.equals(allowOverRefunding, that.allowOverRefunding) &&
        Objects.equals(orderTransactions, that.orderTransactions) &&
        Objects.equals(refundMethods, that.refundMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowOverRefunding, orderTransactions, refundMethods);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether to allow the total refunded amount to surpass the amount paid for the order.
     */
    private Boolean allowOverRefunding = false;

    /**
     * The order transactions for the refund.
     */
    private List<ReturnRefundOrderTransactionInput> orderTransactions;

    /**
     * A list of instructions to process the financial outcome of the refund.
     */
    private List<RefundMethodInput> refundMethods = Collections.emptyList();

    public ReturnProcessRefundInput build() {
      ReturnProcessRefundInput result = new ReturnProcessRefundInput();
      result.allowOverRefunding = this.allowOverRefunding;
      result.orderTransactions = this.orderTransactions;
      result.refundMethods = this.refundMethods;
      return result;
    }

    /**
     * Whether to allow the total refunded amount to surpass the amount paid for the order.
     */
    public Builder allowOverRefunding(Boolean allowOverRefunding) {
      this.allowOverRefunding = allowOverRefunding;
      return this;
    }

    /**
     * The order transactions for the refund.
     */
    public Builder orderTransactions(List<ReturnRefundOrderTransactionInput> orderTransactions) {
      this.orderTransactions = orderTransactions;
      return this;
    }

    /**
     * A list of instructions to process the financial outcome of the refund.
     */
    public Builder refundMethods(List<RefundMethodInput> refundMethods) {
      this.refundMethods = refundMethods;
      return this;
    }
  }
}

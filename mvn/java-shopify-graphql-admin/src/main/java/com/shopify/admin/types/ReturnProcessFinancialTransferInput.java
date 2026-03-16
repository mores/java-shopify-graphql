package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the financial transfer for the return.
 */
public class ReturnProcessFinancialTransferInput {
  /**
   * Issue a refund for the return.
   */
  private ReturnProcessRefundInput issueRefund;

  public ReturnProcessFinancialTransferInput() {
  }

  /**
   * Issue a refund for the return.
   */
  public ReturnProcessRefundInput getIssueRefund() {
    return issueRefund;
  }

  public void setIssueRefund(ReturnProcessRefundInput issueRefund) {
    this.issueRefund = issueRefund;
  }

  @Override
  public String toString() {
    return "ReturnProcessFinancialTransferInput{issueRefund='" + issueRefund + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ReturnProcessFinancialTransferInput that = (ReturnProcessFinancialTransferInput) o;
    return Objects.equals(issueRefund, that.issueRefund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueRefund);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Issue a refund for the return.
     */
    private ReturnProcessRefundInput issueRefund;

    public ReturnProcessFinancialTransferInput build() {
      ReturnProcessFinancialTransferInput result = new ReturnProcessFinancialTransferInput();
      result.issueRefund = this.issueRefund;
      return result;
    }

    /**
     * Issue a refund for the return.
     */
    public Builder issueRefund(ReturnProcessRefundInput issueRefund) {
      this.issueRefund = issueRefund;
      return this;
    }
  }
}

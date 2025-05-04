package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields that are required to reimburse shipping costs.
 */
public class ShippingRefundInput {
  /**
   * The monetary value of the shipping fees to be reimbursed.
   */
  private String amount;

  /**
   * Whether a full refund is provided.
   */
  private Boolean fullRefund;

  public ShippingRefundInput() {
  }

  /**
   * The monetary value of the shipping fees to be reimbursed.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * Whether a full refund is provided.
   */
  public Boolean getFullRefund() {
    return fullRefund;
  }

  public void setFullRefund(Boolean fullRefund) {
    this.fullRefund = fullRefund;
  }

  @Override
  public String toString() {
    return "ShippingRefundInput{amount='" + amount + "', fullRefund='" + fullRefund + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingRefundInput that = (ShippingRefundInput) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(fullRefund, that.fullRefund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, fullRefund);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The monetary value of the shipping fees to be reimbursed.
     */
    private String amount;

    /**
     * Whether a full refund is provided.
     */
    private Boolean fullRefund;

    public ShippingRefundInput build() {
      ShippingRefundInput result = new ShippingRefundInput();
      result.amount = this.amount;
      result.fullRefund = this.fullRefund;
      return result;
    }

    /**
     * The monetary value of the shipping fees to be reimbursed.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Whether a full refund is provided.
     */
    public Builder fullRefund(Boolean fullRefund) {
      this.fullRefund = fullRefund;
      return this;
    }
  }
}

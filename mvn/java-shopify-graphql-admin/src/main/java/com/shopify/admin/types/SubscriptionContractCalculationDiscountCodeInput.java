package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a discount code in the calculate API.
 */
public class SubscriptionContractCalculationDiscountCodeInput {
  /**
   * The discount code to apply to the subscription contract.
   */
  private String redeemCode;

  public SubscriptionContractCalculationDiscountCodeInput() {
  }

  /**
   * The discount code to apply to the subscription contract.
   */
  public String getRedeemCode() {
    return redeemCode;
  }

  public void setRedeemCode(String redeemCode) {
    this.redeemCode = redeemCode;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationDiscountCodeInput{redeemCode='" + redeemCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationDiscountCodeInput that = (SubscriptionContractCalculationDiscountCodeInput) o;
    return Objects.equals(redeemCode, that.redeemCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redeemCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discount code to apply to the subscription contract.
     */
    private String redeemCode;

    public SubscriptionContractCalculationDiscountCodeInput build() {
      SubscriptionContractCalculationDiscountCodeInput result = new SubscriptionContractCalculationDiscountCodeInput();
      result.redeemCode = this.redeemCode;
      return result;
    }

    /**
     * The discount code to apply to the subscription contract.
     */
    public Builder redeemCode(String redeemCode) {
      this.redeemCode = redeemCode;
      return this;
    }
  }
}

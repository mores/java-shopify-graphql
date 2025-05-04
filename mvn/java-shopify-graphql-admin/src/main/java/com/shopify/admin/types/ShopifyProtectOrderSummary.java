package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A summary of Shopify Protect details for an order.
 */
public class ShopifyProtectOrderSummary {
  /**
   * The eligibility details of an order's protection against fraudulent chargebacks.
   */
  private ShopifyProtectOrderEligibility eligibility;

  /**
   * The status of the order's protection against fraudulent chargebacks.
   */
  private ShopifyProtectStatus status;

  public ShopifyProtectOrderSummary() {
  }

  /**
   * The eligibility details of an order's protection against fraudulent chargebacks.
   */
  public ShopifyProtectOrderEligibility getEligibility() {
    return eligibility;
  }

  public void setEligibility(ShopifyProtectOrderEligibility eligibility) {
    this.eligibility = eligibility;
  }

  /**
   * The status of the order's protection against fraudulent chargebacks.
   */
  public ShopifyProtectStatus getStatus() {
    return status;
  }

  public void setStatus(ShopifyProtectStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "ShopifyProtectOrderSummary{eligibility='" + eligibility + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyProtectOrderSummary that = (ShopifyProtectOrderSummary) o;
    return Objects.equals(eligibility, that.eligibility) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligibility, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The eligibility details of an order's protection against fraudulent chargebacks.
     */
    private ShopifyProtectOrderEligibility eligibility;

    /**
     * The status of the order's protection against fraudulent chargebacks.
     */
    private ShopifyProtectStatus status;

    public ShopifyProtectOrderSummary build() {
      ShopifyProtectOrderSummary result = new ShopifyProtectOrderSummary();
      result.eligibility = this.eligibility;
      result.status = this.status;
      return result;
    }

    /**
     * The eligibility details of an order's protection against fraudulent chargebacks.
     */
    public Builder eligibility(ShopifyProtectOrderEligibility eligibility) {
      this.eligibility = eligibility;
      return this;
    }

    /**
     * The status of the order's protection against fraudulent chargebacks.
     */
    public Builder status(ShopifyProtectStatus status) {
      this.status = status;
      return this;
    }
  }
}

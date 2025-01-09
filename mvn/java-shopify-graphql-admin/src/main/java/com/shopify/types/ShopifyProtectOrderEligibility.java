package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The eligibility details of an order's protection against fraudulent chargebacks by Shopify Protect.
 */
public class ShopifyProtectOrderEligibility {
  /**
   * The status of whether an order is eligible for protection against fraudulent chargebacks.
   */
  private ShopifyProtectEligibilityStatus status;

  public ShopifyProtectOrderEligibility() {
  }

  /**
   * The status of whether an order is eligible for protection against fraudulent chargebacks.
   */
  public ShopifyProtectEligibilityStatus getStatus() {
    return status;
  }

  public void setStatus(ShopifyProtectEligibilityStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "ShopifyProtectOrderEligibility{status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyProtectOrderEligibility that = (ShopifyProtectOrderEligibility) o;
    return Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The status of whether an order is eligible for protection against fraudulent chargebacks.
     */
    private ShopifyProtectEligibilityStatus status;

    public ShopifyProtectOrderEligibility build() {
      ShopifyProtectOrderEligibility result = new ShopifyProtectOrderEligibility();
      result.status = this.status;
      return result;
    }

    /**
     * The status of whether an order is eligible for protection against fraudulent chargebacks.
     */
    public Builder status(ShopifyProtectEligibilityStatus status) {
      this.status = status;
      return this;
    }
  }
}

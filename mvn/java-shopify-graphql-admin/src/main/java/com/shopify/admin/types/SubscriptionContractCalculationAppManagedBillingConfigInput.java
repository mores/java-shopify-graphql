package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for app-managed billing configuration for subscriptions
 * contracts. These fields are stored on the contract but are not used to calculate
 * billing cycle dates.
 */
public class SubscriptionContractCalculationAppManagedBillingConfigInput {
  /**
   * The minimum number of billing cycles.
   */
  private Integer minCycles;

  /**
   * The maximum number of billing cycles.
   */
  private Integer maxCycles;

  public SubscriptionContractCalculationAppManagedBillingConfigInput() {
  }

  /**
   * The minimum number of billing cycles.
   */
  public Integer getMinCycles() {
    return minCycles;
  }

  public void setMinCycles(Integer minCycles) {
    this.minCycles = minCycles;
  }

  /**
   * The maximum number of billing cycles.
   */
  public Integer getMaxCycles() {
    return maxCycles;
  }

  public void setMaxCycles(Integer maxCycles) {
    this.maxCycles = maxCycles;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationAppManagedBillingConfigInput{minCycles='" + minCycles + "', maxCycles='" + maxCycles + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationAppManagedBillingConfigInput that = (SubscriptionContractCalculationAppManagedBillingConfigInput) o;
    return Objects.equals(minCycles, that.minCycles) &&
        Objects.equals(maxCycles, that.maxCycles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minCycles, maxCycles);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The minimum number of billing cycles.
     */
    private Integer minCycles;

    /**
     * The maximum number of billing cycles.
     */
    private Integer maxCycles;

    public SubscriptionContractCalculationAppManagedBillingConfigInput build() {
      SubscriptionContractCalculationAppManagedBillingConfigInput result = new SubscriptionContractCalculationAppManagedBillingConfigInput();
      result.minCycles = this.minCycles;
      result.maxCycles = this.maxCycles;
      return result;
    }

    /**
     * The minimum number of billing cycles.
     */
    public Builder minCycles(Integer minCycles) {
      this.minCycles = minCycles;
      return this;
    }

    /**
     * The maximum number of billing cycles.
     */
    public Builder maxCycles(Integer maxCycles) {
      this.maxCycles = maxCycles;
      return this;
    }
  }
}

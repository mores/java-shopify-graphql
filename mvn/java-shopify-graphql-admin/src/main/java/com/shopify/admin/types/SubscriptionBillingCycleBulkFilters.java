package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for filtering subscription billing cycles in bulk actions.
 */
public class SubscriptionBillingCycleBulkFilters {
  /**
   * Filters the billing cycles based on their status.
   */
  private List<SubscriptionBillingCycleBillingCycleStatus> billingCycleStatus;

  /**
   * Filters the billing cycles based on the status of their associated subscription contracts.
   */
  private List<SubscriptionContractSubscriptionStatus> contractStatus;

  /**
   * Filters the billing cycles based on the presence of billing attempts.
   */
  private SubscriptionBillingCycleBillingAttemptStatus billingAttemptStatus = SubscriptionBillingCycleBillingAttemptStatus.ANY;

  public SubscriptionBillingCycleBulkFilters() {
  }

  /**
   * Filters the billing cycles based on their status.
   */
  public List<SubscriptionBillingCycleBillingCycleStatus> getBillingCycleStatus() {
    return billingCycleStatus;
  }

  public void setBillingCycleStatus(
      List<SubscriptionBillingCycleBillingCycleStatus> billingCycleStatus) {
    this.billingCycleStatus = billingCycleStatus;
  }

  /**
   * Filters the billing cycles based on the status of their associated subscription contracts.
   */
  public List<SubscriptionContractSubscriptionStatus> getContractStatus() {
    return contractStatus;
  }

  public void setContractStatus(List<SubscriptionContractSubscriptionStatus> contractStatus) {
    this.contractStatus = contractStatus;
  }

  /**
   * Filters the billing cycles based on the presence of billing attempts.
   */
  public SubscriptionBillingCycleBillingAttemptStatus getBillingAttemptStatus() {
    return billingAttemptStatus;
  }

  public void setBillingAttemptStatus(
      SubscriptionBillingCycleBillingAttemptStatus billingAttemptStatus) {
    this.billingAttemptStatus = billingAttemptStatus;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCycleBulkFilters{billingCycleStatus='" + billingCycleStatus + "', contractStatus='" + contractStatus + "', billingAttemptStatus='" + billingAttemptStatus + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleBulkFilters that = (SubscriptionBillingCycleBulkFilters) o;
    return Objects.equals(billingCycleStatus, that.billingCycleStatus) &&
        Objects.equals(contractStatus, that.contractStatus) &&
        Objects.equals(billingAttemptStatus, that.billingAttemptStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingCycleStatus, contractStatus, billingAttemptStatus);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Filters the billing cycles based on their status.
     */
    private List<SubscriptionBillingCycleBillingCycleStatus> billingCycleStatus;

    /**
     * Filters the billing cycles based on the status of their associated subscription contracts.
     */
    private List<SubscriptionContractSubscriptionStatus> contractStatus;

    /**
     * Filters the billing cycles based on the presence of billing attempts.
     */
    private SubscriptionBillingCycleBillingAttemptStatus billingAttemptStatus = SubscriptionBillingCycleBillingAttemptStatus.ANY;

    public SubscriptionBillingCycleBulkFilters build() {
      SubscriptionBillingCycleBulkFilters result = new SubscriptionBillingCycleBulkFilters();
      result.billingCycleStatus = this.billingCycleStatus;
      result.contractStatus = this.contractStatus;
      result.billingAttemptStatus = this.billingAttemptStatus;
      return result;
    }

    /**
     * Filters the billing cycles based on their status.
     */
    public Builder billingCycleStatus(
        List<SubscriptionBillingCycleBillingCycleStatus> billingCycleStatus) {
      this.billingCycleStatus = billingCycleStatus;
      return this;
    }

    /**
     * Filters the billing cycles based on the status of their associated subscription contracts.
     */
    public Builder contractStatus(List<SubscriptionContractSubscriptionStatus> contractStatus) {
      this.contractStatus = contractStatus;
      return this;
    }

    /**
     * Filters the billing cycles based on the presence of billing attempts.
     */
    public Builder billingAttemptStatus(
        SubscriptionBillingCycleBillingAttemptStatus billingAttemptStatus) {
      this.billingAttemptStatus = billingAttemptStatus;
      return this;
    }
  }
}

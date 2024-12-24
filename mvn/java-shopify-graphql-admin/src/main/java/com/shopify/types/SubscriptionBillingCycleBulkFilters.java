package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionBillingCycleBulkFilters {
  
  private List<SubscriptionBillingCycleBillingCycleStatus> billingCycleStatus;

  
  private List<SubscriptionContractSubscriptionStatus> contractStatus;

  
  private SubscriptionBillingCycleBillingAttemptStatus billingAttemptStatus = SubscriptionBillingCycleBillingAttemptStatus.ANY;

  public SubscriptionBillingCycleBulkFilters() {
  }

  
  public List<SubscriptionBillingCycleBillingCycleStatus> getBillingCycleStatus() {
    return billingCycleStatus;
  }

  public void setBillingCycleStatus(
      List<SubscriptionBillingCycleBillingCycleStatus> billingCycleStatus) {
    this.billingCycleStatus = billingCycleStatus;
  }

  
  public List<SubscriptionContractSubscriptionStatus> getContractStatus() {
    return contractStatus;
  }

  public void setContractStatus(List<SubscriptionContractSubscriptionStatus> contractStatus) {
    this.contractStatus = contractStatus;
  }

  
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
    
    private List<SubscriptionBillingCycleBillingCycleStatus> billingCycleStatus;

    
    private List<SubscriptionContractSubscriptionStatus> contractStatus;

    
    private SubscriptionBillingCycleBillingAttemptStatus billingAttemptStatus = SubscriptionBillingCycleBillingAttemptStatus.ANY;

    public SubscriptionBillingCycleBulkFilters build() {
      SubscriptionBillingCycleBulkFilters result = new SubscriptionBillingCycleBulkFilters();
      result.billingCycleStatus = this.billingCycleStatus;
      result.contractStatus = this.contractStatus;
      result.billingAttemptStatus = this.billingAttemptStatus;
      return result;
    }

    
    public Builder billingCycleStatus(
        List<SubscriptionBillingCycleBillingCycleStatus> billingCycleStatus) {
      this.billingCycleStatus = billingCycleStatus;
      return this;
    }

    
    public Builder contractStatus(List<SubscriptionContractSubscriptionStatus> contractStatus) {
      this.contractStatus = contractStatus;
      return this;
    }

    
    public Builder billingAttemptStatus(
        SubscriptionBillingCycleBillingAttemptStatus billingAttemptStatus) {
      this.billingAttemptStatus = billingAttemptStatus;
      return this;
    }
  }
}

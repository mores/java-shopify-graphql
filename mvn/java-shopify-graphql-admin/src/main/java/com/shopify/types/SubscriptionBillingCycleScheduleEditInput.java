package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class SubscriptionBillingCycleScheduleEditInput {
  
  private Boolean skip;

  
  private OffsetDateTime billingDate;

  
  private SubscriptionBillingCycleScheduleEditInputScheduleEditReason reason;

  public SubscriptionBillingCycleScheduleEditInput() {
  }

  
  public Boolean getSkip() {
    return skip;
  }

  public void setSkip(Boolean skip) {
    this.skip = skip;
  }

  
  public OffsetDateTime getBillingDate() {
    return billingDate;
  }

  public void setBillingDate(OffsetDateTime billingDate) {
    this.billingDate = billingDate;
  }

  
  public SubscriptionBillingCycleScheduleEditInputScheduleEditReason getReason() {
    return reason;
  }

  public void setReason(SubscriptionBillingCycleScheduleEditInputScheduleEditReason reason) {
    this.reason = reason;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCycleScheduleEditInput{skip='" + skip + "', billingDate='" + billingDate + "', reason='" + reason + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleScheduleEditInput that = (SubscriptionBillingCycleScheduleEditInput) o;
    return Objects.equals(skip, that.skip) &&
        Objects.equals(billingDate, that.billingDate) &&
        Objects.equals(reason, that.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skip, billingDate, reason);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean skip;

    
    private OffsetDateTime billingDate;

    
    private SubscriptionBillingCycleScheduleEditInputScheduleEditReason reason;

    public SubscriptionBillingCycleScheduleEditInput build() {
      SubscriptionBillingCycleScheduleEditInput result = new SubscriptionBillingCycleScheduleEditInput();
      result.skip = this.skip;
      result.billingDate = this.billingDate;
      result.reason = this.reason;
      return result;
    }

    
    public Builder skip(Boolean skip) {
      this.skip = skip;
      return this;
    }

    
    public Builder billingDate(OffsetDateTime billingDate) {
      this.billingDate = billingDate;
      return this;
    }

    
    public Builder reason(SubscriptionBillingCycleScheduleEditInputScheduleEditReason reason) {
      this.reason = reason;
      return this;
    }
  }
}

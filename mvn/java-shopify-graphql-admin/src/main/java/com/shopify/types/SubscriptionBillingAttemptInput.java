package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class SubscriptionBillingAttemptInput {
  
  private String idempotencyKey;

  
  private OffsetDateTime originTime;

  
  private SubscriptionBillingCycleSelector billingCycleSelector;

  public SubscriptionBillingAttemptInput() {
  }

  
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  
  public OffsetDateTime getOriginTime() {
    return originTime;
  }

  public void setOriginTime(OffsetDateTime originTime) {
    this.originTime = originTime;
  }

  
  public SubscriptionBillingCycleSelector getBillingCycleSelector() {
    return billingCycleSelector;
  }

  public void setBillingCycleSelector(SubscriptionBillingCycleSelector billingCycleSelector) {
    this.billingCycleSelector = billingCycleSelector;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttemptInput{idempotencyKey='" + idempotencyKey + "', originTime='" + originTime + "', billingCycleSelector='" + billingCycleSelector + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttemptInput that = (SubscriptionBillingAttemptInput) o;
    return Objects.equals(idempotencyKey, that.idempotencyKey) &&
        Objects.equals(originTime, that.originTime) &&
        Objects.equals(billingCycleSelector, that.billingCycleSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idempotencyKey, originTime, billingCycleSelector);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String idempotencyKey;

    
    private OffsetDateTime originTime;

    
    private SubscriptionBillingCycleSelector billingCycleSelector;

    public SubscriptionBillingAttemptInput build() {
      SubscriptionBillingAttemptInput result = new SubscriptionBillingAttemptInput();
      result.idempotencyKey = this.idempotencyKey;
      result.originTime = this.originTime;
      result.billingCycleSelector = this.billingCycleSelector;
      return result;
    }

    
    public Builder idempotencyKey(String idempotencyKey) {
      this.idempotencyKey = idempotencyKey;
      return this;
    }

    
    public Builder originTime(OffsetDateTime originTime) {
      this.originTime = originTime;
      return this;
    }

    
    public Builder billingCycleSelector(SubscriptionBillingCycleSelector billingCycleSelector) {
      this.billingCycleSelector = billingCycleSelector;
      return this;
    }
  }
}

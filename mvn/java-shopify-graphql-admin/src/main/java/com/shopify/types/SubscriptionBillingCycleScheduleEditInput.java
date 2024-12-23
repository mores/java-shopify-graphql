package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for parameters to modify the schedule of a specific billing cycle.
 */
public class SubscriptionBillingCycleScheduleEditInput {
  /**
   * Sets the skip status for the billing cycle.
   */
  private Boolean skip;

  /**
   * Sets the expected billing date for the billing cycle.
   */
  private OffsetDateTime billingDate;

  /**
   * The reason for editing.
   */
  private SubscriptionBillingCycleScheduleEditInputScheduleEditReason reason;

  public SubscriptionBillingCycleScheduleEditInput() {
  }

  /**
   * Sets the skip status for the billing cycle.
   */
  public Boolean getSkip() {
    return skip;
  }

  public void setSkip(Boolean skip) {
    this.skip = skip;
  }

  /**
   * Sets the expected billing date for the billing cycle.
   */
  public OffsetDateTime getBillingDate() {
    return billingDate;
  }

  public void setBillingDate(OffsetDateTime billingDate) {
    this.billingDate = billingDate;
  }

  /**
   * The reason for editing.
   */
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
    /**
     * Sets the skip status for the billing cycle.
     */
    private Boolean skip;

    /**
     * Sets the expected billing date for the billing cycle.
     */
    private OffsetDateTime billingDate;

    /**
     * The reason for editing.
     */
    private SubscriptionBillingCycleScheduleEditInputScheduleEditReason reason;

    public SubscriptionBillingCycleScheduleEditInput build() {
      SubscriptionBillingCycleScheduleEditInput result = new SubscriptionBillingCycleScheduleEditInput();
      result.skip = this.skip;
      result.billingDate = this.billingDate;
      result.reason = this.reason;
      return result;
    }

    /**
     * Sets the skip status for the billing cycle.
     */
    public Builder skip(Boolean skip) {
      this.skip = skip;
      return this;
    }

    /**
     * Sets the expected billing date for the billing cycle.
     */
    public Builder billingDate(OffsetDateTime billingDate) {
      this.billingDate = billingDate;
      return this;
    }

    /**
     * The reason for editing.
     */
    public Builder reason(SubscriptionBillingCycleScheduleEditInputScheduleEditReason reason) {
      this.reason = reason;
      return this;
    }
  }
}

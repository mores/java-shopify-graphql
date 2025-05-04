package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields to select SubscriptionBillingCycle by either date or index.
 */
public class SubscriptionBillingCycleSelector {
  /**
   * Returns a billing cycle by index.
   */
  private Integer index;

  /**
   * Returns a billing cycle by date.
   */
  private OffsetDateTime date;

  public SubscriptionBillingCycleSelector() {
  }

  /**
   * Returns a billing cycle by index.
   */
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Returns a billing cycle by date.
   */
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingCycleSelector{index='" + index + "', date='" + date + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingCycleSelector that = (SubscriptionBillingCycleSelector) o;
    return Objects.equals(index, that.index) &&
        Objects.equals(date, that.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, date);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Returns a billing cycle by index.
     */
    private Integer index;

    /**
     * Returns a billing cycle by date.
     */
    private OffsetDateTime date;

    public SubscriptionBillingCycleSelector build() {
      SubscriptionBillingCycleSelector result = new SubscriptionBillingCycleSelector();
      result.index = this.index;
      result.date = this.date;
      return result;
    }

    /**
     * Returns a billing cycle by index.
     */
    public Builder index(Integer index) {
      this.index = index;
      return this;
    }

    /**
     * Returns a billing cycle by date.
     */
    public Builder date(OffsetDateTime date) {
      this.date = date;
      return this;
    }
  }
}

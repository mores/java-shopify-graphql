package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The plan attached to an app subscription.
 */
public class AppSubscriptionLineItem {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The pricing model for the app subscription.
   */
  private AppPlanV2 plan;

  /**
   * A list of the store's usage records for a usage pricing plan.
   */
  private AppUsageRecordConnection usageRecords;

  public AppSubscriptionLineItem() {
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The pricing model for the app subscription.
   */
  public AppPlanV2 getPlan() {
    return plan;
  }

  public void setPlan(AppPlanV2 plan) {
    this.plan = plan;
  }

  /**
   * A list of the store's usage records for a usage pricing plan.
   */
  public AppUsageRecordConnection getUsageRecords() {
    return usageRecords;
  }

  public void setUsageRecords(AppUsageRecordConnection usageRecords) {
    this.usageRecords = usageRecords;
  }

  @Override
  public String toString() {
    return "AppSubscriptionLineItem{id='" + id + "', plan='" + plan + "', usageRecords='" + usageRecords + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionLineItem that = (AppSubscriptionLineItem) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(plan, that.plan) &&
        Objects.equals(usageRecords, that.usageRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, plan, usageRecords);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The pricing model for the app subscription.
     */
    private AppPlanV2 plan;

    /**
     * A list of the store's usage records for a usage pricing plan.
     */
    private AppUsageRecordConnection usageRecords;

    public AppSubscriptionLineItem build() {
      AppSubscriptionLineItem result = new AppSubscriptionLineItem();
      result.id = this.id;
      result.plan = this.plan;
      result.usageRecords = this.usageRecords;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The pricing model for the app subscription.
     */
    public Builder plan(AppPlanV2 plan) {
      this.plan = plan;
      return this;
    }

    /**
     * A list of the store's usage records for a usage pricing plan.
     */
    public Builder usageRecords(AppUsageRecordConnection usageRecords) {
      this.usageRecords = usageRecords;
      return this;
    }
  }
}

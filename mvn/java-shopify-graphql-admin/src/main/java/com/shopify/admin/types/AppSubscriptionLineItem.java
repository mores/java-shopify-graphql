package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a component of an app subscription that contains pricing details for
 * either recurring fees or usage-based charges. Each subscription has exactly 1 or
 * 2 line items - one for recurring fees and/or one for usage fees.
 *
 * If a subscription has both recurring and usage pricing, there will be 2 line
 * items. If it only has one type of pricing, the subscription will have a single
 * line item for that pricing model.
 *
 * Use the `AppSubscriptionLineItem` object to:
 * - View the pricing terms a merchant has agreed to
 * - Distinguish between recurring and usage fee components
 * - Access detailed billing information for each pricing component
 *
 * This read-only object provides visibility into the subscription's pricing structure without allowing modifications.
 *
 * Read about subscription pricing models in the [billing architecture
 * guide](https://shopify.dev/docs/apps/launch/billing/subscription-billing).
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

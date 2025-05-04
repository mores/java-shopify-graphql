package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to add more than one pricing plan to an app subscription.
 */
public class AppSubscriptionLineItemInput {
  /**
   * The pricing model for the app subscription.
   */
  private AppPlanInput plan;

  public AppSubscriptionLineItemInput() {
  }

  /**
   * The pricing model for the app subscription.
   */
  public AppPlanInput getPlan() {
    return plan;
  }

  public void setPlan(AppPlanInput plan) {
    this.plan = plan;
  }

  @Override
  public String toString() {
    return "AppSubscriptionLineItemInput{plan='" + plan + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionLineItemInput that = (AppSubscriptionLineItemInput) o;
    return Objects.equals(plan, that.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plan);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The pricing model for the app subscription.
     */
    private AppPlanInput plan;

    public AppSubscriptionLineItemInput build() {
      AppSubscriptionLineItemInput result = new AppSubscriptionLineItemInput();
      result.plan = this.plan;
      return result;
    }

    /**
     * The pricing model for the app subscription.
     */
    public Builder plan(AppPlanInput plan) {
      this.plan = plan;
      return this;
    }
  }
}

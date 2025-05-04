package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The pricing model for the app subscription.
 * The pricing model input can be either `appRecurringPricingDetails` or `appUsagePricingDetails`.
 */
public class AppPlanInput {
  /**
   * The pricing details for usage-based billing.
   */
  private AppUsagePricingInput appUsagePricingDetails;

  /**
   * The pricing details for recurring billing.
   */
  private AppRecurringPricingInput appRecurringPricingDetails;

  public AppPlanInput() {
  }

  /**
   * The pricing details for usage-based billing.
   */
  public AppUsagePricingInput getAppUsagePricingDetails() {
    return appUsagePricingDetails;
  }

  public void setAppUsagePricingDetails(AppUsagePricingInput appUsagePricingDetails) {
    this.appUsagePricingDetails = appUsagePricingDetails;
  }

  /**
   * The pricing details for recurring billing.
   */
  public AppRecurringPricingInput getAppRecurringPricingDetails() {
    return appRecurringPricingDetails;
  }

  public void setAppRecurringPricingDetails(AppRecurringPricingInput appRecurringPricingDetails) {
    this.appRecurringPricingDetails = appRecurringPricingDetails;
  }

  @Override
  public String toString() {
    return "AppPlanInput{appUsagePricingDetails='" + appUsagePricingDetails + "', appRecurringPricingDetails='" + appRecurringPricingDetails + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppPlanInput that = (AppPlanInput) o;
    return Objects.equals(appUsagePricingDetails, that.appUsagePricingDetails) &&
        Objects.equals(appRecurringPricingDetails, that.appRecurringPricingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appUsagePricingDetails, appRecurringPricingDetails);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The pricing details for usage-based billing.
     */
    private AppUsagePricingInput appUsagePricingDetails;

    /**
     * The pricing details for recurring billing.
     */
    private AppRecurringPricingInput appRecurringPricingDetails;

    public AppPlanInput build() {
      AppPlanInput result = new AppPlanInput();
      result.appUsagePricingDetails = this.appUsagePricingDetails;
      result.appRecurringPricingDetails = this.appRecurringPricingDetails;
      return result;
    }

    /**
     * The pricing details for usage-based billing.
     */
    public Builder appUsagePricingDetails(AppUsagePricingInput appUsagePricingDetails) {
      this.appUsagePricingDetails = appUsagePricingDetails;
      return this;
    }

    /**
     * The pricing details for recurring billing.
     */
    public Builder appRecurringPricingDetails(AppRecurringPricingInput appRecurringPricingDetails) {
      this.appRecurringPricingDetails = appRecurringPricingDetails;
      return this;
    }
  }
}

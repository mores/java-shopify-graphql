package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Contains the pricing details for the app plan that a merchant has subscribed to within their current billing arrangement.
 *
 * This simplified object focuses on the essential pricing information merchants
 * need to understand their current subscription costs and billing structure.
 *
 * Details about subscription management and pricing strategies are available in
 * the [app billing documentation](https://shopify.dev/docs/apps/launch/billing).
 */
public class AppPlanV2 {
  /**
   * The plan billed to a shop on a recurring basis.
   */
  private AppPricingDetails pricingDetails;

  public AppPlanV2() {
  }

  /**
   * The plan billed to a shop on a recurring basis.
   */
  public AppPricingDetails getPricingDetails() {
    return pricingDetails;
  }

  public void setPricingDetails(AppPricingDetails pricingDetails) {
    this.pricingDetails = pricingDetails;
  }

  @Override
  public String toString() {
    return "AppPlanV2{pricingDetails='" + pricingDetails + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppPlanV2 that = (AppPlanV2) o;
    return Objects.equals(pricingDetails, that.pricingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pricingDetails);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The plan billed to a shop on a recurring basis.
     */
    private AppPricingDetails pricingDetails;

    public AppPlanV2 build() {
      AppPlanV2 result = new AppPlanV2();
      result.pricingDetails = this.pricingDetails;
      return result;
    }

    /**
     * The plan billed to a shop on a recurring basis.
     */
    public Builder pricingDetails(AppPricingDetails pricingDetails) {
      this.pricingDetails = pricingDetails;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating breadcrumb customizations, which represent the buyer's journey to checkout.
 */
public class CheckoutAndAccountsConfigurationBrandingBuyerJourneyInput {
  /**
   * The visibility customizations for updating breadcrumbs, which represent the buyer's journey to checkout.
   */
  private CheckoutAndAccountsConfigurationBrandingVisibility visibility;

  public CheckoutAndAccountsConfigurationBrandingBuyerJourneyInput() {
  }

  /**
   * The visibility customizations for updating breadcrumbs, which represent the buyer's journey to checkout.
   */
  public CheckoutAndAccountsConfigurationBrandingVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(CheckoutAndAccountsConfigurationBrandingVisibility visibility) {
    this.visibility = visibility;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingBuyerJourneyInput{visibility='" + visibility + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingBuyerJourneyInput that = (CheckoutAndAccountsConfigurationBrandingBuyerJourneyInput) o;
    return Objects.equals(visibility, that.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visibility);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The visibility customizations for updating breadcrumbs, which represent the buyer's journey to checkout.
     */
    private CheckoutAndAccountsConfigurationBrandingVisibility visibility;

    public CheckoutAndAccountsConfigurationBrandingBuyerJourneyInput build() {
      CheckoutAndAccountsConfigurationBrandingBuyerJourneyInput result = new CheckoutAndAccountsConfigurationBrandingBuyerJourneyInput();
      result.visibility = this.visibility;
      return result;
    }

    /**
     * The visibility customizations for updating breadcrumbs, which represent the buyer's journey to checkout.
     */
    public Builder visibility(CheckoutAndAccountsConfigurationBrandingVisibility visibility) {
      this.visibility = visibility;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The customizations for the breadcrumbs that represent a buyer's journey to the checkout.
 */
public class CheckoutAndAccountsConfigurationBrandingBuyerJourney {
  /**
   * An option to display or hide the breadcrumbs that represent the buyer's journey on 3-page checkout.
   */
  private CheckoutAndAccountsConfigurationBrandingVisibility visibility;

  public CheckoutAndAccountsConfigurationBrandingBuyerJourney() {
  }

  /**
   * An option to display or hide the breadcrumbs that represent the buyer's journey on 3-page checkout.
   */
  public CheckoutAndAccountsConfigurationBrandingVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(CheckoutAndAccountsConfigurationBrandingVisibility visibility) {
    this.visibility = visibility;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingBuyerJourney{visibility='" + visibility + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingBuyerJourney that = (CheckoutAndAccountsConfigurationBrandingBuyerJourney) o;
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
     * An option to display or hide the breadcrumbs that represent the buyer's journey on 3-page checkout.
     */
    private CheckoutAndAccountsConfigurationBrandingVisibility visibility;

    public CheckoutAndAccountsConfigurationBrandingBuyerJourney build() {
      CheckoutAndAccountsConfigurationBrandingBuyerJourney result = new CheckoutAndAccountsConfigurationBrandingBuyerJourney();
      result.visibility = this.visibility;
      return result;
    }

    /**
     * An option to display or hide the breadcrumbs that represent the buyer's journey on 3-page checkout.
     */
    public Builder visibility(CheckoutAndAccountsConfigurationBrandingVisibility visibility) {
      this.visibility = visibility;
      return this;
    }
  }
}

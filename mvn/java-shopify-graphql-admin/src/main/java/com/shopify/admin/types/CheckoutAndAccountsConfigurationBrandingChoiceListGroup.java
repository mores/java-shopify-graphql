package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The customizations that apply to the 'group' variant of ChoiceList.
 */
public class CheckoutAndAccountsConfigurationBrandingChoiceListGroup {
  /**
   * The spacing between UI elements in the list.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacingKeyword spacing;

  public CheckoutAndAccountsConfigurationBrandingChoiceListGroup() {
  }

  /**
   * The spacing between UI elements in the list.
   */
  public CheckoutAndAccountsConfigurationBrandingSpacingKeyword getSpacing() {
    return spacing;
  }

  public void setSpacing(CheckoutAndAccountsConfigurationBrandingSpacingKeyword spacing) {
    this.spacing = spacing;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingChoiceListGroup{spacing='" + spacing + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingChoiceListGroup that = (CheckoutAndAccountsConfigurationBrandingChoiceListGroup) o;
    return Objects.equals(spacing, that.spacing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spacing);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The spacing between UI elements in the list.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacingKeyword spacing;

    public CheckoutAndAccountsConfigurationBrandingChoiceListGroup build() {
      CheckoutAndAccountsConfigurationBrandingChoiceListGroup result = new CheckoutAndAccountsConfigurationBrandingChoiceListGroup();
      result.spacing = this.spacing;
      return result;
    }

    /**
     * The spacing between UI elements in the list.
     */
    public Builder spacing(CheckoutAndAccountsConfigurationBrandingSpacingKeyword spacing) {
      this.spacing = spacing;
      return this;
    }
  }
}

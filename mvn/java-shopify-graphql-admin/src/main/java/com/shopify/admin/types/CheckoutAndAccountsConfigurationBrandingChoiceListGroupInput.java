package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the 'group' variant of ChoiceList.
 */
public class CheckoutAndAccountsConfigurationBrandingChoiceListGroupInput {
  /**
   * The spacing between UI elements in the list.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacingKeyword spacing;

  public CheckoutAndAccountsConfigurationBrandingChoiceListGroupInput() {
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
    return "CheckoutAndAccountsConfigurationBrandingChoiceListGroupInput{spacing='" + spacing + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingChoiceListGroupInput that = (CheckoutAndAccountsConfigurationBrandingChoiceListGroupInput) o;
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

    public CheckoutAndAccountsConfigurationBrandingChoiceListGroupInput build() {
      CheckoutAndAccountsConfigurationBrandingChoiceListGroupInput result = new CheckoutAndAccountsConfigurationBrandingChoiceListGroupInput();
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

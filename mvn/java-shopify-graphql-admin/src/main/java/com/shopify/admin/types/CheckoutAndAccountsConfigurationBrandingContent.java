package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The content customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingContent {
  /**
   * The divider style and visibility.
   */
  private CheckoutAndAccountsConfigurationBrandingContainerDivider divider;

  public CheckoutAndAccountsConfigurationBrandingContent() {
  }

  /**
   * The divider style and visibility.
   */
  public CheckoutAndAccountsConfigurationBrandingContainerDivider getDivider() {
    return divider;
  }

  public void setDivider(CheckoutAndAccountsConfigurationBrandingContainerDivider divider) {
    this.divider = divider;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingContent{divider='" + divider + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingContent that = (CheckoutAndAccountsConfigurationBrandingContent) o;
    return Objects.equals(divider, that.divider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(divider);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The divider style and visibility.
     */
    private CheckoutAndAccountsConfigurationBrandingContainerDivider divider;

    public CheckoutAndAccountsConfigurationBrandingContent build() {
      CheckoutAndAccountsConfigurationBrandingContent result = new CheckoutAndAccountsConfigurationBrandingContent();
      result.divider = this.divider;
      return result;
    }

    /**
     * The divider style and visibility.
     */
    public Builder divider(CheckoutAndAccountsConfigurationBrandingContainerDivider divider) {
      this.divider = divider;
      return this;
    }
  }
}

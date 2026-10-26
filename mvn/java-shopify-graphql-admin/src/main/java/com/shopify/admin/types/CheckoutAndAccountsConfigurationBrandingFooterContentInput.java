package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the footer content.
 */
public class CheckoutAndAccountsConfigurationBrandingFooterContentInput {
  /**
   * The visibility of the footer content. Shopify reserves the right to add
   * required legal notices to the footer and prevent them from being modified or
   * hidden. This setting doesn't control the visibility of those notices.
   */
  private CheckoutAndAccountsConfigurationBrandingVisibility visibility;

  public CheckoutAndAccountsConfigurationBrandingFooterContentInput() {
  }

  /**
   * The visibility of the footer content. Shopify reserves the right to add
   * required legal notices to the footer and prevent them from being modified or
   * hidden. This setting doesn't control the visibility of those notices.
   */
  public CheckoutAndAccountsConfigurationBrandingVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(CheckoutAndAccountsConfigurationBrandingVisibility visibility) {
    this.visibility = visibility;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingFooterContentInput{visibility='" + visibility + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingFooterContentInput that = (CheckoutAndAccountsConfigurationBrandingFooterContentInput) o;
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
     * The visibility of the footer content. Shopify reserves the right to add
     * required legal notices to the footer and prevent them from being modified or
     * hidden. This setting doesn't control the visibility of those notices.
     */
    private CheckoutAndAccountsConfigurationBrandingVisibility visibility;

    public CheckoutAndAccountsConfigurationBrandingFooterContentInput build() {
      CheckoutAndAccountsConfigurationBrandingFooterContentInput result = new CheckoutAndAccountsConfigurationBrandingFooterContentInput();
      result.visibility = this.visibility;
      return result;
    }

    /**
     * The visibility of the footer content. Shopify reserves the right to add
     * required legal notices to the footer and prevent them from being modified or
     * hidden. This setting doesn't control the visibility of those notices.
     */
    public Builder visibility(CheckoutAndAccountsConfigurationBrandingVisibility visibility) {
      this.visibility = visibility;
      return this;
    }
  }
}

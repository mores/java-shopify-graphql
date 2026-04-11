package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A container for the customer accounts footer section customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooter {
  /**
   * The footer alignment.
   */
  private CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment;

  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColors colors;

  /**
   * The padding of the footer container.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooter() {
  }

  /**
   * The footer alignment.
   */
  public CheckoutAndAccountsConfigurationBrandingFooterAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment) {
    this.alignment = alignment;
  }

  /**
   * The colors customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingColors getColors() {
    return colors;
  }

  public void setColors(CheckoutAndAccountsConfigurationBrandingColors colors) {
    this.colors = colors;
  }

  /**
   * The padding of the footer container.
   */
  public CheckoutAndAccountsConfigurationBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooter{alignment='" + alignment + "', colors='" + colors + "', padding='" + padding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooter that = (CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooter) o;
    return Objects.equals(alignment, that.alignment) &&
        Objects.equals(colors, that.colors) &&
        Objects.equals(padding, that.padding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, colors, padding);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The footer alignment.
     */
    private CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment;

    /**
     * The colors customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingColors colors;

    /**
     * The padding of the footer container.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

    public CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooter build() {
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooter result = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooter();
      result.alignment = this.alignment;
      result.colors = this.colors;
      result.padding = this.padding;
      return result;
    }

    /**
     * The footer alignment.
     */
    public Builder alignment(CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment) {
      this.alignment = alignment;
      return this;
    }

    /**
     * The colors customizations.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingColors colors) {
      this.colors = colors;
      return this;
    }

    /**
     * The padding of the footer container.
     */
    public Builder padding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the customer accounts footer.
 */
public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterInput {
  /**
   * The footer alignment settings. You can set the footer native content alignment to the left, center, or right.
   */
  private CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment;

  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

  /**
   * The padding of the footer container.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterInput() {
  }

  /**
   * The footer alignment settings. You can set the footer native content alignment to the left, center, or right.
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
  public CheckoutAndAccountsConfigurationBrandingColorsInput getColors() {
    return colors;
  }

  public void setColors(CheckoutAndAccountsConfigurationBrandingColorsInput colors) {
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
    return "CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterInput{alignment='" + alignment + "', colors='" + colors + "', padding='" + padding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterInput that = (CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterInput) o;
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
     * The footer alignment settings. You can set the footer native content alignment to the left, center, or right.
     */
    private CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment;

    /**
     * The colors customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

    /**
     * The padding of the footer container.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

    public CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterInput build() {
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterInput result = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterInput();
      result.alignment = this.alignment;
      result.colors = this.colors;
      result.padding = this.padding;
      return result;
    }

    /**
     * The footer alignment settings. You can set the footer native content alignment to the left, center, or right.
     */
    public Builder alignment(CheckoutAndAccountsConfigurationBrandingFooterAlignment alignment) {
      this.alignment = alignment;
      return this;
    }

    /**
     * The colors customizations.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingColorsInput colors) {
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

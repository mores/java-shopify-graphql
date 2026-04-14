package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The checkout header customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeader {
  /**
   * The header alignment.
   */
  private CheckoutAndAccountsConfigurationBrandingHeaderAlignment alignment;

  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColors colors;

  /**
   * The store logo.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogo logo;

  /**
   * The padding of the header container.
   */
  private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeader() {
  }

  /**
   * The header alignment.
   */
  public CheckoutAndAccountsConfigurationBrandingHeaderAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(CheckoutAndAccountsConfigurationBrandingHeaderAlignment alignment) {
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
   * The store logo.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogo getLogo() {
    return logo;
  }

  public void setLogo(CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogo logo) {
    this.logo = logo;
  }

  /**
   * The padding of the header container.
   */
  public CheckoutAndAccountsConfigurationBrandingSpacingKeyword getPadding() {
    return padding;
  }

  public void setPadding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
    this.padding = padding;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeader{alignment='" + alignment + "', colors='" + colors + "', logo='" + logo + "', padding='" + padding + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeader that = (CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeader) o;
    return Objects.equals(alignment, that.alignment) &&
        Objects.equals(colors, that.colors) &&
        Objects.equals(logo, that.logo) &&
        Objects.equals(padding, that.padding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, colors, logo, padding);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The header alignment.
     */
    private CheckoutAndAccountsConfigurationBrandingHeaderAlignment alignment;

    /**
     * The colors customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingColors colors;

    /**
     * The store logo.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogo logo;

    /**
     * The padding of the header container.
     */
    private CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding;

    public CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeader build() {
      CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeader result = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeader();
      result.alignment = this.alignment;
      result.colors = this.colors;
      result.logo = this.logo;
      result.padding = this.padding;
      return result;
    }

    /**
     * The header alignment.
     */
    public Builder alignment(CheckoutAndAccountsConfigurationBrandingHeaderAlignment alignment) {
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
     * The store logo.
     */
    public Builder logo(CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogo logo) {
      this.logo = logo;
      return this;
    }

    /**
     * The padding of the header container.
     */
    public Builder padding(CheckoutAndAccountsConfigurationBrandingSpacingKeyword padding) {
      this.padding = padding;
      return this;
    }
  }
}

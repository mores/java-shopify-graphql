package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the main container.
 */
public class CheckoutAndAccountsConfigurationBrandingMainInput {
  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

  /**
   * Divider style and visibility on the main container.
   */
  private CheckoutAndAccountsConfigurationBrandingContainerDividerInput divider;

  /**
   * The customizations for the main sections.
   */
  private CheckoutAndAccountsConfigurationBrandingMainSectionInput section;

  public CheckoutAndAccountsConfigurationBrandingMainInput() {
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
   * Divider style and visibility on the main container.
   */
  public CheckoutAndAccountsConfigurationBrandingContainerDividerInput getDivider() {
    return divider;
  }

  public void setDivider(CheckoutAndAccountsConfigurationBrandingContainerDividerInput divider) {
    this.divider = divider;
  }

  /**
   * The customizations for the main sections.
   */
  public CheckoutAndAccountsConfigurationBrandingMainSectionInput getSection() {
    return section;
  }

  public void setSection(CheckoutAndAccountsConfigurationBrandingMainSectionInput section) {
    this.section = section;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingMainInput{colors='" + colors + "', divider='" + divider + "', section='" + section + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingMainInput that = (CheckoutAndAccountsConfigurationBrandingMainInput) o;
    return Objects.equals(colors, that.colors) &&
        Objects.equals(divider, that.divider) &&
        Objects.equals(section, that.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colors, divider, section);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The colors customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

    /**
     * Divider style and visibility on the main container.
     */
    private CheckoutAndAccountsConfigurationBrandingContainerDividerInput divider;

    /**
     * The customizations for the main sections.
     */
    private CheckoutAndAccountsConfigurationBrandingMainSectionInput section;

    public CheckoutAndAccountsConfigurationBrandingMainInput build() {
      CheckoutAndAccountsConfigurationBrandingMainInput result = new CheckoutAndAccountsConfigurationBrandingMainInput();
      result.colors = this.colors;
      result.divider = this.divider;
      result.section = this.section;
      return result;
    }

    /**
     * The colors customizations.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingColorsInput colors) {
      this.colors = colors;
      return this;
    }

    /**
     * Divider style and visibility on the main container.
     */
    public Builder divider(CheckoutAndAccountsConfigurationBrandingContainerDividerInput divider) {
      this.divider = divider;
      return this;
    }

    /**
     * The customizations for the main sections.
     */
    public Builder section(CheckoutAndAccountsConfigurationBrandingMainSectionInput section) {
      this.section = section;
      return this;
    }
  }
}

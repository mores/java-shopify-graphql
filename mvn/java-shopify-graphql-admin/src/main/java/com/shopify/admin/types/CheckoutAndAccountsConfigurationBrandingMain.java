package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The main container customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingMain {
  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColors colors;

  /**
   * The main container's divider style and visibility.
   */
  private CheckoutAndAccountsConfigurationBrandingContainerDivider divider;

  /**
   * The main sections.
   */
  private CheckoutAndAccountsConfigurationBrandingMainSection section;

  public CheckoutAndAccountsConfigurationBrandingMain() {
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
   * The main container's divider style and visibility.
   */
  public CheckoutAndAccountsConfigurationBrandingContainerDivider getDivider() {
    return divider;
  }

  public void setDivider(CheckoutAndAccountsConfigurationBrandingContainerDivider divider) {
    this.divider = divider;
  }

  /**
   * The main sections.
   */
  public CheckoutAndAccountsConfigurationBrandingMainSection getSection() {
    return section;
  }

  public void setSection(CheckoutAndAccountsConfigurationBrandingMainSection section) {
    this.section = section;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingMain{colors='" + colors + "', divider='" + divider + "', section='" + section + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingMain that = (CheckoutAndAccountsConfigurationBrandingMain) o;
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
    private CheckoutAndAccountsConfigurationBrandingColors colors;

    /**
     * The main container's divider style and visibility.
     */
    private CheckoutAndAccountsConfigurationBrandingContainerDivider divider;

    /**
     * The main sections.
     */
    private CheckoutAndAccountsConfigurationBrandingMainSection section;

    public CheckoutAndAccountsConfigurationBrandingMain build() {
      CheckoutAndAccountsConfigurationBrandingMain result = new CheckoutAndAccountsConfigurationBrandingMain();
      result.colors = this.colors;
      result.divider = this.divider;
      result.section = this.section;
      return result;
    }

    /**
     * The colors customizations.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingColors colors) {
      this.colors = colors;
      return this;
    }

    /**
     * The main container's divider style and visibility.
     */
    public Builder divider(CheckoutAndAccountsConfigurationBrandingContainerDivider divider) {
      this.divider = divider;
      return this;
    }

    /**
     * The main sections.
     */
    public Builder section(CheckoutAndAccountsConfigurationBrandingMainSection section) {
      this.section = section;
      return this;
    }
  }
}

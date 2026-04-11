package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The branding configuration for checkout and customer accounts.
 */
public class CheckoutAndAccountsConfigurationBranding {
  /**
   * The components that apply to all surfaces.
   */
  private CheckoutAndAccountsConfigurationBrandingComponents components;

  /**
   * The design tokens allow you to set values that represent specific attributes
   * of your brand like color and font. These attributes are used throughout the
   * user interface. This brings consistency and allows you to easily make broad
   * design changes.
   */
  private CheckoutAndAccountsConfigurationBrandingDesignTokens designTokens;

  /**
   * The surface-specific customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingSurfaces surfaces;

  public CheckoutAndAccountsConfigurationBranding() {
  }

  /**
   * The components that apply to all surfaces.
   */
  public CheckoutAndAccountsConfigurationBrandingComponents getComponents() {
    return components;
  }

  public void setComponents(CheckoutAndAccountsConfigurationBrandingComponents components) {
    this.components = components;
  }

  /**
   * The design tokens allow you to set values that represent specific attributes
   * of your brand like color and font. These attributes are used throughout the
   * user interface. This brings consistency and allows you to easily make broad
   * design changes.
   */
  public CheckoutAndAccountsConfigurationBrandingDesignTokens getDesignTokens() {
    return designTokens;
  }

  public void setDesignTokens(CheckoutAndAccountsConfigurationBrandingDesignTokens designTokens) {
    this.designTokens = designTokens;
  }

  /**
   * The surface-specific customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingSurfaces getSurfaces() {
    return surfaces;
  }

  public void setSurfaces(CheckoutAndAccountsConfigurationBrandingSurfaces surfaces) {
    this.surfaces = surfaces;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBranding{components='" + components + "', designTokens='" + designTokens + "', surfaces='" + surfaces + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBranding that = (CheckoutAndAccountsConfigurationBranding) o;
    return Objects.equals(components, that.components) &&
        Objects.equals(designTokens, that.designTokens) &&
        Objects.equals(surfaces, that.surfaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(components, designTokens, surfaces);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The components that apply to all surfaces.
     */
    private CheckoutAndAccountsConfigurationBrandingComponents components;

    /**
     * The design tokens allow you to set values that represent specific attributes
     * of your brand like color and font. These attributes are used throughout the
     * user interface. This brings consistency and allows you to easily make broad
     * design changes.
     */
    private CheckoutAndAccountsConfigurationBrandingDesignTokens designTokens;

    /**
     * The surface-specific customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingSurfaces surfaces;

    public CheckoutAndAccountsConfigurationBranding build() {
      CheckoutAndAccountsConfigurationBranding result = new CheckoutAndAccountsConfigurationBranding();
      result.components = this.components;
      result.designTokens = this.designTokens;
      result.surfaces = this.surfaces;
      return result;
    }

    /**
     * The components that apply to all surfaces.
     */
    public Builder components(CheckoutAndAccountsConfigurationBrandingComponents components) {
      this.components = components;
      return this;
    }

    /**
     * The design tokens allow you to set values that represent specific attributes
     * of your brand like color and font. These attributes are used throughout the
     * user interface. This brings consistency and allows you to easily make broad
     * design changes.
     */
    public Builder designTokens(CheckoutAndAccountsConfigurationBrandingDesignTokens designTokens) {
      this.designTokens = designTokens;
      return this;
    }

    /**
     * The surface-specific customizations.
     */
    public Builder surfaces(CheckoutAndAccountsConfigurationBrandingSurfaces surfaces) {
      this.surfaces = surfaces;
      return this;
    }
  }
}

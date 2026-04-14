package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing Checkout and Customer Accounts branding.
 */
public class CheckoutAndAccountsConfigurationBrandingInput {
  /**
   * The design tokens allows you to set values that represent specific attributes
   * of your brand like color and font. These attributes are used throughout the
   * user interface. This brings consistency and allows you to easily make broad
   * design changes.
   */
  private CheckoutAndAccountsConfigurationBrandingDesignTokensInput designTokens;

  /**
   * The customizations that apply to specific components or areas of the user interface.
   */
  private CheckoutAndAccountsConfigurationBrandingComponentsInput components;

  /**
   * The surface-level customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingSurfacesInput surfaces;

  public CheckoutAndAccountsConfigurationBrandingInput() {
  }

  /**
   * The design tokens allows you to set values that represent specific attributes
   * of your brand like color and font. These attributes are used throughout the
   * user interface. This brings consistency and allows you to easily make broad
   * design changes.
   */
  public CheckoutAndAccountsConfigurationBrandingDesignTokensInput getDesignTokens() {
    return designTokens;
  }

  public void setDesignTokens(
      CheckoutAndAccountsConfigurationBrandingDesignTokensInput designTokens) {
    this.designTokens = designTokens;
  }

  /**
   * The customizations that apply to specific components or areas of the user interface.
   */
  public CheckoutAndAccountsConfigurationBrandingComponentsInput getComponents() {
    return components;
  }

  public void setComponents(CheckoutAndAccountsConfigurationBrandingComponentsInput components) {
    this.components = components;
  }

  /**
   * The surface-level customizations.
   */
  public CheckoutAndAccountsConfigurationBrandingSurfacesInput getSurfaces() {
    return surfaces;
  }

  public void setSurfaces(CheckoutAndAccountsConfigurationBrandingSurfacesInput surfaces) {
    this.surfaces = surfaces;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingInput{designTokens='" + designTokens + "', components='" + components + "', surfaces='" + surfaces + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingInput that = (CheckoutAndAccountsConfigurationBrandingInput) o;
    return Objects.equals(designTokens, that.designTokens) &&
        Objects.equals(components, that.components) &&
        Objects.equals(surfaces, that.surfaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(designTokens, components, surfaces);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The design tokens allows you to set values that represent specific attributes
     * of your brand like color and font. These attributes are used throughout the
     * user interface. This brings consistency and allows you to easily make broad
     * design changes.
     */
    private CheckoutAndAccountsConfigurationBrandingDesignTokensInput designTokens;

    /**
     * The customizations that apply to specific components or areas of the user interface.
     */
    private CheckoutAndAccountsConfigurationBrandingComponentsInput components;

    /**
     * The surface-level customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingSurfacesInput surfaces;

    public CheckoutAndAccountsConfigurationBrandingInput build() {
      CheckoutAndAccountsConfigurationBrandingInput result = new CheckoutAndAccountsConfigurationBrandingInput();
      result.designTokens = this.designTokens;
      result.components = this.components;
      result.surfaces = this.surfaces;
      return result;
    }

    /**
     * The design tokens allows you to set values that represent specific attributes
     * of your brand like color and font. These attributes are used throughout the
     * user interface. This brings consistency and allows you to easily make broad
     * design changes.
     */
    public Builder designTokens(
        CheckoutAndAccountsConfigurationBrandingDesignTokensInput designTokens) {
      this.designTokens = designTokens;
      return this;
    }

    /**
     * The customizations that apply to specific components or areas of the user interface.
     */
    public Builder components(CheckoutAndAccountsConfigurationBrandingComponentsInput components) {
      this.components = components;
      return this;
    }

    /**
     * The surface-level customizations.
     */
    public Builder surfaces(CheckoutAndAccountsConfigurationBrandingSurfacesInput surfaces) {
      this.surfaces = surfaces;
      return this;
    }
  }
}

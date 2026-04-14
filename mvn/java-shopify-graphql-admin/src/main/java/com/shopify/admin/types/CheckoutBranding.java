package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Creates a unified visual identity for your checkout that keeps customers engaged
 * and reinforces your brand throughout the purchase process. This comprehensive
 * branding system lets you control every visual aspect of checkout, from colors
 * and fonts to layouts and imagery, so your checkout feels like a natural
 * extension of your store.
 *
 * For example, a luxury fashion retailer can configure their checkout with custom
 * color palettes, premium typography, rounded corners for a softer feel, and
 * branded imagery that matches their main website aesthetic.
 *
 * Use the `Branding` object to:
 * - Configure comprehensive checkout visual identity
 * - Coordinate color schemes across all checkout elements
 * - Apply consistent typography and spacing standards
 * - Manage background imagery and layout customizations
 * - Control visibility of various checkout components
 *
 * The branding configuration includes design system foundations like color roles,
 * typography scales, and spacing units, plus specific customizations for sections,
 * dividers, and interactive elements. This allows merchants to create cohesive
 * checkout experiences that reinforce their brand identity while maintaining
 * usability standards.
 *
 * Different color schemes can be defined for various contexts, ensuring optimal
 * contrast and accessibility across different checkout states and customer preferences.
 */
public class CheckoutBranding {
  /**
   * The customizations that apply to specific components or areas of the user interface.
   */
  private CheckoutBrandingCustomizations customizations;

  /**
   * The design system allows you to set values that represent specific attributes
   * of your brand like color and font. These attributes are used throughout the user
   * interface. This brings consistency and allows you to easily make broad design changes.
   */
  private CheckoutBrandingDesignSystem designSystem;

  public CheckoutBranding() {
  }

  /**
   * The customizations that apply to specific components or areas of the user interface.
   */
  public CheckoutBrandingCustomizations getCustomizations() {
    return customizations;
  }

  public void setCustomizations(CheckoutBrandingCustomizations customizations) {
    this.customizations = customizations;
  }

  /**
   * The design system allows you to set values that represent specific attributes
   * of your brand like color and font. These attributes are used throughout the user
   * interface. This brings consistency and allows you to easily make broad design changes.
   */
  public CheckoutBrandingDesignSystem getDesignSystem() {
    return designSystem;
  }

  public void setDesignSystem(CheckoutBrandingDesignSystem designSystem) {
    this.designSystem = designSystem;
  }

  @Override
  public String toString() {
    return "CheckoutBranding{customizations='" + customizations + "', designSystem='" + designSystem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBranding that = (CheckoutBranding) o;
    return Objects.equals(customizations, that.customizations) &&
        Objects.equals(designSystem, that.designSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customizations, designSystem);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customizations that apply to specific components or areas of the user interface.
     */
    private CheckoutBrandingCustomizations customizations;

    /**
     * The design system allows you to set values that represent specific attributes
     * of your brand like color and font. These attributes are used throughout the user
     * interface. This brings consistency and allows you to easily make broad design changes.
     */
    private CheckoutBrandingDesignSystem designSystem;

    public CheckoutBranding build() {
      CheckoutBranding result = new CheckoutBranding();
      result.customizations = this.customizations;
      result.designSystem = this.designSystem;
      return result;
    }

    /**
     * The customizations that apply to specific components or areas of the user interface.
     */
    public Builder customizations(CheckoutBrandingCustomizations customizations) {
      this.customizations = customizations;
      return this;
    }

    /**
     * The design system allows you to set values that represent specific attributes
     * of your brand like color and font. These attributes are used throughout the user
     * interface. This brings consistency and allows you to easily make broad design changes.
     */
    public Builder designSystem(CheckoutBrandingDesignSystem designSystem) {
      this.designSystem = designSystem;
      return this;
    }
  }
}

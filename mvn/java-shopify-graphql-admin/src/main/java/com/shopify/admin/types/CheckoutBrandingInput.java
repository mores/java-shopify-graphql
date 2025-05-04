package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to upsert the checkout branding settings.
 */
public class CheckoutBrandingInput {
  /**
   * The design system allows you to set values that represent specific attributes
   * of your brand like color and font. These attributes are used throughout the user
   * interface. This brings consistency and allows you to easily make broad design changes.
   */
  private CheckoutBrandingDesignSystemInput designSystem;

  /**
   * The customizations that apply to specific components or areas of the user interface.
   */
  private CheckoutBrandingCustomizationsInput customizations;

  public CheckoutBrandingInput() {
  }

  /**
   * The design system allows you to set values that represent specific attributes
   * of your brand like color and font. These attributes are used throughout the user
   * interface. This brings consistency and allows you to easily make broad design changes.
   */
  public CheckoutBrandingDesignSystemInput getDesignSystem() {
    return designSystem;
  }

  public void setDesignSystem(CheckoutBrandingDesignSystemInput designSystem) {
    this.designSystem = designSystem;
  }

  /**
   * The customizations that apply to specific components or areas of the user interface.
   */
  public CheckoutBrandingCustomizationsInput getCustomizations() {
    return customizations;
  }

  public void setCustomizations(CheckoutBrandingCustomizationsInput customizations) {
    this.customizations = customizations;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingInput{designSystem='" + designSystem + "', customizations='" + customizations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingInput that = (CheckoutBrandingInput) o;
    return Objects.equals(designSystem, that.designSystem) &&
        Objects.equals(customizations, that.customizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(designSystem, customizations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The design system allows you to set values that represent specific attributes
     * of your brand like color and font. These attributes are used throughout the user
     * interface. This brings consistency and allows you to easily make broad design changes.
     */
    private CheckoutBrandingDesignSystemInput designSystem;

    /**
     * The customizations that apply to specific components or areas of the user interface.
     */
    private CheckoutBrandingCustomizationsInput customizations;

    public CheckoutBrandingInput build() {
      CheckoutBrandingInput result = new CheckoutBrandingInput();
      result.designSystem = this.designSystem;
      result.customizations = this.customizations;
      return result;
    }

    /**
     * The design system allows you to set values that represent specific attributes
     * of your brand like color and font. These attributes are used throughout the user
     * interface. This brings consistency and allows you to easily make broad design changes.
     */
    public Builder designSystem(CheckoutBrandingDesignSystemInput designSystem) {
      this.designSystem = designSystem;
      return this;
    }

    /**
     * The customizations that apply to specific components or areas of the user interface.
     */
    public Builder customizations(CheckoutBrandingCustomizationsInput customizations) {
      this.customizations = customizations;
      return this;
    }
  }
}

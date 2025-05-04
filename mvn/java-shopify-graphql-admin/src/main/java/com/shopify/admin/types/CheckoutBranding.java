package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The settings of checkout visual customizations.
 *
 * To learn more about updating checkout branding settings, refer to the
 * [checkoutBrandingUpsert](https://shopify.dev/api/admin-graphql/unstable/mutations/checkoutBrandingUpsert) mutation.
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

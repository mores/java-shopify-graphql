package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the sign-in main container.
 */
public class CheckoutAndAccountsConfigurationBrandingSignInMainInput {
  /**
   * The background image of the main container.
   */
  private CheckoutAndAccountsConfigurationBrandingImageInput backgroundImage;

  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

  /**
   * The customizations for the main sections.
   */
  private CheckoutAndAccountsConfigurationBrandingMainSectionInput section;

  public CheckoutAndAccountsConfigurationBrandingSignInMainInput() {
  }

  /**
   * The background image of the main container.
   */
  public CheckoutAndAccountsConfigurationBrandingImageInput getBackgroundImage() {
    return backgroundImage;
  }

  public void setBackgroundImage(
      CheckoutAndAccountsConfigurationBrandingImageInput backgroundImage) {
    this.backgroundImage = backgroundImage;
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
    return "CheckoutAndAccountsConfigurationBrandingSignInMainInput{backgroundImage='" + backgroundImage + "', colors='" + colors + "', section='" + section + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSignInMainInput that = (CheckoutAndAccountsConfigurationBrandingSignInMainInput) o;
    return Objects.equals(backgroundImage, that.backgroundImage) &&
        Objects.equals(colors, that.colors) &&
        Objects.equals(section, that.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundImage, colors, section);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The background image of the main container.
     */
    private CheckoutAndAccountsConfigurationBrandingImageInput backgroundImage;

    /**
     * The colors customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

    /**
     * The customizations for the main sections.
     */
    private CheckoutAndAccountsConfigurationBrandingMainSectionInput section;

    public CheckoutAndAccountsConfigurationBrandingSignInMainInput build() {
      CheckoutAndAccountsConfigurationBrandingSignInMainInput result = new CheckoutAndAccountsConfigurationBrandingSignInMainInput();
      result.backgroundImage = this.backgroundImage;
      result.colors = this.colors;
      result.section = this.section;
      return result;
    }

    /**
     * The background image of the main container.
     */
    public Builder backgroundImage(
        CheckoutAndAccountsConfigurationBrandingImageInput backgroundImage) {
      this.backgroundImage = backgroundImage;
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
     * The customizations for the main sections.
     */
    public Builder section(CheckoutAndAccountsConfigurationBrandingMainSectionInput section) {
      this.section = section;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The sign-in-specific main customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingSignInMain {
  /**
   * The background image of the main container.
   */
  private CheckoutAndAccountsConfigurationBrandingImageValue backgroundImage;

  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColors colors;

  /**
   * The main sections.
   */
  private CheckoutAndAccountsConfigurationBrandingMainSection section;

  public CheckoutAndAccountsConfigurationBrandingSignInMain() {
  }

  /**
   * The background image of the main container.
   */
  public CheckoutAndAccountsConfigurationBrandingImageValue getBackgroundImage() {
    return backgroundImage;
  }

  public void setBackgroundImage(
      CheckoutAndAccountsConfigurationBrandingImageValue backgroundImage) {
    this.backgroundImage = backgroundImage;
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
    return "CheckoutAndAccountsConfigurationBrandingSignInMain{backgroundImage='" + backgroundImage + "', colors='" + colors + "', section='" + section + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingSignInMain that = (CheckoutAndAccountsConfigurationBrandingSignInMain) o;
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
    private CheckoutAndAccountsConfigurationBrandingImageValue backgroundImage;

    /**
     * The colors customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingColors colors;

    /**
     * The main sections.
     */
    private CheckoutAndAccountsConfigurationBrandingMainSection section;

    public CheckoutAndAccountsConfigurationBrandingSignInMain build() {
      CheckoutAndAccountsConfigurationBrandingSignInMain result = new CheckoutAndAccountsConfigurationBrandingSignInMain();
      result.backgroundImage = this.backgroundImage;
      result.colors = this.colors;
      result.section = this.section;
      return result;
    }

    /**
     * The background image of the main container.
     */
    public Builder backgroundImage(
        CheckoutAndAccountsConfigurationBrandingImageValue backgroundImage) {
      this.backgroundImage = backgroundImage;
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
     * The main sections.
     */
    public Builder section(CheckoutAndAccountsConfigurationBrandingMainSection section) {
      this.section = section;
      return this;
    }
  }
}

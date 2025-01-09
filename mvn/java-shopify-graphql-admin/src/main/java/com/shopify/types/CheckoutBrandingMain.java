package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The main container customizations.
 */
public class CheckoutBrandingMain {
  /**
   * The background image of the main container.
   */
  private CheckoutBrandingImage backgroundImage;

  /**
   * The selected color scheme of the main container.
   */
  private CheckoutBrandingColorSchemeSelection colorScheme;

  /**
   * The main container's divider style and visibility.
   */
  private CheckoutBrandingContainerDivider divider;

  /**
   * The settings for the main sections.
   */
  private CheckoutBrandingMainSection section;

  public CheckoutBrandingMain() {
  }

  /**
   * The background image of the main container.
   */
  public CheckoutBrandingImage getBackgroundImage() {
    return backgroundImage;
  }

  public void setBackgroundImage(CheckoutBrandingImage backgroundImage) {
    this.backgroundImage = backgroundImage;
  }

  /**
   * The selected color scheme of the main container.
   */
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  /**
   * The main container's divider style and visibility.
   */
  public CheckoutBrandingContainerDivider getDivider() {
    return divider;
  }

  public void setDivider(CheckoutBrandingContainerDivider divider) {
    this.divider = divider;
  }

  /**
   * The settings for the main sections.
   */
  public CheckoutBrandingMainSection getSection() {
    return section;
  }

  public void setSection(CheckoutBrandingMainSection section) {
    this.section = section;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingMain{backgroundImage='" + backgroundImage + "', colorScheme='" + colorScheme + "', divider='" + divider + "', section='" + section + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingMain that = (CheckoutBrandingMain) o;
    return Objects.equals(backgroundImage, that.backgroundImage) &&
        Objects.equals(colorScheme, that.colorScheme) &&
        Objects.equals(divider, that.divider) &&
        Objects.equals(section, that.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundImage, colorScheme, divider, section);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The background image of the main container.
     */
    private CheckoutBrandingImage backgroundImage;

    /**
     * The selected color scheme of the main container.
     */
    private CheckoutBrandingColorSchemeSelection colorScheme;

    /**
     * The main container's divider style and visibility.
     */
    private CheckoutBrandingContainerDivider divider;

    /**
     * The settings for the main sections.
     */
    private CheckoutBrandingMainSection section;

    public CheckoutBrandingMain build() {
      CheckoutBrandingMain result = new CheckoutBrandingMain();
      result.backgroundImage = this.backgroundImage;
      result.colorScheme = this.colorScheme;
      result.divider = this.divider;
      result.section = this.section;
      return result;
    }

    /**
     * The background image of the main container.
     */
    public Builder backgroundImage(CheckoutBrandingImage backgroundImage) {
      this.backgroundImage = backgroundImage;
      return this;
    }

    /**
     * The selected color scheme of the main container.
     */
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }

    /**
     * The main container's divider style and visibility.
     */
    public Builder divider(CheckoutBrandingContainerDivider divider) {
      this.divider = divider;
      return this;
    }

    /**
     * The settings for the main sections.
     */
    public Builder section(CheckoutBrandingMainSection section) {
      this.section = section;
      return this;
    }
  }
}

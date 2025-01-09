package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The order summary customizations.
 */
public class CheckoutBrandingOrderSummary {
  /**
   * The background image of the order summary container.
   */
  private CheckoutBrandingImage backgroundImage;

  /**
   * The selected color scheme of the order summary container.
   */
  private CheckoutBrandingColorSchemeSelection colorScheme;

  /**
   * The order summary container's divider style and visibility.
   */
  private CheckoutBrandingContainerDivider divider;

  /**
   * The settings for the order summary sections.
   */
  private CheckoutBrandingOrderSummarySection section;

  public CheckoutBrandingOrderSummary() {
  }

  /**
   * The background image of the order summary container.
   */
  public CheckoutBrandingImage getBackgroundImage() {
    return backgroundImage;
  }

  public void setBackgroundImage(CheckoutBrandingImage backgroundImage) {
    this.backgroundImage = backgroundImage;
  }

  /**
   * The selected color scheme of the order summary container.
   */
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  /**
   * The order summary container's divider style and visibility.
   */
  public CheckoutBrandingContainerDivider getDivider() {
    return divider;
  }

  public void setDivider(CheckoutBrandingContainerDivider divider) {
    this.divider = divider;
  }

  /**
   * The settings for the order summary sections.
   */
  public CheckoutBrandingOrderSummarySection getSection() {
    return section;
  }

  public void setSection(CheckoutBrandingOrderSummarySection section) {
    this.section = section;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingOrderSummary{backgroundImage='" + backgroundImage + "', colorScheme='" + colorScheme + "', divider='" + divider + "', section='" + section + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingOrderSummary that = (CheckoutBrandingOrderSummary) o;
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
     * The background image of the order summary container.
     */
    private CheckoutBrandingImage backgroundImage;

    /**
     * The selected color scheme of the order summary container.
     */
    private CheckoutBrandingColorSchemeSelection colorScheme;

    /**
     * The order summary container's divider style and visibility.
     */
    private CheckoutBrandingContainerDivider divider;

    /**
     * The settings for the order summary sections.
     */
    private CheckoutBrandingOrderSummarySection section;

    public CheckoutBrandingOrderSummary build() {
      CheckoutBrandingOrderSummary result = new CheckoutBrandingOrderSummary();
      result.backgroundImage = this.backgroundImage;
      result.colorScheme = this.colorScheme;
      result.divider = this.divider;
      result.section = this.section;
      return result;
    }

    /**
     * The background image of the order summary container.
     */
    public Builder backgroundImage(CheckoutBrandingImage backgroundImage) {
      this.backgroundImage = backgroundImage;
      return this;
    }

    /**
     * The selected color scheme of the order summary container.
     */
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }

    /**
     * The order summary container's divider style and visibility.
     */
    public Builder divider(CheckoutBrandingContainerDivider divider) {
      this.divider = divider;
      return this;
    }

    /**
     * The settings for the order summary sections.
     */
    public Builder section(CheckoutBrandingOrderSummarySection section) {
      this.section = section;
      return this;
    }
  }
}

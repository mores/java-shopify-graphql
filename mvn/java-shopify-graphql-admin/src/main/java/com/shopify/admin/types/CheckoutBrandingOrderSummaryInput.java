package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the order summary container customizations.
 */
public class CheckoutBrandingOrderSummaryInput {
  /**
   * The selected color scheme for the order summary container of the checkout.
   */
  private CheckoutBrandingColorSchemeSelection colorScheme;

  /**
   * The background image of the order summary container (must not be of SVG format).
   */
  private CheckoutBrandingImageInput backgroundImage;

  /**
   * Divider style and visibility on the order summary container.
   */
  private CheckoutBrandingContainerDividerInput divider;

  /**
   * The settings for the order summary sections.
   */
  private CheckoutBrandingOrderSummarySectionInput section;

  public CheckoutBrandingOrderSummaryInput() {
  }

  /**
   * The selected color scheme for the order summary container of the checkout.
   */
  public CheckoutBrandingColorSchemeSelection getColorScheme() {
    return colorScheme;
  }

  public void setColorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
    this.colorScheme = colorScheme;
  }

  /**
   * The background image of the order summary container (must not be of SVG format).
   */
  public CheckoutBrandingImageInput getBackgroundImage() {
    return backgroundImage;
  }

  public void setBackgroundImage(CheckoutBrandingImageInput backgroundImage) {
    this.backgroundImage = backgroundImage;
  }

  /**
   * Divider style and visibility on the order summary container.
   */
  public CheckoutBrandingContainerDividerInput getDivider() {
    return divider;
  }

  public void setDivider(CheckoutBrandingContainerDividerInput divider) {
    this.divider = divider;
  }

  /**
   * The settings for the order summary sections.
   */
  public CheckoutBrandingOrderSummarySectionInput getSection() {
    return section;
  }

  public void setSection(CheckoutBrandingOrderSummarySectionInput section) {
    this.section = section;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingOrderSummaryInput{colorScheme='" + colorScheme + "', backgroundImage='" + backgroundImage + "', divider='" + divider + "', section='" + section + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingOrderSummaryInput that = (CheckoutBrandingOrderSummaryInput) o;
    return Objects.equals(colorScheme, that.colorScheme) &&
        Objects.equals(backgroundImage, that.backgroundImage) &&
        Objects.equals(divider, that.divider) &&
        Objects.equals(section, that.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colorScheme, backgroundImage, divider, section);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The selected color scheme for the order summary container of the checkout.
     */
    private CheckoutBrandingColorSchemeSelection colorScheme;

    /**
     * The background image of the order summary container (must not be of SVG format).
     */
    private CheckoutBrandingImageInput backgroundImage;

    /**
     * Divider style and visibility on the order summary container.
     */
    private CheckoutBrandingContainerDividerInput divider;

    /**
     * The settings for the order summary sections.
     */
    private CheckoutBrandingOrderSummarySectionInput section;

    public CheckoutBrandingOrderSummaryInput build() {
      CheckoutBrandingOrderSummaryInput result = new CheckoutBrandingOrderSummaryInput();
      result.colorScheme = this.colorScheme;
      result.backgroundImage = this.backgroundImage;
      result.divider = this.divider;
      result.section = this.section;
      return result;
    }

    /**
     * The selected color scheme for the order summary container of the checkout.
     */
    public Builder colorScheme(CheckoutBrandingColorSchemeSelection colorScheme) {
      this.colorScheme = colorScheme;
      return this;
    }

    /**
     * The background image of the order summary container (must not be of SVG format).
     */
    public Builder backgroundImage(CheckoutBrandingImageInput backgroundImage) {
      this.backgroundImage = backgroundImage;
      return this;
    }

    /**
     * Divider style and visibility on the order summary container.
     */
    public Builder divider(CheckoutBrandingContainerDividerInput divider) {
      this.divider = divider;
      return this;
    }

    /**
     * The settings for the order summary sections.
     */
    public Builder section(CheckoutBrandingOrderSummarySectionInput section) {
      this.section = section;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the order summary container.
 */
public class CheckoutAndAccountsConfigurationBrandingOrderSummaryInput {
  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

  /**
   * The background image of the order summary container (must not be of SVG format).
   */
  private CheckoutAndAccountsConfigurationBrandingImageInput backgroundImage;

  /**
   * Divider style and visibility on the order summary container.
   */
  private CheckoutAndAccountsConfigurationBrandingContainerDividerInput divider;

  /**
   * The customizations for the order summary sections.
   */
  private CheckoutAndAccountsConfigurationBrandingOrderSummarySectionInput section;

  public CheckoutAndAccountsConfigurationBrandingOrderSummaryInput() {
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
   * The background image of the order summary container (must not be of SVG format).
   */
  public CheckoutAndAccountsConfigurationBrandingImageInput getBackgroundImage() {
    return backgroundImage;
  }

  public void setBackgroundImage(
      CheckoutAndAccountsConfigurationBrandingImageInput backgroundImage) {
    this.backgroundImage = backgroundImage;
  }

  /**
   * Divider style and visibility on the order summary container.
   */
  public CheckoutAndAccountsConfigurationBrandingContainerDividerInput getDivider() {
    return divider;
  }

  public void setDivider(CheckoutAndAccountsConfigurationBrandingContainerDividerInput divider) {
    this.divider = divider;
  }

  /**
   * The customizations for the order summary sections.
   */
  public CheckoutAndAccountsConfigurationBrandingOrderSummarySectionInput getSection() {
    return section;
  }

  public void setSection(CheckoutAndAccountsConfigurationBrandingOrderSummarySectionInput section) {
    this.section = section;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingOrderSummaryInput{colors='" + colors + "', backgroundImage='" + backgroundImage + "', divider='" + divider + "', section='" + section + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingOrderSummaryInput that = (CheckoutAndAccountsConfigurationBrandingOrderSummaryInput) o;
    return Objects.equals(colors, that.colors) &&
        Objects.equals(backgroundImage, that.backgroundImage) &&
        Objects.equals(divider, that.divider) &&
        Objects.equals(section, that.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(colors, backgroundImage, divider, section);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The colors customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingColorsInput colors;

    /**
     * The background image of the order summary container (must not be of SVG format).
     */
    private CheckoutAndAccountsConfigurationBrandingImageInput backgroundImage;

    /**
     * Divider style and visibility on the order summary container.
     */
    private CheckoutAndAccountsConfigurationBrandingContainerDividerInput divider;

    /**
     * The customizations for the order summary sections.
     */
    private CheckoutAndAccountsConfigurationBrandingOrderSummarySectionInput section;

    public CheckoutAndAccountsConfigurationBrandingOrderSummaryInput build() {
      CheckoutAndAccountsConfigurationBrandingOrderSummaryInput result = new CheckoutAndAccountsConfigurationBrandingOrderSummaryInput();
      result.colors = this.colors;
      result.backgroundImage = this.backgroundImage;
      result.divider = this.divider;
      result.section = this.section;
      return result;
    }

    /**
     * The colors customizations.
     */
    public Builder colors(CheckoutAndAccountsConfigurationBrandingColorsInput colors) {
      this.colors = colors;
      return this;
    }

    /**
     * The background image of the order summary container (must not be of SVG format).
     */
    public Builder backgroundImage(
        CheckoutAndAccountsConfigurationBrandingImageInput backgroundImage) {
      this.backgroundImage = backgroundImage;
      return this;
    }

    /**
     * Divider style and visibility on the order summary container.
     */
    public Builder divider(CheckoutAndAccountsConfigurationBrandingContainerDividerInput divider) {
      this.divider = divider;
      return this;
    }

    /**
     * The customizations for the order summary sections.
     */
    public Builder section(
        CheckoutAndAccountsConfigurationBrandingOrderSummarySectionInput section) {
      this.section = section;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The order summary customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingOrderSummary {
  /**
   * The background image of the order summary container.
   */
  private CheckoutAndAccountsConfigurationBrandingImageValue backgroundImage;

  /**
   * The colors customizations.
   */
  private CheckoutAndAccountsConfigurationBrandingColors colors;

  /**
   * The order summary container's divider style and visibility.
   */
  private CheckoutAndAccountsConfigurationBrandingContainerDivider divider;

  /**
   * The order summary sections.
   */
  private CheckoutAndAccountsConfigurationBrandingOrderSummarySection section;

  public CheckoutAndAccountsConfigurationBrandingOrderSummary() {
  }

  /**
   * The background image of the order summary container.
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
   * The order summary container's divider style and visibility.
   */
  public CheckoutAndAccountsConfigurationBrandingContainerDivider getDivider() {
    return divider;
  }

  public void setDivider(CheckoutAndAccountsConfigurationBrandingContainerDivider divider) {
    this.divider = divider;
  }

  /**
   * The order summary sections.
   */
  public CheckoutAndAccountsConfigurationBrandingOrderSummarySection getSection() {
    return section;
  }

  public void setSection(CheckoutAndAccountsConfigurationBrandingOrderSummarySection section) {
    this.section = section;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingOrderSummary{backgroundImage='" + backgroundImage + "', colors='" + colors + "', divider='" + divider + "', section='" + section + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingOrderSummary that = (CheckoutAndAccountsConfigurationBrandingOrderSummary) o;
    return Objects.equals(backgroundImage, that.backgroundImage) &&
        Objects.equals(colors, that.colors) &&
        Objects.equals(divider, that.divider) &&
        Objects.equals(section, that.section);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundImage, colors, divider, section);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The background image of the order summary container.
     */
    private CheckoutAndAccountsConfigurationBrandingImageValue backgroundImage;

    /**
     * The colors customizations.
     */
    private CheckoutAndAccountsConfigurationBrandingColors colors;

    /**
     * The order summary container's divider style and visibility.
     */
    private CheckoutAndAccountsConfigurationBrandingContainerDivider divider;

    /**
     * The order summary sections.
     */
    private CheckoutAndAccountsConfigurationBrandingOrderSummarySection section;

    public CheckoutAndAccountsConfigurationBrandingOrderSummary build() {
      CheckoutAndAccountsConfigurationBrandingOrderSummary result = new CheckoutAndAccountsConfigurationBrandingOrderSummary();
      result.backgroundImage = this.backgroundImage;
      result.colors = this.colors;
      result.divider = this.divider;
      result.section = this.section;
      return result;
    }

    /**
     * The background image of the order summary container.
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
     * The order summary container's divider style and visibility.
     */
    public Builder divider(CheckoutAndAccountsConfigurationBrandingContainerDivider divider) {
      this.divider = divider;
      return this;
    }

    /**
     * The order summary sections.
     */
    public Builder section(CheckoutAndAccountsConfigurationBrandingOrderSummarySection section) {
      this.section = section;
      return this;
    }
  }
}

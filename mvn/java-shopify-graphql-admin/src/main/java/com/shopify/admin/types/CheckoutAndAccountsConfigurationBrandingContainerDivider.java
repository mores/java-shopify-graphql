package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The container's divider customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingContainerDivider {
  /**
   * The divider style.
   */
  private CheckoutAndAccountsConfigurationBrandingBorderStyle borderStyle;

  /**
   * The divider width.
   */
  private CheckoutAndAccountsConfigurationBrandingBorderWidth borderWidth;

  /**
   * The divider visibility.
   */
  private CheckoutAndAccountsConfigurationBrandingVisibility visibility;

  public CheckoutAndAccountsConfigurationBrandingContainerDivider() {
  }

  /**
   * The divider style.
   */
  public CheckoutAndAccountsConfigurationBrandingBorderStyle getBorderStyle() {
    return borderStyle;
  }

  public void setBorderStyle(CheckoutAndAccountsConfigurationBrandingBorderStyle borderStyle) {
    this.borderStyle = borderStyle;
  }

  /**
   * The divider width.
   */
  public CheckoutAndAccountsConfigurationBrandingBorderWidth getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(CheckoutAndAccountsConfigurationBrandingBorderWidth borderWidth) {
    this.borderWidth = borderWidth;
  }

  /**
   * The divider visibility.
   */
  public CheckoutAndAccountsConfigurationBrandingVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(CheckoutAndAccountsConfigurationBrandingVisibility visibility) {
    this.visibility = visibility;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingContainerDivider{borderStyle='" + borderStyle + "', borderWidth='" + borderWidth + "', visibility='" + visibility + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingContainerDivider that = (CheckoutAndAccountsConfigurationBrandingContainerDivider) o;
    return Objects.equals(borderStyle, that.borderStyle) &&
        Objects.equals(borderWidth, that.borderWidth) &&
        Objects.equals(visibility, that.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderStyle, borderWidth, visibility);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The divider style.
     */
    private CheckoutAndAccountsConfigurationBrandingBorderStyle borderStyle;

    /**
     * The divider width.
     */
    private CheckoutAndAccountsConfigurationBrandingBorderWidth borderWidth;

    /**
     * The divider visibility.
     */
    private CheckoutAndAccountsConfigurationBrandingVisibility visibility;

    public CheckoutAndAccountsConfigurationBrandingContainerDivider build() {
      CheckoutAndAccountsConfigurationBrandingContainerDivider result = new CheckoutAndAccountsConfigurationBrandingContainerDivider();
      result.borderStyle = this.borderStyle;
      result.borderWidth = this.borderWidth;
      result.visibility = this.visibility;
      return result;
    }

    /**
     * The divider style.
     */
    public Builder borderStyle(CheckoutAndAccountsConfigurationBrandingBorderStyle borderStyle) {
      this.borderStyle = borderStyle;
      return this;
    }

    /**
     * The divider width.
     */
    public Builder borderWidth(CheckoutAndAccountsConfigurationBrandingBorderWidth borderWidth) {
      this.borderWidth = borderWidth;
      return this;
    }

    /**
     * The divider visibility.
     */
    public Builder visibility(CheckoutAndAccountsConfigurationBrandingVisibility visibility) {
      this.visibility = visibility;
      return this;
    }
  }
}

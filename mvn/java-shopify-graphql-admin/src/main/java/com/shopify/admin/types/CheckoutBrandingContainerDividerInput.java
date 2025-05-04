package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update a container's divider customizations.
 */
public class CheckoutBrandingContainerDividerInput {
  /**
   * The divider style.
   */
  private CheckoutBrandingBorderStyle borderStyle;

  /**
   * The divider width.
   */
  private CheckoutBrandingBorderWidth borderWidth;

  /**
   * The divider visibility.
   */
  private CheckoutBrandingVisibility visibility;

  public CheckoutBrandingContainerDividerInput() {
  }

  /**
   * The divider style.
   */
  public CheckoutBrandingBorderStyle getBorderStyle() {
    return borderStyle;
  }

  public void setBorderStyle(CheckoutBrandingBorderStyle borderStyle) {
    this.borderStyle = borderStyle;
  }

  /**
   * The divider width.
   */
  public CheckoutBrandingBorderWidth getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(CheckoutBrandingBorderWidth borderWidth) {
    this.borderWidth = borderWidth;
  }

  /**
   * The divider visibility.
   */
  public CheckoutBrandingVisibility getVisibility() {
    return visibility;
  }

  public void setVisibility(CheckoutBrandingVisibility visibility) {
    this.visibility = visibility;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingContainerDividerInput{borderStyle='" + borderStyle + "', borderWidth='" + borderWidth + "', visibility='" + visibility + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingContainerDividerInput that = (CheckoutBrandingContainerDividerInput) o;
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
    private CheckoutBrandingBorderStyle borderStyle;

    /**
     * The divider width.
     */
    private CheckoutBrandingBorderWidth borderWidth;

    /**
     * The divider visibility.
     */
    private CheckoutBrandingVisibility visibility;

    public CheckoutBrandingContainerDividerInput build() {
      CheckoutBrandingContainerDividerInput result = new CheckoutBrandingContainerDividerInput();
      result.borderStyle = this.borderStyle;
      result.borderWidth = this.borderWidth;
      result.visibility = this.visibility;
      return result;
    }

    /**
     * The divider style.
     */
    public Builder borderStyle(CheckoutBrandingBorderStyle borderStyle) {
      this.borderStyle = borderStyle;
      return this;
    }

    /**
     * The divider width.
     */
    public Builder borderWidth(CheckoutBrandingBorderWidth borderWidth) {
      this.borderWidth = borderWidth;
      return this;
    }

    /**
     * The divider visibility.
     */
    public Builder visibility(CheckoutBrandingVisibility visibility) {
      this.visibility = visibility;
      return this;
    }
  }
}

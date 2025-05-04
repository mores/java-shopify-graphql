package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the form controls customizations.
 */
public class CheckoutBrandingControlInput {
  /**
   * Set to TRANSPARENT to define transparent form controls. If null, form controls
   * inherit colors from their scheme settings (for example, the main section
   * inherits from `design_system.colors.schemes.scheme1.control` by default). Note
   * that usage of the `customizations.control.color` setting to customize the form
   * control color is deprecated.
   */
  private CheckoutBrandingColorSelection color;

  /**
   * The corner radius used for form controls.
   */
  private CheckoutBrandingCornerRadius cornerRadius;

  /**
   * The border used for form controls.
   */
  private CheckoutBrandingSimpleBorder border;

  /**
   * The label position used for form controls.
   */
  private CheckoutBrandingLabelPosition labelPosition;

  public CheckoutBrandingControlInput() {
  }

  /**
   * Set to TRANSPARENT to define transparent form controls. If null, form controls
   * inherit colors from their scheme settings (for example, the main section
   * inherits from `design_system.colors.schemes.scheme1.control` by default). Note
   * that usage of the `customizations.control.color` setting to customize the form
   * control color is deprecated.
   */
  public CheckoutBrandingColorSelection getColor() {
    return color;
  }

  public void setColor(CheckoutBrandingColorSelection color) {
    this.color = color;
  }

  /**
   * The corner radius used for form controls.
   */
  public CheckoutBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  /**
   * The border used for form controls.
   */
  public CheckoutBrandingSimpleBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutBrandingSimpleBorder border) {
    this.border = border;
  }

  /**
   * The label position used for form controls.
   */
  public CheckoutBrandingLabelPosition getLabelPosition() {
    return labelPosition;
  }

  public void setLabelPosition(CheckoutBrandingLabelPosition labelPosition) {
    this.labelPosition = labelPosition;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingControlInput{color='" + color + "', cornerRadius='" + cornerRadius + "', border='" + border + "', labelPosition='" + labelPosition + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingControlInput that = (CheckoutBrandingControlInput) o;
    return Objects.equals(color, that.color) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(border, that.border) &&
        Objects.equals(labelPosition, that.labelPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, cornerRadius, border, labelPosition);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Set to TRANSPARENT to define transparent form controls. If null, form controls
     * inherit colors from their scheme settings (for example, the main section
     * inherits from `design_system.colors.schemes.scheme1.control` by default). Note
     * that usage of the `customizations.control.color` setting to customize the form
     * control color is deprecated.
     */
    private CheckoutBrandingColorSelection color;

    /**
     * The corner radius used for form controls.
     */
    private CheckoutBrandingCornerRadius cornerRadius;

    /**
     * The border used for form controls.
     */
    private CheckoutBrandingSimpleBorder border;

    /**
     * The label position used for form controls.
     */
    private CheckoutBrandingLabelPosition labelPosition;

    public CheckoutBrandingControlInput build() {
      CheckoutBrandingControlInput result = new CheckoutBrandingControlInput();
      result.color = this.color;
      result.cornerRadius = this.cornerRadius;
      result.border = this.border;
      result.labelPosition = this.labelPosition;
      return result;
    }

    /**
     * Set to TRANSPARENT to define transparent form controls. If null, form controls
     * inherit colors from their scheme settings (for example, the main section
     * inherits from `design_system.colors.schemes.scheme1.control` by default). Note
     * that usage of the `customizations.control.color` setting to customize the form
     * control color is deprecated.
     */
    public Builder color(CheckoutBrandingColorSelection color) {
      this.color = color;
      return this;
    }

    /**
     * The corner radius used for form controls.
     */
    public Builder cornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    /**
     * The border used for form controls.
     */
    public Builder border(CheckoutBrandingSimpleBorder border) {
      this.border = border;
      return this;
    }

    /**
     * The label position used for form controls.
     */
    public Builder labelPosition(CheckoutBrandingLabelPosition labelPosition) {
      this.labelPosition = labelPosition;
      return this;
    }
  }
}

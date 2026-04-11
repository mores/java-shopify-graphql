package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The form controls customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingControl {
  /**
   * The border.
   */
  private CheckoutAndAccountsConfigurationBrandingSimpleBorder border;

  /**
   * The corner radius.
   */
  private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

  /**
   * The label position.
   */
  private CheckoutAndAccountsConfigurationBrandingLabelPosition labelPosition;

  public CheckoutAndAccountsConfigurationBrandingControl() {
  }

  /**
   * The border.
   */
  public CheckoutAndAccountsConfigurationBrandingSimpleBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutAndAccountsConfigurationBrandingSimpleBorder border) {
    this.border = border;
  }

  /**
   * The corner radius.
   */
  public CheckoutAndAccountsConfigurationBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  /**
   * The label position.
   */
  public CheckoutAndAccountsConfigurationBrandingLabelPosition getLabelPosition() {
    return labelPosition;
  }

  public void setLabelPosition(
      CheckoutAndAccountsConfigurationBrandingLabelPosition labelPosition) {
    this.labelPosition = labelPosition;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingControl{border='" + border + "', cornerRadius='" + cornerRadius + "', labelPosition='" + labelPosition + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingControl that = (CheckoutAndAccountsConfigurationBrandingControl) o;
    return Objects.equals(border, that.border) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(labelPosition, that.labelPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(border, cornerRadius, labelPosition);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The border.
     */
    private CheckoutAndAccountsConfigurationBrandingSimpleBorder border;

    /**
     * The corner radius.
     */
    private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

    /**
     * The label position.
     */
    private CheckoutAndAccountsConfigurationBrandingLabelPosition labelPosition;

    public CheckoutAndAccountsConfigurationBrandingControl build() {
      CheckoutAndAccountsConfigurationBrandingControl result = new CheckoutAndAccountsConfigurationBrandingControl();
      result.border = this.border;
      result.cornerRadius = this.cornerRadius;
      result.labelPosition = this.labelPosition;
      return result;
    }

    /**
     * The border.
     */
    public Builder border(CheckoutAndAccountsConfigurationBrandingSimpleBorder border) {
      this.border = border;
      return this;
    }

    /**
     * The corner radius.
     */
    public Builder cornerRadius(CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    /**
     * The label position.
     */
    public Builder labelPosition(
        CheckoutAndAccountsConfigurationBrandingLabelPosition labelPosition) {
      this.labelPosition = labelPosition;
      return this;
    }
  }
}

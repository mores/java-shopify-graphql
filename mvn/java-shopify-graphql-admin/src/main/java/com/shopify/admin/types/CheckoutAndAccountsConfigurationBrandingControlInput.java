package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the form controls.
 */
public class CheckoutAndAccountsConfigurationBrandingControlInput {
  /**
   * The corner radius.
   */
  private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

  /**
   * The border.
   */
  private CheckoutAndAccountsConfigurationBrandingSimpleBorder border;

  /**
   * The label position.
   */
  private CheckoutAndAccountsConfigurationBrandingLabelPosition labelPosition;

  public CheckoutAndAccountsConfigurationBrandingControlInput() {
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
   * The border.
   */
  public CheckoutAndAccountsConfigurationBrandingSimpleBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutAndAccountsConfigurationBrandingSimpleBorder border) {
    this.border = border;
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
    return "CheckoutAndAccountsConfigurationBrandingControlInput{cornerRadius='" + cornerRadius + "', border='" + border + "', labelPosition='" + labelPosition + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingControlInput that = (CheckoutAndAccountsConfigurationBrandingControlInput) o;
    return Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(border, that.border) &&
        Objects.equals(labelPosition, that.labelPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cornerRadius, border, labelPosition);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The corner radius.
     */
    private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

    /**
     * The border.
     */
    private CheckoutAndAccountsConfigurationBrandingSimpleBorder border;

    /**
     * The label position.
     */
    private CheckoutAndAccountsConfigurationBrandingLabelPosition labelPosition;

    public CheckoutAndAccountsConfigurationBrandingControlInput build() {
      CheckoutAndAccountsConfigurationBrandingControlInput result = new CheckoutAndAccountsConfigurationBrandingControlInput();
      result.cornerRadius = this.cornerRadius;
      result.border = this.border;
      result.labelPosition = this.labelPosition;
      return result;
    }

    /**
     * The corner radius.
     */
    public Builder cornerRadius(CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    /**
     * The border.
     */
    public Builder border(CheckoutAndAccountsConfigurationBrandingSimpleBorder border) {
      this.border = border;
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

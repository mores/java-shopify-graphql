package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The text fields customizations.
 */
public class CheckoutBrandingTextField {
  /**
   * The border used for text fields.
   */
  private CheckoutBrandingBorder border;

  /**
   * The typography customizations used for text fields.
   */
  private CheckoutBrandingTypographyStyle typography;

  public CheckoutBrandingTextField() {
  }

  /**
   * The border used for text fields.
   */
  public CheckoutBrandingBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutBrandingBorder border) {
    this.border = border;
  }

  /**
   * The typography customizations used for text fields.
   */
  public CheckoutBrandingTypographyStyle getTypography() {
    return typography;
  }

  public void setTypography(CheckoutBrandingTypographyStyle typography) {
    this.typography = typography;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingTextField{border='" + border + "', typography='" + typography + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingTextField that = (CheckoutBrandingTextField) o;
    return Objects.equals(border, that.border) &&
        Objects.equals(typography, that.typography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(border, typography);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The border used for text fields.
     */
    private CheckoutBrandingBorder border;

    /**
     * The typography customizations used for text fields.
     */
    private CheckoutBrandingTypographyStyle typography;

    public CheckoutBrandingTextField build() {
      CheckoutBrandingTextField result = new CheckoutBrandingTextField();
      result.border = this.border;
      result.typography = this.typography;
      return result;
    }

    /**
     * The border used for text fields.
     */
    public Builder border(CheckoutBrandingBorder border) {
      this.border = border;
      return this;
    }

    /**
     * The typography customizations used for text fields.
     */
    public Builder typography(CheckoutBrandingTypographyStyle typography) {
      this.typography = typography;
      return this;
    }
  }
}

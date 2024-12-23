package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the merchandise thumbnails customizations.
 */
public class CheckoutBrandingMerchandiseThumbnailInput {
  /**
   * The border used for merchandise thumbnails.
   */
  private CheckoutBrandingSimpleBorder border;

  /**
   * The corner radius used for merchandise thumbnails.
   */
  private CheckoutBrandingCornerRadius cornerRadius;

  public CheckoutBrandingMerchandiseThumbnailInput() {
  }

  /**
   * The border used for merchandise thumbnails.
   */
  public CheckoutBrandingSimpleBorder getBorder() {
    return border;
  }

  public void setBorder(CheckoutBrandingSimpleBorder border) {
    this.border = border;
  }

  /**
   * The corner radius used for merchandise thumbnails.
   */
  public CheckoutBrandingCornerRadius getCornerRadius() {
    return cornerRadius;
  }

  public void setCornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
    this.cornerRadius = cornerRadius;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingMerchandiseThumbnailInput{border='" + border + "', cornerRadius='" + cornerRadius + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingMerchandiseThumbnailInput that = (CheckoutBrandingMerchandiseThumbnailInput) o;
    return Objects.equals(border, that.border) &&
        Objects.equals(cornerRadius, that.cornerRadius);
  }

  @Override
  public int hashCode() {
    return Objects.hash(border, cornerRadius);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The border used for merchandise thumbnails.
     */
    private CheckoutBrandingSimpleBorder border;

    /**
     * The corner radius used for merchandise thumbnails.
     */
    private CheckoutBrandingCornerRadius cornerRadius;

    public CheckoutBrandingMerchandiseThumbnailInput build() {
      CheckoutBrandingMerchandiseThumbnailInput result = new CheckoutBrandingMerchandiseThumbnailInput();
      result.border = this.border;
      result.cornerRadius = this.cornerRadius;
      return result;
    }

    /**
     * The border used for merchandise thumbnails.
     */
    public Builder border(CheckoutBrandingSimpleBorder border) {
      this.border = border;
      return this;
    }

    /**
     * The corner radius used for merchandise thumbnails.
     */
    public Builder cornerRadius(CheckoutBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }
  }
}

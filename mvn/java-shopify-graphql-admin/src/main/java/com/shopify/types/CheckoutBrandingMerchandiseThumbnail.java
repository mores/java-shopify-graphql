package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The merchandise thumbnails customizations.
 */
public class CheckoutBrandingMerchandiseThumbnail {
  /**
   * The border used for merchandise thumbnails.
   */
  private CheckoutBrandingSimpleBorder border;

  /**
   * The corner radius used for merchandise thumbnails.
   */
  private CheckoutBrandingCornerRadius cornerRadius;

  public CheckoutBrandingMerchandiseThumbnail() {
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
    return "CheckoutBrandingMerchandiseThumbnail{border='" + border + "', cornerRadius='" + cornerRadius + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingMerchandiseThumbnail that = (CheckoutBrandingMerchandiseThumbnail) o;
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

    public CheckoutBrandingMerchandiseThumbnail build() {
      CheckoutBrandingMerchandiseThumbnail result = new CheckoutBrandingMerchandiseThumbnail();
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

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The merchandise thumbnails customizations.
 */
public class CheckoutBrandingMerchandiseThumbnail {
  /**
   * The settings for the merchandise thumbnail badge.
   */
  private CheckoutBrandingMerchandiseThumbnailBadge badge;

  /**
   * The border used for merchandise thumbnails.
   */
  private CheckoutBrandingSimpleBorder border;

  /**
   * The corner radius used for merchandise thumbnails.
   */
  private CheckoutBrandingCornerRadius cornerRadius;

  /**
   * The property used to customize how the product image fits within merchandise thumbnails.
   */
  private CheckoutBrandingObjectFit fit;

  public CheckoutBrandingMerchandiseThumbnail() {
  }

  /**
   * The settings for the merchandise thumbnail badge.
   */
  public CheckoutBrandingMerchandiseThumbnailBadge getBadge() {
    return badge;
  }

  public void setBadge(CheckoutBrandingMerchandiseThumbnailBadge badge) {
    this.badge = badge;
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

  /**
   * The property used to customize how the product image fits within merchandise thumbnails.
   */
  public CheckoutBrandingObjectFit getFit() {
    return fit;
  }

  public void setFit(CheckoutBrandingObjectFit fit) {
    this.fit = fit;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingMerchandiseThumbnail{badge='" + badge + "', border='" + border + "', cornerRadius='" + cornerRadius + "', fit='" + fit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingMerchandiseThumbnail that = (CheckoutBrandingMerchandiseThumbnail) o;
    return Objects.equals(badge, that.badge) &&
        Objects.equals(border, that.border) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(fit, that.fit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(badge, border, cornerRadius, fit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The settings for the merchandise thumbnail badge.
     */
    private CheckoutBrandingMerchandiseThumbnailBadge badge;

    /**
     * The border used for merchandise thumbnails.
     */
    private CheckoutBrandingSimpleBorder border;

    /**
     * The corner radius used for merchandise thumbnails.
     */
    private CheckoutBrandingCornerRadius cornerRadius;

    /**
     * The property used to customize how the product image fits within merchandise thumbnails.
     */
    private CheckoutBrandingObjectFit fit;

    public CheckoutBrandingMerchandiseThumbnail build() {
      CheckoutBrandingMerchandiseThumbnail result = new CheckoutBrandingMerchandiseThumbnail();
      result.badge = this.badge;
      result.border = this.border;
      result.cornerRadius = this.cornerRadius;
      result.fit = this.fit;
      return result;
    }

    /**
     * The settings for the merchandise thumbnail badge.
     */
    public Builder badge(CheckoutBrandingMerchandiseThumbnailBadge badge) {
      this.badge = badge;
      return this;
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

    /**
     * The property used to customize how the product image fits within merchandise thumbnails.
     */
    public Builder fit(CheckoutBrandingObjectFit fit) {
      this.fit = fit;
      return this;
    }
  }
}

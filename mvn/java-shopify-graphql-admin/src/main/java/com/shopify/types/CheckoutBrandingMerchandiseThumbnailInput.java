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

  /**
   * The property used to customize how the product image fits within merchandise thumbnails.
   */
  private CheckoutBrandingObjectFit fit;

  /**
   * The settings for the merchandise thumbnail badge.
   */
  private CheckoutBrandingMerchandiseThumbnailBadgeInput badge;

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

  /**
   * The property used to customize how the product image fits within merchandise thumbnails.
   */
  public CheckoutBrandingObjectFit getFit() {
    return fit;
  }

  public void setFit(CheckoutBrandingObjectFit fit) {
    this.fit = fit;
  }

  /**
   * The settings for the merchandise thumbnail badge.
   */
  public CheckoutBrandingMerchandiseThumbnailBadgeInput getBadge() {
    return badge;
  }

  public void setBadge(CheckoutBrandingMerchandiseThumbnailBadgeInput badge) {
    this.badge = badge;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingMerchandiseThumbnailInput{border='" + border + "', cornerRadius='" + cornerRadius + "', fit='" + fit + "', badge='" + badge + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingMerchandiseThumbnailInput that = (CheckoutBrandingMerchandiseThumbnailInput) o;
    return Objects.equals(border, that.border) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(fit, that.fit) &&
        Objects.equals(badge, that.badge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(border, cornerRadius, fit, badge);
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

    /**
     * The property used to customize how the product image fits within merchandise thumbnails.
     */
    private CheckoutBrandingObjectFit fit;

    /**
     * The settings for the merchandise thumbnail badge.
     */
    private CheckoutBrandingMerchandiseThumbnailBadgeInput badge;

    public CheckoutBrandingMerchandiseThumbnailInput build() {
      CheckoutBrandingMerchandiseThumbnailInput result = new CheckoutBrandingMerchandiseThumbnailInput();
      result.border = this.border;
      result.cornerRadius = this.cornerRadius;
      result.fit = this.fit;
      result.badge = this.badge;
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

    /**
     * The property used to customize how the product image fits within merchandise thumbnails.
     */
    public Builder fit(CheckoutBrandingObjectFit fit) {
      this.fit = fit;
      return this;
    }

    /**
     * The settings for the merchandise thumbnail badge.
     */
    public Builder badge(CheckoutBrandingMerchandiseThumbnailBadgeInput badge) {
      this.badge = badge;
      return this;
    }
  }
}

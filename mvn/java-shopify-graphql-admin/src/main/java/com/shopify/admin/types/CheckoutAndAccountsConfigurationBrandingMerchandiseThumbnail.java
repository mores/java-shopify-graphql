package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The merchandise thumbnails customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnail {
  /**
   * The merchandise thumbnail badge.
   */
  private CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadge badge;

  /**
   * The border.
   */
  private CheckoutAndAccountsConfigurationBrandingSimpleBorder border;

  /**
   * The corner radius.
   */
  private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

  /**
   * The property used to customize how the product image fits within merchandise thumbnails.
   */
  private CheckoutAndAccountsConfigurationBrandingObjectFit fit;

  public CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnail() {
  }

  /**
   * The merchandise thumbnail badge.
   */
  public CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadge getBadge() {
    return badge;
  }

  public void setBadge(CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadge badge) {
    this.badge = badge;
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
   * The property used to customize how the product image fits within merchandise thumbnails.
   */
  public CheckoutAndAccountsConfigurationBrandingObjectFit getFit() {
    return fit;
  }

  public void setFit(CheckoutAndAccountsConfigurationBrandingObjectFit fit) {
    this.fit = fit;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnail{badge='" + badge + "', border='" + border + "', cornerRadius='" + cornerRadius + "', fit='" + fit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnail that = (CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnail) o;
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
     * The merchandise thumbnail badge.
     */
    private CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadge badge;

    /**
     * The border.
     */
    private CheckoutAndAccountsConfigurationBrandingSimpleBorder border;

    /**
     * The corner radius.
     */
    private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

    /**
     * The property used to customize how the product image fits within merchandise thumbnails.
     */
    private CheckoutAndAccountsConfigurationBrandingObjectFit fit;

    public CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnail build() {
      CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnail result = new CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnail();
      result.badge = this.badge;
      result.border = this.border;
      result.cornerRadius = this.cornerRadius;
      result.fit = this.fit;
      return result;
    }

    /**
     * The merchandise thumbnail badge.
     */
    public Builder badge(CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadge badge) {
      this.badge = badge;
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
     * The corner radius.
     */
    public Builder cornerRadius(CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius) {
      this.cornerRadius = cornerRadius;
      return this;
    }

    /**
     * The property used to customize how the product image fits within merchandise thumbnails.
     */
    public Builder fit(CheckoutAndAccountsConfigurationBrandingObjectFit fit) {
      this.fit = fit;
      return this;
    }
  }
}

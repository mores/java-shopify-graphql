package com.shopify.admin.types;

import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the merchandise thumbnails.
 */
public class CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailInput {
  /**
   * The border.
   */
  private CheckoutAndAccountsConfigurationBrandingSimpleBorder border;

  /**
   * The corner radius.
   */
  private CheckoutAndAccountsConfigurationBrandingCornerRadius cornerRadius;

  /**
   * The aspect ratio.
   */
  private Double aspectRatio;

  /**
   * The property used to customize how the product image fits within merchandise thumbnails.
   */
  private CheckoutAndAccountsConfigurationBrandingObjectFit fit;

  /**
   * The merchandise thumbnail badge.
   */
  private CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeInput badge;

  public CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailInput() {
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
   * The aspect ratio.
   */
  public Double getAspectRatio() {
    return aspectRatio;
  }

  public void setAspectRatio(Double aspectRatio) {
    this.aspectRatio = aspectRatio;
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

  /**
   * The merchandise thumbnail badge.
   */
  public CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeInput getBadge() {
    return badge;
  }

  public void setBadge(
      CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeInput badge) {
    this.badge = badge;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailInput{border='" + border + "', cornerRadius='" + cornerRadius + "', aspectRatio='" + aspectRatio + "', fit='" + fit + "', badge='" + badge + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailInput that = (CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailInput) o;
    return Objects.equals(border, that.border) &&
        Objects.equals(cornerRadius, that.cornerRadius) &&
        Objects.equals(aspectRatio, that.aspectRatio) &&
        Objects.equals(fit, that.fit) &&
        Objects.equals(badge, that.badge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(border, cornerRadius, aspectRatio, fit, badge);
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
     * The aspect ratio.
     */
    private Double aspectRatio;

    /**
     * The property used to customize how the product image fits within merchandise thumbnails.
     */
    private CheckoutAndAccountsConfigurationBrandingObjectFit fit;

    /**
     * The merchandise thumbnail badge.
     */
    private CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeInput badge;

    public CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailInput build() {
      CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailInput result = new CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailInput();
      result.border = this.border;
      result.cornerRadius = this.cornerRadius;
      result.aspectRatio = this.aspectRatio;
      result.fit = this.fit;
      result.badge = this.badge;
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
     * The aspect ratio.
     */
    public Builder aspectRatio(Double aspectRatio) {
      this.aspectRatio = aspectRatio;
      return this;
    }

    /**
     * The property used to customize how the product image fits within merchandise thumbnails.
     */
    public Builder fit(CheckoutAndAccountsConfigurationBrandingObjectFit fit) {
      this.fit = fit;
      return this;
    }

    /**
     * The merchandise thumbnail badge.
     */
    public Builder badge(
        CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeInput badge) {
      this.badge = badge;
      return this;
    }
  }
}

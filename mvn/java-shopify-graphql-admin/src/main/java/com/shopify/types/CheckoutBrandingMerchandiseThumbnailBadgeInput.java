package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update the merchandise thumbnail badges customizations.
 */
public class CheckoutBrandingMerchandiseThumbnailBadgeInput {
  /**
   * The background used for merchandise thumbnail badges.
   */
  private CheckoutBrandingMerchandiseThumbnailBadgeBackground background;

  public CheckoutBrandingMerchandiseThumbnailBadgeInput() {
  }

  /**
   * The background used for merchandise thumbnail badges.
   */
  public CheckoutBrandingMerchandiseThumbnailBadgeBackground getBackground() {
    return background;
  }

  public void setBackground(CheckoutBrandingMerchandiseThumbnailBadgeBackground background) {
    this.background = background;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingMerchandiseThumbnailBadgeInput{background='" + background + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingMerchandiseThumbnailBadgeInput that = (CheckoutBrandingMerchandiseThumbnailBadgeInput) o;
    return Objects.equals(background, that.background);
  }

  @Override
  public int hashCode() {
    return Objects.hash(background);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The background used for merchandise thumbnail badges.
     */
    private CheckoutBrandingMerchandiseThumbnailBadgeBackground background;

    public CheckoutBrandingMerchandiseThumbnailBadgeInput build() {
      CheckoutBrandingMerchandiseThumbnailBadgeInput result = new CheckoutBrandingMerchandiseThumbnailBadgeInput();
      result.background = this.background;
      return result;
    }

    /**
     * The background used for merchandise thumbnail badges.
     */
    public Builder background(CheckoutBrandingMerchandiseThumbnailBadgeBackground background) {
      this.background = background;
      return this;
    }
  }
}

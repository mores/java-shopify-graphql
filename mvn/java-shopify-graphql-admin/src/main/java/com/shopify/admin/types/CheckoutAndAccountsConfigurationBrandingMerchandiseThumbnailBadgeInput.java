package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing the merchandise thumbnail badges.
 */
public class CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeInput {
  /**
   * The background.
   */
  private CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeBackground background;

  public CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeInput() {
  }

  /**
   * The background.
   */
  public CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeBackground getBackground(
      ) {
    return background;
  }

  public void setBackground(
      CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeBackground background) {
    this.background = background;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeInput{background='" + background + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeInput that = (CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeInput) o;
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
     * The background.
     */
    private CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeBackground background;

    public CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeInput build() {
      CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeInput result = new CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeInput();
      result.background = this.background;
      return result;
    }

    /**
     * The background.
     */
    public Builder background(
        CheckoutAndAccountsConfigurationBrandingMerchandiseThumbnailBadgeBackground background) {
      this.background = background;
      return this;
    }
  }
}

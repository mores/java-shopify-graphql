package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update a font group. To learn more about updating fonts, refer to the
 * [checkoutBrandingUpsert](https://shopify.dev/api/admin-graphql/unstable/mutations/checkoutBrandingUpsert)
 * mutation and the checkout branding [tutorial](https://shopify.dev/docs/apps/checkout/styling).
 */
public class CheckoutBrandingFontGroupInput {
  /**
   * A Shopify font group.
   */
  private CheckoutBrandingShopifyFontGroupInput shopifyFontGroup;

  /**
   * A custom font group.
   */
  private CheckoutBrandingCustomFontGroupInput customFontGroup;

  public CheckoutBrandingFontGroupInput() {
  }

  /**
   * A Shopify font group.
   */
  public CheckoutBrandingShopifyFontGroupInput getShopifyFontGroup() {
    return shopifyFontGroup;
  }

  public void setShopifyFontGroup(CheckoutBrandingShopifyFontGroupInput shopifyFontGroup) {
    this.shopifyFontGroup = shopifyFontGroup;
  }

  /**
   * A custom font group.
   */
  public CheckoutBrandingCustomFontGroupInput getCustomFontGroup() {
    return customFontGroup;
  }

  public void setCustomFontGroup(CheckoutBrandingCustomFontGroupInput customFontGroup) {
    this.customFontGroup = customFontGroup;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingFontGroupInput{shopifyFontGroup='" + shopifyFontGroup + "', customFontGroup='" + customFontGroup + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingFontGroupInput that = (CheckoutBrandingFontGroupInput) o;
    return Objects.equals(shopifyFontGroup, that.shopifyFontGroup) &&
        Objects.equals(customFontGroup, that.customFontGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopifyFontGroup, customFontGroup);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A Shopify font group.
     */
    private CheckoutBrandingShopifyFontGroupInput shopifyFontGroup;

    /**
     * A custom font group.
     */
    private CheckoutBrandingCustomFontGroupInput customFontGroup;

    public CheckoutBrandingFontGroupInput build() {
      CheckoutBrandingFontGroupInput result = new CheckoutBrandingFontGroupInput();
      result.shopifyFontGroup = this.shopifyFontGroup;
      result.customFontGroup = this.customFontGroup;
      return result;
    }

    /**
     * A Shopify font group.
     */
    public Builder shopifyFontGroup(CheckoutBrandingShopifyFontGroupInput shopifyFontGroup) {
      this.shopifyFontGroup = shopifyFontGroup;
      return this;
    }

    /**
     * A custom font group.
     */
    public Builder customFontGroup(CheckoutBrandingCustomFontGroupInput customFontGroup) {
      this.customFontGroup = customFontGroup;
      return this;
    }
  }
}

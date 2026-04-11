package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update a font group.
 */
public class CheckoutAndAccountsConfigurationBrandingFontGroupInput {
  /**
   * A Shopify font group.
   */
  private CheckoutAndAccountsConfigurationBrandingShopifyFontGroupInput shopifyFontGroup;

  /**
   * A custom font group.
   */
  private CheckoutAndAccountsConfigurationBrandingCustomFontGroupInput customFontGroup;

  public CheckoutAndAccountsConfigurationBrandingFontGroupInput() {
  }

  /**
   * A Shopify font group.
   */
  public CheckoutAndAccountsConfigurationBrandingShopifyFontGroupInput getShopifyFontGroup() {
    return shopifyFontGroup;
  }

  public void setShopifyFontGroup(
      CheckoutAndAccountsConfigurationBrandingShopifyFontGroupInput shopifyFontGroup) {
    this.shopifyFontGroup = shopifyFontGroup;
  }

  /**
   * A custom font group.
   */
  public CheckoutAndAccountsConfigurationBrandingCustomFontGroupInput getCustomFontGroup() {
    return customFontGroup;
  }

  public void setCustomFontGroup(
      CheckoutAndAccountsConfigurationBrandingCustomFontGroupInput customFontGroup) {
    this.customFontGroup = customFontGroup;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingFontGroupInput{shopifyFontGroup='" + shopifyFontGroup + "', customFontGroup='" + customFontGroup + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingFontGroupInput that = (CheckoutAndAccountsConfigurationBrandingFontGroupInput) o;
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
    private CheckoutAndAccountsConfigurationBrandingShopifyFontGroupInput shopifyFontGroup;

    /**
     * A custom font group.
     */
    private CheckoutAndAccountsConfigurationBrandingCustomFontGroupInput customFontGroup;

    public CheckoutAndAccountsConfigurationBrandingFontGroupInput build() {
      CheckoutAndAccountsConfigurationBrandingFontGroupInput result = new CheckoutAndAccountsConfigurationBrandingFontGroupInput();
      result.shopifyFontGroup = this.shopifyFontGroup;
      result.customFontGroup = this.customFontGroup;
      return result;
    }

    /**
     * A Shopify font group.
     */
    public Builder shopifyFontGroup(
        CheckoutAndAccountsConfigurationBrandingShopifyFontGroupInput shopifyFontGroup) {
      this.shopifyFontGroup = shopifyFontGroup;
      return this;
    }

    /**
     * A custom font group.
     */
    public Builder customFontGroup(
        CheckoutAndAccountsConfigurationBrandingCustomFontGroupInput customFontGroup) {
      this.customFontGroup = customFontGroup;
      return this;
    }
  }
}

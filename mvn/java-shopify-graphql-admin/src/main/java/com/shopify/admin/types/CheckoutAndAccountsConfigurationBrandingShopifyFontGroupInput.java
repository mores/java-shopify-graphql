package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing a Shopify font group.
 */
public class CheckoutAndAccountsConfigurationBrandingShopifyFontGroupInput {
  /**
   * The Shopify base font handle.
   */
  private String baseFontHandle;

  /**
   * The Shopify bold font handle.
   */
  private String boldFontHandle;

  /**
   * The font loading strategy.
   */
  private CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy loadingStrategy;

  public CheckoutAndAccountsConfigurationBrandingShopifyFontGroupInput() {
  }

  /**
   * The Shopify base font handle.
   */
  public String getBaseFontHandle() {
    return baseFontHandle;
  }

  public void setBaseFontHandle(String baseFontHandle) {
    this.baseFontHandle = baseFontHandle;
  }

  /**
   * The Shopify bold font handle.
   */
  public String getBoldFontHandle() {
    return boldFontHandle;
  }

  public void setBoldFontHandle(String boldFontHandle) {
    this.boldFontHandle = boldFontHandle;
  }

  /**
   * The font loading strategy.
   */
  public CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy getLoadingStrategy() {
    return loadingStrategy;
  }

  public void setLoadingStrategy(
      CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy loadingStrategy) {
    this.loadingStrategy = loadingStrategy;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingShopifyFontGroupInput{baseFontHandle='" + baseFontHandle + "', boldFontHandle='" + boldFontHandle + "', loadingStrategy='" + loadingStrategy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingShopifyFontGroupInput that = (CheckoutAndAccountsConfigurationBrandingShopifyFontGroupInput) o;
    return Objects.equals(baseFontHandle, that.baseFontHandle) &&
        Objects.equals(boldFontHandle, that.boldFontHandle) &&
        Objects.equals(loadingStrategy, that.loadingStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseFontHandle, boldFontHandle, loadingStrategy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The Shopify base font handle.
     */
    private String baseFontHandle;

    /**
     * The Shopify bold font handle.
     */
    private String boldFontHandle;

    /**
     * The font loading strategy.
     */
    private CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy loadingStrategy;

    public CheckoutAndAccountsConfigurationBrandingShopifyFontGroupInput build() {
      CheckoutAndAccountsConfigurationBrandingShopifyFontGroupInput result = new CheckoutAndAccountsConfigurationBrandingShopifyFontGroupInput();
      result.baseFontHandle = this.baseFontHandle;
      result.boldFontHandle = this.boldFontHandle;
      result.loadingStrategy = this.loadingStrategy;
      return result;
    }

    /**
     * The Shopify base font handle.
     */
    public Builder baseFontHandle(String baseFontHandle) {
      this.baseFontHandle = baseFontHandle;
      return this;
    }

    /**
     * The Shopify bold font handle.
     */
    public Builder boldFontHandle(String boldFontHandle) {
      this.boldFontHandle = boldFontHandle;
      return this;
    }

    /**
     * The font loading strategy.
     */
    public Builder loadingStrategy(
        CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy loadingStrategy) {
      this.loadingStrategy = loadingStrategy;
      return this;
    }
  }
}

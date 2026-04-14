package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The Shopify font group customizations.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CheckoutAndAccountsConfigurationBrandingShopifyFontGroup implements CheckoutAndAccountsConfigurationBrandingFontGroup {
  /**
   * The base Shopify font.
   */
  private CheckoutAndAccountsConfigurationBrandingShopifyFont base;

  /**
   * The bold Shopify font.
   */
  private CheckoutAndAccountsConfigurationBrandingShopifyFont bold;

  /**
   * The font loading strategy.
   */
  private CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy loadingStrategy;

  /**
   * The font group name.
   */
  private String name;

  public CheckoutAndAccountsConfigurationBrandingShopifyFontGroup() {
  }

  /**
   * The base Shopify font.
   */
  public CheckoutAndAccountsConfigurationBrandingShopifyFont getBase() {
    return base;
  }

  public void setBase(CheckoutAndAccountsConfigurationBrandingShopifyFont base) {
    this.base = base;
  }

  /**
   * The bold Shopify font.
   */
  public CheckoutAndAccountsConfigurationBrandingShopifyFont getBold() {
    return bold;
  }

  public void setBold(CheckoutAndAccountsConfigurationBrandingShopifyFont bold) {
    this.bold = bold;
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

  /**
   * The font group name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingShopifyFontGroup{base='" + base + "', bold='" + bold + "', loadingStrategy='" + loadingStrategy + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingShopifyFontGroup that = (CheckoutAndAccountsConfigurationBrandingShopifyFontGroup) o;
    return Objects.equals(base, that.base) &&
        Objects.equals(bold, that.bold) &&
        Objects.equals(loadingStrategy, that.loadingStrategy) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, bold, loadingStrategy, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The base Shopify font.
     */
    private CheckoutAndAccountsConfigurationBrandingShopifyFont base;

    /**
     * The bold Shopify font.
     */
    private CheckoutAndAccountsConfigurationBrandingShopifyFont bold;

    /**
     * The font loading strategy.
     */
    private CheckoutAndAccountsConfigurationBrandingFontLoadingStrategy loadingStrategy;

    /**
     * The font group name.
     */
    private String name;

    public CheckoutAndAccountsConfigurationBrandingShopifyFontGroup build() {
      CheckoutAndAccountsConfigurationBrandingShopifyFontGroup result = new CheckoutAndAccountsConfigurationBrandingShopifyFontGroup();
      result.base = this.base;
      result.bold = this.bold;
      result.loadingStrategy = this.loadingStrategy;
      result.name = this.name;
      return result;
    }

    /**
     * The base Shopify font.
     */
    public Builder base(CheckoutAndAccountsConfigurationBrandingShopifyFont base) {
      this.base = base;
      return this;
    }

    /**
     * The bold Shopify font.
     */
    public Builder bold(CheckoutAndAccountsConfigurationBrandingShopifyFont bold) {
      this.bold = bold;
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

    /**
     * The font group name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}

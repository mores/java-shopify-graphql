package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields used to update a Shopify font group.
 */
public class CheckoutBrandingShopifyFontGroupInput {
  /**
   * The Shopify font name from [the list of available fonts](https://shopify.dev/themes/architecture/settings/fonts#available-fonts),
   * such as `Alegreya Sans` or `Anonymous Pro`.
   */
  private String name;

  /**
   * The base font weight.
   */
  private Integer baseWeight;

  /**
   * The bold font weight.
   */
  private Integer boldWeight;

  /**
   * The font loading strategy.
   */
  private CheckoutBrandingFontLoadingStrategy loadingStrategy;

  public CheckoutBrandingShopifyFontGroupInput() {
  }

  /**
   * The Shopify font name from [the list of available fonts](https://shopify.dev/themes/architecture/settings/fonts#available-fonts),
   * such as `Alegreya Sans` or `Anonymous Pro`.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The base font weight.
   */
  public Integer getBaseWeight() {
    return baseWeight;
  }

  public void setBaseWeight(Integer baseWeight) {
    this.baseWeight = baseWeight;
  }

  /**
   * The bold font weight.
   */
  public Integer getBoldWeight() {
    return boldWeight;
  }

  public void setBoldWeight(Integer boldWeight) {
    this.boldWeight = boldWeight;
  }

  /**
   * The font loading strategy.
   */
  public CheckoutBrandingFontLoadingStrategy getLoadingStrategy() {
    return loadingStrategy;
  }

  public void setLoadingStrategy(CheckoutBrandingFontLoadingStrategy loadingStrategy) {
    this.loadingStrategy = loadingStrategy;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingShopifyFontGroupInput{name='" + name + "', baseWeight='" + baseWeight + "', boldWeight='" + boldWeight + "', loadingStrategy='" + loadingStrategy + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingShopifyFontGroupInput that = (CheckoutBrandingShopifyFontGroupInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(baseWeight, that.baseWeight) &&
        Objects.equals(boldWeight, that.boldWeight) &&
        Objects.equals(loadingStrategy, that.loadingStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, baseWeight, boldWeight, loadingStrategy);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The Shopify font name from [the list of available fonts](https://shopify.dev/themes/architecture/settings/fonts#available-fonts),
     * such as `Alegreya Sans` or `Anonymous Pro`.
     */
    private String name;

    /**
     * The base font weight.
     */
    private Integer baseWeight;

    /**
     * The bold font weight.
     */
    private Integer boldWeight;

    /**
     * The font loading strategy.
     */
    private CheckoutBrandingFontLoadingStrategy loadingStrategy;

    public CheckoutBrandingShopifyFontGroupInput build() {
      CheckoutBrandingShopifyFontGroupInput result = new CheckoutBrandingShopifyFontGroupInput();
      result.name = this.name;
      result.baseWeight = this.baseWeight;
      result.boldWeight = this.boldWeight;
      result.loadingStrategy = this.loadingStrategy;
      return result;
    }

    /**
     * The Shopify font name from [the list of available fonts](https://shopify.dev/themes/architecture/settings/fonts#available-fonts),
     * such as `Alegreya Sans` or `Anonymous Pro`.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The base font weight.
     */
    public Builder baseWeight(Integer baseWeight) {
      this.baseWeight = baseWeight;
      return this;
    }

    /**
     * The bold font weight.
     */
    public Builder boldWeight(Integer boldWeight) {
      this.boldWeight = boldWeight;
      return this;
    }

    /**
     * The font loading strategy.
     */
    public Builder loadingStrategy(CheckoutBrandingFontLoadingStrategy loadingStrategy) {
      this.loadingStrategy = loadingStrategy;
      return this;
    }
  }
}

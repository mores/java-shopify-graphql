package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The Shopify font customizations.
 */
public class CheckoutAndAccountsConfigurationBrandingShopifyFont {
  /**
   * The font sources.
   */
  private String sources;

  /**
   * The font weight.
   */
  private Integer weight;

  public CheckoutAndAccountsConfigurationBrandingShopifyFont() {
  }

  /**
   * The font sources.
   */
  public String getSources() {
    return sources;
  }

  public void setSources(String sources) {
    this.sources = sources;
  }

  /**
   * The font weight.
   */
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingShopifyFont{sources='" + sources + "', weight='" + weight + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingShopifyFont that = (CheckoutAndAccountsConfigurationBrandingShopifyFont) o;
    return Objects.equals(sources, that.sources) &&
        Objects.equals(weight, that.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sources, weight);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The font sources.
     */
    private String sources;

    /**
     * The font weight.
     */
    private Integer weight;

    public CheckoutAndAccountsConfigurationBrandingShopifyFont build() {
      CheckoutAndAccountsConfigurationBrandingShopifyFont result = new CheckoutAndAccountsConfigurationBrandingShopifyFont();
      result.sources = this.sources;
      result.weight = this.weight;
      return result;
    }

    /**
     * The font sources.
     */
    public Builder sources(String sources) {
      this.sources = sources;
      return this;
    }

    /**
     * The font weight.
     */
    public Builder weight(Integer weight) {
      this.weight = weight;
      return this;
    }
  }
}

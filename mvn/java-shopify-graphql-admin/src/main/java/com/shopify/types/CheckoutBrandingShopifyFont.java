package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A Shopify font.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CheckoutBrandingShopifyFont implements com.shopify.types.CheckoutBrandingFont {
  /**
   * The font sources.
   */
  private String sources;

  /**
   * The font weight.
   */
  private Integer weight;

  public CheckoutBrandingShopifyFont() {
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
    return "CheckoutBrandingShopifyFont{sources='" + sources + "', weight='" + weight + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingShopifyFont that = (CheckoutBrandingShopifyFont) o;
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

    public CheckoutBrandingShopifyFont build() {
      CheckoutBrandingShopifyFont result = new CheckoutBrandingShopifyFont();
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

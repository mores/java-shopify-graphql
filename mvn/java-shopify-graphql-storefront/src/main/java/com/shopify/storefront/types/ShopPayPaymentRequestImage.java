package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents an image for a Shop Pay payment request line item.
 */
public class ShopPayPaymentRequestImage {
  /**
   * The alt text of the image.
   */
  private String alt;

  /**
   * The source URL of the image.
   */
  private String url;

  public ShopPayPaymentRequestImage() {
  }

  /**
   * The alt text of the image.
   */
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  /**
   * The source URL of the image.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestImage{alt='" + alt + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestImage that = (ShopPayPaymentRequestImage) o;
    return Objects.equals(alt, that.alt) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alt, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The alt text of the image.
     */
    private String alt;

    /**
     * The source URL of the image.
     */
    private String url;

    public ShopPayPaymentRequestImage build() {
      ShopPayPaymentRequestImage result = new ShopPayPaymentRequestImage();
      result.alt = this.alt;
      result.url = this.url;
      return result;
    }

    /**
     * The alt text of the image.
     */
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }

    /**
     * The source URL of the image.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}

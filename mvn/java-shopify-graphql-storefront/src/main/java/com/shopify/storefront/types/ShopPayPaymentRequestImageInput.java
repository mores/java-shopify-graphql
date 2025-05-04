package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to create an image for a Shop Pay payment request.
 */
public class ShopPayPaymentRequestImageInput {
  /**
   * The source URL of the image.
   */
  private String url;

  /**
   * The alt text of the image.
   */
  private String alt;

  public ShopPayPaymentRequestImageInput() {
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

  /**
   * The alt text of the image.
   */
  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestImageInput{url='" + url + "', alt='" + alt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestImageInput that = (ShopPayPaymentRequestImageInput) o;
    return Objects.equals(url, that.url) &&
        Objects.equals(alt, that.alt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, alt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The source URL of the image.
     */
    private String url;

    /**
     * The alt text of the image.
     */
    private String alt;

    public ShopPayPaymentRequestImageInput build() {
      ShopPayPaymentRequestImageInput result = new ShopPayPaymentRequestImageInput();
      result.url = this.url;
      result.alt = this.alt;
      return result;
    }

    /**
     * The source URL of the image.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }

    /**
     * The alt text of the image.
     */
    public Builder alt(String alt) {
      this.alt = alt;
      return this;
    }
  }
}

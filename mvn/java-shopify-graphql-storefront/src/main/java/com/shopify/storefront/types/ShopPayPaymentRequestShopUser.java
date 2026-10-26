package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the Shop user that authorized a Shop Pay payment request.
 */
public class ShopPayPaymentRequestShopUser {
  /**
   * The public ID of the Shop user.
   */
  private String publicId;

  public ShopPayPaymentRequestShopUser() {
  }

  /**
   * The public ID of the Shop user.
   */
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestShopUser{publicId='" + publicId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestShopUser that = (ShopPayPaymentRequestShopUser) o;
    return Objects.equals(publicId, that.publicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The public ID of the Shop user.
     */
    private String publicId;

    public ShopPayPaymentRequestShopUser build() {
      ShopPayPaymentRequestShopUser result = new ShopPayPaymentRequestShopUser();
      result.publicId = this.publicId;
      return result;
    }

    /**
     * The public ID of the Shop user.
     */
    public Builder publicId(String publicId) {
      this.publicId = publicId;
      return this;
    }
  }
}

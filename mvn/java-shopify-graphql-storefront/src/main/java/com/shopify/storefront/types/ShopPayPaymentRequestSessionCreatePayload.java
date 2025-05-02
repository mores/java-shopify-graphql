package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `shopPayPaymentRequestSessionCreate` mutation.
 */
public class ShopPayPaymentRequestSessionCreatePayload {
  /**
   * The new Shop Pay payment request session object.
   */
  private ShopPayPaymentRequestSession shopPayPaymentRequestSession;

  /**
   * Error codes for failed Shop Pay payment request session mutations.
   */
  private List<UserErrorsShopPayPaymentRequestSessionUserErrors> userErrors;

  public ShopPayPaymentRequestSessionCreatePayload() {
  }

  /**
   * The new Shop Pay payment request session object.
   */
  public ShopPayPaymentRequestSession getShopPayPaymentRequestSession() {
    return shopPayPaymentRequestSession;
  }

  public void setShopPayPaymentRequestSession(
      ShopPayPaymentRequestSession shopPayPaymentRequestSession) {
    this.shopPayPaymentRequestSession = shopPayPaymentRequestSession;
  }

  /**
   * Error codes for failed Shop Pay payment request session mutations.
   */
  public List<UserErrorsShopPayPaymentRequestSessionUserErrors> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserErrorsShopPayPaymentRequestSessionUserErrors> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestSessionCreatePayload{shopPayPaymentRequestSession='" + shopPayPaymentRequestSession + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestSessionCreatePayload that = (ShopPayPaymentRequestSessionCreatePayload) o;
    return Objects.equals(shopPayPaymentRequestSession, that.shopPayPaymentRequestSession) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopPayPaymentRequestSession, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The new Shop Pay payment request session object.
     */
    private ShopPayPaymentRequestSession shopPayPaymentRequestSession;

    /**
     * Error codes for failed Shop Pay payment request session mutations.
     */
    private List<UserErrorsShopPayPaymentRequestSessionUserErrors> userErrors;

    public ShopPayPaymentRequestSessionCreatePayload build() {
      ShopPayPaymentRequestSessionCreatePayload result = new ShopPayPaymentRequestSessionCreatePayload();
      result.shopPayPaymentRequestSession = this.shopPayPaymentRequestSession;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The new Shop Pay payment request session object.
     */
    public Builder shopPayPaymentRequestSession(
        ShopPayPaymentRequestSession shopPayPaymentRequestSession) {
      this.shopPayPaymentRequestSession = shopPayPaymentRequestSession;
      return this;
    }

    /**
     * Error codes for failed Shop Pay payment request session mutations.
     */
    public Builder userErrors(List<UserErrorsShopPayPaymentRequestSessionUserErrors> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

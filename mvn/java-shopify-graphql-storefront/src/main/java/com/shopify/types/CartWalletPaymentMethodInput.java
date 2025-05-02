package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for submitting wallet payment method information for checkout.
 */
public class CartWalletPaymentMethodInput {
  /**
   * The payment method information for the Apple Pay wallet.
   */
  private ApplePayWalletContentInput applePayWalletContent;

  /**
   * The payment method information for the Shop Pay wallet.
   */
  private ShopPayWalletContentInput shopPayWalletContent;

  public CartWalletPaymentMethodInput() {
  }

  /**
   * The payment method information for the Apple Pay wallet.
   */
  public ApplePayWalletContentInput getApplePayWalletContent() {
    return applePayWalletContent;
  }

  public void setApplePayWalletContent(ApplePayWalletContentInput applePayWalletContent) {
    this.applePayWalletContent = applePayWalletContent;
  }

  /**
   * The payment method information for the Shop Pay wallet.
   */
  public ShopPayWalletContentInput getShopPayWalletContent() {
    return shopPayWalletContent;
  }

  public void setShopPayWalletContent(ShopPayWalletContentInput shopPayWalletContent) {
    this.shopPayWalletContent = shopPayWalletContent;
  }

  @Override
  public String toString() {
    return "CartWalletPaymentMethodInput{applePayWalletContent='" + applePayWalletContent + "', shopPayWalletContent='" + shopPayWalletContent + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartWalletPaymentMethodInput that = (CartWalletPaymentMethodInput) o;
    return Objects.equals(applePayWalletContent, that.applePayWalletContent) &&
        Objects.equals(shopPayWalletContent, that.shopPayWalletContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applePayWalletContent, shopPayWalletContent);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The payment method information for the Apple Pay wallet.
     */
    private ApplePayWalletContentInput applePayWalletContent;

    /**
     * The payment method information for the Shop Pay wallet.
     */
    private ShopPayWalletContentInput shopPayWalletContent;

    public CartWalletPaymentMethodInput build() {
      CartWalletPaymentMethodInput result = new CartWalletPaymentMethodInput();
      result.applePayWalletContent = this.applePayWalletContent;
      result.shopPayWalletContent = this.shopPayWalletContent;
      return result;
    }

    /**
     * The payment method information for the Apple Pay wallet.
     */
    public Builder applePayWalletContent(ApplePayWalletContentInput applePayWalletContent) {
      this.applePayWalletContent = applePayWalletContent;
      return this;
    }

    /**
     * The payment method information for the Shop Pay wallet.
     */
    public Builder shopPayWalletContent(ShopPayWalletContentInput shopPayWalletContent) {
      this.shopPayWalletContent = shopPayWalletContent;
      return this;
    }
  }
}

package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating the payment method that will be used to checkout.
 */
public class CartPaymentInput {
  /**
   * The amount that the customer will be charged at checkout.
   */
  private MoneyInput amount;

  /**
   * An ID of the order placed on the originating platform.
   * Note that this value doesn't correspond to the Shopify Order ID.
   */
  private String sourceIdentifier;

  /**
   * The input fields to use to checkout a cart without providing a payment method.
   * Use this payment method input if the total cost of the cart is 0.
   */
  private CartFreePaymentMethodInput freePaymentMethod;

  /**
   * The input fields to use when checking out a cart with a direct payment method (like a credit card).
   */
  private CartDirectPaymentMethodInput directPaymentMethod;

  /**
   * The input fields to use when checking out a cart with a wallet payment method (like Shop Pay or Apple Pay).
   */
  private CartWalletPaymentMethodInput walletPaymentMethod;

  public CartPaymentInput() {
  }

  /**
   * The amount that the customer will be charged at checkout.
   */
  public MoneyInput getAmount() {
    return amount;
  }

  public void setAmount(MoneyInput amount) {
    this.amount = amount;
  }

  /**
   * An ID of the order placed on the originating platform.
   * Note that this value doesn't correspond to the Shopify Order ID.
   */
  public String getSourceIdentifier() {
    return sourceIdentifier;
  }

  public void setSourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = sourceIdentifier;
  }

  /**
   * The input fields to use to checkout a cart without providing a payment method.
   * Use this payment method input if the total cost of the cart is 0.
   */
  public CartFreePaymentMethodInput getFreePaymentMethod() {
    return freePaymentMethod;
  }

  public void setFreePaymentMethod(CartFreePaymentMethodInput freePaymentMethod) {
    this.freePaymentMethod = freePaymentMethod;
  }

  /**
   * The input fields to use when checking out a cart with a direct payment method (like a credit card).
   */
  public CartDirectPaymentMethodInput getDirectPaymentMethod() {
    return directPaymentMethod;
  }

  public void setDirectPaymentMethod(CartDirectPaymentMethodInput directPaymentMethod) {
    this.directPaymentMethod = directPaymentMethod;
  }

  /**
   * The input fields to use when checking out a cart with a wallet payment method (like Shop Pay or Apple Pay).
   */
  public CartWalletPaymentMethodInput getWalletPaymentMethod() {
    return walletPaymentMethod;
  }

  public void setWalletPaymentMethod(CartWalletPaymentMethodInput walletPaymentMethod) {
    this.walletPaymentMethod = walletPaymentMethod;
  }

  @Override
  public String toString() {
    return "CartPaymentInput{amount='" + amount + "', sourceIdentifier='" + sourceIdentifier + "', freePaymentMethod='" + freePaymentMethod + "', directPaymentMethod='" + directPaymentMethod + "', walletPaymentMethod='" + walletPaymentMethod + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartPaymentInput that = (CartPaymentInput) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(sourceIdentifier, that.sourceIdentifier) &&
        Objects.equals(freePaymentMethod, that.freePaymentMethod) &&
        Objects.equals(directPaymentMethod, that.directPaymentMethod) &&
        Objects.equals(walletPaymentMethod, that.walletPaymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, sourceIdentifier, freePaymentMethod, directPaymentMethod, walletPaymentMethod);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount that the customer will be charged at checkout.
     */
    private MoneyInput amount;

    /**
     * An ID of the order placed on the originating platform.
     * Note that this value doesn't correspond to the Shopify Order ID.
     */
    private String sourceIdentifier;

    /**
     * The input fields to use to checkout a cart without providing a payment method.
     * Use this payment method input if the total cost of the cart is 0.
     */
    private CartFreePaymentMethodInput freePaymentMethod;

    /**
     * The input fields to use when checking out a cart with a direct payment method (like a credit card).
     */
    private CartDirectPaymentMethodInput directPaymentMethod;

    /**
     * The input fields to use when checking out a cart with a wallet payment method (like Shop Pay or Apple Pay).
     */
    private CartWalletPaymentMethodInput walletPaymentMethod;

    public CartPaymentInput build() {
      CartPaymentInput result = new CartPaymentInput();
      result.amount = this.amount;
      result.sourceIdentifier = this.sourceIdentifier;
      result.freePaymentMethod = this.freePaymentMethod;
      result.directPaymentMethod = this.directPaymentMethod;
      result.walletPaymentMethod = this.walletPaymentMethod;
      return result;
    }

    /**
     * The amount that the customer will be charged at checkout.
     */
    public Builder amount(MoneyInput amount) {
      this.amount = amount;
      return this;
    }

    /**
     * An ID of the order placed on the originating platform.
     * Note that this value doesn't correspond to the Shopify Order ID.
     */
    public Builder sourceIdentifier(String sourceIdentifier) {
      this.sourceIdentifier = sourceIdentifier;
      return this;
    }

    /**
     * The input fields to use to checkout a cart without providing a payment method.
     * Use this payment method input if the total cost of the cart is 0.
     */
    public Builder freePaymentMethod(CartFreePaymentMethodInput freePaymentMethod) {
      this.freePaymentMethod = freePaymentMethod;
      return this;
    }

    /**
     * The input fields to use when checking out a cart with a direct payment method (like a credit card).
     */
    public Builder directPaymentMethod(CartDirectPaymentMethodInput directPaymentMethod) {
      this.directPaymentMethod = directPaymentMethod;
      return this;
    }

    /**
     * The input fields to use when checking out a cart with a wallet payment method (like Shop Pay or Apple Pay).
     */
    public Builder walletPaymentMethod(CartWalletPaymentMethodInput walletPaymentMethod) {
      this.walletPaymentMethod = walletPaymentMethod;
      return this;
    }
  }
}

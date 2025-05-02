package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields represent preferences for the buyer that is interacting with the cart.
 */
public class CartPreferencesInput {
  /**
   * Delivery preferences can be used to prefill the delivery section in at checkout.
   */
  private CartDeliveryPreferenceInput delivery;

  /**
   * Wallet preferences are used to populate relevant payment fields in the checkout flow.
   * Accepted value: `["shop_pay"]`.
   *   
   * The input must not contain more than `250` values.
   */
  private List<String> wallet;

  public CartPreferencesInput() {
  }

  /**
   * Delivery preferences can be used to prefill the delivery section in at checkout.
   */
  public CartDeliveryPreferenceInput getDelivery() {
    return delivery;
  }

  public void setDelivery(CartDeliveryPreferenceInput delivery) {
    this.delivery = delivery;
  }

  /**
   * Wallet preferences are used to populate relevant payment fields in the checkout flow.
   * Accepted value: `["shop_pay"]`.
   *   
   * The input must not contain more than `250` values.
   */
  public List<String> getWallet() {
    return wallet;
  }

  public void setWallet(List<String> wallet) {
    this.wallet = wallet;
  }

  @Override
  public String toString() {
    return "CartPreferencesInput{delivery='" + delivery + "', wallet='" + wallet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartPreferencesInput that = (CartPreferencesInput) o;
    return Objects.equals(delivery, that.delivery) &&
        Objects.equals(wallet, that.wallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delivery, wallet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Delivery preferences can be used to prefill the delivery section in at checkout.
     */
    private CartDeliveryPreferenceInput delivery;

    /**
     * Wallet preferences are used to populate relevant payment fields in the checkout flow.
     * Accepted value: `["shop_pay"]`.
     *   
     * The input must not contain more than `250` values.
     */
    private List<String> wallet;

    public CartPreferencesInput build() {
      CartPreferencesInput result = new CartPreferencesInput();
      result.delivery = this.delivery;
      result.wallet = this.wallet;
      return result;
    }

    /**
     * Delivery preferences can be used to prefill the delivery section in at checkout.
     */
    public Builder delivery(CartDeliveryPreferenceInput delivery) {
      this.delivery = delivery;
      return this;
    }

    /**
     * Wallet preferences are used to populate relevant payment fields in the checkout flow.
     * Accepted value: `["shop_pay"]`.
     *   
     * The input must not contain more than `250` values.
     */
    public Builder wallet(List<String> wallet) {
      this.wallet = wallet;
      return this;
    }
  }
}

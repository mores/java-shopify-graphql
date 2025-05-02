package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A set of preferences tied to the buyer interacting with the cart. Preferences
 * are used to prefill fields in at checkout to streamline information collection. 
 * Preferences are not synced back to the cart if they are overwritten.
 */
public class CartPreferences {
  /**
   * Delivery preferences can be used to prefill the delivery section in at checkout.
   */
  private CartDeliveryPreference delivery;

  /**
   * Wallet preferences are used to populate relevant payment fields in the checkout flow.
   * Accepted value: `["shop_pay"]`.
   */
  private List<String> wallet;

  public CartPreferences() {
  }

  /**
   * Delivery preferences can be used to prefill the delivery section in at checkout.
   */
  public CartDeliveryPreference getDelivery() {
    return delivery;
  }

  public void setDelivery(CartDeliveryPreference delivery) {
    this.delivery = delivery;
  }

  /**
   * Wallet preferences are used to populate relevant payment fields in the checkout flow.
   * Accepted value: `["shop_pay"]`.
   */
  public List<String> getWallet() {
    return wallet;
  }

  public void setWallet(List<String> wallet) {
    this.wallet = wallet;
  }

  @Override
  public String toString() {
    return "CartPreferences{delivery='" + delivery + "', wallet='" + wallet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartPreferences that = (CartPreferences) o;
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
    private CartDeliveryPreference delivery;

    /**
     * Wallet preferences are used to populate relevant payment fields in the checkout flow.
     * Accepted value: `["shop_pay"]`.
     */
    private List<String> wallet;

    public CartPreferences build() {
      CartPreferences result = new CartPreferences();
      result.delivery = this.delivery;
      result.wallet = this.wallet;
      return result;
    }

    /**
     * Delivery preferences can be used to prefill the delivery section in at checkout.
     */
    public Builder delivery(CartDeliveryPreference delivery) {
      this.delivery = delivery;
      return this;
    }

    /**
     * Wallet preferences are used to populate relevant payment fields in the checkout flow.
     * Accepted value: `["shop_pay"]`.
     */
    public Builder wallet(List<String> wallet) {
      this.wallet = wallet;
      return this;
    }
  }
}

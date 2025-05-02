package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for submitting a billing address without a selected payment method.
 */
public class CartFreePaymentMethodInput {
  /**
   * The customer's billing address.
   */
  private MailingAddressInput billingAddress;

  public CartFreePaymentMethodInput() {
  }

  /**
   * The customer's billing address.
   */
  public MailingAddressInput getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(MailingAddressInput billingAddress) {
    this.billingAddress = billingAddress;
  }

  @Override
  public String toString() {
    return "CartFreePaymentMethodInput{billingAddress='" + billingAddress + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartFreePaymentMethodInput that = (CartFreePaymentMethodInput) o;
    return Objects.equals(billingAddress, that.billingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customer's billing address.
     */
    private MailingAddressInput billingAddress;

    public CartFreePaymentMethodInput build() {
      CartFreePaymentMethodInput result = new CartFreePaymentMethodInput();
      result.billingAddress = this.billingAddress;
      return result;
    }

    /**
     * The customer's billing address.
     */
    public Builder billingAddress(MailingAddressInput billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }
  }
}

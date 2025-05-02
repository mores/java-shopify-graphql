package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for submitting Shop Pay payment method information for checkout.
 */
public class ShopPayWalletContentInput {
  /**
   * The customer's billing address.
   */
  private MailingAddressInput billingAddress;

  /**
   * Session token for transaction.
   */
  private String sessionToken;

  public ShopPayWalletContentInput() {
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

  /**
   * Session token for transaction.
   */
  public String getSessionToken() {
    return sessionToken;
  }

  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }

  @Override
  public String toString() {
    return "ShopPayWalletContentInput{billingAddress='" + billingAddress + "', sessionToken='" + sessionToken + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayWalletContentInput that = (ShopPayWalletContentInput) o;
    return Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(sessionToken, that.sessionToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, sessionToken);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The customer's billing address.
     */
    private MailingAddressInput billingAddress;

    /**
     * Session token for transaction.
     */
    private String sessionToken;

    public ShopPayWalletContentInput build() {
      ShopPayWalletContentInput result = new ShopPayWalletContentInput();
      result.billingAddress = this.billingAddress;
      result.sessionToken = this.sessionToken;
      return result;
    }

    /**
     * The customer's billing address.
     */
    public Builder billingAddress(MailingAddressInput billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    /**
     * Session token for transaction.
     */
    public Builder sessionToken(String sessionToken) {
      this.sessionToken = sessionToken;
      return this;
    }
  }
}

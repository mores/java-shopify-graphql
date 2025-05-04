package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Settings related to payments.
 */
public class PaymentSettings {
  /**
   * List of the digital wallets which the shop supports.
   */
  private List<DigitalWallet> supportedDigitalWallets;

  public PaymentSettings() {
  }

  /**
   * List of the digital wallets which the shop supports.
   */
  public List<DigitalWallet> getSupportedDigitalWallets() {
    return supportedDigitalWallets;
  }

  public void setSupportedDigitalWallets(List<DigitalWallet> supportedDigitalWallets) {
    this.supportedDigitalWallets = supportedDigitalWallets;
  }

  @Override
  public String toString() {
    return "PaymentSettings{supportedDigitalWallets='" + supportedDigitalWallets + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentSettings that = (PaymentSettings) o;
    return Objects.equals(supportedDigitalWallets, that.supportedDigitalWallets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedDigitalWallets);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * List of the digital wallets which the shop supports.
     */
    private List<DigitalWallet> supportedDigitalWallets;

    public PaymentSettings build() {
      PaymentSettings result = new PaymentSettings();
      result.supportedDigitalWallets = this.supportedDigitalWallets;
      return result;
    }

    /**
     * List of the digital wallets which the shop supports.
     */
    public Builder supportedDigitalWallets(List<DigitalWallet> supportedDigitalWallets) {
      this.supportedDigitalWallets = supportedDigitalWallets;
      return this;
    }
  }
}

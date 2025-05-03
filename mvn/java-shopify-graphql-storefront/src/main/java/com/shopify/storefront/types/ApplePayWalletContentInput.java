package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for submitting Apple Pay payment method information for checkout.
 */
public class ApplePayWalletContentInput {
  /**
   * The customer's billing address.
   */
  private MailingAddressInput billingAddress;

  /**
   * The data for the Apple Pay wallet.
   */
  private String data;

  /**
   * The header data for the Apple Pay wallet.
   */
  private ApplePayWalletHeaderInput header;

  /**
   * The last digits of the card used to create the payment.
   */
  private String lastDigits;

  /**
   * The signature for the Apple Pay wallet.
   */
  private String signature;

  /**
   * The version for the Apple Pay wallet.
   */
  private String version;

  public ApplePayWalletContentInput() {
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
   * The data for the Apple Pay wallet.
   */
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  /**
   * The header data for the Apple Pay wallet.
   */
  public ApplePayWalletHeaderInput getHeader() {
    return header;
  }

  public void setHeader(ApplePayWalletHeaderInput header) {
    this.header = header;
  }

  /**
   * The last digits of the card used to create the payment.
   */
  public String getLastDigits() {
    return lastDigits;
  }

  public void setLastDigits(String lastDigits) {
    this.lastDigits = lastDigits;
  }

  /**
   * The signature for the Apple Pay wallet.
   */
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  /**
   * The version for the Apple Pay wallet.
   */
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public String toString() {
    return "ApplePayWalletContentInput{billingAddress='" + billingAddress + "', data='" + data + "', header='" + header + "', lastDigits='" + lastDigits + "', signature='" + signature + "', version='" + version + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApplePayWalletContentInput that = (ApplePayWalletContentInput) o;
    return Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(data, that.data) &&
        Objects.equals(header, that.header) &&
        Objects.equals(lastDigits, that.lastDigits) &&
        Objects.equals(signature, that.signature) &&
        Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, data, header, lastDigits, signature, version);
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
     * The data for the Apple Pay wallet.
     */
    private String data;

    /**
     * The header data for the Apple Pay wallet.
     */
    private ApplePayWalletHeaderInput header;

    /**
     * The last digits of the card used to create the payment.
     */
    private String lastDigits;

    /**
     * The signature for the Apple Pay wallet.
     */
    private String signature;

    /**
     * The version for the Apple Pay wallet.
     */
    private String version;

    public ApplePayWalletContentInput build() {
      ApplePayWalletContentInput result = new ApplePayWalletContentInput();
      result.billingAddress = this.billingAddress;
      result.data = this.data;
      result.header = this.header;
      result.lastDigits = this.lastDigits;
      result.signature = this.signature;
      result.version = this.version;
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
     * The data for the Apple Pay wallet.
     */
    public Builder data(String data) {
      this.data = data;
      return this;
    }

    /**
     * The header data for the Apple Pay wallet.
     */
    public Builder header(ApplePayWalletHeaderInput header) {
      this.header = header;
      return this;
    }

    /**
     * The last digits of the card used to create the payment.
     */
    public Builder lastDigits(String lastDigits) {
      this.lastDigits = lastDigits;
      return this;
    }

    /**
     * The signature for the Apple Pay wallet.
     */
    public Builder signature(String signature) {
      this.signature = signature;
      return this;
    }

    /**
     * The version for the Apple Pay wallet.
     */
    public Builder version(String version) {
      this.version = version;
      return this;
    }
  }
}

package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for submitting wallet payment method information for checkout.
 */
public class ApplePayWalletHeaderInput {
  /**
   * The application data for the Apple Pay wallet.
   */
  private String applicationData;

  /**
   * The ephemeral public key for the Apple Pay wallet.
   */
  private String ephemeralPublicKey;

  /**
   * The public key hash for the Apple Pay wallet.
   */
  private String publicKeyHash;

  /**
   * The transaction ID for the Apple Pay wallet.
   */
  private String transactionId;

  public ApplePayWalletHeaderInput() {
  }

  /**
   * The application data for the Apple Pay wallet.
   */
  public String getApplicationData() {
    return applicationData;
  }

  public void setApplicationData(String applicationData) {
    this.applicationData = applicationData;
  }

  /**
   * The ephemeral public key for the Apple Pay wallet.
   */
  public String getEphemeralPublicKey() {
    return ephemeralPublicKey;
  }

  public void setEphemeralPublicKey(String ephemeralPublicKey) {
    this.ephemeralPublicKey = ephemeralPublicKey;
  }

  /**
   * The public key hash for the Apple Pay wallet.
   */
  public String getPublicKeyHash() {
    return publicKeyHash;
  }

  public void setPublicKeyHash(String publicKeyHash) {
    this.publicKeyHash = publicKeyHash;
  }

  /**
   * The transaction ID for the Apple Pay wallet.
   */
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  @Override
  public String toString() {
    return "ApplePayWalletHeaderInput{applicationData='" + applicationData + "', ephemeralPublicKey='" + ephemeralPublicKey + "', publicKeyHash='" + publicKeyHash + "', transactionId='" + transactionId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApplePayWalletHeaderInput that = (ApplePayWalletHeaderInput) o;
    return Objects.equals(applicationData, that.applicationData) &&
        Objects.equals(ephemeralPublicKey, that.ephemeralPublicKey) &&
        Objects.equals(publicKeyHash, that.publicKeyHash) &&
        Objects.equals(transactionId, that.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationData, ephemeralPublicKey, publicKeyHash, transactionId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The application data for the Apple Pay wallet.
     */
    private String applicationData;

    /**
     * The ephemeral public key for the Apple Pay wallet.
     */
    private String ephemeralPublicKey;

    /**
     * The public key hash for the Apple Pay wallet.
     */
    private String publicKeyHash;

    /**
     * The transaction ID for the Apple Pay wallet.
     */
    private String transactionId;

    public ApplePayWalletHeaderInput build() {
      ApplePayWalletHeaderInput result = new ApplePayWalletHeaderInput();
      result.applicationData = this.applicationData;
      result.ephemeralPublicKey = this.ephemeralPublicKey;
      result.publicKeyHash = this.publicKeyHash;
      result.transactionId = this.transactionId;
      return result;
    }

    /**
     * The application data for the Apple Pay wallet.
     */
    public Builder applicationData(String applicationData) {
      this.applicationData = applicationData;
      return this;
    }

    /**
     * The ephemeral public key for the Apple Pay wallet.
     */
    public Builder ephemeralPublicKey(String ephemeralPublicKey) {
      this.ephemeralPublicKey = ephemeralPublicKey;
      return this;
    }

    /**
     * The public key hash for the Apple Pay wallet.
     */
    public Builder publicKeyHash(String publicKeyHash) {
      this.publicKeyHash = publicKeyHash;
      return this;
    }

    /**
     * The transaction ID for the Apple Pay wallet.
     */
    public Builder transactionId(String transactionId) {
      this.transactionId = transactionId;
      return this;
    }
  }
}

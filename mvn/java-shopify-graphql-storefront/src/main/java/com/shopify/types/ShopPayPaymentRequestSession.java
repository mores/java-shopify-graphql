package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a Shop Pay payment request session.
 */
public class ShopPayPaymentRequestSession {
  /**
   * The checkout URL of the Shop Pay payment request session.
   */
  private String checkoutUrl;

  /**
   * The payment request associated with the Shop Pay payment request session.
   */
  private ShopPayPaymentRequest paymentRequest;

  /**
   * The source identifier of the Shop Pay payment request session.
   */
  private String sourceIdentifier;

  /**
   * The token of the Shop Pay payment request session.
   */
  private String token;

  public ShopPayPaymentRequestSession() {
  }

  /**
   * The checkout URL of the Shop Pay payment request session.
   */
  public String getCheckoutUrl() {
    return checkoutUrl;
  }

  public void setCheckoutUrl(String checkoutUrl) {
    this.checkoutUrl = checkoutUrl;
  }

  /**
   * The payment request associated with the Shop Pay payment request session.
   */
  public ShopPayPaymentRequest getPaymentRequest() {
    return paymentRequest;
  }

  public void setPaymentRequest(ShopPayPaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
  }

  /**
   * The source identifier of the Shop Pay payment request session.
   */
  public String getSourceIdentifier() {
    return sourceIdentifier;
  }

  public void setSourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = sourceIdentifier;
  }

  /**
   * The token of the Shop Pay payment request session.
   */
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestSession{checkoutUrl='" + checkoutUrl + "', paymentRequest='" + paymentRequest + "', sourceIdentifier='" + sourceIdentifier + "', token='" + token + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestSession that = (ShopPayPaymentRequestSession) o;
    return Objects.equals(checkoutUrl, that.checkoutUrl) &&
        Objects.equals(paymentRequest, that.paymentRequest) &&
        Objects.equals(sourceIdentifier, that.sourceIdentifier) &&
        Objects.equals(token, that.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutUrl, paymentRequest, sourceIdentifier, token);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The checkout URL of the Shop Pay payment request session.
     */
    private String checkoutUrl;

    /**
     * The payment request associated with the Shop Pay payment request session.
     */
    private ShopPayPaymentRequest paymentRequest;

    /**
     * The source identifier of the Shop Pay payment request session.
     */
    private String sourceIdentifier;

    /**
     * The token of the Shop Pay payment request session.
     */
    private String token;

    public ShopPayPaymentRequestSession build() {
      ShopPayPaymentRequestSession result = new ShopPayPaymentRequestSession();
      result.checkoutUrl = this.checkoutUrl;
      result.paymentRequest = this.paymentRequest;
      result.sourceIdentifier = this.sourceIdentifier;
      result.token = this.token;
      return result;
    }

    /**
     * The checkout URL of the Shop Pay payment request session.
     */
    public Builder checkoutUrl(String checkoutUrl) {
      this.checkoutUrl = checkoutUrl;
      return this;
    }

    /**
     * The payment request associated with the Shop Pay payment request session.
     */
    public Builder paymentRequest(ShopPayPaymentRequest paymentRequest) {
      this.paymentRequest = paymentRequest;
      return this;
    }

    /**
     * The source identifier of the Shop Pay payment request session.
     */
    public Builder sourceIdentifier(String sourceIdentifier) {
      this.sourceIdentifier = sourceIdentifier;
      return this;
    }

    /**
     * The token of the Shop Pay payment request session.
     */
    public Builder token(String token) {
      this.token = token;
      return this;
    }
  }
}

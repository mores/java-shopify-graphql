package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a receipt for a Shop Pay payment request.
 */
public class ShopPayPaymentRequestReceipt {
  /**
   * The payment request object.
   */
  private ShopPayPaymentRequest paymentRequest;

  /**
   * The processing status.
   */
  private String processingStatusType;

  /**
   * The token of the receipt.
   */
  private String token;

  public ShopPayPaymentRequestReceipt() {
  }

  /**
   * The payment request object.
   */
  public ShopPayPaymentRequest getPaymentRequest() {
    return paymentRequest;
  }

  public void setPaymentRequest(ShopPayPaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
  }

  /**
   * The processing status.
   */
  public String getProcessingStatusType() {
    return processingStatusType;
  }

  public void setProcessingStatusType(String processingStatusType) {
    this.processingStatusType = processingStatusType;
  }

  /**
   * The token of the receipt.
   */
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestReceipt{paymentRequest='" + paymentRequest + "', processingStatusType='" + processingStatusType + "', token='" + token + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestReceipt that = (ShopPayPaymentRequestReceipt) o;
    return Objects.equals(paymentRequest, that.paymentRequest) &&
        Objects.equals(processingStatusType, that.processingStatusType) &&
        Objects.equals(token, that.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentRequest, processingStatusType, token);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The payment request object.
     */
    private ShopPayPaymentRequest paymentRequest;

    /**
     * The processing status.
     */
    private String processingStatusType;

    /**
     * The token of the receipt.
     */
    private String token;

    public ShopPayPaymentRequestReceipt build() {
      ShopPayPaymentRequestReceipt result = new ShopPayPaymentRequestReceipt();
      result.paymentRequest = this.paymentRequest;
      result.processingStatusType = this.processingStatusType;
      result.token = this.token;
      return result;
    }

    /**
     * The payment request object.
     */
    public Builder paymentRequest(ShopPayPaymentRequest paymentRequest) {
      this.paymentRequest = paymentRequest;
      return this;
    }

    /**
     * The processing status.
     */
    public Builder processingStatusType(String processingStatusType) {
      this.processingStatusType = processingStatusType;
      return this;
    }

    /**
     * The token of the receipt.
     */
    public Builder token(String token) {
      this.token = token;
      return this;
    }
  }
}

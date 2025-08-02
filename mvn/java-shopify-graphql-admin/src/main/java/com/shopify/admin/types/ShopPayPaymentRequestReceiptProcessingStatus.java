package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The processing status of a Shop Pay payment request.
 * Represents the different states a payment request can be in during its lifecycle,
 * from initial creation through to completion or failure.
 */
public class ShopPayPaymentRequestReceiptProcessingStatus {
  /**
   * A standardized error code, independent of the payment provider.
   */
  private ShopPayPaymentRequestReceiptProcessingStatusErrorCode errorCode;

  /**
   * The message of the payment request receipt.
   */
  private String message;

  /**
   * The state of the payment request receipt.
   */
  private ShopPayPaymentRequestReceiptProcessingStatusState state;

  public ShopPayPaymentRequestReceiptProcessingStatus() {
  }

  /**
   * A standardized error code, independent of the payment provider.
   */
  public ShopPayPaymentRequestReceiptProcessingStatusErrorCode getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(ShopPayPaymentRequestReceiptProcessingStatusErrorCode errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * The message of the payment request receipt.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The state of the payment request receipt.
   */
  public ShopPayPaymentRequestReceiptProcessingStatusState getState() {
    return state;
  }

  public void setState(ShopPayPaymentRequestReceiptProcessingStatusState state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestReceiptProcessingStatus{errorCode='" + errorCode + "', message='" + message + "', state='" + state + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestReceiptProcessingStatus that = (ShopPayPaymentRequestReceiptProcessingStatus) o;
    return Objects.equals(errorCode, that.errorCode) &&
        Objects.equals(message, that.message) &&
        Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message, state);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A standardized error code, independent of the payment provider.
     */
    private ShopPayPaymentRequestReceiptProcessingStatusErrorCode errorCode;

    /**
     * The message of the payment request receipt.
     */
    private String message;

    /**
     * The state of the payment request receipt.
     */
    private ShopPayPaymentRequestReceiptProcessingStatusState state;

    public ShopPayPaymentRequestReceiptProcessingStatus build() {
      ShopPayPaymentRequestReceiptProcessingStatus result = new ShopPayPaymentRequestReceiptProcessingStatus();
      result.errorCode = this.errorCode;
      result.message = this.message;
      result.state = this.state;
      return result;
    }

    /**
     * A standardized error code, independent of the payment provider.
     */
    public Builder errorCode(ShopPayPaymentRequestReceiptProcessingStatusErrorCode errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    /**
     * The message of the payment request receipt.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * The state of the payment request receipt.
     */
    public Builder state(ShopPayPaymentRequestReceiptProcessingStatusState state) {
      this.state = state;
      return this;
    }
  }
}

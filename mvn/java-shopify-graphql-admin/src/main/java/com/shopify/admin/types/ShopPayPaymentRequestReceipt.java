package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The receipt of Shop Pay payment request session submission.
 */
public class ShopPayPaymentRequestReceipt {
  /**
   * The date and time when the payment request receipt was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The order that's associated with the payment request receipt.
   */
  private Order order;

  /**
   * The shop pay payment request object.
   */
  private ShopPayPaymentRequest paymentRequest;

  /**
   * The status of the payment request session submission.
   */
  private ShopPayPaymentRequestReceiptProcessingStatus processingStatus;

  /**
   * The source identifier provided in the `ShopPayPaymentRequestSessionCreate` mutation.
   */
  private String sourceIdentifier;

  /**
   * The token of the receipt, initially returned by an `ShopPayPaymentRequestSessionSubmit` mutation.
   */
  private String token;

  public ShopPayPaymentRequestReceipt() {
  }

  /**
   * The date and time when the payment request receipt was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The order that's associated with the payment request receipt.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * The shop pay payment request object.
   */
  public ShopPayPaymentRequest getPaymentRequest() {
    return paymentRequest;
  }

  public void setPaymentRequest(ShopPayPaymentRequest paymentRequest) {
    this.paymentRequest = paymentRequest;
  }

  /**
   * The status of the payment request session submission.
   */
  public ShopPayPaymentRequestReceiptProcessingStatus getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(ShopPayPaymentRequestReceiptProcessingStatus processingStatus) {
    this.processingStatus = processingStatus;
  }

  /**
   * The source identifier provided in the `ShopPayPaymentRequestSessionCreate` mutation.
   */
  public String getSourceIdentifier() {
    return sourceIdentifier;
  }

  public void setSourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = sourceIdentifier;
  }

  /**
   * The token of the receipt, initially returned by an `ShopPayPaymentRequestSessionSubmit` mutation.
   */
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public String toString() {
    return "ShopPayPaymentRequestReceipt{createdAt='" + createdAt + "', order='" + order + "', paymentRequest='" + paymentRequest + "', processingStatus='" + processingStatus + "', sourceIdentifier='" + sourceIdentifier + "', token='" + token + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayPaymentRequestReceipt that = (ShopPayPaymentRequestReceipt) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(order, that.order) &&
        Objects.equals(paymentRequest, that.paymentRequest) &&
        Objects.equals(processingStatus, that.processingStatus) &&
        Objects.equals(sourceIdentifier, that.sourceIdentifier) &&
        Objects.equals(token, that.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, order, paymentRequest, processingStatus, sourceIdentifier, token);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the payment request receipt was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The order that's associated with the payment request receipt.
     */
    private Order order;

    /**
     * The shop pay payment request object.
     */
    private ShopPayPaymentRequest paymentRequest;

    /**
     * The status of the payment request session submission.
     */
    private ShopPayPaymentRequestReceiptProcessingStatus processingStatus;

    /**
     * The source identifier provided in the `ShopPayPaymentRequestSessionCreate` mutation.
     */
    private String sourceIdentifier;

    /**
     * The token of the receipt, initially returned by an `ShopPayPaymentRequestSessionSubmit` mutation.
     */
    private String token;

    public ShopPayPaymentRequestReceipt build() {
      ShopPayPaymentRequestReceipt result = new ShopPayPaymentRequestReceipt();
      result.createdAt = this.createdAt;
      result.order = this.order;
      result.paymentRequest = this.paymentRequest;
      result.processingStatus = this.processingStatus;
      result.sourceIdentifier = this.sourceIdentifier;
      result.token = this.token;
      return result;
    }

    /**
     * The date and time when the payment request receipt was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The order that's associated with the payment request receipt.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The shop pay payment request object.
     */
    public Builder paymentRequest(ShopPayPaymentRequest paymentRequest) {
      this.paymentRequest = paymentRequest;
      return this;
    }

    /**
     * The status of the payment request session submission.
     */
    public Builder processingStatus(ShopPayPaymentRequestReceiptProcessingStatus processingStatus) {
      this.processingStatus = processingStatus;
      return this;
    }

    /**
     * The source identifier provided in the `ShopPayPaymentRequestSessionCreate` mutation.
     */
    public Builder sourceIdentifier(String sourceIdentifier) {
      this.sourceIdentifier = sourceIdentifier;
      return this;
    }

    /**
     * The token of the receipt, initially returned by an `ShopPayPaymentRequestSessionSubmit` mutation.
     */
    public Builder token(String token) {
      this.token = token;
      return this;
    }
  }
}

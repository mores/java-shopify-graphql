package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The status of a customer's payment for an order.
 */
public class OrderPaymentStatus {
  /**
   * A message describing an error during the asynchronous processing of a payment.
   */
  private String errorMessage;

  /**
   * The ID of the payment, initially returned by an `orderCreateMandatePayment` or `orderCreatePayment` mutation.
   */
  private String paymentReferenceId;

  /**
   * The status of the payment.
   */
  private OrderPaymentStatusResult status;

  /**
   * The transaction associated with the payment.
   */
  private List<OrderTransaction> transactions;

  /**
   * A translated message describing an error during the asynchronous processing of a payment.
   */
  private String translatedErrorMessage;

  public OrderPaymentStatus() {
  }

  /**
   * A message describing an error during the asynchronous processing of a payment.
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * The ID of the payment, initially returned by an `orderCreateMandatePayment` or `orderCreatePayment` mutation.
   */
  public String getPaymentReferenceId() {
    return paymentReferenceId;
  }

  public void setPaymentReferenceId(String paymentReferenceId) {
    this.paymentReferenceId = paymentReferenceId;
  }

  /**
   * The status of the payment.
   */
  public OrderPaymentStatusResult getStatus() {
    return status;
  }

  public void setStatus(OrderPaymentStatusResult status) {
    this.status = status;
  }

  /**
   * The transaction associated with the payment.
   */
  public List<OrderTransaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<OrderTransaction> transactions) {
    this.transactions = transactions;
  }

  /**
   * A translated message describing an error during the asynchronous processing of a payment.
   */
  public String getTranslatedErrorMessage() {
    return translatedErrorMessage;
  }

  public void setTranslatedErrorMessage(String translatedErrorMessage) {
    this.translatedErrorMessage = translatedErrorMessage;
  }

  @Override
  public String toString() {
    return "OrderPaymentStatus{errorMessage='" + errorMessage + "', paymentReferenceId='" + paymentReferenceId + "', status='" + status + "', transactions='" + transactions + "', translatedErrorMessage='" + translatedErrorMessage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderPaymentStatus that = (OrderPaymentStatus) o;
    return Objects.equals(errorMessage, that.errorMessage) &&
        Objects.equals(paymentReferenceId, that.paymentReferenceId) &&
        Objects.equals(status, that.status) &&
        Objects.equals(transactions, that.transactions) &&
        Objects.equals(translatedErrorMessage, that.translatedErrorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, paymentReferenceId, status, transactions, translatedErrorMessage);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A message describing an error during the asynchronous processing of a payment.
     */
    private String errorMessage;

    /**
     * The ID of the payment, initially returned by an `orderCreateMandatePayment` or `orderCreatePayment` mutation.
     */
    private String paymentReferenceId;

    /**
     * The status of the payment.
     */
    private OrderPaymentStatusResult status;

    /**
     * The transaction associated with the payment.
     */
    private List<OrderTransaction> transactions;

    /**
     * A translated message describing an error during the asynchronous processing of a payment.
     */
    private String translatedErrorMessage;

    public OrderPaymentStatus build() {
      OrderPaymentStatus result = new OrderPaymentStatus();
      result.errorMessage = this.errorMessage;
      result.paymentReferenceId = this.paymentReferenceId;
      result.status = this.status;
      result.transactions = this.transactions;
      result.translatedErrorMessage = this.translatedErrorMessage;
      return result;
    }

    /**
     * A message describing an error during the asynchronous processing of a payment.
     */
    public Builder errorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
      return this;
    }

    /**
     * The ID of the payment, initially returned by an `orderCreateMandatePayment` or `orderCreatePayment` mutation.
     */
    public Builder paymentReferenceId(String paymentReferenceId) {
      this.paymentReferenceId = paymentReferenceId;
      return this;
    }

    /**
     * The status of the payment.
     */
    public Builder status(OrderPaymentStatusResult status) {
      this.status = status;
      return this;
    }

    /**
     * The transaction associated with the payment.
     */
    public Builder transactions(List<OrderTransaction> transactions) {
      this.transactions = transactions;
      return this;
    }

    /**
     * A translated message describing an error during the asynchronous processing of a payment.
     */
    public Builder translatedErrorMessage(String translatedErrorMessage) {
      this.translatedErrorMessage = translatedErrorMessage;
      return this;
    }
  }
}

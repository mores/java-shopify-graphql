package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the authorized transaction to capture and the total amount to capture from it.
 */
public class OrderCaptureInput {
  
  private String id;

  /**
   * The ID of the authorized transaction to capture.
   */
  private String parentTransactionId;

  /**
   * The amount to capture. The capture amount can't be greater than the amount of the authorized transaction.
   */
  private String amount;

  
  private CurrencyCode currency;

  /**
   * Indicates whether this is to be the final capture for the order transaction. Only applies to
   * Shopify Payments authorizations which are multi-capturable. If true, any uncaptured amount from the
   * authorization will be voided after the capture is completed. If false, the authorization will remain open
   * for future captures.
   *   
   * For multi-capturable authorizations, this defaults to false if not provided. This field has no effect on
   * authorizations which aren't multi-capturable (can only be captured once), or on other types of
   * transactions.
   */
  private Boolean finalCapture;

  public OrderCaptureInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The ID of the authorized transaction to capture.
   */
  public String getParentTransactionId() {
    return parentTransactionId;
  }

  public void setParentTransactionId(String parentTransactionId) {
    this.parentTransactionId = parentTransactionId;
  }

  /**
   * The amount to capture. The capture amount can't be greater than the amount of the authorized transaction.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  /**
   * Indicates whether this is to be the final capture for the order transaction. Only applies to
   * Shopify Payments authorizations which are multi-capturable. If true, any uncaptured amount from the
   * authorization will be voided after the capture is completed. If false, the authorization will remain open
   * for future captures.
   *   
   * For multi-capturable authorizations, this defaults to false if not provided. This field has no effect on
   * authorizations which aren't multi-capturable (can only be captured once), or on other types of
   * transactions.
   */
  public Boolean getFinalCapture() {
    return finalCapture;
  }

  public void setFinalCapture(Boolean finalCapture) {
    this.finalCapture = finalCapture;
  }

  @Override
  public String toString() {
    return "OrderCaptureInput{id='" + id + "', parentTransactionId='" + parentTransactionId + "', amount='" + amount + "', currency='" + currency + "', finalCapture='" + finalCapture + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCaptureInput that = (OrderCaptureInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(parentTransactionId, that.parentTransactionId) &&
        Objects.equals(amount, that.amount) &&
        Objects.equals(currency, that.currency) &&
        Objects.equals(finalCapture, that.finalCapture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentTransactionId, amount, currency, finalCapture);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    /**
     * The ID of the authorized transaction to capture.
     */
    private String parentTransactionId;

    /**
     * The amount to capture. The capture amount can't be greater than the amount of the authorized transaction.
     */
    private String amount;

    
    private CurrencyCode currency;

    /**
     * Indicates whether this is to be the final capture for the order transaction. Only applies to
     * Shopify Payments authorizations which are multi-capturable. If true, any uncaptured amount from the
     * authorization will be voided after the capture is completed. If false, the authorization will remain open
     * for future captures.
     *   
     * For multi-capturable authorizations, this defaults to false if not provided. This field has no effect on
     * authorizations which aren't multi-capturable (can only be captured once), or on other types of
     * transactions.
     */
    private Boolean finalCapture;

    public OrderCaptureInput build() {
      OrderCaptureInput result = new OrderCaptureInput();
      result.id = this.id;
      result.parentTransactionId = this.parentTransactionId;
      result.amount = this.amount;
      result.currency = this.currency;
      result.finalCapture = this.finalCapture;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The ID of the authorized transaction to capture.
     */
    public Builder parentTransactionId(String parentTransactionId) {
      this.parentTransactionId = parentTransactionId;
      return this;
    }

    /**
     * The amount to capture. The capture amount can't be greater than the amount of the authorized transaction.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }

    /**
     * Indicates whether this is to be the final capture for the order transaction. Only applies to
     * Shopify Payments authorizations which are multi-capturable. If true, any uncaptured amount from the
     * authorization will be voided after the capture is completed. If false, the authorization will remain open
     * for future captures.
     *   
     * For multi-capturable authorizations, this defaults to false if not provided. This field has no effect on
     * authorizations which aren't multi-capturable (can only be captured once), or on other types of
     * transactions.
     */
    public Builder finalCapture(Boolean finalCapture) {
      this.finalCapture = finalCapture;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the information needed to create an order transaction.
 */
public class OrderTransactionInput {
  /**
   * The amount of money for this transaction.
   */
  private String amount;

  /**
   * The payment gateway to use for this transaction.
   */
  private String gateway;

  /**
   * The kind of transaction.
   */
  private OrderTransactionKind kind;

  /**
   * The ID of the order associated with the transaction.
   */
  private String orderId;

  /**
   * The ID of the optional parent transaction, for example the authorization of a capture.
   */
  private String parentId;

  public OrderTransactionInput() {
  }

  /**
   * The amount of money for this transaction.
   */
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * The payment gateway to use for this transaction.
   */
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  /**
   * The kind of transaction.
   */
  public OrderTransactionKind getKind() {
    return kind;
  }

  public void setKind(OrderTransactionKind kind) {
    this.kind = kind;
  }

  /**
   * The ID of the order associated with the transaction.
   */
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * The ID of the optional parent transaction, for example the authorization of a capture.
   */
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  @Override
  public String toString() {
    return "OrderTransactionInput{amount='" + amount + "', gateway='" + gateway + "', kind='" + kind + "', orderId='" + orderId + "', parentId='" + parentId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderTransactionInput that = (OrderTransactionInput) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(gateway, that.gateway) &&
        Objects.equals(kind, that.kind) &&
        Objects.equals(orderId, that.orderId) &&
        Objects.equals(parentId, that.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, gateway, kind, orderId, parentId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount of money for this transaction.
     */
    private String amount;

    /**
     * The payment gateway to use for this transaction.
     */
    private String gateway;

    /**
     * The kind of transaction.
     */
    private OrderTransactionKind kind;

    /**
     * The ID of the order associated with the transaction.
     */
    private String orderId;

    /**
     * The ID of the optional parent transaction, for example the authorization of a capture.
     */
    private String parentId;

    public OrderTransactionInput build() {
      OrderTransactionInput result = new OrderTransactionInput();
      result.amount = this.amount;
      result.gateway = this.gateway;
      result.kind = this.kind;
      result.orderId = this.orderId;
      result.parentId = this.parentId;
      return result;
    }

    /**
     * The amount of money for this transaction.
     */
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The payment gateway to use for this transaction.
     */
    public Builder gateway(String gateway) {
      this.gateway = gateway;
      return this;
    }

    /**
     * The kind of transaction.
     */
    public Builder kind(OrderTransactionKind kind) {
      this.kind = kind;
      return this;
    }

    /**
     * The ID of the order associated with the transaction.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * The ID of the optional parent transaction, for example the authorization of a capture.
     */
    public Builder parentId(String parentId) {
      this.parentId = parentId;
      return this;
    }
  }
}

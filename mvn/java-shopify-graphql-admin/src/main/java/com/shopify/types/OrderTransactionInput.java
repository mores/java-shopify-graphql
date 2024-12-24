package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OrderTransactionInput {
  
  private String amount;

  
  private String gateway;

  
  private OrderTransactionKind kind;

  
  private String orderId;

  /**
   * The ID of the optional parent transaction, for example the authorization of a capture.
   */
  private String parentId;

  public OrderTransactionInput() {
  }

  
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  
  public OrderTransactionKind getKind() {
    return kind;
  }

  public void setKind(OrderTransactionKind kind) {
    this.kind = kind;
  }

  
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
    
    private String amount;

    
    private String gateway;

    
    private OrderTransactionKind kind;

    
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

    
    public Builder amount(String amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder gateway(String gateway) {
      this.gateway = gateway;
      return this;
    }

    
    public Builder kind(OrderTransactionKind kind) {
      this.kind = kind;
      return this;
    }

    
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

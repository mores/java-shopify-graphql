package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class OrderCreateOrderTransactionInput {
  
  private MoneyBagInput amountSet;

  /**
   * The authorization code associated with the transaction.
   */
  private String authorizationCode;

  
  private String deviceId;

  
  private String gateway;

  
  private String giftCardId;

  
  private OrderTransactionKind kind = OrderTransactionKind.SALE;

  
  private String locationId;

  
  private OffsetDateTime processedAt;

  
  private String receiptJson;

  
  private OrderTransactionStatus status = OrderTransactionStatus.SUCCESS;

  
  private Boolean test = false;

  
  private String userId;

  public OrderCreateOrderTransactionInput() {
  }

  
  public MoneyBagInput getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBagInput amountSet) {
    this.amountSet = amountSet;
  }

  /**
   * The authorization code associated with the transaction.
   */
  public String getAuthorizationCode() {
    return authorizationCode;
  }

  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  
  public String getGiftCardId() {
    return giftCardId;
  }

  public void setGiftCardId(String giftCardId) {
    this.giftCardId = giftCardId;
  }

  
  public OrderTransactionKind getKind() {
    return kind;
  }

  public void setKind(OrderTransactionKind kind) {
    this.kind = kind;
  }

  
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  
  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
  }

  
  public String getReceiptJson() {
    return receiptJson;
  }

  public void setReceiptJson(String receiptJson) {
    this.receiptJson = receiptJson;
  }

  
  public OrderTransactionStatus getStatus() {
    return status;
  }

  public void setStatus(OrderTransactionStatus status) {
    this.status = status;
  }

  
  public Boolean getTest() {
    return test;
  }

  public void setTest(Boolean test) {
    this.test = test;
  }

  
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public String toString() {
    return "OrderCreateOrderTransactionInput{amountSet='" + amountSet + "', authorizationCode='" + authorizationCode + "', deviceId='" + deviceId + "', gateway='" + gateway + "', giftCardId='" + giftCardId + "', kind='" + kind + "', locationId='" + locationId + "', processedAt='" + processedAt + "', receiptJson='" + receiptJson + "', status='" + status + "', test='" + test + "', userId='" + userId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateOrderTransactionInput that = (OrderCreateOrderTransactionInput) o;
    return Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(authorizationCode, that.authorizationCode) &&
        Objects.equals(deviceId, that.deviceId) &&
        Objects.equals(gateway, that.gateway) &&
        Objects.equals(giftCardId, that.giftCardId) &&
        Objects.equals(kind, that.kind) &&
        Objects.equals(locationId, that.locationId) &&
        Objects.equals(processedAt, that.processedAt) &&
        Objects.equals(receiptJson, that.receiptJson) &&
        Objects.equals(status, that.status) &&
        Objects.equals(test, that.test) &&
        Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountSet, authorizationCode, deviceId, gateway, giftCardId, kind, locationId, processedAt, receiptJson, status, test, userId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyBagInput amountSet;

    /**
     * The authorization code associated with the transaction.
     */
    private String authorizationCode;

    
    private String deviceId;

    
    private String gateway;

    
    private String giftCardId;

    
    private OrderTransactionKind kind = OrderTransactionKind.SALE;

    
    private String locationId;

    
    private OffsetDateTime processedAt;

    
    private String receiptJson;

    
    private OrderTransactionStatus status = OrderTransactionStatus.SUCCESS;

    
    private Boolean test = false;

    
    private String userId;

    public OrderCreateOrderTransactionInput build() {
      OrderCreateOrderTransactionInput result = new OrderCreateOrderTransactionInput();
      result.amountSet = this.amountSet;
      result.authorizationCode = this.authorizationCode;
      result.deviceId = this.deviceId;
      result.gateway = this.gateway;
      result.giftCardId = this.giftCardId;
      result.kind = this.kind;
      result.locationId = this.locationId;
      result.processedAt = this.processedAt;
      result.receiptJson = this.receiptJson;
      result.status = this.status;
      result.test = this.test;
      result.userId = this.userId;
      return result;
    }

    
    public Builder amountSet(MoneyBagInput amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    /**
     * The authorization code associated with the transaction.
     */
    public Builder authorizationCode(String authorizationCode) {
      this.authorizationCode = authorizationCode;
      return this;
    }

    
    public Builder deviceId(String deviceId) {
      this.deviceId = deviceId;
      return this;
    }

    
    public Builder gateway(String gateway) {
      this.gateway = gateway;
      return this;
    }

    
    public Builder giftCardId(String giftCardId) {
      this.giftCardId = giftCardId;
      return this;
    }

    
    public Builder kind(OrderTransactionKind kind) {
      this.kind = kind;
      return this;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }

    
    public Builder receiptJson(String receiptJson) {
      this.receiptJson = receiptJson;
      return this;
    }

    
    public Builder status(OrderTransactionStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder test(Boolean test) {
      this.test = test;
      return this;
    }

    
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }
  }
}

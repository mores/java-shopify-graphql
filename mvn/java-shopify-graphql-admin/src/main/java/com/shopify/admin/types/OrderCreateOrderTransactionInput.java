package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for a transaction to create for an order.
 */
public class OrderCreateOrderTransactionInput {
  /**
   * The amount of the transaction.
   */
  private MoneyBagInput amountSet;

  /**
   * The authorization code associated with the transaction.
   */
  private String authorizationCode;

  /**
   * The ID of the device used to process the transaction.
   */
  private String deviceId;

  /**
   * The name of the gateway the transaction was issued through.
   */
  private String gateway;

  /**
   * The ID of the gift card used for this transaction.
   */
  private String giftCardId;

  /**
   * The kind of transaction.
   */
  private OrderTransactionKind kind = OrderTransactionKind.SALE;

  /**
   * The ID of the location where the transaction was processed.
   */
  private String locationId;

  /**
   * The date and time when the transaction was processed.
   */
  private OffsetDateTime processedAt;

  /**
   * The transaction receipt that the payment gateway attaches to the transaction.
   * The value of this field depends on which payment gateway processed the transaction.
   */
  private String receiptJson;

  /**
   * The status of the transaction.
   */
  private OrderTransactionStatus status = OrderTransactionStatus.SUCCESS;

  /**
   * Whether the transaction is a test transaction.
   */
  private Boolean test = false;

  /**
   * The ID of the user who processed the transaction.
   */
  private String userId;

  public OrderCreateOrderTransactionInput() {
  }

  /**
   * The amount of the transaction.
   */
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

  /**
   * The ID of the device used to process the transaction.
   */
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  /**
   * The name of the gateway the transaction was issued through.
   */
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  /**
   * The ID of the gift card used for this transaction.
   */
  public String getGiftCardId() {
    return giftCardId;
  }

  public void setGiftCardId(String giftCardId) {
    this.giftCardId = giftCardId;
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
   * The ID of the location where the transaction was processed.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  /**
   * The date and time when the transaction was processed.
   */
  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
  }

  /**
   * The transaction receipt that the payment gateway attaches to the transaction.
   * The value of this field depends on which payment gateway processed the transaction.
   */
  public String getReceiptJson() {
    return receiptJson;
  }

  public void setReceiptJson(String receiptJson) {
    this.receiptJson = receiptJson;
  }

  /**
   * The status of the transaction.
   */
  public OrderTransactionStatus getStatus() {
    return status;
  }

  public void setStatus(OrderTransactionStatus status) {
    this.status = status;
  }

  /**
   * Whether the transaction is a test transaction.
   */
  public Boolean getTest() {
    return test;
  }

  public void setTest(Boolean test) {
    this.test = test;
  }

  /**
   * The ID of the user who processed the transaction.
   */
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
    /**
     * The amount of the transaction.
     */
    private MoneyBagInput amountSet;

    /**
     * The authorization code associated with the transaction.
     */
    private String authorizationCode;

    /**
     * The ID of the device used to process the transaction.
     */
    private String deviceId;

    /**
     * The name of the gateway the transaction was issued through.
     */
    private String gateway;

    /**
     * The ID of the gift card used for this transaction.
     */
    private String giftCardId;

    /**
     * The kind of transaction.
     */
    private OrderTransactionKind kind = OrderTransactionKind.SALE;

    /**
     * The ID of the location where the transaction was processed.
     */
    private String locationId;

    /**
     * The date and time when the transaction was processed.
     */
    private OffsetDateTime processedAt;

    /**
     * The transaction receipt that the payment gateway attaches to the transaction.
     * The value of this field depends on which payment gateway processed the transaction.
     */
    private String receiptJson;

    /**
     * The status of the transaction.
     */
    private OrderTransactionStatus status = OrderTransactionStatus.SUCCESS;

    /**
     * Whether the transaction is a test transaction.
     */
    private Boolean test = false;

    /**
     * The ID of the user who processed the transaction.
     */
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

    /**
     * The amount of the transaction.
     */
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

    /**
     * The ID of the device used to process the transaction.
     */
    public Builder deviceId(String deviceId) {
      this.deviceId = deviceId;
      return this;
    }

    /**
     * The name of the gateway the transaction was issued through.
     */
    public Builder gateway(String gateway) {
      this.gateway = gateway;
      return this;
    }

    /**
     * The ID of the gift card used for this transaction.
     */
    public Builder giftCardId(String giftCardId) {
      this.giftCardId = giftCardId;
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
     * The ID of the location where the transaction was processed.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * The date and time when the transaction was processed.
     */
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }

    /**
     * The transaction receipt that the payment gateway attaches to the transaction.
     * The value of this field depends on which payment gateway processed the transaction.
     */
    public Builder receiptJson(String receiptJson) {
      this.receiptJson = receiptJson;
      return this;
    }

    /**
     * The status of the transaction.
     */
    public Builder status(OrderTransactionStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Whether the transaction is a test transaction.
     */
    public Builder test(Boolean test) {
      this.test = test;
      return this;
    }

    /**
     * The ID of the user who processed the transaction.
     */
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }
  }
}

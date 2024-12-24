package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionBillingAttempt implements com.shopify.types.Node {
  
  private OffsetDateTime completedAt;

  
  private OffsetDateTime createdAt;

  
  private SubscriptionBillingAttemptErrorCode errorCode;

  
  private String errorMessage;

  
  private String id;

  
  private String idempotencyKey;

  
  private String nextActionUrl;

  
  private Order order;

  
  private OffsetDateTime originTime;

  
  private String paymentGroupId;

  
  private String paymentSessionId;

  
  private boolean ready;

  
  private SubscriptionContract subscriptionContract;

  
  private OrderTransactionConnection transactions;

  public SubscriptionBillingAttempt() {
  }

  
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public SubscriptionBillingAttemptErrorCode getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(SubscriptionBillingAttemptErrorCode errorCode) {
    this.errorCode = errorCode;
  }

  
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  
  public String getNextActionUrl() {
    return nextActionUrl;
  }

  public void setNextActionUrl(String nextActionUrl) {
    this.nextActionUrl = nextActionUrl;
  }

  
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  
  public OffsetDateTime getOriginTime() {
    return originTime;
  }

  public void setOriginTime(OffsetDateTime originTime) {
    this.originTime = originTime;
  }

  
  public String getPaymentGroupId() {
    return paymentGroupId;
  }

  public void setPaymentGroupId(String paymentGroupId) {
    this.paymentGroupId = paymentGroupId;
  }

  
  public String getPaymentSessionId() {
    return paymentSessionId;
  }

  public void setPaymentSessionId(String paymentSessionId) {
    this.paymentSessionId = paymentSessionId;
  }

  
  public boolean getReady() {
    return ready;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }

  
  public SubscriptionContract getSubscriptionContract() {
    return subscriptionContract;
  }

  public void setSubscriptionContract(SubscriptionContract subscriptionContract) {
    this.subscriptionContract = subscriptionContract;
  }

  
  public OrderTransactionConnection getTransactions() {
    return transactions;
  }

  public void setTransactions(OrderTransactionConnection transactions) {
    this.transactions = transactions;
  }

  @Override
  public String toString() {
    return "SubscriptionBillingAttempt{completedAt='" + completedAt + "', createdAt='" + createdAt + "', errorCode='" + errorCode + "', errorMessage='" + errorMessage + "', id='" + id + "', idempotencyKey='" + idempotencyKey + "', nextActionUrl='" + nextActionUrl + "', order='" + order + "', originTime='" + originTime + "', paymentGroupId='" + paymentGroupId + "', paymentSessionId='" + paymentSessionId + "', ready='" + ready + "', subscriptionContract='" + subscriptionContract + "', transactions='" + transactions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionBillingAttempt that = (SubscriptionBillingAttempt) o;
    return Objects.equals(completedAt, that.completedAt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(errorCode, that.errorCode) &&
        Objects.equals(errorMessage, that.errorMessage) &&
        Objects.equals(id, that.id) &&
        Objects.equals(idempotencyKey, that.idempotencyKey) &&
        Objects.equals(nextActionUrl, that.nextActionUrl) &&
        Objects.equals(order, that.order) &&
        Objects.equals(originTime, that.originTime) &&
        Objects.equals(paymentGroupId, that.paymentGroupId) &&
        Objects.equals(paymentSessionId, that.paymentSessionId) &&
        ready == that.ready &&
        Objects.equals(subscriptionContract, that.subscriptionContract) &&
        Objects.equals(transactions, that.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedAt, createdAt, errorCode, errorMessage, id, idempotencyKey, nextActionUrl, order, originTime, paymentGroupId, paymentSessionId, ready, subscriptionContract, transactions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime completedAt;

    
    private OffsetDateTime createdAt;

    
    private SubscriptionBillingAttemptErrorCode errorCode;

    
    private String errorMessage;

    
    private String id;

    
    private String idempotencyKey;

    
    private String nextActionUrl;

    
    private Order order;

    
    private OffsetDateTime originTime;

    
    private String paymentGroupId;

    
    private String paymentSessionId;

    
    private boolean ready;

    
    private SubscriptionContract subscriptionContract;

    
    private OrderTransactionConnection transactions;

    public SubscriptionBillingAttempt build() {
      SubscriptionBillingAttempt result = new SubscriptionBillingAttempt();
      result.completedAt = this.completedAt;
      result.createdAt = this.createdAt;
      result.errorCode = this.errorCode;
      result.errorMessage = this.errorMessage;
      result.id = this.id;
      result.idempotencyKey = this.idempotencyKey;
      result.nextActionUrl = this.nextActionUrl;
      result.order = this.order;
      result.originTime = this.originTime;
      result.paymentGroupId = this.paymentGroupId;
      result.paymentSessionId = this.paymentSessionId;
      result.ready = this.ready;
      result.subscriptionContract = this.subscriptionContract;
      result.transactions = this.transactions;
      return result;
    }

    
    public Builder completedAt(OffsetDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder errorCode(SubscriptionBillingAttemptErrorCode errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    
    public Builder errorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder idempotencyKey(String idempotencyKey) {
      this.idempotencyKey = idempotencyKey;
      return this;
    }

    
    public Builder nextActionUrl(String nextActionUrl) {
      this.nextActionUrl = nextActionUrl;
      return this;
    }

    
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    
    public Builder originTime(OffsetDateTime originTime) {
      this.originTime = originTime;
      return this;
    }

    
    public Builder paymentGroupId(String paymentGroupId) {
      this.paymentGroupId = paymentGroupId;
      return this;
    }

    
    public Builder paymentSessionId(String paymentSessionId) {
      this.paymentSessionId = paymentSessionId;
      return this;
    }

    
    public Builder ready(boolean ready) {
      this.ready = ready;
      return this;
    }

    
    public Builder subscriptionContract(SubscriptionContract subscriptionContract) {
      this.subscriptionContract = subscriptionContract;
      return this;
    }

    
    public Builder transactions(OrderTransactionConnection transactions) {
      this.transactions = transactions;
      return this;
    }
  }
}

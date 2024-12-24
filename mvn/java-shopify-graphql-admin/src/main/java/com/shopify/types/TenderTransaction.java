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
public class TenderTransaction implements com.shopify.types.Node {
  
  private MoneyV2 amount;

  
  private String id;

  
  private Order order;

  
  private String paymentMethod;

  
  private OffsetDateTime processedAt;

  
  private String remoteReference;

  
  private boolean test;

  
  private TenderTransactionDetails transactionDetails;

  
  private StaffMember user;

  public TenderTransaction() {
  }

  
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  
  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
  }

  
  public String getRemoteReference() {
    return remoteReference;
  }

  public void setRemoteReference(String remoteReference) {
    this.remoteReference = remoteReference;
  }

  
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  
  public TenderTransactionDetails getTransactionDetails() {
    return transactionDetails;
  }

  public void setTransactionDetails(TenderTransactionDetails transactionDetails) {
    this.transactionDetails = transactionDetails;
  }

  
  public StaffMember getUser() {
    return user;
  }

  public void setUser(StaffMember user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "TenderTransaction{amount='" + amount + "', id='" + id + "', order='" + order + "', paymentMethod='" + paymentMethod + "', processedAt='" + processedAt + "', remoteReference='" + remoteReference + "', test='" + test + "', transactionDetails='" + transactionDetails + "', user='" + user + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TenderTransaction that = (TenderTransaction) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(id, that.id) &&
        Objects.equals(order, that.order) &&
        Objects.equals(paymentMethod, that.paymentMethod) &&
        Objects.equals(processedAt, that.processedAt) &&
        Objects.equals(remoteReference, that.remoteReference) &&
        test == that.test &&
        Objects.equals(transactionDetails, that.transactionDetails) &&
        Objects.equals(user, that.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, id, order, paymentMethod, processedAt, remoteReference, test, transactionDetails, user);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 amount;

    
    private String id;

    
    private Order order;

    
    private String paymentMethod;

    
    private OffsetDateTime processedAt;

    
    private String remoteReference;

    
    private boolean test;

    
    private TenderTransactionDetails transactionDetails;

    
    private StaffMember user;

    public TenderTransaction build() {
      TenderTransaction result = new TenderTransaction();
      result.amount = this.amount;
      result.id = this.id;
      result.order = this.order;
      result.paymentMethod = this.paymentMethod;
      result.processedAt = this.processedAt;
      result.remoteReference = this.remoteReference;
      result.test = this.test;
      result.transactionDetails = this.transactionDetails;
      result.user = this.user;
      return result;
    }

    
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    
    public Builder paymentMethod(String paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }

    
    public Builder remoteReference(String remoteReference) {
      this.remoteReference = remoteReference;
      return this;
    }

    
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }

    
    public Builder transactionDetails(TenderTransactionDetails transactionDetails) {
      this.transactionDetails = transactionDetails;
      return this;
    }

    
    public Builder user(StaffMember user) {
      this.user = user;
      return this;
    }
  }
}

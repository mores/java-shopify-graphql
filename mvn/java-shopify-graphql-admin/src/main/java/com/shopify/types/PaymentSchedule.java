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
public class PaymentSchedule implements com.shopify.types.Node {
  
  private MoneyV2 amount;

  
  private OffsetDateTime completedAt;

  
  private OffsetDateTime dueAt;

  
  private String id;

  
  private OffsetDateTime issuedAt;

  
  private PaymentTerms paymentTerms;

  public PaymentSchedule() {
  }

  
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  
  public OffsetDateTime getDueAt() {
    return dueAt;
  }

  public void setDueAt(OffsetDateTime dueAt) {
    this.dueAt = dueAt;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }

  
  public PaymentTerms getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(PaymentTerms paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  @Override
  public String toString() {
    return "PaymentSchedule{amount='" + amount + "', completedAt='" + completedAt + "', dueAt='" + dueAt + "', id='" + id + "', issuedAt='" + issuedAt + "', paymentTerms='" + paymentTerms + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentSchedule that = (PaymentSchedule) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(completedAt, that.completedAt) &&
        Objects.equals(dueAt, that.dueAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(issuedAt, that.issuedAt) &&
        Objects.equals(paymentTerms, that.paymentTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, completedAt, dueAt, id, issuedAt, paymentTerms);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 amount;

    
    private OffsetDateTime completedAt;

    
    private OffsetDateTime dueAt;

    
    private String id;

    
    private OffsetDateTime issuedAt;

    
    private PaymentTerms paymentTerms;

    public PaymentSchedule build() {
      PaymentSchedule result = new PaymentSchedule();
      result.amount = this.amount;
      result.completedAt = this.completedAt;
      result.dueAt = this.dueAt;
      result.id = this.id;
      result.issuedAt = this.issuedAt;
      result.paymentTerms = this.paymentTerms;
      return result;
    }

    
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    
    public Builder completedAt(OffsetDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
    }

    
    public Builder dueAt(OffsetDateTime dueAt) {
      this.dueAt = dueAt;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder issuedAt(OffsetDateTime issuedAt) {
      this.issuedAt = issuedAt;
      return this;
    }

    
    public Builder paymentTerms(PaymentTerms paymentTerms) {
      this.paymentTerms = paymentTerms;
      return this;
    }
  }
}

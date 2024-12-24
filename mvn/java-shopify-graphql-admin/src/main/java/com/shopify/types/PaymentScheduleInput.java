package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class PaymentScheduleInput {
  
  private OffsetDateTime issuedAt;

  
  private OffsetDateTime dueAt;

  public PaymentScheduleInput() {
  }

  
  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }

  
  public OffsetDateTime getDueAt() {
    return dueAt;
  }

  public void setDueAt(OffsetDateTime dueAt) {
    this.dueAt = dueAt;
  }

  @Override
  public String toString() {
    return "PaymentScheduleInput{issuedAt='" + issuedAt + "', dueAt='" + dueAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PaymentScheduleInput that = (PaymentScheduleInput) o;
    return Objects.equals(issuedAt, that.issuedAt) &&
        Objects.equals(dueAt, that.dueAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuedAt, dueAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime issuedAt;

    
    private OffsetDateTime dueAt;

    public PaymentScheduleInput build() {
      PaymentScheduleInput result = new PaymentScheduleInput();
      result.issuedAt = this.issuedAt;
      result.dueAt = this.dueAt;
      return result;
    }

    
    public Builder issuedAt(OffsetDateTime issuedAt) {
      this.issuedAt = issuedAt;
      return this;
    }

    
    public Builder dueAt(OffsetDateTime dueAt) {
      this.dueAt = dueAt;
      return this;
    }
  }
}

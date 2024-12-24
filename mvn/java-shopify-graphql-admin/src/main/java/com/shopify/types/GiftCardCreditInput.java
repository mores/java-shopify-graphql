package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class GiftCardCreditInput {
  
  private MoneyInput creditAmount;

  
  private String note;

  
  private OffsetDateTime processedAt;

  public GiftCardCreditInput() {
  }

  
  public MoneyInput getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(MoneyInput creditAmount) {
    this.creditAmount = creditAmount;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
  }

  @Override
  public String toString() {
    return "GiftCardCreditInput{creditAmount='" + creditAmount + "', note='" + note + "', processedAt='" + processedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardCreditInput that = (GiftCardCreditInput) o;
    return Objects.equals(creditAmount, that.creditAmount) &&
        Objects.equals(note, that.note) &&
        Objects.equals(processedAt, that.processedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditAmount, note, processedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyInput creditAmount;

    
    private String note;

    
    private OffsetDateTime processedAt;

    public GiftCardCreditInput build() {
      GiftCardCreditInput result = new GiftCardCreditInput();
      result.creditAmount = this.creditAmount;
      result.note = this.note;
      result.processedAt = this.processedAt;
      return result;
    }

    
    public Builder creditAmount(MoneyInput creditAmount) {
      this.creditAmount = creditAmount;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }
  }
}

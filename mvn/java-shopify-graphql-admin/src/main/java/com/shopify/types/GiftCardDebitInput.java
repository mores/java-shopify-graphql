package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class GiftCardDebitInput {
  
  private MoneyInput debitAmount;

  
  private String note;

  
  private OffsetDateTime processedAt;

  public GiftCardDebitInput() {
  }

  
  public MoneyInput getDebitAmount() {
    return debitAmount;
  }

  public void setDebitAmount(MoneyInput debitAmount) {
    this.debitAmount = debitAmount;
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
    return "GiftCardDebitInput{debitAmount='" + debitAmount + "', note='" + note + "', processedAt='" + processedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GiftCardDebitInput that = (GiftCardDebitInput) o;
    return Objects.equals(debitAmount, that.debitAmount) &&
        Objects.equals(note, that.note) &&
        Objects.equals(processedAt, that.processedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(debitAmount, note, processedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyInput debitAmount;

    
    private String note;

    
    private OffsetDateTime processedAt;

    public GiftCardDebitInput build() {
      GiftCardDebitInput result = new GiftCardDebitInput();
      result.debitAmount = this.debitAmount;
      result.note = this.note;
      result.processedAt = this.processedAt;
      return result;
    }

    
    public Builder debitAmount(MoneyInput debitAmount) {
      this.debitAmount = debitAmount;
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

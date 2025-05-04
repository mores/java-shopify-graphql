package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for a gift card debit transaction.
 */
public class GiftCardDebitInput {
  /**
   * The amount to debit the gift card.
   */
  private MoneyInput debitAmount;

  /**
   * A note about the debit.
   */
  private String note;

  /**
   * The date and time the debit was processed. Defaults to current date and time.
   */
  private OffsetDateTime processedAt;

  public GiftCardDebitInput() {
  }

  /**
   * The amount to debit the gift card.
   */
  public MoneyInput getDebitAmount() {
    return debitAmount;
  }

  public void setDebitAmount(MoneyInput debitAmount) {
    this.debitAmount = debitAmount;
  }

  /**
   * A note about the debit.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The date and time the debit was processed. Defaults to current date and time.
   */
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
    /**
     * The amount to debit the gift card.
     */
    private MoneyInput debitAmount;

    /**
     * A note about the debit.
     */
    private String note;

    /**
     * The date and time the debit was processed. Defaults to current date and time.
     */
    private OffsetDateTime processedAt;

    public GiftCardDebitInput build() {
      GiftCardDebitInput result = new GiftCardDebitInput();
      result.debitAmount = this.debitAmount;
      result.note = this.note;
      result.processedAt = this.processedAt;
      return result;
    }

    /**
     * The amount to debit the gift card.
     */
    public Builder debitAmount(MoneyInput debitAmount) {
      this.debitAmount = debitAmount;
      return this;
    }

    /**
     * A note about the debit.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The date and time the debit was processed. Defaults to current date and time.
     */
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for a gift card credit transaction.
 */
public class GiftCardCreditInput {
  /**
   * The amount to credit the gift card.
   */
  private MoneyInput creditAmount;

  /**
   * A note about the credit.
   */
  private String note;

  /**
   * The date and time the credit was processed. Defaults to current date and time.
   */
  private OffsetDateTime processedAt;

  public GiftCardCreditInput() {
  }

  /**
   * The amount to credit the gift card.
   */
  public MoneyInput getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(MoneyInput creditAmount) {
    this.creditAmount = creditAmount;
  }

  /**
   * A note about the credit.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The date and time the credit was processed. Defaults to current date and time.
   */
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
    /**
     * The amount to credit the gift card.
     */
    private MoneyInput creditAmount;

    /**
     * A note about the credit.
     */
    private String note;

    /**
     * The date and time the credit was processed. Defaults to current date and time.
     */
    private OffsetDateTime processedAt;

    public GiftCardCreditInput build() {
      GiftCardCreditInput result = new GiftCardCreditInput();
      result.creditAmount = this.creditAmount;
      result.note = this.note;
      result.processedAt = this.processedAt;
      return result;
    }

    /**
     * The amount to credit the gift card.
     */
    public Builder creditAmount(MoneyInput creditAmount) {
      this.creditAmount = creditAmount;
      return this;
    }

    /**
     * A note about the credit.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The date and time the credit was processed. Defaults to current date and time.
     */
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }
  }
}

package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields used to create a payment schedule for payment terms.
 */
public class PaymentScheduleInput {
  /**
   * Specifies the date and time that the payment schedule was issued. This field must be provided for net type payment terms.
   */
  private OffsetDateTime issuedAt;

  /**
   * Specifies the date and time when the payment schedule is due. This field must be provided for fixed type payment terms.
   */
  private OffsetDateTime dueAt;

  public PaymentScheduleInput() {
  }

  /**
   * Specifies the date and time that the payment schedule was issued. This field must be provided for net type payment terms.
   */
  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }

  /**
   * Specifies the date and time when the payment schedule is due. This field must be provided for fixed type payment terms.
   */
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
    /**
     * Specifies the date and time that the payment schedule was issued. This field must be provided for net type payment terms.
     */
    private OffsetDateTime issuedAt;

    /**
     * Specifies the date and time when the payment schedule is due. This field must be provided for fixed type payment terms.
     */
    private OffsetDateTime dueAt;

    public PaymentScheduleInput build() {
      PaymentScheduleInput result = new PaymentScheduleInput();
      result.issuedAt = this.issuedAt;
      result.dueAt = this.dueAt;
      return result;
    }

    /**
     * Specifies the date and time that the payment schedule was issued. This field must be provided for net type payment terms.
     */
    public Builder issuedAt(OffsetDateTime issuedAt) {
      this.issuedAt = issuedAt;
      return this;
    }

    /**
     * Specifies the date and time when the payment schedule is due. This field must be provided for fixed type payment terms.
     */
    public Builder dueAt(OffsetDateTime dueAt) {
      this.dueAt = dueAt;
      return this;
    }
  }
}

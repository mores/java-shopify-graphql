package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for date and time range filter.
 */
public class CashDrawerDateRangeInput {
  /**
   * The start of the date and time range.
   */
  private OffsetDateTime from;

  /**
   * The end of the date and time range.
   */
  private OffsetDateTime to;

  public CashDrawerDateRangeInput() {
  }

  /**
   * The start of the date and time range.
   */
  public OffsetDateTime getFrom() {
    return from;
  }

  public void setFrom(OffsetDateTime from) {
    this.from = from;
  }

  /**
   * The end of the date and time range.
   */
  public OffsetDateTime getTo() {
    return to;
  }

  public void setTo(OffsetDateTime to) {
    this.to = to;
  }

  @Override
  public String toString() {
    return "CashDrawerDateRangeInput{from='" + from + "', to='" + to + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CashDrawerDateRangeInput that = (CashDrawerDateRangeInput) o;
    return Objects.equals(from, that.from) &&
        Objects.equals(to, that.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The start of the date and time range.
     */
    private OffsetDateTime from;

    /**
     * The end of the date and time range.
     */
    private OffsetDateTime to;

    public CashDrawerDateRangeInput build() {
      CashDrawerDateRangeInput result = new CashDrawerDateRangeInput();
      result.from = this.from;
      result.to = this.to;
      return result;
    }

    /**
     * The start of the date and time range.
     */
    public Builder from(OffsetDateTime from) {
      this.from = from;
      return this;
    }

    /**
     * The end of the date and time range.
     */
    public Builder to(OffsetDateTime to) {
      this.to = to;
      return this;
    }
  }
}

package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A time period during which a price rule is applicable.
 */
public class PriceRuleValidityPeriod {
  /**
   * The time after which the price rule becomes invalid.
   */
  private OffsetDateTime end;

  /**
   * The time after which the price rule is valid.
   */
  private OffsetDateTime start;

  public PriceRuleValidityPeriod() {
  }

  /**
   * The time after which the price rule becomes invalid.
   */
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  /**
   * The time after which the price rule is valid.
   */
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  @Override
  public String toString() {
    return "PriceRuleValidityPeriod{end='" + end + "', start='" + start + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleValidityPeriod that = (PriceRuleValidityPeriod) o;
    return Objects.equals(end, that.end) &&
        Objects.equals(start, that.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The time after which the price rule becomes invalid.
     */
    private OffsetDateTime end;

    /**
     * The time after which the price rule is valid.
     */
    private OffsetDateTime start;

    public PriceRuleValidityPeriod build() {
      PriceRuleValidityPeriod result = new PriceRuleValidityPeriod();
      result.end = this.end;
      result.start = this.start;
      return result;
    }

    /**
     * The time after which the price rule becomes invalid.
     */
    public Builder end(OffsetDateTime end) {
      this.end = end;
      return this;
    }

    /**
     * The time after which the price rule is valid.
     */
    public Builder start(OffsetDateTime start) {
      this.start = start;
      return this;
    }
  }
}

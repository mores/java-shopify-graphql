package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for subscription cadence in the calculate API.
 */
public class SubscriptionContractCalculationCadenceInput {
  /**
   * The unit of time for the interval.
   */
  private SubscriptionContractCalculationCadenceUnit unit;

  /**
   * Number of intervals between occurrences. Must be greater than or equal to 1.
   */
  private int count;

  public SubscriptionContractCalculationCadenceInput() {
  }

  /**
   * The unit of time for the interval.
   */
  public SubscriptionContractCalculationCadenceUnit getUnit() {
    return unit;
  }

  public void setUnit(SubscriptionContractCalculationCadenceUnit unit) {
    this.unit = unit;
  }

  /**
   * Number of intervals between occurrences. Must be greater than or equal to 1.
   */
  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationCadenceInput{unit='" + unit + "', count='" + count + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationCadenceInput that = (SubscriptionContractCalculationCadenceInput) o;
    return Objects.equals(unit, that.unit) &&
        count == that.count;
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, count);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unit of time for the interval.
     */
    private SubscriptionContractCalculationCadenceUnit unit;

    /**
     * Number of intervals between occurrences. Must be greater than or equal to 1.
     */
    private int count;

    public SubscriptionContractCalculationCadenceInput build() {
      SubscriptionContractCalculationCadenceInput result = new SubscriptionContractCalculationCadenceInput();
      result.unit = this.unit;
      result.count = this.count;
      return result;
    }

    /**
     * The unit of time for the interval.
     */
    public Builder unit(SubscriptionContractCalculationCadenceUnit unit) {
      this.unit = unit;
      return this;
    }

    /**
     * Number of intervals between occurrences. Must be greater than or equal to 1.
     */
    public Builder count(int count) {
      this.count = count;
      return this;
    }
  }
}

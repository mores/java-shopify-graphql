package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A subscription cadence: a unit of time and the number of units between occurrences.
 */
public class SubscriptionContractCalculationCadence {
  /**
   * The number of intervals between occurrences.
   */
  private int count;

  /**
   * The unit of time for the interval.
   */
  private SubscriptionContractCalculationCadenceUnit unit;

  public SubscriptionContractCalculationCadence() {
  }

  /**
   * The number of intervals between occurrences.
   */
  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
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

  @Override
  public String toString() {
    return "SubscriptionContractCalculationCadence{count='" + count + "', unit='" + unit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationCadence that = (SubscriptionContractCalculationCadence) o;
    return count == that.count &&
        Objects.equals(unit, that.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, unit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The number of intervals between occurrences.
     */
    private int count;

    /**
     * The unit of time for the interval.
     */
    private SubscriptionContractCalculationCadenceUnit unit;

    public SubscriptionContractCalculationCadence build() {
      SubscriptionContractCalculationCadence result = new SubscriptionContractCalculationCadence();
      result.count = this.count;
      result.unit = this.unit;
      return result;
    }

    /**
     * The number of intervals between occurrences.
     */
    public Builder count(int count) {
      this.count = count;
      return this;
    }

    /**
     * The unit of time for the interval.
     */
    public Builder unit(SubscriptionContractCalculationCadenceUnit unit) {
      this.unit = unit;
      return this;
    }
  }
}

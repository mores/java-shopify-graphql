package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for subscription contract anchors used for contract calculation.
 * This is a oneOf input: one, and only one, field can be provided.
 */
public class SubscriptionContractCalculationAnchorInput {
  /**
   * Anchor to a specific day of the week.
   */
  private SubscriptionContractCalculationWeekdayAnchorInput weekday;

  /**
   * Anchor to a specific day of the month.
   */
  private SubscriptionContractCalculationMonthdayAnchorInput monthday;

  /**
   * Anchor to a specific day of the year.
   */
  private SubscriptionContractCalculationYeardayAnchorInput yearday;

  public SubscriptionContractCalculationAnchorInput() {
  }

  /**
   * Anchor to a specific day of the week.
   */
  public SubscriptionContractCalculationWeekdayAnchorInput getWeekday() {
    return weekday;
  }

  public void setWeekday(SubscriptionContractCalculationWeekdayAnchorInput weekday) {
    this.weekday = weekday;
  }

  /**
   * Anchor to a specific day of the month.
   */
  public SubscriptionContractCalculationMonthdayAnchorInput getMonthday() {
    return monthday;
  }

  public void setMonthday(SubscriptionContractCalculationMonthdayAnchorInput monthday) {
    this.monthday = monthday;
  }

  /**
   * Anchor to a specific day of the year.
   */
  public SubscriptionContractCalculationYeardayAnchorInput getYearday() {
    return yearday;
  }

  public void setYearday(SubscriptionContractCalculationYeardayAnchorInput yearday) {
    this.yearday = yearday;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationAnchorInput{weekday='" + weekday + "', monthday='" + monthday + "', yearday='" + yearday + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationAnchorInput that = (SubscriptionContractCalculationAnchorInput) o;
    return Objects.equals(weekday, that.weekday) &&
        Objects.equals(monthday, that.monthday) &&
        Objects.equals(yearday, that.yearday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekday, monthday, yearday);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Anchor to a specific day of the week.
     */
    private SubscriptionContractCalculationWeekdayAnchorInput weekday;

    /**
     * Anchor to a specific day of the month.
     */
    private SubscriptionContractCalculationMonthdayAnchorInput monthday;

    /**
     * Anchor to a specific day of the year.
     */
    private SubscriptionContractCalculationYeardayAnchorInput yearday;

    public SubscriptionContractCalculationAnchorInput build() {
      SubscriptionContractCalculationAnchorInput result = new SubscriptionContractCalculationAnchorInput();
      result.weekday = this.weekday;
      result.monthday = this.monthday;
      result.yearday = this.yearday;
      return result;
    }

    /**
     * Anchor to a specific day of the week.
     */
    public Builder weekday(SubscriptionContractCalculationWeekdayAnchorInput weekday) {
      this.weekday = weekday;
      return this;
    }

    /**
     * Anchor to a specific day of the month.
     */
    public Builder monthday(SubscriptionContractCalculationMonthdayAnchorInput monthday) {
      this.monthday = monthday;
      return this;
    }

    /**
     * Anchor to a specific day of the year.
     */
    public Builder yearday(SubscriptionContractCalculationYeardayAnchorInput yearday) {
      this.yearday = yearday;
      return this;
    }
  }
}

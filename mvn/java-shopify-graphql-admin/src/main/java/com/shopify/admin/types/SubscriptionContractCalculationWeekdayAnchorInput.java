package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for weekday anchor in the calculate API.
 */
public class SubscriptionContractCalculationWeekdayAnchorInput {
  /**
   * Day of the week for the weekday anchor.
   */
  private DayOfTheWeek dayOfWeek;

  public SubscriptionContractCalculationWeekdayAnchorInput() {
  }

  /**
   * Day of the week for the weekday anchor.
   */
  public DayOfTheWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(DayOfTheWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationWeekdayAnchorInput{dayOfWeek='" + dayOfWeek + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationWeekdayAnchorInput that = (SubscriptionContractCalculationWeekdayAnchorInput) o;
    return Objects.equals(dayOfWeek, that.dayOfWeek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Day of the week for the weekday anchor.
     */
    private DayOfTheWeek dayOfWeek;

    public SubscriptionContractCalculationWeekdayAnchorInput build() {
      SubscriptionContractCalculationWeekdayAnchorInput result = new SubscriptionContractCalculationWeekdayAnchorInput();
      result.dayOfWeek = this.dayOfWeek;
      return result;
    }

    /**
     * Day of the week for the weekday anchor.
     */
    public Builder dayOfWeek(DayOfTheWeek dayOfWeek) {
      this.dayOfWeek = dayOfWeek;
      return this;
    }
  }
}

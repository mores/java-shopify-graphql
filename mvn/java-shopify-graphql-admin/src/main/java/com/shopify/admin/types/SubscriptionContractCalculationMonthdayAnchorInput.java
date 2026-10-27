package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for monthday anchor in the calculate API.
 */
public class SubscriptionContractCalculationMonthdayAnchorInput {
  /**
   * Day of month: 1-31. For months with fewer days, will use the last day of the month.
   */
  private int dayOfMonth;

  public SubscriptionContractCalculationMonthdayAnchorInput() {
  }

  /**
   * Day of month: 1-31. For months with fewer days, will use the last day of the month.
   */
  public int getDayOfMonth() {
    return dayOfMonth;
  }

  public void setDayOfMonth(int dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationMonthdayAnchorInput{dayOfMonth='" + dayOfMonth + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationMonthdayAnchorInput that = (SubscriptionContractCalculationMonthdayAnchorInput) o;
    return dayOfMonth == that.dayOfMonth;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfMonth);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Day of month: 1-31. For months with fewer days, will use the last day of the month.
     */
    private int dayOfMonth;

    public SubscriptionContractCalculationMonthdayAnchorInput build() {
      SubscriptionContractCalculationMonthdayAnchorInput result = new SubscriptionContractCalculationMonthdayAnchorInput();
      result.dayOfMonth = this.dayOfMonth;
      return result;
    }

    /**
     * Day of month: 1-31. For months with fewer days, will use the last day of the month.
     */
    public Builder dayOfMonth(int dayOfMonth) {
      this.dayOfMonth = dayOfMonth;
      return this;
    }
  }
}

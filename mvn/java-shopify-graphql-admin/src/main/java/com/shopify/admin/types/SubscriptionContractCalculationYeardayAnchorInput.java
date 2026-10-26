package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for yearday anchor in the calculate API.
 */
public class SubscriptionContractCalculationYeardayAnchorInput {
  /**
   * Day of month: 1-31.
   */
  private int dayOfMonth;

  /**
   * Month: 1-12.
   */
  private int month;

  public SubscriptionContractCalculationYeardayAnchorInput() {
  }

  /**
   * Day of month: 1-31.
   */
  public int getDayOfMonth() {
    return dayOfMonth;
  }

  public void setDayOfMonth(int dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  /**
   * Month: 1-12.
   */
  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationYeardayAnchorInput{dayOfMonth='" + dayOfMonth + "', month='" + month + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationYeardayAnchorInput that = (SubscriptionContractCalculationYeardayAnchorInput) o;
    return dayOfMonth == that.dayOfMonth &&
        month == that.month;
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfMonth, month);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Day of month: 1-31.
     */
    private int dayOfMonth;

    /**
     * Month: 1-12.
     */
    private int month;

    public SubscriptionContractCalculationYeardayAnchorInput build() {
      SubscriptionContractCalculationYeardayAnchorInput result = new SubscriptionContractCalculationYeardayAnchorInput();
      result.dayOfMonth = this.dayOfMonth;
      result.month = this.month;
      return result;
    }

    /**
     * Day of month: 1-31.
     */
    public Builder dayOfMonth(int dayOfMonth) {
      this.dayOfMonth = dayOfMonth;
      return this;
    }

    /**
     * Month: 1-12.
     */
    public Builder month(int month) {
      this.month = month;
      return this;
    }
  }
}

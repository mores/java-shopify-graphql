package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The payment schedule for a payments account.
 */
public class ShopifyPaymentsPayoutSchedule {
  /**
   * The interval at which payouts are sent to the connected bank account.
   */
  private ShopifyPaymentsPayoutInterval interval;

  /**
   * The day of the month funds will be paid out.
   *   
   * The value can be any day of the month from the 1st to the 31st.
   * If the payment interval is set to monthly, this value will be used.
   * Payouts scheduled between 29-31st of the month are sent on the last day of shorter months.
   */
  private Integer monthlyAnchor;

  /**
   * The day of the week funds will be paid out.
   *   
   * The value can be any weekday from Monday to Friday.
   * If the payment interval is set to weekly, this value will be used.
   */
  private DayOfTheWeek weeklyAnchor;

  public ShopifyPaymentsPayoutSchedule() {
  }

  /**
   * The interval at which payouts are sent to the connected bank account.
   */
  public ShopifyPaymentsPayoutInterval getInterval() {
    return interval;
  }

  public void setInterval(ShopifyPaymentsPayoutInterval interval) {
    this.interval = interval;
  }

  /**
   * The day of the month funds will be paid out.
   *   
   * The value can be any day of the month from the 1st to the 31st.
   * If the payment interval is set to monthly, this value will be used.
   * Payouts scheduled between 29-31st of the month are sent on the last day of shorter months.
   */
  public Integer getMonthlyAnchor() {
    return monthlyAnchor;
  }

  public void setMonthlyAnchor(Integer monthlyAnchor) {
    this.monthlyAnchor = monthlyAnchor;
  }

  /**
   * The day of the week funds will be paid out.
   *   
   * The value can be any weekday from Monday to Friday.
   * If the payment interval is set to weekly, this value will be used.
   */
  public DayOfTheWeek getWeeklyAnchor() {
    return weeklyAnchor;
  }

  public void setWeeklyAnchor(DayOfTheWeek weeklyAnchor) {
    this.weeklyAnchor = weeklyAnchor;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsPayoutSchedule{interval='" + interval + "', monthlyAnchor='" + monthlyAnchor + "', weeklyAnchor='" + weeklyAnchor + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsPayoutSchedule that = (ShopifyPaymentsPayoutSchedule) o;
    return Objects.equals(interval, that.interval) &&
        Objects.equals(monthlyAnchor, that.monthlyAnchor) &&
        Objects.equals(weeklyAnchor, that.weeklyAnchor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, monthlyAnchor, weeklyAnchor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The interval at which payouts are sent to the connected bank account.
     */
    private ShopifyPaymentsPayoutInterval interval;

    /**
     * The day of the month funds will be paid out.
     *   
     * The value can be any day of the month from the 1st to the 31st.
     * If the payment interval is set to monthly, this value will be used.
     * Payouts scheduled between 29-31st of the month are sent on the last day of shorter months.
     */
    private Integer monthlyAnchor;

    /**
     * The day of the week funds will be paid out.
     *   
     * The value can be any weekday from Monday to Friday.
     * If the payment interval is set to weekly, this value will be used.
     */
    private DayOfTheWeek weeklyAnchor;

    public ShopifyPaymentsPayoutSchedule build() {
      ShopifyPaymentsPayoutSchedule result = new ShopifyPaymentsPayoutSchedule();
      result.interval = this.interval;
      result.monthlyAnchor = this.monthlyAnchor;
      result.weeklyAnchor = this.weeklyAnchor;
      return result;
    }

    /**
     * The interval at which payouts are sent to the connected bank account.
     */
    public Builder interval(ShopifyPaymentsPayoutInterval interval) {
      this.interval = interval;
      return this;
    }

    /**
     * The day of the month funds will be paid out.
     *   
     * The value can be any day of the month from the 1st to the 31st.
     * If the payment interval is set to monthly, this value will be used.
     * Payouts scheduled between 29-31st of the month are sent on the last day of shorter months.
     */
    public Builder monthlyAnchor(Integer monthlyAnchor) {
      this.monthlyAnchor = monthlyAnchor;
      return this;
    }

    /**
     * The day of the week funds will be paid out.
     *   
     * The value can be any weekday from Monday to Friday.
     * If the payment interval is set to weekly, this value will be used.
     */
    public Builder weeklyAnchor(DayOfTheWeek weeklyAnchor) {
      this.weeklyAnchor = weeklyAnchor;
      return this;
    }
  }
}

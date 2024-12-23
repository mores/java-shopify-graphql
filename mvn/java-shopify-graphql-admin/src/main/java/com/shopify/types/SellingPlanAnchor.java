package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Specifies the date when delivery or fulfillment is completed by a merchant for a given time cycle. You can also
 * define a cutoff for which customers are eligible to enter this cycle and the desired behavior for customers who
 * start their subscription inside the cutoff period.
 *
 * Some example scenarios where anchors can be useful to implement advanced delivery behavior:
 * - A merchant starts fulfillment on a specific date every month.
 * - A merchant wants to bill the 1st of every quarter.
 * - A customer expects their delivery every Tuesday.
 *
 * For more details, see [About Selling Plans](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/selling-plans#anchors).
 */
public class SellingPlanAnchor {
  /**
   * The cutoff day for the anchor. Specifies a buffer period before the anchor date for orders to be included in a
   * delivery or fulfillment cycle.
   *   
   * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
   * the days of the week according to ISO 8601, where 1 is Monday.
   *   
   * If `type` is MONTHDAY, then the value must be between 1-31.
   *   
   * If `type` is YEARDAY, then the value must be `null`.
   */
  private Integer cutoffDay;

  /**
   * The day of the anchor.
   *   
   * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
   * the days of the week according to ISO 8601, where 1 is Monday.
   *   
   * If `type` isn't WEEKDAY, then the value must be between 1-31.
   */
  private int day;

  /**
   * The month of the anchor. If type is different than YEARDAY, then the value must
   * be `null` or between 1-12.
   */
  private Integer month;

  /**
   * Represents the anchor type, it can be one one of WEEKDAY, MONTHDAY, YEARDAY.
   */
  private SellingPlanAnchorType type;

  public SellingPlanAnchor() {
  }

  /**
   * The cutoff day for the anchor. Specifies a buffer period before the anchor date for orders to be included in a
   * delivery or fulfillment cycle.
   *   
   * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
   * the days of the week according to ISO 8601, where 1 is Monday.
   *   
   * If `type` is MONTHDAY, then the value must be between 1-31.
   *   
   * If `type` is YEARDAY, then the value must be `null`.
   */
  public Integer getCutoffDay() {
    return cutoffDay;
  }

  public void setCutoffDay(Integer cutoffDay) {
    this.cutoffDay = cutoffDay;
  }

  /**
   * The day of the anchor.
   *   
   * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
   * the days of the week according to ISO 8601, where 1 is Monday.
   *   
   * If `type` isn't WEEKDAY, then the value must be between 1-31.
   */
  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  /**
   * The month of the anchor. If type is different than YEARDAY, then the value must
   * be `null` or between 1-12.
   */
  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  /**
   * Represents the anchor type, it can be one one of WEEKDAY, MONTHDAY, YEARDAY.
   */
  public SellingPlanAnchorType getType() {
    return type;
  }

  public void setType(SellingPlanAnchorType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "SellingPlanAnchor{cutoffDay='" + cutoffDay + "', day='" + day + "', month='" + month + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanAnchor that = (SellingPlanAnchor) o;
    return Objects.equals(cutoffDay, that.cutoffDay) &&
        day == that.day &&
        Objects.equals(month, that.month) &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cutoffDay, day, month, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The cutoff day for the anchor. Specifies a buffer period before the anchor date for orders to be included in a
     * delivery or fulfillment cycle.
     *   
     * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
     * the days of the week according to ISO 8601, where 1 is Monday.
     *   
     * If `type` is MONTHDAY, then the value must be between 1-31.
     *   
     * If `type` is YEARDAY, then the value must be `null`.
     */
    private Integer cutoffDay;

    /**
     * The day of the anchor.
     *   
     * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
     * the days of the week according to ISO 8601, where 1 is Monday.
     *   
     * If `type` isn't WEEKDAY, then the value must be between 1-31.
     */
    private int day;

    /**
     * The month of the anchor. If type is different than YEARDAY, then the value must
     * be `null` or between 1-12.
     */
    private Integer month;

    /**
     * Represents the anchor type, it can be one one of WEEKDAY, MONTHDAY, YEARDAY.
     */
    private SellingPlanAnchorType type;

    public SellingPlanAnchor build() {
      SellingPlanAnchor result = new SellingPlanAnchor();
      result.cutoffDay = this.cutoffDay;
      result.day = this.day;
      result.month = this.month;
      result.type = this.type;
      return result;
    }

    /**
     * The cutoff day for the anchor. Specifies a buffer period before the anchor date for orders to be included in a
     * delivery or fulfillment cycle.
     *   
     * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
     * the days of the week according to ISO 8601, where 1 is Monday.
     *   
     * If `type` is MONTHDAY, then the value must be between 1-31.
     *   
     * If `type` is YEARDAY, then the value must be `null`.
     */
    public Builder cutoffDay(Integer cutoffDay) {
      this.cutoffDay = cutoffDay;
      return this;
    }

    /**
     * The day of the anchor.
     *   
     * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
     * the days of the week according to ISO 8601, where 1 is Monday.
     *   
     * If `type` isn't WEEKDAY, then the value must be between 1-31.
     */
    public Builder day(int day) {
      this.day = day;
      return this;
    }

    /**
     * The month of the anchor. If type is different than YEARDAY, then the value must
     * be `null` or between 1-12.
     */
    public Builder month(Integer month) {
      this.month = month;
      return this;
    }

    /**
     * Represents the anchor type, it can be one one of WEEKDAY, MONTHDAY, YEARDAY.
     */
    public Builder type(SellingPlanAnchorType type) {
      this.type = type;
      return this;
    }
  }
}

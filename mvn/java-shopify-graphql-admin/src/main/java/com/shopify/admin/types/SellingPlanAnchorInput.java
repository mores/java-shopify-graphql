package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create or update a selling plan anchor.
 */
public class SellingPlanAnchorInput {
  /**
   * Represents the anchor type, must be one of WEEKDAY, MONTHDAY, YEARDAY.
   */
  private SellingPlanAnchorType type;

  /**
   * The day of the anchor.
   *   
   * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
   * the days of the week according to ISO 8601, where 1 is Monday.
   *   
   * If `type` isn't WEEKDAY, then the value must be between 1-31.
   */
  private Integer day;

  /**
   * The month of the anchor. If type is different than YEARDAY, then the value must
   * be `null` or between 1-12.
   */
  private Integer month;

  /**
   * The cutoff day of the anchor.
   *   
   * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
   * the days of the week according to ISO 8601, where 1 is Monday.
   *   
   * If `type` is MONTHDAY, then the value must be between 1-31.
   *   
   * If `type` is YEARDAY, then the value must be `null`.
   *   
   * This field should only be set if the cutoff field for the delivery policy is `null`.
   */
  private Integer cutoffDay;

  public SellingPlanAnchorInput() {
  }

  /**
   * Represents the anchor type, must be one of WEEKDAY, MONTHDAY, YEARDAY.
   */
  public SellingPlanAnchorType getType() {
    return type;
  }

  public void setType(SellingPlanAnchorType type) {
    this.type = type;
  }

  /**
   * The day of the anchor.
   *   
   * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
   * the days of the week according to ISO 8601, where 1 is Monday.
   *   
   * If `type` isn't WEEKDAY, then the value must be between 1-31.
   */
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
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
   * The cutoff day of the anchor.
   *   
   * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
   * the days of the week according to ISO 8601, where 1 is Monday.
   *   
   * If `type` is MONTHDAY, then the value must be between 1-31.
   *   
   * If `type` is YEARDAY, then the value must be `null`.
   *   
   * This field should only be set if the cutoff field for the delivery policy is `null`.
   */
  public Integer getCutoffDay() {
    return cutoffDay;
  }

  public void setCutoffDay(Integer cutoffDay) {
    this.cutoffDay = cutoffDay;
  }

  @Override
  public String toString() {
    return "SellingPlanAnchorInput{type='" + type + "', day='" + day + "', month='" + month + "', cutoffDay='" + cutoffDay + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanAnchorInput that = (SellingPlanAnchorInput) o;
    return Objects.equals(type, that.type) &&
        Objects.equals(day, that.day) &&
        Objects.equals(month, that.month) &&
        Objects.equals(cutoffDay, that.cutoffDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, day, month, cutoffDay);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Represents the anchor type, must be one of WEEKDAY, MONTHDAY, YEARDAY.
     */
    private SellingPlanAnchorType type;

    /**
     * The day of the anchor.
     *   
     * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
     * the days of the week according to ISO 8601, where 1 is Monday.
     *   
     * If `type` isn't WEEKDAY, then the value must be between 1-31.
     */
    private Integer day;

    /**
     * The month of the anchor. If type is different than YEARDAY, then the value must
     * be `null` or between 1-12.
     */
    private Integer month;

    /**
     * The cutoff day of the anchor.
     *   
     * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
     * the days of the week according to ISO 8601, where 1 is Monday.
     *   
     * If `type` is MONTHDAY, then the value must be between 1-31.
     *   
     * If `type` is YEARDAY, then the value must be `null`.
     *   
     * This field should only be set if the cutoff field for the delivery policy is `null`.
     */
    private Integer cutoffDay;

    public SellingPlanAnchorInput build() {
      SellingPlanAnchorInput result = new SellingPlanAnchorInput();
      result.type = this.type;
      result.day = this.day;
      result.month = this.month;
      result.cutoffDay = this.cutoffDay;
      return result;
    }

    /**
     * Represents the anchor type, must be one of WEEKDAY, MONTHDAY, YEARDAY.
     */
    public Builder type(SellingPlanAnchorType type) {
      this.type = type;
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
    public Builder day(Integer day) {
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
     * The cutoff day of the anchor.
     *   
     * If `type` is WEEKDAY, then the value must be between 1-7. Shopify interprets
     * the days of the week according to ISO 8601, where 1 is Monday.
     *   
     * If `type` is MONTHDAY, then the value must be between 1-31.
     *   
     * If `type` is YEARDAY, then the value must be `null`.
     *   
     * This field should only be set if the cutoff field for the delivery policy is `null`.
     */
    public Builder cutoffDay(Integer cutoffDay) {
      this.cutoffDay = cutoffDay;
      return this;
    }
  }
}

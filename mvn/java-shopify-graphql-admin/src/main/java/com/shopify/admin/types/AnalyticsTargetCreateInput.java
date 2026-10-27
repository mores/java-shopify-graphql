package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;

/**
 * The input fields for creating an [analytics target](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsTarget)
 * that tracks a merchant's goal for a specific metric over a date range.
 */
public class AnalyticsTargetCreateInput {
  /**
   * The identifier of the analytics metric that this target tracks, such as `total_sales` or `orders`.
   */
  private String metric;

  /**
   * The start date of the period over which progress toward the target is measured.
   */
  private LocalDate startDate;

  /**
   * The end date of the period over which progress toward the target is measured.
   */
  private LocalDate endDate;

  /**
   * The goal value that the merchant aims to reach for the tracked metric within the target period. Must be greater than 0.
   */
  private String expectedValue;

  /**
   * A human-readable label for the target, such as `Q1 Sales Target`.
   */
  private String name;

  /**
   * An optional filter expression to narrow the data evaluated against this target. For example, `shipping_country = 'US'`.
   */
  private String filters;

  public AnalyticsTargetCreateInput() {
  }

  /**
   * The identifier of the analytics metric that this target tracks, such as `total_sales` or `orders`.
   */
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  /**
   * The start date of the period over which progress toward the target is measured.
   */
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  /**
   * The end date of the period over which progress toward the target is measured.
   */
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  /**
   * The goal value that the merchant aims to reach for the tracked metric within the target period. Must be greater than 0.
   */
  public String getExpectedValue() {
    return expectedValue;
  }

  public void setExpectedValue(String expectedValue) {
    this.expectedValue = expectedValue;
  }

  /**
   * A human-readable label for the target, such as `Q1 Sales Target`.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * An optional filter expression to narrow the data evaluated against this target. For example, `shipping_country = 'US'`.
   */
  public String getFilters() {
    return filters;
  }

  public void setFilters(String filters) {
    this.filters = filters;
  }

  @Override
  public String toString() {
    return "AnalyticsTargetCreateInput{metric='" + metric + "', startDate='" + startDate + "', endDate='" + endDate + "', expectedValue='" + expectedValue + "', name='" + name + "', filters='" + filters + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnalyticsTargetCreateInput that = (AnalyticsTargetCreateInput) o;
    return Objects.equals(metric, that.metric) &&
        Objects.equals(startDate, that.startDate) &&
        Objects.equals(endDate, that.endDate) &&
        Objects.equals(expectedValue, that.expectedValue) &&
        Objects.equals(name, that.name) &&
        Objects.equals(filters, that.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, startDate, endDate, expectedValue, name, filters);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The identifier of the analytics metric that this target tracks, such as `total_sales` or `orders`.
     */
    private String metric;

    /**
     * The start date of the period over which progress toward the target is measured.
     */
    private LocalDate startDate;

    /**
     * The end date of the period over which progress toward the target is measured.
     */
    private LocalDate endDate;

    /**
     * The goal value that the merchant aims to reach for the tracked metric within the target period. Must be greater than 0.
     */
    private String expectedValue;

    /**
     * A human-readable label for the target, such as `Q1 Sales Target`.
     */
    private String name;

    /**
     * An optional filter expression to narrow the data evaluated against this target. For example, `shipping_country = 'US'`.
     */
    private String filters;

    public AnalyticsTargetCreateInput build() {
      AnalyticsTargetCreateInput result = new AnalyticsTargetCreateInput();
      result.metric = this.metric;
      result.startDate = this.startDate;
      result.endDate = this.endDate;
      result.expectedValue = this.expectedValue;
      result.name = this.name;
      result.filters = this.filters;
      return result;
    }

    /**
     * The identifier of the analytics metric that this target tracks, such as `total_sales` or `orders`.
     */
    public Builder metric(String metric) {
      this.metric = metric;
      return this;
    }

    /**
     * The start date of the period over which progress toward the target is measured.
     */
    public Builder startDate(LocalDate startDate) {
      this.startDate = startDate;
      return this;
    }

    /**
     * The end date of the period over which progress toward the target is measured.
     */
    public Builder endDate(LocalDate endDate) {
      this.endDate = endDate;
      return this;
    }

    /**
     * The goal value that the merchant aims to reach for the tracked metric within the target period. Must be greater than 0.
     */
    public Builder expectedValue(String expectedValue) {
      this.expectedValue = expectedValue;
      return this;
    }

    /**
     * A human-readable label for the target, such as `Q1 Sales Target`.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * An optional filter expression to narrow the data evaluated against this target. For example, `shipping_country = 'US'`.
     */
    public Builder filters(String filters) {
      this.filters = filters;
      return this;
    }
  }
}

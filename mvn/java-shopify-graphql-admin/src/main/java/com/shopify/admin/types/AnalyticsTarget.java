package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents a merchant-defined goal for a specific analytics metric over a date range.
 * Merchants use analytics targets to track progress toward business objectives, such as reaching
 * a total sales amount or a number of orders within a given period.
 *
 * Each target is associated with a single metric and can optionally include filter expressions to
 * narrow the evaluated data. Use the
 * [`analyticsTargets`](https://shopify.dev/docs/api/admin-graphql/latest/queries/analyticsTargets) query
 * to retrieve targets, and the
 * [`analyticsTargetCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsTargetCreate),
 * [`analyticsTargetUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsTargetUpdate),
 * and [`analyticsTargetsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsTargetsDelete)
 * mutations to manage them.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AnalyticsTarget implements com.shopify.admin.types.Node {
  /**
   * The date and time when the analytics target was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The currency code stored on the target's expected value. Defaults to the shop currency when the target is created.
   */
  private CurrencyCode currencyCode;

  /**
   * The end date of the period over which progress toward the target is measured.
   */
  private LocalDate endDate;

  /**
   * The goal value that the merchant aims to reach for the tracked metric within the target period. Must be greater than 0.
   */
  private String expectedValue;

  /**
   * An optional filter expression to narrow the data evaluated against this target. For example, `shipping_country = 'US'`.
   */
  private String filters;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The identifier of the analytics metric that this target tracks, such as `total_sales` or `orders`.
   */
  private String metric;

  /**
   * A human-readable label for the target, such as `Q1 Sales Target`.
   */
  private String name;

  /**
   * The target's expected value converted to a specified presentment currency.
   * Returns `null` when the target metric isn't a money metric or the conversion
   * rate is unavailable.
   */
  private MoneyV2 presentmentExpectedValue;

  /**
   * A generated [ShopifyQL](https://shopify.dev/docs/api/shopifyql) query string
   * that fetches the current value of the tracked metric for this target's date
   * range and filters.
   */
  private String shopifyqlQuery;

  /**
   * The start date of the period over which progress toward the target is measured.
   */
  private LocalDate startDate;

  /**
   * The date and time when the analytics target was last updated.
   */
  private OffsetDateTime updatedAt;

  public AnalyticsTarget() {
  }

  /**
   * The date and time when the analytics target was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The currency code stored on the target's expected value. Defaults to the shop currency when the target is created.
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
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
   * An optional filter expression to narrow the data evaluated against this target. For example, `shipping_country = 'US'`.
   */
  public String getFilters() {
    return filters;
  }

  public void setFilters(String filters) {
    this.filters = filters;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
   * A human-readable label for the target, such as `Q1 Sales Target`.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The target's expected value converted to a specified presentment currency.
   * Returns `null` when the target metric isn't a money metric or the conversion
   * rate is unavailable.
   */
  public MoneyV2 getPresentmentExpectedValue() {
    return presentmentExpectedValue;
  }

  public void setPresentmentExpectedValue(MoneyV2 presentmentExpectedValue) {
    this.presentmentExpectedValue = presentmentExpectedValue;
  }

  /**
   * A generated [ShopifyQL](https://shopify.dev/docs/api/shopifyql) query string
   * that fetches the current value of the tracked metric for this target's date
   * range and filters.
   */
  public String getShopifyqlQuery() {
    return shopifyqlQuery;
  }

  public void setShopifyqlQuery(String shopifyqlQuery) {
    this.shopifyqlQuery = shopifyqlQuery;
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
   * The date and time when the analytics target was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "AnalyticsTarget{createdAt='" + createdAt + "', currencyCode='" + currencyCode + "', endDate='" + endDate + "', expectedValue='" + expectedValue + "', filters='" + filters + "', id='" + id + "', metric='" + metric + "', name='" + name + "', presentmentExpectedValue='" + presentmentExpectedValue + "', shopifyqlQuery='" + shopifyqlQuery + "', startDate='" + startDate + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AnalyticsTarget that = (AnalyticsTarget) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(endDate, that.endDate) &&
        Objects.equals(expectedValue, that.expectedValue) &&
        Objects.equals(filters, that.filters) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metric, that.metric) &&
        Objects.equals(name, that.name) &&
        Objects.equals(presentmentExpectedValue, that.presentmentExpectedValue) &&
        Objects.equals(shopifyqlQuery, that.shopifyqlQuery) &&
        Objects.equals(startDate, that.startDate) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, currencyCode, endDate, expectedValue, filters, id, metric, name, presentmentExpectedValue, shopifyqlQuery, startDate, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the analytics target was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The currency code stored on the target's expected value. Defaults to the shop currency when the target is created.
     */
    private CurrencyCode currencyCode;

    /**
     * The end date of the period over which progress toward the target is measured.
     */
    private LocalDate endDate;

    /**
     * The goal value that the merchant aims to reach for the tracked metric within the target period. Must be greater than 0.
     */
    private String expectedValue;

    /**
     * An optional filter expression to narrow the data evaluated against this target. For example, `shipping_country = 'US'`.
     */
    private String filters;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The identifier of the analytics metric that this target tracks, such as `total_sales` or `orders`.
     */
    private String metric;

    /**
     * A human-readable label for the target, such as `Q1 Sales Target`.
     */
    private String name;

    /**
     * The target's expected value converted to a specified presentment currency.
     * Returns `null` when the target metric isn't a money metric or the conversion
     * rate is unavailable.
     */
    private MoneyV2 presentmentExpectedValue;

    /**
     * A generated [ShopifyQL](https://shopify.dev/docs/api/shopifyql) query string
     * that fetches the current value of the tracked metric for this target's date
     * range and filters.
     */
    private String shopifyqlQuery;

    /**
     * The start date of the period over which progress toward the target is measured.
     */
    private LocalDate startDate;

    /**
     * The date and time when the analytics target was last updated.
     */
    private OffsetDateTime updatedAt;

    public AnalyticsTarget build() {
      AnalyticsTarget result = new AnalyticsTarget();
      result.createdAt = this.createdAt;
      result.currencyCode = this.currencyCode;
      result.endDate = this.endDate;
      result.expectedValue = this.expectedValue;
      result.filters = this.filters;
      result.id = this.id;
      result.metric = this.metric;
      result.name = this.name;
      result.presentmentExpectedValue = this.presentmentExpectedValue;
      result.shopifyqlQuery = this.shopifyqlQuery;
      result.startDate = this.startDate;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The date and time when the analytics target was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The currency code stored on the target's expected value. Defaults to the shop currency when the target is created.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
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
     * An optional filter expression to narrow the data evaluated against this target. For example, `shipping_country = 'US'`.
     */
    public Builder filters(String filters) {
      this.filters = filters;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The identifier of the analytics metric that this target tracks, such as `total_sales` or `orders`.
     */
    public Builder metric(String metric) {
      this.metric = metric;
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
     * The target's expected value converted to a specified presentment currency.
     * Returns `null` when the target metric isn't a money metric or the conversion
     * rate is unavailable.
     */
    public Builder presentmentExpectedValue(MoneyV2 presentmentExpectedValue) {
      this.presentmentExpectedValue = presentmentExpectedValue;
      return this;
    }

    /**
     * A generated [ShopifyQL](https://shopify.dev/docs/api/shopifyql) query string
     * that fetches the current value of the tracked metric for this target's date
     * range and filters.
     */
    public Builder shopifyqlQuery(String shopifyqlQuery) {
      this.shopifyqlQuery = shopifyqlQuery;
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
     * The date and time when the analytics target was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}

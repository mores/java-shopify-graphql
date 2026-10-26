package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a value-based rate.
 */
public class DeliveryValueBasedRateUpdateInput {
  /**
   * The ID of the rate to update.
   */
  private String id;

  /**
   * The price charged for this rate.
   */
  private MoneyInput price;

  /**
   * The minimum cart value for this rate.
   */
  private MoneyInput minValue;

  /**
   * The maximum cart value (inclusive) for this rate. Set to null for no upper limit.
   */
  private MoneyInput maxValue;

  /**
   * The minimum transit time estimate in seconds.
   */
  private Integer transitTimeMinSeconds;

  /**
   * The maximum transit time estimate in seconds.
   */
  private Integer transitTimeMaxSeconds;

  public DeliveryValueBasedRateUpdateInput() {
  }

  /**
   * The ID of the rate to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The price charged for this rate.
   */
  public MoneyInput getPrice() {
    return price;
  }

  public void setPrice(MoneyInput price) {
    this.price = price;
  }

  /**
   * The minimum cart value for this rate.
   */
  public MoneyInput getMinValue() {
    return minValue;
  }

  public void setMinValue(MoneyInput minValue) {
    this.minValue = minValue;
  }

  /**
   * The maximum cart value (inclusive) for this rate. Set to null for no upper limit.
   */
  public MoneyInput getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(MoneyInput maxValue) {
    this.maxValue = maxValue;
  }

  /**
   * The minimum transit time estimate in seconds.
   */
  public Integer getTransitTimeMinSeconds() {
    return transitTimeMinSeconds;
  }

  public void setTransitTimeMinSeconds(Integer transitTimeMinSeconds) {
    this.transitTimeMinSeconds = transitTimeMinSeconds;
  }

  /**
   * The maximum transit time estimate in seconds.
   */
  public Integer getTransitTimeMaxSeconds() {
    return transitTimeMaxSeconds;
  }

  public void setTransitTimeMaxSeconds(Integer transitTimeMaxSeconds) {
    this.transitTimeMaxSeconds = transitTimeMaxSeconds;
  }

  @Override
  public String toString() {
    return "DeliveryValueBasedRateUpdateInput{id='" + id + "', price='" + price + "', minValue='" + minValue + "', maxValue='" + maxValue + "', transitTimeMinSeconds='" + transitTimeMinSeconds + "', transitTimeMaxSeconds='" + transitTimeMaxSeconds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryValueBasedRateUpdateInput that = (DeliveryValueBasedRateUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(price, that.price) &&
        Objects.equals(minValue, that.minValue) &&
        Objects.equals(maxValue, that.maxValue) &&
        Objects.equals(transitTimeMinSeconds, that.transitTimeMinSeconds) &&
        Objects.equals(transitTimeMaxSeconds, that.transitTimeMaxSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price, minValue, maxValue, transitTimeMinSeconds, transitTimeMaxSeconds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the rate to update.
     */
    private String id;

    /**
     * The price charged for this rate.
     */
    private MoneyInput price;

    /**
     * The minimum cart value for this rate.
     */
    private MoneyInput minValue;

    /**
     * The maximum cart value (inclusive) for this rate. Set to null for no upper limit.
     */
    private MoneyInput maxValue;

    /**
     * The minimum transit time estimate in seconds.
     */
    private Integer transitTimeMinSeconds;

    /**
     * The maximum transit time estimate in seconds.
     */
    private Integer transitTimeMaxSeconds;

    public DeliveryValueBasedRateUpdateInput build() {
      DeliveryValueBasedRateUpdateInput result = new DeliveryValueBasedRateUpdateInput();
      result.id = this.id;
      result.price = this.price;
      result.minValue = this.minValue;
      result.maxValue = this.maxValue;
      result.transitTimeMinSeconds = this.transitTimeMinSeconds;
      result.transitTimeMaxSeconds = this.transitTimeMaxSeconds;
      return result;
    }

    /**
     * The ID of the rate to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The price charged for this rate.
     */
    public Builder price(MoneyInput price) {
      this.price = price;
      return this;
    }

    /**
     * The minimum cart value for this rate.
     */
    public Builder minValue(MoneyInput minValue) {
      this.minValue = minValue;
      return this;
    }

    /**
     * The maximum cart value (inclusive) for this rate. Set to null for no upper limit.
     */
    public Builder maxValue(MoneyInput maxValue) {
      this.maxValue = maxValue;
      return this;
    }

    /**
     * The minimum transit time estimate in seconds.
     */
    public Builder transitTimeMinSeconds(Integer transitTimeMinSeconds) {
      this.transitTimeMinSeconds = transitTimeMinSeconds;
      return this;
    }

    /**
     * The maximum transit time estimate in seconds.
     */
    public Builder transitTimeMaxSeconds(Integer transitTimeMaxSeconds) {
      this.transitTimeMaxSeconds = transitTimeMaxSeconds;
      return this;
    }
  }
}

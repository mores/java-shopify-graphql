package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A value-based shipping rate.
 *
 * Defines price, optional transit time estimates, and the cart-value range for this rate.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryValueBasedRate implements com.shopify.admin.types.DeliveryRate {
  /**
   * A globally unique ID.
   */
  private String id;

  /**
   * The maximum cart value (inclusive) for this rate. Null means no upper limit.
   */
  private MoneyV2 maxValue;

  /**
   * The minimum cart value (inclusive) for this rate.
   */
  private MoneyV2 minValue;

  /**
   * The price charged for this rate.
   */
  private MoneyV2 price;

  /**
   * The maximum transit time estimate in seconds.
   */
  private Integer transitTimeMaxSeconds;

  /**
   * The minimum transit time estimate in seconds.
   */
  private Integer transitTimeMinSeconds;

  public DeliveryValueBasedRate() {
  }

  /**
   * A globally unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The maximum cart value (inclusive) for this rate. Null means no upper limit.
   */
  public MoneyV2 getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(MoneyV2 maxValue) {
    this.maxValue = maxValue;
  }

  /**
   * The minimum cart value (inclusive) for this rate.
   */
  public MoneyV2 getMinValue() {
    return minValue;
  }

  public void setMinValue(MoneyV2 minValue) {
    this.minValue = minValue;
  }

  /**
   * The price charged for this rate.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
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

  /**
   * The minimum transit time estimate in seconds.
   */
  public Integer getTransitTimeMinSeconds() {
    return transitTimeMinSeconds;
  }

  public void setTransitTimeMinSeconds(Integer transitTimeMinSeconds) {
    this.transitTimeMinSeconds = transitTimeMinSeconds;
  }

  @Override
  public String toString() {
    return "DeliveryValueBasedRate{id='" + id + "', maxValue='" + maxValue + "', minValue='" + minValue + "', price='" + price + "', transitTimeMaxSeconds='" + transitTimeMaxSeconds + "', transitTimeMinSeconds='" + transitTimeMinSeconds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryValueBasedRate that = (DeliveryValueBasedRate) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(maxValue, that.maxValue) &&
        Objects.equals(minValue, that.minValue) &&
        Objects.equals(price, that.price) &&
        Objects.equals(transitTimeMaxSeconds, that.transitTimeMaxSeconds) &&
        Objects.equals(transitTimeMinSeconds, that.transitTimeMinSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, maxValue, minValue, price, transitTimeMaxSeconds, transitTimeMinSeconds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally unique ID.
     */
    private String id;

    /**
     * The maximum cart value (inclusive) for this rate. Null means no upper limit.
     */
    private MoneyV2 maxValue;

    /**
     * The minimum cart value (inclusive) for this rate.
     */
    private MoneyV2 minValue;

    /**
     * The price charged for this rate.
     */
    private MoneyV2 price;

    /**
     * The maximum transit time estimate in seconds.
     */
    private Integer transitTimeMaxSeconds;

    /**
     * The minimum transit time estimate in seconds.
     */
    private Integer transitTimeMinSeconds;

    public DeliveryValueBasedRate build() {
      DeliveryValueBasedRate result = new DeliveryValueBasedRate();
      result.id = this.id;
      result.maxValue = this.maxValue;
      result.minValue = this.minValue;
      result.price = this.price;
      result.transitTimeMaxSeconds = this.transitTimeMaxSeconds;
      result.transitTimeMinSeconds = this.transitTimeMinSeconds;
      return result;
    }

    /**
     * A globally unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The maximum cart value (inclusive) for this rate. Null means no upper limit.
     */
    public Builder maxValue(MoneyV2 maxValue) {
      this.maxValue = maxValue;
      return this;
    }

    /**
     * The minimum cart value (inclusive) for this rate.
     */
    public Builder minValue(MoneyV2 minValue) {
      this.minValue = minValue;
      return this;
    }

    /**
     * The price charged for this rate.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }

    /**
     * The maximum transit time estimate in seconds.
     */
    public Builder transitTimeMaxSeconds(Integer transitTimeMaxSeconds) {
      this.transitTimeMaxSeconds = transitTimeMaxSeconds;
      return this;
    }

    /**
     * The minimum transit time estimate in seconds.
     */
    public Builder transitTimeMinSeconds(Integer transitTimeMinSeconds) {
      this.transitTimeMinSeconds = transitTimeMinSeconds;
      return this;
    }
  }
}

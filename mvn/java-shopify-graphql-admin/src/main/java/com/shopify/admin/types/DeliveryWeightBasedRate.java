package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A weight-based shipping rate.
 *
 * Weight-based rates charge different prices depending on package weight, which can
 * include packaging weight in addition to item weight, and may include optional
 * transit time estimates.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryWeightBasedRate implements com.shopify.admin.types.DeliveryRate {
  /**
   * A globally unique ID.
   */
  private String id;

  /**
   * The maximum package weight for this rate tier.
   */
  private Weight maxWeight;

  /**
   * The minimum package weight for this rate tier.
   */
  private Weight minWeight;

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

  public DeliveryWeightBasedRate() {
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
   * The maximum package weight for this rate tier.
   */
  public Weight getMaxWeight() {
    return maxWeight;
  }

  public void setMaxWeight(Weight maxWeight) {
    this.maxWeight = maxWeight;
  }

  /**
   * The minimum package weight for this rate tier.
   */
  public Weight getMinWeight() {
    return minWeight;
  }

  public void setMinWeight(Weight minWeight) {
    this.minWeight = minWeight;
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
    return "DeliveryWeightBasedRate{id='" + id + "', maxWeight='" + maxWeight + "', minWeight='" + minWeight + "', price='" + price + "', transitTimeMaxSeconds='" + transitTimeMaxSeconds + "', transitTimeMinSeconds='" + transitTimeMinSeconds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryWeightBasedRate that = (DeliveryWeightBasedRate) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(maxWeight, that.maxWeight) &&
        Objects.equals(minWeight, that.minWeight) &&
        Objects.equals(price, that.price) &&
        Objects.equals(transitTimeMaxSeconds, that.transitTimeMaxSeconds) &&
        Objects.equals(transitTimeMinSeconds, that.transitTimeMinSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, maxWeight, minWeight, price, transitTimeMaxSeconds, transitTimeMinSeconds);
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
     * The maximum package weight for this rate tier.
     */
    private Weight maxWeight;

    /**
     * The minimum package weight for this rate tier.
     */
    private Weight minWeight;

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

    public DeliveryWeightBasedRate build() {
      DeliveryWeightBasedRate result = new DeliveryWeightBasedRate();
      result.id = this.id;
      result.maxWeight = this.maxWeight;
      result.minWeight = this.minWeight;
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
     * The maximum package weight for this rate tier.
     */
    public Builder maxWeight(Weight maxWeight) {
      this.maxWeight = maxWeight;
      return this;
    }

    /**
     * The minimum package weight for this rate tier.
     */
    public Builder minWeight(Weight minWeight) {
      this.minWeight = minWeight;
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

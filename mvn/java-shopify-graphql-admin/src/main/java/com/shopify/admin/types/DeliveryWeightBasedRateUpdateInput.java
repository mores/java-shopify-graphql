package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a weight-based rate.
 */
public class DeliveryWeightBasedRateUpdateInput {
  /**
   * The globally unique ID of the weight-based rate to update.
   */
  private String id;

  /**
   * The price charged for this rate tier.
   */
  private MoneyInput price;

  /**
   * The minimum estimated transit time in seconds.
   */
  private Integer transitTimeMinSeconds;

  /**
   * The maximum estimated transit time in seconds.
   */
  private Integer transitTimeMaxSeconds;

  /**
   * The minimum package weight for this rate tier.
   */
  private WeightInput minWeight;

  /**
   * The maximum package weight for this rate tier. Null means no upper weight limit.
   */
  private WeightInput maxWeight;

  public DeliveryWeightBasedRateUpdateInput() {
  }

  /**
   * The globally unique ID of the weight-based rate to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The price charged for this rate tier.
   */
  public MoneyInput getPrice() {
    return price;
  }

  public void setPrice(MoneyInput price) {
    this.price = price;
  }

  /**
   * The minimum estimated transit time in seconds.
   */
  public Integer getTransitTimeMinSeconds() {
    return transitTimeMinSeconds;
  }

  public void setTransitTimeMinSeconds(Integer transitTimeMinSeconds) {
    this.transitTimeMinSeconds = transitTimeMinSeconds;
  }

  /**
   * The maximum estimated transit time in seconds.
   */
  public Integer getTransitTimeMaxSeconds() {
    return transitTimeMaxSeconds;
  }

  public void setTransitTimeMaxSeconds(Integer transitTimeMaxSeconds) {
    this.transitTimeMaxSeconds = transitTimeMaxSeconds;
  }

  /**
   * The minimum package weight for this rate tier.
   */
  public WeightInput getMinWeight() {
    return minWeight;
  }

  public void setMinWeight(WeightInput minWeight) {
    this.minWeight = minWeight;
  }

  /**
   * The maximum package weight for this rate tier. Null means no upper weight limit.
   */
  public WeightInput getMaxWeight() {
    return maxWeight;
  }

  public void setMaxWeight(WeightInput maxWeight) {
    this.maxWeight = maxWeight;
  }

  @Override
  public String toString() {
    return "DeliveryWeightBasedRateUpdateInput{id='" + id + "', price='" + price + "', transitTimeMinSeconds='" + transitTimeMinSeconds + "', transitTimeMaxSeconds='" + transitTimeMaxSeconds + "', minWeight='" + minWeight + "', maxWeight='" + maxWeight + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryWeightBasedRateUpdateInput that = (DeliveryWeightBasedRateUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(price, that.price) &&
        Objects.equals(transitTimeMinSeconds, that.transitTimeMinSeconds) &&
        Objects.equals(transitTimeMaxSeconds, that.transitTimeMaxSeconds) &&
        Objects.equals(minWeight, that.minWeight) &&
        Objects.equals(maxWeight, that.maxWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, price, transitTimeMinSeconds, transitTimeMaxSeconds, minWeight, maxWeight);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The globally unique ID of the weight-based rate to update.
     */
    private String id;

    /**
     * The price charged for this rate tier.
     */
    private MoneyInput price;

    /**
     * The minimum estimated transit time in seconds.
     */
    private Integer transitTimeMinSeconds;

    /**
     * The maximum estimated transit time in seconds.
     */
    private Integer transitTimeMaxSeconds;

    /**
     * The minimum package weight for this rate tier.
     */
    private WeightInput minWeight;

    /**
     * The maximum package weight for this rate tier. Null means no upper weight limit.
     */
    private WeightInput maxWeight;

    public DeliveryWeightBasedRateUpdateInput build() {
      DeliveryWeightBasedRateUpdateInput result = new DeliveryWeightBasedRateUpdateInput();
      result.id = this.id;
      result.price = this.price;
      result.transitTimeMinSeconds = this.transitTimeMinSeconds;
      result.transitTimeMaxSeconds = this.transitTimeMaxSeconds;
      result.minWeight = this.minWeight;
      result.maxWeight = this.maxWeight;
      return result;
    }

    /**
     * The globally unique ID of the weight-based rate to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The price charged for this rate tier.
     */
    public Builder price(MoneyInput price) {
      this.price = price;
      return this;
    }

    /**
     * The minimum estimated transit time in seconds.
     */
    public Builder transitTimeMinSeconds(Integer transitTimeMinSeconds) {
      this.transitTimeMinSeconds = transitTimeMinSeconds;
      return this;
    }

    /**
     * The maximum estimated transit time in seconds.
     */
    public Builder transitTimeMaxSeconds(Integer transitTimeMaxSeconds) {
      this.transitTimeMaxSeconds = transitTimeMaxSeconds;
      return this;
    }

    /**
     * The minimum package weight for this rate tier.
     */
    public Builder minWeight(WeightInput minWeight) {
      this.minWeight = minWeight;
      return this;
    }

    /**
     * The maximum package weight for this rate tier. Null means no upper weight limit.
     */
    public Builder maxWeight(WeightInput maxWeight) {
      this.maxWeight = maxWeight;
      return this;
    }
  }
}

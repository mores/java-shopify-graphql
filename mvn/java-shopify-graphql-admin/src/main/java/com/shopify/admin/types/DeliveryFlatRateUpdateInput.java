package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a flat rate.
 */
public class DeliveryFlatRateUpdateInput {
  /**
   * The fixed price charged for this rate.
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

  public DeliveryFlatRateUpdateInput() {
  }

  /**
   * The fixed price charged for this rate.
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

  @Override
  public String toString() {
    return "DeliveryFlatRateUpdateInput{price='" + price + "', transitTimeMinSeconds='" + transitTimeMinSeconds + "', transitTimeMaxSeconds='" + transitTimeMaxSeconds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryFlatRateUpdateInput that = (DeliveryFlatRateUpdateInput) o;
    return Objects.equals(price, that.price) &&
        Objects.equals(transitTimeMinSeconds, that.transitTimeMinSeconds) &&
        Objects.equals(transitTimeMaxSeconds, that.transitTimeMaxSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, transitTimeMinSeconds, transitTimeMaxSeconds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The fixed price charged for this rate.
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

    public DeliveryFlatRateUpdateInput build() {
      DeliveryFlatRateUpdateInput result = new DeliveryFlatRateUpdateInput();
      result.price = this.price;
      result.transitTimeMinSeconds = this.transitTimeMinSeconds;
      result.transitTimeMaxSeconds = this.transitTimeMaxSeconds;
      return result;
    }

    /**
     * The fixed price charged for this rate.
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
  }
}

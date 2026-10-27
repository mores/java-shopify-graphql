package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The multiple fulfillment configuration of a subscription delivery policy: how
 * many fulfillments occur in each billing cycle, and the cadence between them.
 */
public class SubscriptionContractCalculationMultipleFulfillmentConfig {
  /**
   * The cadence for calculating fulfillment dates within each billing cycle.
   */
  private SubscriptionContractCalculationCadence cadence;

  /**
   * The number of fulfillments per billing cycle.
   */
  private int numberOfFulfillments;

  public SubscriptionContractCalculationMultipleFulfillmentConfig() {
  }

  /**
   * The cadence for calculating fulfillment dates within each billing cycle.
   */
  public SubscriptionContractCalculationCadence getCadence() {
    return cadence;
  }

  public void setCadence(SubscriptionContractCalculationCadence cadence) {
    this.cadence = cadence;
  }

  /**
   * The number of fulfillments per billing cycle.
   */
  public int getNumberOfFulfillments() {
    return numberOfFulfillments;
  }

  public void setNumberOfFulfillments(int numberOfFulfillments) {
    this.numberOfFulfillments = numberOfFulfillments;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationMultipleFulfillmentConfig{cadence='" + cadence + "', numberOfFulfillments='" + numberOfFulfillments + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationMultipleFulfillmentConfig that = (SubscriptionContractCalculationMultipleFulfillmentConfig) o;
    return Objects.equals(cadence, that.cadence) &&
        numberOfFulfillments == that.numberOfFulfillments;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cadence, numberOfFulfillments);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The cadence for calculating fulfillment dates within each billing cycle.
     */
    private SubscriptionContractCalculationCadence cadence;

    /**
     * The number of fulfillments per billing cycle.
     */
    private int numberOfFulfillments;

    public SubscriptionContractCalculationMultipleFulfillmentConfig build() {
      SubscriptionContractCalculationMultipleFulfillmentConfig result = new SubscriptionContractCalculationMultipleFulfillmentConfig();
      result.cadence = this.cadence;
      result.numberOfFulfillments = this.numberOfFulfillments;
      return result;
    }

    /**
     * The cadence for calculating fulfillment dates within each billing cycle.
     */
    public Builder cadence(SubscriptionContractCalculationCadence cadence) {
      this.cadence = cadence;
      return this;
    }

    /**
     * The number of fulfillments per billing cycle.
     */
    public Builder numberOfFulfillments(int numberOfFulfillments) {
      this.numberOfFulfillments = numberOfFulfillments;
      return this;
    }
  }
}

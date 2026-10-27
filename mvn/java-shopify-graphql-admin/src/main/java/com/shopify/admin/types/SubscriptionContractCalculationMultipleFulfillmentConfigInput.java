package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for multiple fulfillment configuration used for contract calculation.
 */
public class SubscriptionContractCalculationMultipleFulfillmentConfigInput {
  /**
   * The cadence for calculating fulfillment dates for multiple fulfillments.
   */
  private SubscriptionContractCalculationCadenceInput cadence;

  /**
   * The number of fulfillments per billing cycle. Must be at least 2.
   */
  private int numberOfFulfillments;

  public SubscriptionContractCalculationMultipleFulfillmentConfigInput() {
  }

  /**
   * The cadence for calculating fulfillment dates for multiple fulfillments.
   */
  public SubscriptionContractCalculationCadenceInput getCadence() {
    return cadence;
  }

  public void setCadence(SubscriptionContractCalculationCadenceInput cadence) {
    this.cadence = cadence;
  }

  /**
   * The number of fulfillments per billing cycle. Must be at least 2.
   */
  public int getNumberOfFulfillments() {
    return numberOfFulfillments;
  }

  public void setNumberOfFulfillments(int numberOfFulfillments) {
    this.numberOfFulfillments = numberOfFulfillments;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationMultipleFulfillmentConfigInput{cadence='" + cadence + "', numberOfFulfillments='" + numberOfFulfillments + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationMultipleFulfillmentConfigInput that = (SubscriptionContractCalculationMultipleFulfillmentConfigInput) o;
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
     * The cadence for calculating fulfillment dates for multiple fulfillments.
     */
    private SubscriptionContractCalculationCadenceInput cadence;

    /**
     * The number of fulfillments per billing cycle. Must be at least 2.
     */
    private int numberOfFulfillments;

    public SubscriptionContractCalculationMultipleFulfillmentConfigInput build() {
      SubscriptionContractCalculationMultipleFulfillmentConfigInput result = new SubscriptionContractCalculationMultipleFulfillmentConfigInput();
      result.cadence = this.cadence;
      result.numberOfFulfillments = this.numberOfFulfillments;
      return result;
    }

    /**
     * The cadence for calculating fulfillment dates for multiple fulfillments.
     */
    public Builder cadence(SubscriptionContractCalculationCadenceInput cadence) {
      this.cadence = cadence;
      return this;
    }

    /**
     * The number of fulfillments per billing cycle. Must be at least 2.
     */
    public Builder numberOfFulfillments(int numberOfFulfillments) {
      this.numberOfFulfillments = numberOfFulfillments;
      return this;
    }
  }
}

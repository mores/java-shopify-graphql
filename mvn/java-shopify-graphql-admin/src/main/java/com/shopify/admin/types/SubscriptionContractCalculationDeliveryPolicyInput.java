package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for subscription delivery policy used for contract calculation.
 */
public class SubscriptionContractCalculationDeliveryPolicyInput {
  /**
   * The anchors for calculating fulfillment dates.
   */
  private List<SubscriptionContractCalculationAnchorInput> anchors = Collections.emptyList();

  /**
   * Configuration for multiple fulfillment deliveries.
   */
  private SubscriptionContractCalculationMultipleFulfillmentConfigInput multiFulfillment;

  public SubscriptionContractCalculationDeliveryPolicyInput() {
  }

  /**
   * The anchors for calculating fulfillment dates.
   */
  public List<SubscriptionContractCalculationAnchorInput> getAnchors() {
    return anchors;
  }

  public void setAnchors(List<SubscriptionContractCalculationAnchorInput> anchors) {
    this.anchors = anchors;
  }

  /**
   * Configuration for multiple fulfillment deliveries.
   */
  public SubscriptionContractCalculationMultipleFulfillmentConfigInput getMultiFulfillment() {
    return multiFulfillment;
  }

  public void setMultiFulfillment(
      SubscriptionContractCalculationMultipleFulfillmentConfigInput multiFulfillment) {
    this.multiFulfillment = multiFulfillment;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationDeliveryPolicyInput{anchors='" + anchors + "', multiFulfillment='" + multiFulfillment + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationDeliveryPolicyInput that = (SubscriptionContractCalculationDeliveryPolicyInput) o;
    return Objects.equals(anchors, that.anchors) &&
        Objects.equals(multiFulfillment, that.multiFulfillment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchors, multiFulfillment);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The anchors for calculating fulfillment dates.
     */
    private List<SubscriptionContractCalculationAnchorInput> anchors = Collections.emptyList();

    /**
     * Configuration for multiple fulfillment deliveries.
     */
    private SubscriptionContractCalculationMultipleFulfillmentConfigInput multiFulfillment;

    public SubscriptionContractCalculationDeliveryPolicyInput build() {
      SubscriptionContractCalculationDeliveryPolicyInput result = new SubscriptionContractCalculationDeliveryPolicyInput();
      result.anchors = this.anchors;
      result.multiFulfillment = this.multiFulfillment;
      return result;
    }

    /**
     * The anchors for calculating fulfillment dates.
     */
    public Builder anchors(List<SubscriptionContractCalculationAnchorInput> anchors) {
      this.anchors = anchors;
      return this;
    }

    /**
     * Configuration for multiple fulfillment deliveries.
     */
    public Builder multiFulfillment(
        SubscriptionContractCalculationMultipleFulfillmentConfigInput multiFulfillment) {
      this.multiFulfillment = multiFulfillment;
      return this;
    }
  }
}

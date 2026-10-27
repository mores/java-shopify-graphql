package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for subscription billing policy used for contract calculation.
 */
public class SubscriptionContractCalculationBillingPolicyInput {
  /**
   * The anchors for calculating billing cycle dates.
   */
  private List<SubscriptionContractCalculationAnchorInput> anchors = Collections.emptyList();

  /**
   * The cadence for calculating billing cycle dates.
   */
  private SubscriptionContractCalculationCadenceInput cadence;

  public SubscriptionContractCalculationBillingPolicyInput() {
  }

  /**
   * The anchors for calculating billing cycle dates.
   */
  public List<SubscriptionContractCalculationAnchorInput> getAnchors() {
    return anchors;
  }

  public void setAnchors(List<SubscriptionContractCalculationAnchorInput> anchors) {
    this.anchors = anchors;
  }

  /**
   * The cadence for calculating billing cycle dates.
   */
  public SubscriptionContractCalculationCadenceInput getCadence() {
    return cadence;
  }

  public void setCadence(SubscriptionContractCalculationCadenceInput cadence) {
    this.cadence = cadence;
  }

  @Override
  public String toString() {
    return "SubscriptionContractCalculationBillingPolicyInput{anchors='" + anchors + "', cadence='" + cadence + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionContractCalculationBillingPolicyInput that = (SubscriptionContractCalculationBillingPolicyInput) o;
    return Objects.equals(anchors, that.anchors) &&
        Objects.equals(cadence, that.cadence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchors, cadence);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The anchors for calculating billing cycle dates.
     */
    private List<SubscriptionContractCalculationAnchorInput> anchors = Collections.emptyList();

    /**
     * The cadence for calculating billing cycle dates.
     */
    private SubscriptionContractCalculationCadenceInput cadence;

    public SubscriptionContractCalculationBillingPolicyInput build() {
      SubscriptionContractCalculationBillingPolicyInput result = new SubscriptionContractCalculationBillingPolicyInput();
      result.anchors = this.anchors;
      result.cadence = this.cadence;
      return result;
    }

    /**
     * The anchors for calculating billing cycle dates.
     */
    public Builder anchors(List<SubscriptionContractCalculationAnchorInput> anchors) {
      this.anchors = anchors;
      return this;
    }

    /**
     * The cadence for calculating billing cycle dates.
     */
    public Builder cadence(SubscriptionContractCalculationCadenceInput cadence) {
      this.cadence = cadence;
      return this;
    }
  }
}

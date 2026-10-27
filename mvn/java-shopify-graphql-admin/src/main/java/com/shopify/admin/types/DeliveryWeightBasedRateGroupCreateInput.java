package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating a weight-based rate group.
 */
public class DeliveryWeightBasedRateGroupCreateInput {
  /**
   * The weight-based rates for this rate group.
   */
  private List<DeliveryWeightBasedRateCreateInput> rates;

  /**
   * Collection and origin location conditions for this rate group.
   */
  private DeliveryRateConditionsCreateInput conditions;

  public DeliveryWeightBasedRateGroupCreateInput() {
  }

  /**
   * The weight-based rates for this rate group.
   */
  public List<DeliveryWeightBasedRateCreateInput> getRates() {
    return rates;
  }

  public void setRates(List<DeliveryWeightBasedRateCreateInput> rates) {
    this.rates = rates;
  }

  /**
   * Collection and origin location conditions for this rate group.
   */
  public DeliveryRateConditionsCreateInput getConditions() {
    return conditions;
  }

  public void setConditions(DeliveryRateConditionsCreateInput conditions) {
    this.conditions = conditions;
  }

  @Override
  public String toString() {
    return "DeliveryWeightBasedRateGroupCreateInput{rates='" + rates + "', conditions='" + conditions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryWeightBasedRateGroupCreateInput that = (DeliveryWeightBasedRateGroupCreateInput) o;
    return Objects.equals(rates, that.rates) &&
        Objects.equals(conditions, that.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rates, conditions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The weight-based rates for this rate group.
     */
    private List<DeliveryWeightBasedRateCreateInput> rates;

    /**
     * Collection and origin location conditions for this rate group.
     */
    private DeliveryRateConditionsCreateInput conditions;

    public DeliveryWeightBasedRateGroupCreateInput build() {
      DeliveryWeightBasedRateGroupCreateInput result = new DeliveryWeightBasedRateGroupCreateInput();
      result.rates = this.rates;
      result.conditions = this.conditions;
      return result;
    }

    /**
     * The weight-based rates for this rate group.
     */
    public Builder rates(List<DeliveryWeightBasedRateCreateInput> rates) {
      this.rates = rates;
      return this;
    }

    /**
     * Collection and origin location conditions for this rate group.
     */
    public Builder conditions(DeliveryRateConditionsCreateInput conditions) {
      this.conditions = conditions;
      return this;
    }
  }
}

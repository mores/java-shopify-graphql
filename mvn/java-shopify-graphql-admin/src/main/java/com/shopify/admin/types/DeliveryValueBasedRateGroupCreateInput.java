package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating a rate group for a value-based shipping option.
 */
public class DeliveryValueBasedRateGroupCreateInput {
  /**
   * The rates to create in this rate group.
   */
  private List<DeliveryValueBasedRateCreateInput> rates;

  /**
   * Collection and origin location conditions for this rate group.
   */
  private DeliveryRateConditionsCreateInput conditions;

  public DeliveryValueBasedRateGroupCreateInput() {
  }

  /**
   * The rates to create in this rate group.
   */
  public List<DeliveryValueBasedRateCreateInput> getRates() {
    return rates;
  }

  public void setRates(List<DeliveryValueBasedRateCreateInput> rates) {
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
    return "DeliveryValueBasedRateGroupCreateInput{rates='" + rates + "', conditions='" + conditions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryValueBasedRateGroupCreateInput that = (DeliveryValueBasedRateGroupCreateInput) o;
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
     * The rates to create in this rate group.
     */
    private List<DeliveryValueBasedRateCreateInput> rates;

    /**
     * Collection and origin location conditions for this rate group.
     */
    private DeliveryRateConditionsCreateInput conditions;

    public DeliveryValueBasedRateGroupCreateInput build() {
      DeliveryValueBasedRateGroupCreateInput result = new DeliveryValueBasedRateGroupCreateInput();
      result.rates = this.rates;
      result.conditions = this.conditions;
      return result;
    }

    /**
     * The rates to create in this rate group.
     */
    public Builder rates(List<DeliveryValueBasedRateCreateInput> rates) {
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

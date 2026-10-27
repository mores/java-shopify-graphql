package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for creating a flat rate group.
 */
public class DeliveryFlatRateGroupCreateInput {
  /**
   * The fixed-price rate and optional transit time.
   */
  private DeliveryFlatRateCreateInput rate;

  /**
   * Collection and origin location conditions for this rate group.
   */
  private DeliveryRateConditionsCreateInput conditions;

  public DeliveryFlatRateGroupCreateInput() {
  }

  /**
   * The fixed-price rate and optional transit time.
   */
  public DeliveryFlatRateCreateInput getRate() {
    return rate;
  }

  public void setRate(DeliveryFlatRateCreateInput rate) {
    this.rate = rate;
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
    return "DeliveryFlatRateGroupCreateInput{rate='" + rate + "', conditions='" + conditions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryFlatRateGroupCreateInput that = (DeliveryFlatRateGroupCreateInput) o;
    return Objects.equals(rate, that.rate) &&
        Objects.equals(conditions, that.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, conditions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The fixed-price rate and optional transit time.
     */
    private DeliveryFlatRateCreateInput rate;

    /**
     * Collection and origin location conditions for this rate group.
     */
    private DeliveryRateConditionsCreateInput conditions;

    public DeliveryFlatRateGroupCreateInput build() {
      DeliveryFlatRateGroupCreateInput result = new DeliveryFlatRateGroupCreateInput();
      result.rate = this.rate;
      result.conditions = this.conditions;
      return result;
    }

    /**
     * The fixed-price rate and optional transit time.
     */
    public Builder rate(DeliveryFlatRateCreateInput rate) {
      this.rate = rate;
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

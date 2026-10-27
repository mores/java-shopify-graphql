package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a flat rate group.
 */
public class DeliveryFlatRateGroupUpdateInput {
  /**
   * The globally unique ID of the flat rate group to update.
   */
  private String id;

  /**
   * Updates to the fixed-price rate and optional transit time.
   */
  private DeliveryFlatRateUpdateInput rate;

  /**
   * Collection and origin location conditions for this rate group.
   */
  private DeliveryRateConditionsUpdateInput conditions;

  public DeliveryFlatRateGroupUpdateInput() {
  }

  /**
   * The globally unique ID of the flat rate group to update.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Updates to the fixed-price rate and optional transit time.
   */
  public DeliveryFlatRateUpdateInput getRate() {
    return rate;
  }

  public void setRate(DeliveryFlatRateUpdateInput rate) {
    this.rate = rate;
  }

  /**
   * Collection and origin location conditions for this rate group.
   */
  public DeliveryRateConditionsUpdateInput getConditions() {
    return conditions;
  }

  public void setConditions(DeliveryRateConditionsUpdateInput conditions) {
    this.conditions = conditions;
  }

  @Override
  public String toString() {
    return "DeliveryFlatRateGroupUpdateInput{id='" + id + "', rate='" + rate + "', conditions='" + conditions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryFlatRateGroupUpdateInput that = (DeliveryFlatRateGroupUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(rate, that.rate) &&
        Objects.equals(conditions, that.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, rate, conditions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The globally unique ID of the flat rate group to update.
     */
    private String id;

    /**
     * Updates to the fixed-price rate and optional transit time.
     */
    private DeliveryFlatRateUpdateInput rate;

    /**
     * Collection and origin location conditions for this rate group.
     */
    private DeliveryRateConditionsUpdateInput conditions;

    public DeliveryFlatRateGroupUpdateInput build() {
      DeliveryFlatRateGroupUpdateInput result = new DeliveryFlatRateGroupUpdateInput();
      result.id = this.id;
      result.rate = this.rate;
      result.conditions = this.conditions;
      return result;
    }

    /**
     * The globally unique ID of the flat rate group to update.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Updates to the fixed-price rate and optional transit time.
     */
    public Builder rate(DeliveryFlatRateUpdateInput rate) {
      this.rate = rate;
      return this;
    }

    /**
     * Collection and origin location conditions for this rate group.
     */
    public Builder conditions(DeliveryRateConditionsUpdateInput conditions) {
      this.conditions = conditions;
      return this;
    }
  }
}

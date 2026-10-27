package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A rate group for a value-based shipping option.
 *
 * Contains rates that define price tiers based on cart value.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryValueBasedRateGroup implements com.shopify.admin.types.DeliveryOptionDefinitionRateGroup {
  /**
   * Conditions that limit this rate group to specific collections or origin locations.
   */
  private DeliveryRateGroupConditions conditions;

  /**
   * A globally unique ID.
   */
  private String id;

  /**
   * The value-based rates in this rate group.
   */
  private DeliveryValueBasedRateConnection rates;

  public DeliveryValueBasedRateGroup() {
  }

  /**
   * Conditions that limit this rate group to specific collections or origin locations.
   */
  public DeliveryRateGroupConditions getConditions() {
    return conditions;
  }

  public void setConditions(DeliveryRateGroupConditions conditions) {
    this.conditions = conditions;
  }

  /**
   * A globally unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The value-based rates in this rate group.
   */
  public DeliveryValueBasedRateConnection getRates() {
    return rates;
  }

  public void setRates(DeliveryValueBasedRateConnection rates) {
    this.rates = rates;
  }

  @Override
  public String toString() {
    return "DeliveryValueBasedRateGroup{conditions='" + conditions + "', id='" + id + "', rates='" + rates + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryValueBasedRateGroup that = (DeliveryValueBasedRateGroup) o;
    return Objects.equals(conditions, that.conditions) &&
        Objects.equals(id, that.id) &&
        Objects.equals(rates, that.rates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, id, rates);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Conditions that limit this rate group to specific collections or origin locations.
     */
    private DeliveryRateGroupConditions conditions;

    /**
     * A globally unique ID.
     */
    private String id;

    /**
     * The value-based rates in this rate group.
     */
    private DeliveryValueBasedRateConnection rates;

    public DeliveryValueBasedRateGroup build() {
      DeliveryValueBasedRateGroup result = new DeliveryValueBasedRateGroup();
      result.conditions = this.conditions;
      result.id = this.id;
      result.rates = this.rates;
      return result;
    }

    /**
     * Conditions that limit this rate group to specific collections or origin locations.
     */
    public Builder conditions(DeliveryRateGroupConditions conditions) {
      this.conditions = conditions;
      return this;
    }

    /**
     * A globally unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The value-based rates in this rate group.
     */
    public Builder rates(DeliveryValueBasedRateConnection rates) {
      this.rates = rates;
      return this;
    }
  }
}

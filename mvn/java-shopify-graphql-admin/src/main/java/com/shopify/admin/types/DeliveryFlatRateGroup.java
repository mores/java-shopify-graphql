package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A flat rate group for a shipping option.
 *
 * Contains one fixed-price rate and optional collection or origin location conditions.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryFlatRateGroup implements com.shopify.admin.types.DeliveryOptionDefinitionRateGroup {
  /**
   * Conditions that limit this rate group to specific collections or origin locations.
   */
  private DeliveryRateGroupConditions conditions;

  /**
   * A globally unique ID.
   */
  private String id;

  /**
   * The fixed-price rate and optional transit time.
   */
  private DeliveryFlatRate rate;

  public DeliveryFlatRateGroup() {
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
   * The fixed-price rate and optional transit time.
   */
  public DeliveryFlatRate getRate() {
    return rate;
  }

  public void setRate(DeliveryFlatRate rate) {
    this.rate = rate;
  }

  @Override
  public String toString() {
    return "DeliveryFlatRateGroup{conditions='" + conditions + "', id='" + id + "', rate='" + rate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryFlatRateGroup that = (DeliveryFlatRateGroup) o;
    return Objects.equals(conditions, that.conditions) &&
        Objects.equals(id, that.id) &&
        Objects.equals(rate, that.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, id, rate);
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
     * The fixed-price rate and optional transit time.
     */
    private DeliveryFlatRate rate;

    public DeliveryFlatRateGroup build() {
      DeliveryFlatRateGroup result = new DeliveryFlatRateGroup();
      result.conditions = this.conditions;
      result.id = this.id;
      result.rate = this.rate;
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
     * The fixed-price rate and optional transit time.
     */
    public Builder rate(DeliveryFlatRate rate) {
      this.rate = rate;
      return this;
    }
  }
}

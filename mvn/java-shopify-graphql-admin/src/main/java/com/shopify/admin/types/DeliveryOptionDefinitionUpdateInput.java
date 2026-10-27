package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a shipping option. Provide exactly one option type.
 */
public class DeliveryOptionDefinitionUpdateInput {
  /**
   * A flat rate shipping option to update.
   */
  private DeliveryFlatRateOptionDefinitionUpdateInput flatRate;

  /**
   * A carrier-calculated shipping option to update.
   */
  private DeliveryCarrierCalculatedOptionDefinitionUpdateInput carrierCalculated;

  /**
   * A value-based shipping option to update.
   */
  private DeliveryValueBasedOptionDefinitionUpdateInput valueBased;

  /**
   * A weight-based shipping option to update.
   */
  private DeliveryWeightBasedOptionDefinitionUpdateInput weightBased;

  public DeliveryOptionDefinitionUpdateInput() {
  }

  /**
   * A flat rate shipping option to update.
   */
  public DeliveryFlatRateOptionDefinitionUpdateInput getFlatRate() {
    return flatRate;
  }

  public void setFlatRate(DeliveryFlatRateOptionDefinitionUpdateInput flatRate) {
    this.flatRate = flatRate;
  }

  /**
   * A carrier-calculated shipping option to update.
   */
  public DeliveryCarrierCalculatedOptionDefinitionUpdateInput getCarrierCalculated() {
    return carrierCalculated;
  }

  public void setCarrierCalculated(
      DeliveryCarrierCalculatedOptionDefinitionUpdateInput carrierCalculated) {
    this.carrierCalculated = carrierCalculated;
  }

  /**
   * A value-based shipping option to update.
   */
  public DeliveryValueBasedOptionDefinitionUpdateInput getValueBased() {
    return valueBased;
  }

  public void setValueBased(DeliveryValueBasedOptionDefinitionUpdateInput valueBased) {
    this.valueBased = valueBased;
  }

  /**
   * A weight-based shipping option to update.
   */
  public DeliveryWeightBasedOptionDefinitionUpdateInput getWeightBased() {
    return weightBased;
  }

  public void setWeightBased(DeliveryWeightBasedOptionDefinitionUpdateInput weightBased) {
    this.weightBased = weightBased;
  }

  @Override
  public String toString() {
    return "DeliveryOptionDefinitionUpdateInput{flatRate='" + flatRate + "', carrierCalculated='" + carrierCalculated + "', valueBased='" + valueBased + "', weightBased='" + weightBased + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryOptionDefinitionUpdateInput that = (DeliveryOptionDefinitionUpdateInput) o;
    return Objects.equals(flatRate, that.flatRate) &&
        Objects.equals(carrierCalculated, that.carrierCalculated) &&
        Objects.equals(valueBased, that.valueBased) &&
        Objects.equals(weightBased, that.weightBased);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flatRate, carrierCalculated, valueBased, weightBased);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A flat rate shipping option to update.
     */
    private DeliveryFlatRateOptionDefinitionUpdateInput flatRate;

    /**
     * A carrier-calculated shipping option to update.
     */
    private DeliveryCarrierCalculatedOptionDefinitionUpdateInput carrierCalculated;

    /**
     * A value-based shipping option to update.
     */
    private DeliveryValueBasedOptionDefinitionUpdateInput valueBased;

    /**
     * A weight-based shipping option to update.
     */
    private DeliveryWeightBasedOptionDefinitionUpdateInput weightBased;

    public DeliveryOptionDefinitionUpdateInput build() {
      DeliveryOptionDefinitionUpdateInput result = new DeliveryOptionDefinitionUpdateInput();
      result.flatRate = this.flatRate;
      result.carrierCalculated = this.carrierCalculated;
      result.valueBased = this.valueBased;
      result.weightBased = this.weightBased;
      return result;
    }

    /**
     * A flat rate shipping option to update.
     */
    public Builder flatRate(DeliveryFlatRateOptionDefinitionUpdateInput flatRate) {
      this.flatRate = flatRate;
      return this;
    }

    /**
     * A carrier-calculated shipping option to update.
     */
    public Builder carrierCalculated(
        DeliveryCarrierCalculatedOptionDefinitionUpdateInput carrierCalculated) {
      this.carrierCalculated = carrierCalculated;
      return this;
    }

    /**
     * A value-based shipping option to update.
     */
    public Builder valueBased(DeliveryValueBasedOptionDefinitionUpdateInput valueBased) {
      this.valueBased = valueBased;
      return this;
    }

    /**
     * A weight-based shipping option to update.
     */
    public Builder weightBased(DeliveryWeightBasedOptionDefinitionUpdateInput weightBased) {
      this.weightBased = weightBased;
      return this;
    }
  }
}

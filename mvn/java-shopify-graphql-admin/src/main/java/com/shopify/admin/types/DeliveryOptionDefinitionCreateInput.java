package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for creating a shipping option. Provide exactly one option type.
 */
public class DeliveryOptionDefinitionCreateInput {
  /**
   * A flat rate shipping option.
   */
  private DeliveryFlatRateOptionDefinitionCreateInput flatRate;

  /**
   * A carrier-calculated shipping option.
   */
  private DeliveryCarrierCalculatedOptionDefinitionCreateInput carrierCalculated;

  /**
   * A weight-based shipping option.
   */
  private DeliveryWeightBasedOptionDefinitionCreateInput weightBased;

  /**
   * A value-based shipping option.
   */
  private DeliveryValueBasedOptionDefinitionCreateInput valueBased;

  public DeliveryOptionDefinitionCreateInput() {
  }

  /**
   * A flat rate shipping option.
   */
  public DeliveryFlatRateOptionDefinitionCreateInput getFlatRate() {
    return flatRate;
  }

  public void setFlatRate(DeliveryFlatRateOptionDefinitionCreateInput flatRate) {
    this.flatRate = flatRate;
  }

  /**
   * A carrier-calculated shipping option.
   */
  public DeliveryCarrierCalculatedOptionDefinitionCreateInput getCarrierCalculated() {
    return carrierCalculated;
  }

  public void setCarrierCalculated(
      DeliveryCarrierCalculatedOptionDefinitionCreateInput carrierCalculated) {
    this.carrierCalculated = carrierCalculated;
  }

  /**
   * A weight-based shipping option.
   */
  public DeliveryWeightBasedOptionDefinitionCreateInput getWeightBased() {
    return weightBased;
  }

  public void setWeightBased(DeliveryWeightBasedOptionDefinitionCreateInput weightBased) {
    this.weightBased = weightBased;
  }

  /**
   * A value-based shipping option.
   */
  public DeliveryValueBasedOptionDefinitionCreateInput getValueBased() {
    return valueBased;
  }

  public void setValueBased(DeliveryValueBasedOptionDefinitionCreateInput valueBased) {
    this.valueBased = valueBased;
  }

  @Override
  public String toString() {
    return "DeliveryOptionDefinitionCreateInput{flatRate='" + flatRate + "', carrierCalculated='" + carrierCalculated + "', weightBased='" + weightBased + "', valueBased='" + valueBased + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryOptionDefinitionCreateInput that = (DeliveryOptionDefinitionCreateInput) o;
    return Objects.equals(flatRate, that.flatRate) &&
        Objects.equals(carrierCalculated, that.carrierCalculated) &&
        Objects.equals(weightBased, that.weightBased) &&
        Objects.equals(valueBased, that.valueBased);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flatRate, carrierCalculated, weightBased, valueBased);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A flat rate shipping option.
     */
    private DeliveryFlatRateOptionDefinitionCreateInput flatRate;

    /**
     * A carrier-calculated shipping option.
     */
    private DeliveryCarrierCalculatedOptionDefinitionCreateInput carrierCalculated;

    /**
     * A weight-based shipping option.
     */
    private DeliveryWeightBasedOptionDefinitionCreateInput weightBased;

    /**
     * A value-based shipping option.
     */
    private DeliveryValueBasedOptionDefinitionCreateInput valueBased;

    public DeliveryOptionDefinitionCreateInput build() {
      DeliveryOptionDefinitionCreateInput result = new DeliveryOptionDefinitionCreateInput();
      result.flatRate = this.flatRate;
      result.carrierCalculated = this.carrierCalculated;
      result.weightBased = this.weightBased;
      result.valueBased = this.valueBased;
      return result;
    }

    /**
     * A flat rate shipping option.
     */
    public Builder flatRate(DeliveryFlatRateOptionDefinitionCreateInput flatRate) {
      this.flatRate = flatRate;
      return this;
    }

    /**
     * A carrier-calculated shipping option.
     */
    public Builder carrierCalculated(
        DeliveryCarrierCalculatedOptionDefinitionCreateInput carrierCalculated) {
      this.carrierCalculated = carrierCalculated;
      return this;
    }

    /**
     * A weight-based shipping option.
     */
    public Builder weightBased(DeliveryWeightBasedOptionDefinitionCreateInput weightBased) {
      this.weightBased = weightBased;
      return this;
    }

    /**
     * A value-based shipping option.
     */
    public Builder valueBased(DeliveryValueBasedOptionDefinitionCreateInput valueBased) {
      this.valueBased = valueBased;
      return this;
    }
  }
}

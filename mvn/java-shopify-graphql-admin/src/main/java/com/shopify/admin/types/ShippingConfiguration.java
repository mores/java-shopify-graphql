package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The shipping configuration attached to a market. Defines the shipping
 * options available when a buyer is resolved to that market.
 */
public class ShippingConfiguration {
  /**
   * Whether shipping is enabled for this market. When false, customers in this market won't see any shipping options.
   */
  private boolean isEnabled;

  /**
   * The shipping options configured for this market.
   */
  private DeliveryOptionDefinitionConnection optionDefinitions;

  /**
   * The number of shipping options in this configuration.
   */
  private Count optionDefinitionsCount;

  public ShippingConfiguration() {
  }

  /**
   * Whether shipping is enabled for this market. When false, customers in this market won't see any shipping options.
   */
  public boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  /**
   * The shipping options configured for this market.
   */
  public DeliveryOptionDefinitionConnection getOptionDefinitions() {
    return optionDefinitions;
  }

  public void setOptionDefinitions(DeliveryOptionDefinitionConnection optionDefinitions) {
    this.optionDefinitions = optionDefinitions;
  }

  /**
   * The number of shipping options in this configuration.
   */
  public Count getOptionDefinitionsCount() {
    return optionDefinitionsCount;
  }

  public void setOptionDefinitionsCount(Count optionDefinitionsCount) {
    this.optionDefinitionsCount = optionDefinitionsCount;
  }

  @Override
  public String toString() {
    return "ShippingConfiguration{isEnabled='" + isEnabled + "', optionDefinitions='" + optionDefinitions + "', optionDefinitionsCount='" + optionDefinitionsCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingConfiguration that = (ShippingConfiguration) o;
    return isEnabled == that.isEnabled &&
        Objects.equals(optionDefinitions, that.optionDefinitions) &&
        Objects.equals(optionDefinitionsCount, that.optionDefinitionsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, optionDefinitions, optionDefinitionsCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether shipping is enabled for this market. When false, customers in this market won't see any shipping options.
     */
    private boolean isEnabled;

    /**
     * The shipping options configured for this market.
     */
    private DeliveryOptionDefinitionConnection optionDefinitions;

    /**
     * The number of shipping options in this configuration.
     */
    private Count optionDefinitionsCount;

    public ShippingConfiguration build() {
      ShippingConfiguration result = new ShippingConfiguration();
      result.isEnabled = this.isEnabled;
      result.optionDefinitions = this.optionDefinitions;
      result.optionDefinitionsCount = this.optionDefinitionsCount;
      return result;
    }

    /**
     * Whether shipping is enabled for this market. When false, customers in this market won't see any shipping options.
     */
    public Builder isEnabled(boolean isEnabled) {
      this.isEnabled = isEnabled;
      return this;
    }

    /**
     * The shipping options configured for this market.
     */
    public Builder optionDefinitions(DeliveryOptionDefinitionConnection optionDefinitions) {
      this.optionDefinitions = optionDefinitions;
      return this;
    }

    /**
     * The number of shipping options in this configuration.
     */
    public Builder optionDefinitionsCount(Count optionDefinitionsCount) {
      this.optionDefinitionsCount = optionDefinitionsCount;
      return this;
    }
  }
}

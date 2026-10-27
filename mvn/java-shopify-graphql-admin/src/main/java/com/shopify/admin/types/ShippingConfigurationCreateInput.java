package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating a market's shipping configuration.
 */
public class ShippingConfigurationCreateInput {
  /**
   * Whether shipping is enabled for this market. When false, customers in this market won't see shipping options at checkout.
   */
  private boolean isEnabled;

  /**
   * Shipping options to create for the market.
   */
  private List<DeliveryOptionDefinitionCreateInput> optionDefinitions;

  public ShippingConfigurationCreateInput() {
  }

  /**
   * Whether shipping is enabled for this market. When false, customers in this market won't see shipping options at checkout.
   */
  public boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  /**
   * Shipping options to create for the market.
   */
  public List<DeliveryOptionDefinitionCreateInput> getOptionDefinitions() {
    return optionDefinitions;
  }

  public void setOptionDefinitions(List<DeliveryOptionDefinitionCreateInput> optionDefinitions) {
    this.optionDefinitions = optionDefinitions;
  }

  @Override
  public String toString() {
    return "ShippingConfigurationCreateInput{isEnabled='" + isEnabled + "', optionDefinitions='" + optionDefinitions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingConfigurationCreateInput that = (ShippingConfigurationCreateInput) o;
    return isEnabled == that.isEnabled &&
        Objects.equals(optionDefinitions, that.optionDefinitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, optionDefinitions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether shipping is enabled for this market. When false, customers in this market won't see shipping options at checkout.
     */
    private boolean isEnabled;

    /**
     * Shipping options to create for the market.
     */
    private List<DeliveryOptionDefinitionCreateInput> optionDefinitions;

    public ShippingConfigurationCreateInput build() {
      ShippingConfigurationCreateInput result = new ShippingConfigurationCreateInput();
      result.isEnabled = this.isEnabled;
      result.optionDefinitions = this.optionDefinitions;
      return result;
    }

    /**
     * Whether shipping is enabled for this market. When false, customers in this market won't see shipping options at checkout.
     */
    public Builder isEnabled(boolean isEnabled) {
      this.isEnabled = isEnabled;
      return this;
    }

    /**
     * Shipping options to create for the market.
     */
    public Builder optionDefinitions(List<DeliveryOptionDefinitionCreateInput> optionDefinitions) {
      this.optionDefinitions = optionDefinitions;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for configuring delivery for a new market.
 */
public class MarketDeliveryConfigurationsCreateInput {
  /**
   * The shipping configuration for the market.
   */
  private ShippingConfigurationCreateInput shipping;

  public MarketDeliveryConfigurationsCreateInput() {
  }

  /**
   * The shipping configuration for the market.
   */
  public ShippingConfigurationCreateInput getShipping() {
    return shipping;
  }

  public void setShipping(ShippingConfigurationCreateInput shipping) {
    this.shipping = shipping;
  }

  @Override
  public String toString() {
    return "MarketDeliveryConfigurationsCreateInput{shipping='" + shipping + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketDeliveryConfigurationsCreateInput that = (MarketDeliveryConfigurationsCreateInput) o;
    return Objects.equals(shipping, that.shipping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipping);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The shipping configuration for the market.
     */
    private ShippingConfigurationCreateInput shipping;

    public MarketDeliveryConfigurationsCreateInput build() {
      MarketDeliveryConfigurationsCreateInput result = new MarketDeliveryConfigurationsCreateInput();
      result.shipping = this.shipping;
      return result;
    }

    /**
     * The shipping configuration for the market.
     */
    public Builder shipping(ShippingConfigurationCreateInput shipping) {
      this.shipping = shipping;
      return this;
    }
  }
}

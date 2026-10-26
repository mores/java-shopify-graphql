package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Delivery configurations for a market. Container type for shipping configuration.
 */
public class MarketDeliveryConfigurations {
  /**
   * The shipping configuration for this market. Null means the market inherits shipping from its parent.
   */
  private ShippingConfiguration shipping;

  public MarketDeliveryConfigurations() {
  }

  /**
   * The shipping configuration for this market. Null means the market inherits shipping from its parent.
   */
  public ShippingConfiguration getShipping() {
    return shipping;
  }

  public void setShipping(ShippingConfiguration shipping) {
    this.shipping = shipping;
  }

  @Override
  public String toString() {
    return "MarketDeliveryConfigurations{shipping='" + shipping + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketDeliveryConfigurations that = (MarketDeliveryConfigurations) o;
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
     * The shipping configuration for this market. Null means the market inherits shipping from its parent.
     */
    private ShippingConfiguration shipping;

    public MarketDeliveryConfigurations build() {
      MarketDeliveryConfigurations result = new MarketDeliveryConfigurations();
      result.shipping = this.shipping;
      return result;
    }

    /**
     * The shipping configuration for this market. Null means the market inherits shipping from its parent.
     */
    public Builder shipping(ShippingConfiguration shipping) {
      this.shipping = shipping;
      return this;
    }
  }
}

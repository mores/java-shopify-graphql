package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for configuring delivery for an existing market.
 */
public class MarketDeliveryConfigurationsUpdateInput {
  /**
   * Shipping configuration changes. When omitted, shipping is not changed.
   */
  private ShippingConfigurationUpdateInput shipping;

  /**
   * When true, removes the shipping configuration so the market inherits shipping from its parent.
   */
  private Boolean removeShipping;

  public MarketDeliveryConfigurationsUpdateInput() {
  }

  /**
   * Shipping configuration changes. When omitted, shipping is not changed.
   */
  public ShippingConfigurationUpdateInput getShipping() {
    return shipping;
  }

  public void setShipping(ShippingConfigurationUpdateInput shipping) {
    this.shipping = shipping;
  }

  /**
   * When true, removes the shipping configuration so the market inherits shipping from its parent.
   */
  public Boolean getRemoveShipping() {
    return removeShipping;
  }

  public void setRemoveShipping(Boolean removeShipping) {
    this.removeShipping = removeShipping;
  }

  @Override
  public String toString() {
    return "MarketDeliveryConfigurationsUpdateInput{shipping='" + shipping + "', removeShipping='" + removeShipping + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketDeliveryConfigurationsUpdateInput that = (MarketDeliveryConfigurationsUpdateInput) o;
    return Objects.equals(shipping, that.shipping) &&
        Objects.equals(removeShipping, that.removeShipping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipping, removeShipping);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Shipping configuration changes. When omitted, shipping is not changed.
     */
    private ShippingConfigurationUpdateInput shipping;

    /**
     * When true, removes the shipping configuration so the market inherits shipping from its parent.
     */
    private Boolean removeShipping;

    public MarketDeliveryConfigurationsUpdateInput build() {
      MarketDeliveryConfigurationsUpdateInput result = new MarketDeliveryConfigurationsUpdateInput();
      result.shipping = this.shipping;
      result.removeShipping = this.removeShipping;
      return result;
    }

    /**
     * Shipping configuration changes. When omitted, shipping is not changed.
     */
    public Builder shipping(ShippingConfigurationUpdateInput shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * When true, removes the shipping configuration so the market inherits shipping from its parent.
     */
    public Builder removeShipping(Boolean removeShipping) {
      this.removeShipping = removeShipping;
      return this;
    }
  }
}

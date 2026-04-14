package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for enabling or disabling the "Cart to order copyable" capability.
 * This capability is only available for order metafield definitions.
 *
 * When enabled, the value from a cart metafield is automatically copied to the corresponding
 * order metafield when an order is created. The namespace and key must match between the cart and order metafields.
 */
public class MetafieldCapabilityCartToOrderCopyableInput {
  /**
   * Indicates whether the capability should be enabled or disabled.
   */
  private boolean enabled;

  public MetafieldCapabilityCartToOrderCopyableInput() {
  }

  /**
   * Indicates whether the capability should be enabled or disabled.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "MetafieldCapabilityCartToOrderCopyableInput{enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldCapabilityCartToOrderCopyableInput that = (MetafieldCapabilityCartToOrderCopyableInput) o;
    return enabled == that.enabled;
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Indicates whether the capability should be enabled or disabled.
     */
    private boolean enabled;

    public MetafieldCapabilityCartToOrderCopyableInput build() {
      MetafieldCapabilityCartToOrderCopyableInput result = new MetafieldCapabilityCartToOrderCopyableInput();
      result.enabled = this.enabled;
      return result;
    }

    /**
     * Indicates whether the capability should be enabled or disabled.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}

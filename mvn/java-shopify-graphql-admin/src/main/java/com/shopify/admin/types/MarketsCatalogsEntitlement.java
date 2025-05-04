package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The entitlements for catalogs.
 */
public class MarketsCatalogsEntitlement {
  /**
   * Whether catalogs are enabled.
   */
  private boolean enabled;

  public MarketsCatalogsEntitlement() {
  }

  /**
   * Whether catalogs are enabled.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "MarketsCatalogsEntitlement{enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketsCatalogsEntitlement that = (MarketsCatalogsEntitlement) o;
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
     * Whether catalogs are enabled.
     */
    private boolean enabled;

    public MarketsCatalogsEntitlement build() {
      MarketsCatalogsEntitlement result = new MarketsCatalogsEntitlement();
      result.enabled = this.enabled;
      return result;
    }

    /**
     * Whether catalogs are enabled.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}

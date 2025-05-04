package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The entitlements for region markets.
 */
public class MarketsRegionsEntitlement {
  /**
   * The entitlements for region market catalogs.
   */
  private MarketsCatalogsEntitlement catalogs;

  /**
   * Whether region markets are enabled.
   */
  private boolean enabled;

  public MarketsRegionsEntitlement() {
  }

  /**
   * The entitlements for region market catalogs.
   */
  public MarketsCatalogsEntitlement getCatalogs() {
    return catalogs;
  }

  public void setCatalogs(MarketsCatalogsEntitlement catalogs) {
    this.catalogs = catalogs;
  }

  /**
   * Whether region markets are enabled.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "MarketsRegionsEntitlement{catalogs='" + catalogs + "', enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketsRegionsEntitlement that = (MarketsRegionsEntitlement) o;
    return Objects.equals(catalogs, that.catalogs) &&
        enabled == that.enabled;
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogs, enabled);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The entitlements for region market catalogs.
     */
    private MarketsCatalogsEntitlement catalogs;

    /**
     * Whether region markets are enabled.
     */
    private boolean enabled;

    public MarketsRegionsEntitlement build() {
      MarketsRegionsEntitlement result = new MarketsRegionsEntitlement();
      result.catalogs = this.catalogs;
      result.enabled = this.enabled;
      return result;
    }

    /**
     * The entitlements for region market catalogs.
     */
    public Builder catalogs(MarketsCatalogsEntitlement catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    /**
     * Whether region markets are enabled.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}

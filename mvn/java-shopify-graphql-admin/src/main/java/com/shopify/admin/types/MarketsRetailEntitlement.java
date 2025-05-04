package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The entitlements for retail markets.
 */
public class MarketsRetailEntitlement {
  /**
   * The entitlements for retail market catalogs.
   */
  private MarketsCatalogsEntitlement catalogs;

  /**
   * Whether retail markets are enabled.
   */
  private boolean enabled;

  public MarketsRetailEntitlement() {
  }

  /**
   * The entitlements for retail market catalogs.
   */
  public MarketsCatalogsEntitlement getCatalogs() {
    return catalogs;
  }

  public void setCatalogs(MarketsCatalogsEntitlement catalogs) {
    this.catalogs = catalogs;
  }

  /**
   * Whether retail markets are enabled.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "MarketsRetailEntitlement{catalogs='" + catalogs + "', enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketsRetailEntitlement that = (MarketsRetailEntitlement) o;
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
     * The entitlements for retail market catalogs.
     */
    private MarketsCatalogsEntitlement catalogs;

    /**
     * Whether retail markets are enabled.
     */
    private boolean enabled;

    public MarketsRetailEntitlement build() {
      MarketsRetailEntitlement result = new MarketsRetailEntitlement();
      result.catalogs = this.catalogs;
      result.enabled = this.enabled;
      return result;
    }

    /**
     * The entitlements for retail market catalogs.
     */
    public Builder catalogs(MarketsCatalogsEntitlement catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    /**
     * Whether retail markets are enabled.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}

package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The entitlements for B2B markets.
 */
public class MarketsB2BEntitlement {
  /**
   * The entitlements for B2B market catalogs.
   */
  private MarketsCatalogsEntitlement catalogs;

  /**
   * Whether B2B markets are enabled.
   */
  private boolean enabled;

  public MarketsB2BEntitlement() {
  }

  /**
   * The entitlements for B2B market catalogs.
   */
  public MarketsCatalogsEntitlement getCatalogs() {
    return catalogs;
  }

  public void setCatalogs(MarketsCatalogsEntitlement catalogs) {
    this.catalogs = catalogs;
  }

  /**
   * Whether B2B markets are enabled.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public String toString() {
    return "MarketsB2BEntitlement{catalogs='" + catalogs + "', enabled='" + enabled + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketsB2BEntitlement that = (MarketsB2BEntitlement) o;
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
     * The entitlements for B2B market catalogs.
     */
    private MarketsCatalogsEntitlement catalogs;

    /**
     * Whether B2B markets are enabled.
     */
    private boolean enabled;

    public MarketsB2BEntitlement build() {
      MarketsB2BEntitlement result = new MarketsB2BEntitlement();
      result.catalogs = this.catalogs;
      result.enabled = this.enabled;
      return result;
    }

    /**
     * The entitlements for B2B market catalogs.
     */
    public Builder catalogs(MarketsCatalogsEntitlement catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    /**
     * Whether B2B markets are enabled.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }
  }
}

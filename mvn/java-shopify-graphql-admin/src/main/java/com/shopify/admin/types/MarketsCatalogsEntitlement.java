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

  /**
   * The maximum number of catalogs allowed.
   */
  private int limit;

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

  /**
   * The maximum number of catalogs allowed.
   */
  public int getLimit() {
    return limit;
  }

  public void setLimit(int limit) {
    this.limit = limit;
  }

  @Override
  public String toString() {
    return "MarketsCatalogsEntitlement{enabled='" + enabled + "', limit='" + limit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketsCatalogsEntitlement that = (MarketsCatalogsEntitlement) o;
    return enabled == that.enabled &&
        limit == that.limit;
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, limit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether catalogs are enabled.
     */
    private boolean enabled;

    /**
     * The maximum number of catalogs allowed.
     */
    private int limit;

    public MarketsCatalogsEntitlement build() {
      MarketsCatalogsEntitlement result = new MarketsCatalogsEntitlement();
      result.enabled = this.enabled;
      result.limit = this.limit;
      return result;
    }

    /**
     * Whether catalogs are enabled.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * The maximum number of catalogs allowed.
     */
    public Builder limit(int limit) {
      this.limit = limit;
      return this;
    }
  }
}

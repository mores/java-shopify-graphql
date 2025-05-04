package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Markets entitlement information.
 */
public class MarketsType {
  /**
   * The entitlements for B2B markets.
   */
  private MarketsB2BEntitlement b2b;

  /**
   * The entitlements for region markets.
   */
  private MarketsRegionsEntitlement regions;

  /**
   * The entitlements for retail markets.
   */
  private MarketsRetailEntitlement retail;

  /**
   * The entitlements for themes.
   */
  private MarketsThemesEntitlement themes;

  public MarketsType() {
  }

  /**
   * The entitlements for B2B markets.
   */
  public MarketsB2BEntitlement getB2b() {
    return b2b;
  }

  public void setB2b(MarketsB2BEntitlement b2b) {
    this.b2b = b2b;
  }

  /**
   * The entitlements for region markets.
   */
  public MarketsRegionsEntitlement getRegions() {
    return regions;
  }

  public void setRegions(MarketsRegionsEntitlement regions) {
    this.regions = regions;
  }

  /**
   * The entitlements for retail markets.
   */
  public MarketsRetailEntitlement getRetail() {
    return retail;
  }

  public void setRetail(MarketsRetailEntitlement retail) {
    this.retail = retail;
  }

  /**
   * The entitlements for themes.
   */
  public MarketsThemesEntitlement getThemes() {
    return themes;
  }

  public void setThemes(MarketsThemesEntitlement themes) {
    this.themes = themes;
  }

  @Override
  public String toString() {
    return "MarketsType{b2b='" + b2b + "', regions='" + regions + "', retail='" + retail + "', themes='" + themes + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketsType that = (MarketsType) o;
    return Objects.equals(b2b, that.b2b) &&
        Objects.equals(regions, that.regions) &&
        Objects.equals(retail, that.retail) &&
        Objects.equals(themes, that.themes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(b2b, regions, retail, themes);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The entitlements for B2B markets.
     */
    private MarketsB2BEntitlement b2b;

    /**
     * The entitlements for region markets.
     */
    private MarketsRegionsEntitlement regions;

    /**
     * The entitlements for retail markets.
     */
    private MarketsRetailEntitlement retail;

    /**
     * The entitlements for themes.
     */
    private MarketsThemesEntitlement themes;

    public MarketsType build() {
      MarketsType result = new MarketsType();
      result.b2b = this.b2b;
      result.regions = this.regions;
      result.retail = this.retail;
      result.themes = this.themes;
      return result;
    }

    /**
     * The entitlements for B2B markets.
     */
    public Builder b2b(MarketsB2BEntitlement b2b) {
      this.b2b = b2b;
      return this;
    }

    /**
     * The entitlements for region markets.
     */
    public Builder regions(MarketsRegionsEntitlement regions) {
      this.regions = regions;
      return this;
    }

    /**
     * The entitlements for retail markets.
     */
    public Builder retail(MarketsRetailEntitlement retail) {
      this.retail = retail;
      return this;
    }

    /**
     * The entitlements for themes.
     */
    public Builder themes(MarketsThemesEntitlement themes) {
      this.themes = themes;
      return this;
    }
  }
}

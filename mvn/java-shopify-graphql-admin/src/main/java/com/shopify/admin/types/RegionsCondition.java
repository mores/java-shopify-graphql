package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A condition checking the visitor's region.
 */
public class RegionsCondition {
  /**
   * The application level for the condition.
   */
  private MarketConditionApplicationType applicationLevel;

  /**
   * The regions that comprise the market.
   */
  private MarketRegionConnection regions;

  public RegionsCondition() {
  }

  /**
   * The application level for the condition.
   */
  public MarketConditionApplicationType getApplicationLevel() {
    return applicationLevel;
  }

  public void setApplicationLevel(MarketConditionApplicationType applicationLevel) {
    this.applicationLevel = applicationLevel;
  }

  /**
   * The regions that comprise the market.
   */
  public MarketRegionConnection getRegions() {
    return regions;
  }

  public void setRegions(MarketRegionConnection regions) {
    this.regions = regions;
  }

  @Override
  public String toString() {
    return "RegionsCondition{applicationLevel='" + applicationLevel + "', regions='" + regions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegionsCondition that = (RegionsCondition) o;
    return Objects.equals(applicationLevel, that.applicationLevel) &&
        Objects.equals(regions, that.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationLevel, regions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The application level for the condition.
     */
    private MarketConditionApplicationType applicationLevel;

    /**
     * The regions that comprise the market.
     */
    private MarketRegionConnection regions;

    public RegionsCondition build() {
      RegionsCondition result = new RegionsCondition();
      result.applicationLevel = this.applicationLevel;
      result.regions = this.regions;
      return result;
    }

    /**
     * The application level for the condition.
     */
    public Builder applicationLevel(MarketConditionApplicationType applicationLevel) {
      this.applicationLevel = applicationLevel;
      return this;
    }

    /**
     * The regions that comprise the market.
     */
    public Builder regions(MarketRegionConnection regions) {
      this.regions = regions;
      return this;
    }
  }
}

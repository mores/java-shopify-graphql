package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create or update a region market condition.
 */
public class MarketConditionsRegionsInput {
  /**
   * A list of market region IDs to include in the market condition.
   */
  private List<String> regionIds;

  /**
   * A list of market regions to include in the market condition.
   */
  private List<MarketConditionsRegionInput> regions;

  /**
   * A type of market condition (e.g. ALL) to apply.
   */
  private MarketConditionApplicationType applicationLevel;

  public MarketConditionsRegionsInput() {
  }

  /**
   * A list of market region IDs to include in the market condition.
   */
  public List<String> getRegionIds() {
    return regionIds;
  }

  public void setRegionIds(List<String> regionIds) {
    this.regionIds = regionIds;
  }

  /**
   * A list of market regions to include in the market condition.
   */
  public List<MarketConditionsRegionInput> getRegions() {
    return regions;
  }

  public void setRegions(List<MarketConditionsRegionInput> regions) {
    this.regions = regions;
  }

  /**
   * A type of market condition (e.g. ALL) to apply.
   */
  public MarketConditionApplicationType getApplicationLevel() {
    return applicationLevel;
  }

  public void setApplicationLevel(MarketConditionApplicationType applicationLevel) {
    this.applicationLevel = applicationLevel;
  }

  @Override
  public String toString() {
    return "MarketConditionsRegionsInput{regionIds='" + regionIds + "', regions='" + regions + "', applicationLevel='" + applicationLevel + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketConditionsRegionsInput that = (MarketConditionsRegionsInput) o;
    return Objects.equals(regionIds, that.regionIds) &&
        Objects.equals(regions, that.regions) &&
        Objects.equals(applicationLevel, that.applicationLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionIds, regions, applicationLevel);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of market region IDs to include in the market condition.
     */
    private List<String> regionIds;

    /**
     * A list of market regions to include in the market condition.
     */
    private List<MarketConditionsRegionInput> regions;

    /**
     * A type of market condition (e.g. ALL) to apply.
     */
    private MarketConditionApplicationType applicationLevel;

    public MarketConditionsRegionsInput build() {
      MarketConditionsRegionsInput result = new MarketConditionsRegionsInput();
      result.regionIds = this.regionIds;
      result.regions = this.regions;
      result.applicationLevel = this.applicationLevel;
      return result;
    }

    /**
     * A list of market region IDs to include in the market condition.
     */
    public Builder regionIds(List<String> regionIds) {
      this.regionIds = regionIds;
      return this;
    }

    /**
     * A list of market regions to include in the market condition.
     */
    public Builder regions(List<MarketConditionsRegionInput> regions) {
      this.regions = regions;
      return this;
    }

    /**
     * A type of market condition (e.g. ALL) to apply.
     */
    public Builder applicationLevel(MarketConditionApplicationType applicationLevel) {
      this.applicationLevel = applicationLevel;
      return this;
    }
  }
}

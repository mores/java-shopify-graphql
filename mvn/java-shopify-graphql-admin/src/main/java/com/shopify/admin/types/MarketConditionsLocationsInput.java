package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create or update a location market condition.
 */
public class MarketConditionsLocationsInput {
  /**
   * A list of location IDs to include in the market condition.
   */
  private List<String> locationIds;

  /**
   * A type of market condition (e.g. ALL) to apply.
   */
  private MarketConditionApplicationType applicationLevel;

  public MarketConditionsLocationsInput() {
  }

  /**
   * A list of location IDs to include in the market condition.
   */
  public List<String> getLocationIds() {
    return locationIds;
  }

  public void setLocationIds(List<String> locationIds) {
    this.locationIds = locationIds;
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
    return "MarketConditionsLocationsInput{locationIds='" + locationIds + "', applicationLevel='" + applicationLevel + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketConditionsLocationsInput that = (MarketConditionsLocationsInput) o;
    return Objects.equals(locationIds, that.locationIds) &&
        Objects.equals(applicationLevel, that.applicationLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationIds, applicationLevel);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of location IDs to include in the market condition.
     */
    private List<String> locationIds;

    /**
     * A type of market condition (e.g. ALL) to apply.
     */
    private MarketConditionApplicationType applicationLevel;

    public MarketConditionsLocationsInput build() {
      MarketConditionsLocationsInput result = new MarketConditionsLocationsInput();
      result.locationIds = this.locationIds;
      result.applicationLevel = this.applicationLevel;
      return result;
    }

    /**
     * A list of location IDs to include in the market condition.
     */
    public Builder locationIds(List<String> locationIds) {
      this.locationIds = locationIds;
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

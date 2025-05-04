package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A condition checking the location that the visitor is shopping from.
 */
public class LocationsCondition {
  /**
   * The application level for the condition.
   */
  private MarketConditionApplicationType applicationLevel;

  /**
   * The locations that comprise the market.
   */
  private LocationConnection locations;

  public LocationsCondition() {
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
   * The locations that comprise the market.
   */
  public LocationConnection getLocations() {
    return locations;
  }

  public void setLocations(LocationConnection locations) {
    this.locations = locations;
  }

  @Override
  public String toString() {
    return "LocationsCondition{applicationLevel='" + applicationLevel + "', locations='" + locations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationsCondition that = (LocationsCondition) o;
    return Objects.equals(applicationLevel, that.applicationLevel) &&
        Objects.equals(locations, that.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationLevel, locations);
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
     * The locations that comprise the market.
     */
    private LocationConnection locations;

    public LocationsCondition build() {
      LocationsCondition result = new LocationsCondition();
      result.applicationLevel = this.applicationLevel;
      result.locations = this.locations;
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
     * The locations that comprise the market.
     */
    public Builder locations(LocationConnection locations) {
      this.locations = locations;
      return this;
    }
  }
}

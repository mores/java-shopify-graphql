package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The conditions that determine whether a visitor is in a market.
 */
public class MarketConditions {
  /**
   * The company location conditions that determine whether a visitor is in the market.
   */
  private CompanyLocationsCondition companyLocationsCondition;

  /**
   * The set of condition types that are defined for the market.
   */
  private List<MarketConditionType> conditionTypes;

  /**
   * The retail location conditions that determine whether a visitor is in the market.
   */
  private LocationsCondition locationsCondition;

  /**
   * The region conditions that determine whether a visitor is in the market.
   */
  private RegionsCondition regionsCondition;

  public MarketConditions() {
  }

  /**
   * The company location conditions that determine whether a visitor is in the market.
   */
  public CompanyLocationsCondition getCompanyLocationsCondition() {
    return companyLocationsCondition;
  }

  public void setCompanyLocationsCondition(CompanyLocationsCondition companyLocationsCondition) {
    this.companyLocationsCondition = companyLocationsCondition;
  }

  /**
   * The set of condition types that are defined for the market.
   */
  public List<MarketConditionType> getConditionTypes() {
    return conditionTypes;
  }

  public void setConditionTypes(List<MarketConditionType> conditionTypes) {
    this.conditionTypes = conditionTypes;
  }

  /**
   * The retail location conditions that determine whether a visitor is in the market.
   */
  public LocationsCondition getLocationsCondition() {
    return locationsCondition;
  }

  public void setLocationsCondition(LocationsCondition locationsCondition) {
    this.locationsCondition = locationsCondition;
  }

  /**
   * The region conditions that determine whether a visitor is in the market.
   */
  public RegionsCondition getRegionsCondition() {
    return regionsCondition;
  }

  public void setRegionsCondition(RegionsCondition regionsCondition) {
    this.regionsCondition = regionsCondition;
  }

  @Override
  public String toString() {
    return "MarketConditions{companyLocationsCondition='" + companyLocationsCondition + "', conditionTypes='" + conditionTypes + "', locationsCondition='" + locationsCondition + "', regionsCondition='" + regionsCondition + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketConditions that = (MarketConditions) o;
    return Objects.equals(companyLocationsCondition, that.companyLocationsCondition) &&
        Objects.equals(conditionTypes, that.conditionTypes) &&
        Objects.equals(locationsCondition, that.locationsCondition) &&
        Objects.equals(regionsCondition, that.regionsCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLocationsCondition, conditionTypes, locationsCondition, regionsCondition);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The company location conditions that determine whether a visitor is in the market.
     */
    private CompanyLocationsCondition companyLocationsCondition;

    /**
     * The set of condition types that are defined for the market.
     */
    private List<MarketConditionType> conditionTypes;

    /**
     * The retail location conditions that determine whether a visitor is in the market.
     */
    private LocationsCondition locationsCondition;

    /**
     * The region conditions that determine whether a visitor is in the market.
     */
    private RegionsCondition regionsCondition;

    public MarketConditions build() {
      MarketConditions result = new MarketConditions();
      result.companyLocationsCondition = this.companyLocationsCondition;
      result.conditionTypes = this.conditionTypes;
      result.locationsCondition = this.locationsCondition;
      result.regionsCondition = this.regionsCondition;
      return result;
    }

    /**
     * The company location conditions that determine whether a visitor is in the market.
     */
    public Builder companyLocationsCondition(CompanyLocationsCondition companyLocationsCondition) {
      this.companyLocationsCondition = companyLocationsCondition;
      return this;
    }

    /**
     * The set of condition types that are defined for the market.
     */
    public Builder conditionTypes(List<MarketConditionType> conditionTypes) {
      this.conditionTypes = conditionTypes;
      return this;
    }

    /**
     * The retail location conditions that determine whether a visitor is in the market.
     */
    public Builder locationsCondition(LocationsCondition locationsCondition) {
      this.locationsCondition = locationsCondition;
      return this;
    }

    /**
     * The region conditions that determine whether a visitor is in the market.
     */
    public Builder regionsCondition(RegionsCondition regionsCondition) {
      this.regionsCondition = regionsCondition;
      return this;
    }
  }
}

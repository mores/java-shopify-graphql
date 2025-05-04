package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A condition checking the company location a visitor is purchasing for.
 */
public class CompanyLocationsCondition {
  /**
   * The application level for the condition.
   */
  private MarketConditionApplicationType applicationLevel;

  /**
   * The company locations that comprise the market.
   */
  private CompanyLocationConnection companyLocations;

  public CompanyLocationsCondition() {
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
   * The company locations that comprise the market.
   */
  public CompanyLocationConnection getCompanyLocations() {
    return companyLocations;
  }

  public void setCompanyLocations(CompanyLocationConnection companyLocations) {
    this.companyLocations = companyLocations;
  }

  @Override
  public String toString() {
    return "CompanyLocationsCondition{applicationLevel='" + applicationLevel + "', companyLocations='" + companyLocations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CompanyLocationsCondition that = (CompanyLocationsCondition) o;
    return Objects.equals(applicationLevel, that.applicationLevel) &&
        Objects.equals(companyLocations, that.companyLocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationLevel, companyLocations);
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
     * The company locations that comprise the market.
     */
    private CompanyLocationConnection companyLocations;

    public CompanyLocationsCondition build() {
      CompanyLocationsCondition result = new CompanyLocationsCondition();
      result.applicationLevel = this.applicationLevel;
      result.companyLocations = this.companyLocations;
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
     * The company locations that comprise the market.
     */
    public Builder companyLocations(CompanyLocationConnection companyLocations) {
      this.companyLocations = companyLocations;
      return this;
    }
  }
}

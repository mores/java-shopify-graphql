package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create or update a company location market condition.
 */
public class MarketConditionsCompanyLocationsInput {
  /**
   * A list of company location IDs to include in the market condition.
   */
  private List<String> companyLocationIds;

  /**
   * A type of market condition (e.g. ALL) to apply.
   */
  private MarketConditionApplicationType applicationLevel;

  public MarketConditionsCompanyLocationsInput() {
  }

  /**
   * A list of company location IDs to include in the market condition.
   */
  public List<String> getCompanyLocationIds() {
    return companyLocationIds;
  }

  public void setCompanyLocationIds(List<String> companyLocationIds) {
    this.companyLocationIds = companyLocationIds;
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
    return "MarketConditionsCompanyLocationsInput{companyLocationIds='" + companyLocationIds + "', applicationLevel='" + applicationLevel + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketConditionsCompanyLocationsInput that = (MarketConditionsCompanyLocationsInput) o;
    return Objects.equals(companyLocationIds, that.companyLocationIds) &&
        Objects.equals(applicationLevel, that.applicationLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLocationIds, applicationLevel);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of company location IDs to include in the market condition.
     */
    private List<String> companyLocationIds;

    /**
     * A type of market condition (e.g. ALL) to apply.
     */
    private MarketConditionApplicationType applicationLevel;

    public MarketConditionsCompanyLocationsInput build() {
      MarketConditionsCompanyLocationsInput result = new MarketConditionsCompanyLocationsInput();
      result.companyLocationIds = this.companyLocationIds;
      result.applicationLevel = this.applicationLevel;
      return result;
    }

    /**
     * A list of company location IDs to include in the market condition.
     */
    public Builder companyLocationIds(List<String> companyLocationIds) {
      this.companyLocationIds = companyLocationIds;
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

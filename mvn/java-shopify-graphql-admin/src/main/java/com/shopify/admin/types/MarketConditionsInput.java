package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create or update the market conditions.
 */
public class MarketConditionsInput {
  /**
   * The company locations to include in the market conditions.
   */
  private MarketConditionsCompanyLocationsInput companyLocationsCondition;

  /**
   * The locations to include in the market conditions.
   */
  private MarketConditionsLocationsInput locationsCondition;

  /**
   * The regions to include in the market conditions.
   */
  private MarketConditionsRegionsInput regionsCondition;

  public MarketConditionsInput() {
  }

  /**
   * The company locations to include in the market conditions.
   */
  public MarketConditionsCompanyLocationsInput getCompanyLocationsCondition() {
    return companyLocationsCondition;
  }

  public void setCompanyLocationsCondition(
      MarketConditionsCompanyLocationsInput companyLocationsCondition) {
    this.companyLocationsCondition = companyLocationsCondition;
  }

  /**
   * The locations to include in the market conditions.
   */
  public MarketConditionsLocationsInput getLocationsCondition() {
    return locationsCondition;
  }

  public void setLocationsCondition(MarketConditionsLocationsInput locationsCondition) {
    this.locationsCondition = locationsCondition;
  }

  /**
   * The regions to include in the market conditions.
   */
  public MarketConditionsRegionsInput getRegionsCondition() {
    return regionsCondition;
  }

  public void setRegionsCondition(MarketConditionsRegionsInput regionsCondition) {
    this.regionsCondition = regionsCondition;
  }

  @Override
  public String toString() {
    return "MarketConditionsInput{companyLocationsCondition='" + companyLocationsCondition + "', locationsCondition='" + locationsCondition + "', regionsCondition='" + regionsCondition + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketConditionsInput that = (MarketConditionsInput) o;
    return Objects.equals(companyLocationsCondition, that.companyLocationsCondition) &&
        Objects.equals(locationsCondition, that.locationsCondition) &&
        Objects.equals(regionsCondition, that.regionsCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLocationsCondition, locationsCondition, regionsCondition);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The company locations to include in the market conditions.
     */
    private MarketConditionsCompanyLocationsInput companyLocationsCondition;

    /**
     * The locations to include in the market conditions.
     */
    private MarketConditionsLocationsInput locationsCondition;

    /**
     * The regions to include in the market conditions.
     */
    private MarketConditionsRegionsInput regionsCondition;

    public MarketConditionsInput build() {
      MarketConditionsInput result = new MarketConditionsInput();
      result.companyLocationsCondition = this.companyLocationsCondition;
      result.locationsCondition = this.locationsCondition;
      result.regionsCondition = this.regionsCondition;
      return result;
    }

    /**
     * The company locations to include in the market conditions.
     */
    public Builder companyLocationsCondition(
        MarketConditionsCompanyLocationsInput companyLocationsCondition) {
      this.companyLocationsCondition = companyLocationsCondition;
      return this;
    }

    /**
     * The locations to include in the market conditions.
     */
    public Builder locationsCondition(MarketConditionsLocationsInput locationsCondition) {
      this.locationsCondition = locationsCondition;
      return this;
    }

    /**
     * The regions to include in the market conditions.
     */
    public Builder regionsCondition(MarketConditionsRegionsInput regionsCondition) {
      this.regionsCondition = regionsCondition;
      return this;
    }
  }
}

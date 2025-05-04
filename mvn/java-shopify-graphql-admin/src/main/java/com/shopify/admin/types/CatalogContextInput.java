package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for the context in which the catalog's publishing and pricing rules apply.
 */
public class CatalogContextInput {
  /**
   * The IDs of the markets to associate to the catalog.
   */
  private List<String> marketIds;

  /**
   * The IDs of the company locations to associate to the catalog.
   */
  private List<String> companyLocationIds;

  public CatalogContextInput() {
  }

  /**
   * The IDs of the markets to associate to the catalog.
   */
  public List<String> getMarketIds() {
    return marketIds;
  }

  public void setMarketIds(List<String> marketIds) {
    this.marketIds = marketIds;
  }

  /**
   * The IDs of the company locations to associate to the catalog.
   */
  public List<String> getCompanyLocationIds() {
    return companyLocationIds;
  }

  public void setCompanyLocationIds(List<String> companyLocationIds) {
    this.companyLocationIds = companyLocationIds;
  }

  @Override
  public String toString() {
    return "CatalogContextInput{marketIds='" + marketIds + "', companyLocationIds='" + companyLocationIds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CatalogContextInput that = (CatalogContextInput) o;
    return Objects.equals(marketIds, that.marketIds) &&
        Objects.equals(companyLocationIds, that.companyLocationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketIds, companyLocationIds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The IDs of the markets to associate to the catalog.
     */
    private List<String> marketIds;

    /**
     * The IDs of the company locations to associate to the catalog.
     */
    private List<String> companyLocationIds;

    public CatalogContextInput build() {
      CatalogContextInput result = new CatalogContextInput();
      result.marketIds = this.marketIds;
      result.companyLocationIds = this.companyLocationIds;
      return result;
    }

    /**
     * The IDs of the markets to associate to the catalog.
     */
    public Builder marketIds(List<String> marketIds) {
      this.marketIds = marketIds;
      return this;
    }

    /**
     * The IDs of the company locations to associate to the catalog.
     */
    public Builder companyLocationIds(List<String> companyLocationIds) {
      this.companyLocationIds = companyLocationIds;
      return this;
    }
  }
}

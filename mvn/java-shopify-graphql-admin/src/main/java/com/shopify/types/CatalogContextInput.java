package com.shopify.types;

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
   * The IDs of the company locations to associate to the catalog.
   */
  private List<String> companyLocationIds;

  public CatalogContextInput() {
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
    return "CatalogContextInput{companyLocationIds='" + companyLocationIds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CatalogContextInput that = (CatalogContextInput) o;
    return Objects.equals(companyLocationIds, that.companyLocationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLocationIds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The IDs of the company locations to associate to the catalog.
     */
    private List<String> companyLocationIds;

    public CatalogContextInput build() {
      CatalogContextInput result = new CatalogContextInput();
      result.companyLocationIds = this.companyLocationIds;
      return result;
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

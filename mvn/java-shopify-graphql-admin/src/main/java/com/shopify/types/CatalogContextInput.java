package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CatalogContextInput {
  
  private List<String> companyLocationIds;

  public CatalogContextInput() {
  }

  
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
    
    private List<String> companyLocationIds;

    public CatalogContextInput build() {
      CatalogContextInput result = new CatalogContextInput();
      result.companyLocationIds = this.companyLocationIds;
      return result;
    }

    
    public Builder companyLocationIds(List<String> companyLocationIds) {
      this.companyLocationIds = companyLocationIds;
      return this;
    }
  }
}

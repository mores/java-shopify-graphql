package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SearchFilterOptions {
  
  private List<FilterOption> productAvailability;

  public SearchFilterOptions() {
  }

  
  public List<FilterOption> getProductAvailability() {
    return productAvailability;
  }

  public void setProductAvailability(List<FilterOption> productAvailability) {
    this.productAvailability = productAvailability;
  }

  @Override
  public String toString() {
    return "SearchFilterOptions{productAvailability='" + productAvailability + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchFilterOptions that = (SearchFilterOptions) o;
    return Objects.equals(productAvailability, that.productAvailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productAvailability);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<FilterOption> productAvailability;

    public SearchFilterOptions build() {
      SearchFilterOptions result = new SearchFilterOptions();
      result.productAvailability = this.productAvailability;
      return result;
    }

    
    public Builder productAvailability(List<FilterOption> productAvailability) {
      this.productAvailability = productAvailability;
      return this;
    }
  }
}

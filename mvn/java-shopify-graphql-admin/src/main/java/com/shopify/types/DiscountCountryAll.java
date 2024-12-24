package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCountryAll implements DiscountShippingDestinationSelection {
  
  private boolean allCountries;

  public DiscountCountryAll() {
  }

  
  public boolean getAllCountries() {
    return allCountries;
  }

  public void setAllCountries(boolean allCountries) {
    this.allCountries = allCountries;
  }

  @Override
  public String toString() {
    return "DiscountCountryAll{allCountries='" + allCountries + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCountryAll that = (DiscountCountryAll) o;
    return allCountries == that.allCountries;
  }

  @Override
  public int hashCode() {
    return Objects.hash(allCountries);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean allCountries;

    public DiscountCountryAll build() {
      DiscountCountryAll result = new DiscountCountryAll();
      result.allCountries = this.allCountries;
      return result;
    }

    
    public Builder allCountries(boolean allCountries) {
      this.allCountries = allCountries;
      return this;
    }
  }
}

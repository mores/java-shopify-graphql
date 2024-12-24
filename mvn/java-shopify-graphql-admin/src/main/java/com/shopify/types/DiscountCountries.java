package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCountries implements DiscountShippingDestinationSelection {
  
  private List<CountryCode> countries;

  
  private boolean includeRestOfWorld;

  public DiscountCountries() {
  }

  
  public List<CountryCode> getCountries() {
    return countries;
  }

  public void setCountries(List<CountryCode> countries) {
    this.countries = countries;
  }

  
  public boolean getIncludeRestOfWorld() {
    return includeRestOfWorld;
  }

  public void setIncludeRestOfWorld(boolean includeRestOfWorld) {
    this.includeRestOfWorld = includeRestOfWorld;
  }

  @Override
  public String toString() {
    return "DiscountCountries{countries='" + countries + "', includeRestOfWorld='" + includeRestOfWorld + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCountries that = (DiscountCountries) o;
    return Objects.equals(countries, that.countries) &&
        includeRestOfWorld == that.includeRestOfWorld;
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, includeRestOfWorld);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<CountryCode> countries;

    
    private boolean includeRestOfWorld;

    public DiscountCountries build() {
      DiscountCountries result = new DiscountCountries();
      result.countries = this.countries;
      result.includeRestOfWorld = this.includeRestOfWorld;
      return result;
    }

    
    public Builder countries(List<CountryCode> countries) {
      this.countries = countries;
      return this;
    }

    
    public Builder includeRestOfWorld(boolean includeRestOfWorld) {
      this.includeRestOfWorld = includeRestOfWorld;
      return this;
    }
  }
}

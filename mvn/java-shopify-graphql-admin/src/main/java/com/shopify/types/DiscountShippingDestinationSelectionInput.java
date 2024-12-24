package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DiscountShippingDestinationSelectionInput {
  
  private Boolean all = false;

  
  private DiscountCountriesInput countries;

  public DiscountShippingDestinationSelectionInput() {
  }

  
  public Boolean getAll() {
    return all;
  }

  public void setAll(Boolean all) {
    this.all = all;
  }

  
  public DiscountCountriesInput getCountries() {
    return countries;
  }

  public void setCountries(DiscountCountriesInput countries) {
    this.countries = countries;
  }

  @Override
  public String toString() {
    return "DiscountShippingDestinationSelectionInput{all='" + all + "', countries='" + countries + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountShippingDestinationSelectionInput that = (DiscountShippingDestinationSelectionInput) o;
    return Objects.equals(all, that.all) &&
        Objects.equals(countries, that.countries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, countries);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean all = false;

    
    private DiscountCountriesInput countries;

    public DiscountShippingDestinationSelectionInput build() {
      DiscountShippingDestinationSelectionInput result = new DiscountShippingDestinationSelectionInput();
      result.all = this.all;
      result.countries = this.countries;
      return result;
    }

    
    public Builder all(Boolean all) {
      this.all = all;
      return this;
    }

    
    public Builder countries(DiscountCountriesInput countries) {
      this.countries = countries;
      return this;
    }
  }
}

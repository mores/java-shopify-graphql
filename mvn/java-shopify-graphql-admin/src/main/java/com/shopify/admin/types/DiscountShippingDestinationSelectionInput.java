package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the destinations where the free shipping discount will be applied.
 */
public class DiscountShippingDestinationSelectionInput {
  /**
   * Whether the discount code applies to all countries.
   */
  private Boolean all = false;

  /**
   * A list of countries where the discount code will apply.
   */
  private DiscountCountriesInput countries;

  public DiscountShippingDestinationSelectionInput() {
  }

  /**
   * Whether the discount code applies to all countries.
   */
  public Boolean getAll() {
    return all;
  }

  public void setAll(Boolean all) {
    this.all = all;
  }

  /**
   * A list of countries where the discount code will apply.
   */
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
    /**
     * Whether the discount code applies to all countries.
     */
    private Boolean all = false;

    /**
     * A list of countries where the discount code will apply.
     */
    private DiscountCountriesInput countries;

    public DiscountShippingDestinationSelectionInput build() {
      DiscountShippingDestinationSelectionInput result = new DiscountShippingDestinationSelectionInput();
      result.all = this.all;
      result.countries = this.countries;
      return result;
    }

    /**
     * Whether the discount code applies to all countries.
     */
    public Builder all(Boolean all) {
      this.all = all;
      return this;
    }

    /**
     * A list of countries where the discount code will apply.
     */
    public Builder countries(DiscountCountriesInput countries) {
      this.countries = countries;
      return this;
    }
  }
}

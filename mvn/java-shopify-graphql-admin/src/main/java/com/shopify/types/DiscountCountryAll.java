package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The `DiscountCountryAll` object lets you target all countries as shipping destination for discount eligibility.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCountryAll implements DiscountShippingDestinationSelection {
  /**
   * Whether the discount can be applied to all countries as shipping destination. This value is always `true`.
   */
  private boolean allCountries;

  public DiscountCountryAll() {
  }

  /**
   * Whether the discount can be applied to all countries as shipping destination. This value is always `true`.
   */
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
    /**
     * Whether the discount can be applied to all countries as shipping destination. This value is always `true`.
     */
    private boolean allCountries;

    public DiscountCountryAll build() {
      DiscountCountryAll result = new DiscountCountryAll();
      result.allCountries = this.allCountries;
      return result;
    }

    /**
     * Whether the discount can be applied to all countries as shipping destination. This value is always `true`.
     */
    public Builder allCountries(boolean allCountries) {
      this.allCountries = allCountries;
      return this;
    }
  }
}

package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The shipping destinations where the discount can be applied.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCountries implements DiscountShippingDestinationSelection {
  /**
   * The codes for the countries where the discount can be applied.
   */
  private List<CountryCode> countries;

  /**
   * Whether the discount is applicable to countries that haven't been defined in the shop's shipping zones.
   */
  private boolean includeRestOfWorld;

  public DiscountCountries() {
  }

  /**
   * The codes for the countries where the discount can be applied.
   */
  public List<CountryCode> getCountries() {
    return countries;
  }

  public void setCountries(List<CountryCode> countries) {
    this.countries = countries;
  }

  /**
   * Whether the discount is applicable to countries that haven't been defined in the shop's shipping zones.
   */
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
    /**
     * The codes for the countries where the discount can be applied.
     */
    private List<CountryCode> countries;

    /**
     * Whether the discount is applicable to countries that haven't been defined in the shop's shipping zones.
     */
    private boolean includeRestOfWorld;

    public DiscountCountries build() {
      DiscountCountries result = new DiscountCountries();
      result.countries = this.countries;
      result.includeRestOfWorld = this.includeRestOfWorld;
      return result;
    }

    /**
     * The codes for the countries where the discount can be applied.
     */
    public Builder countries(List<CountryCode> countries) {
      this.countries = countries;
      return this;
    }

    /**
     * Whether the discount is applicable to countries that haven't been defined in the shop's shipping zones.
     */
    public Builder includeRestOfWorld(boolean includeRestOfWorld) {
      this.includeRestOfWorld = includeRestOfWorld;
      return this;
    }
  }
}

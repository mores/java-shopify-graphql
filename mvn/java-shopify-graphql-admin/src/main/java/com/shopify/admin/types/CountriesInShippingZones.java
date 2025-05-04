package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The list of all the countries from the combined shipping zones for the shop.
 */
public class CountriesInShippingZones {
  /**
   * The list of all the countries from all the combined shipping zones.
   */
  private List<CountryCode> countryCodes;

  /**
   * Whether 'Rest of World' has been defined in any of the shipping zones.
   */
  private boolean includeRestOfWorld;

  public CountriesInShippingZones() {
  }

  /**
   * The list of all the countries from all the combined shipping zones.
   */
  public List<CountryCode> getCountryCodes() {
    return countryCodes;
  }

  public void setCountryCodes(List<CountryCode> countryCodes) {
    this.countryCodes = countryCodes;
  }

  /**
   * Whether 'Rest of World' has been defined in any of the shipping zones.
   */
  public boolean getIncludeRestOfWorld() {
    return includeRestOfWorld;
  }

  public void setIncludeRestOfWorld(boolean includeRestOfWorld) {
    this.includeRestOfWorld = includeRestOfWorld;
  }

  @Override
  public String toString() {
    return "CountriesInShippingZones{countryCodes='" + countryCodes + "', includeRestOfWorld='" + includeRestOfWorld + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CountriesInShippingZones that = (CountriesInShippingZones) o;
    return Objects.equals(countryCodes, that.countryCodes) &&
        includeRestOfWorld == that.includeRestOfWorld;
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCodes, includeRestOfWorld);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of all the countries from all the combined shipping zones.
     */
    private List<CountryCode> countryCodes;

    /**
     * Whether 'Rest of World' has been defined in any of the shipping zones.
     */
    private boolean includeRestOfWorld;

    public CountriesInShippingZones build() {
      CountriesInShippingZones result = new CountriesInShippingZones();
      result.countryCodes = this.countryCodes;
      result.includeRestOfWorld = this.includeRestOfWorld;
      return result;
    }

    /**
     * The list of all the countries from all the combined shipping zones.
     */
    public Builder countryCodes(List<CountryCode> countryCodes) {
      this.countryCodes = countryCodes;
      return this;
    }

    /**
     * Whether 'Rest of World' has been defined in any of the shipping zones.
     */
    public Builder includeRestOfWorld(boolean includeRestOfWorld) {
      this.includeRestOfWorld = includeRestOfWorld;
      return this;
    }
  }
}

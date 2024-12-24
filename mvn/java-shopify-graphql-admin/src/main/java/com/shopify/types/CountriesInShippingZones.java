package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CountriesInShippingZones {
  
  private List<CountryCode> countryCodes;

  
  private boolean includeRestOfWorld;

  public CountriesInShippingZones() {
  }

  
  public List<CountryCode> getCountryCodes() {
    return countryCodes;
  }

  public void setCountryCodes(List<CountryCode> countryCodes) {
    this.countryCodes = countryCodes;
  }

  
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
    
    private List<CountryCode> countryCodes;

    
    private boolean includeRestOfWorld;

    public CountriesInShippingZones build() {
      CountriesInShippingZones result = new CountriesInShippingZones();
      result.countryCodes = this.countryCodes;
      result.includeRestOfWorld = this.includeRestOfWorld;
      return result;
    }

    
    public Builder countryCodes(List<CountryCode> countryCodes) {
      this.countryCodes = countryCodes;
      return this;
    }

    
    public Builder includeRestOfWorld(boolean includeRestOfWorld) {
      this.includeRestOfWorld = includeRestOfWorld;
      return this;
    }
  }
}

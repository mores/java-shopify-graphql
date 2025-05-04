package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The list of country codes and information whether the countries
 * are a part of the 'Rest Of World' shipping zone.
 */
public class DeliveryCountryCodesOrRestOfWorld {
  /**
   * List of applicable country codes in the ISO 3166-1 alpha-2 format.
   */
  private List<CountryCode> countryCodes;

  /**
   * Whether the countries are a part of the 'Rest of World' shipping zone.
   */
  private boolean restOfWorld;

  public DeliveryCountryCodesOrRestOfWorld() {
  }

  /**
   * List of applicable country codes in the ISO 3166-1 alpha-2 format.
   */
  public List<CountryCode> getCountryCodes() {
    return countryCodes;
  }

  public void setCountryCodes(List<CountryCode> countryCodes) {
    this.countryCodes = countryCodes;
  }

  /**
   * Whether the countries are a part of the 'Rest of World' shipping zone.
   */
  public boolean getRestOfWorld() {
    return restOfWorld;
  }

  public void setRestOfWorld(boolean restOfWorld) {
    this.restOfWorld = restOfWorld;
  }

  @Override
  public String toString() {
    return "DeliveryCountryCodesOrRestOfWorld{countryCodes='" + countryCodes + "', restOfWorld='" + restOfWorld + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCountryCodesOrRestOfWorld that = (DeliveryCountryCodesOrRestOfWorld) o;
    return Objects.equals(countryCodes, that.countryCodes) &&
        restOfWorld == that.restOfWorld;
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCodes, restOfWorld);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * List of applicable country codes in the ISO 3166-1 alpha-2 format.
     */
    private List<CountryCode> countryCodes;

    /**
     * Whether the countries are a part of the 'Rest of World' shipping zone.
     */
    private boolean restOfWorld;

    public DeliveryCountryCodesOrRestOfWorld build() {
      DeliveryCountryCodesOrRestOfWorld result = new DeliveryCountryCodesOrRestOfWorld();
      result.countryCodes = this.countryCodes;
      result.restOfWorld = this.restOfWorld;
      return result;
    }

    /**
     * List of applicable country codes in the ISO 3166-1 alpha-2 format.
     */
    public Builder countryCodes(List<CountryCode> countryCodes) {
      this.countryCodes = countryCodes;
      return this;
    }

    /**
     * Whether the countries are a part of the 'Rest of World' shipping zone.
     */
    public Builder restOfWorld(boolean restOfWorld) {
      this.restOfWorld = restOfWorld;
      return this;
    }
  }
}

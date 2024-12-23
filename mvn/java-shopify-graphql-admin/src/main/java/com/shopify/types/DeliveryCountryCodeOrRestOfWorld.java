package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The country code and whether the country is a part of the 'Rest Of World' shipping zone.
 */
public class DeliveryCountryCodeOrRestOfWorld {
  /**
   * The country code in the ISO 3166-1 alpha-2 format.
   */
  private CountryCode countryCode;

  /**
   * Whether the country is a part of the 'Rest of World' shipping zone.
   */
  private boolean restOfWorld;

  public DeliveryCountryCodeOrRestOfWorld() {
  }

  /**
   * The country code in the ISO 3166-1 alpha-2 format.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * Whether the country is a part of the 'Rest of World' shipping zone.
   */
  public boolean getRestOfWorld() {
    return restOfWorld;
  }

  public void setRestOfWorld(boolean restOfWorld) {
    this.restOfWorld = restOfWorld;
  }

  @Override
  public String toString() {
    return "DeliveryCountryCodeOrRestOfWorld{countryCode='" + countryCode + "', restOfWorld='" + restOfWorld + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCountryCodeOrRestOfWorld that = (DeliveryCountryCodeOrRestOfWorld) o;
    return Objects.equals(countryCode, that.countryCode) &&
        restOfWorld == that.restOfWorld;
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, restOfWorld);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The country code in the ISO 3166-1 alpha-2 format.
     */
    private CountryCode countryCode;

    /**
     * Whether the country is a part of the 'Rest of World' shipping zone.
     */
    private boolean restOfWorld;

    public DeliveryCountryCodeOrRestOfWorld build() {
      DeliveryCountryCodeOrRestOfWorld result = new DeliveryCountryCodeOrRestOfWorld();
      result.countryCode = this.countryCode;
      result.restOfWorld = this.restOfWorld;
      return result;
    }

    /**
     * The country code in the ISO 3166-1 alpha-2 format.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * Whether the country is a part of the 'Rest of World' shipping zone.
     */
    public Builder restOfWorld(boolean restOfWorld) {
      this.restOfWorld = restOfWorld;
      return this;
    }
  }
}

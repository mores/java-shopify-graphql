package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The country details and the associated shipping zone.
 */
public class DeliveryCountryAndZone {
  /**
   * The country details.
   */
  private DeliveryCountry country;

  /**
   * The name of the shipping zone.
   */
  private String zone;

  public DeliveryCountryAndZone() {
  }

  /**
   * The country details.
   */
  public DeliveryCountry getCountry() {
    return country;
  }

  public void setCountry(DeliveryCountry country) {
    this.country = country;
  }

  /**
   * The name of the shipping zone.
   */
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }

  @Override
  public String toString() {
    return "DeliveryCountryAndZone{country='" + country + "', zone='" + zone + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCountryAndZone that = (DeliveryCountryAndZone) o;
    return Objects.equals(country, that.country) &&
        Objects.equals(zone, that.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, zone);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The country details.
     */
    private DeliveryCountry country;

    /**
     * The name of the shipping zone.
     */
    private String zone;

    public DeliveryCountryAndZone build() {
      DeliveryCountryAndZone result = new DeliveryCountryAndZone();
      result.country = this.country;
      result.zone = this.zone;
      return result;
    }

    /**
     * The country details.
     */
    public Builder country(DeliveryCountry country) {
      this.country = country;
      return this;
    }

    /**
     * The name of the shipping zone.
     */
    public Builder zone(String zone) {
      this.zone = zone;
      return this;
    }
  }
}

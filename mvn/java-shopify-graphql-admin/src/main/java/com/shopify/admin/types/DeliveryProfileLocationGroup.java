package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Links a location group with zones. Both are associated to a delivery profile.
 */
public class DeliveryProfileLocationGroup {
  /**
   * The countries already selected in any zone for the specified location group.
   */
  private List<DeliveryCountryAndZone> countriesInAnyZone;

  /**
   * The collection of locations that make up the specified location group.
   */
  private DeliveryLocationGroup locationGroup;

  /**
   * The applicable zones associated to the specified location group.
   */
  private DeliveryLocationGroupZoneConnection locationGroupZones;

  public DeliveryProfileLocationGroup() {
  }

  /**
   * The countries already selected in any zone for the specified location group.
   */
  public List<DeliveryCountryAndZone> getCountriesInAnyZone() {
    return countriesInAnyZone;
  }

  public void setCountriesInAnyZone(List<DeliveryCountryAndZone> countriesInAnyZone) {
    this.countriesInAnyZone = countriesInAnyZone;
  }

  /**
   * The collection of locations that make up the specified location group.
   */
  public DeliveryLocationGroup getLocationGroup() {
    return locationGroup;
  }

  public void setLocationGroup(DeliveryLocationGroup locationGroup) {
    this.locationGroup = locationGroup;
  }

  /**
   * The applicable zones associated to the specified location group.
   */
  public DeliveryLocationGroupZoneConnection getLocationGroupZones() {
    return locationGroupZones;
  }

  public void setLocationGroupZones(DeliveryLocationGroupZoneConnection locationGroupZones) {
    this.locationGroupZones = locationGroupZones;
  }

  @Override
  public String toString() {
    return "DeliveryProfileLocationGroup{countriesInAnyZone='" + countriesInAnyZone + "', locationGroup='" + locationGroup + "', locationGroupZones='" + locationGroupZones + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryProfileLocationGroup that = (DeliveryProfileLocationGroup) o;
    return Objects.equals(countriesInAnyZone, that.countriesInAnyZone) &&
        Objects.equals(locationGroup, that.locationGroup) &&
        Objects.equals(locationGroupZones, that.locationGroupZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countriesInAnyZone, locationGroup, locationGroupZones);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The countries already selected in any zone for the specified location group.
     */
    private List<DeliveryCountryAndZone> countriesInAnyZone;

    /**
     * The collection of locations that make up the specified location group.
     */
    private DeliveryLocationGroup locationGroup;

    /**
     * The applicable zones associated to the specified location group.
     */
    private DeliveryLocationGroupZoneConnection locationGroupZones;

    public DeliveryProfileLocationGroup build() {
      DeliveryProfileLocationGroup result = new DeliveryProfileLocationGroup();
      result.countriesInAnyZone = this.countriesInAnyZone;
      result.locationGroup = this.locationGroup;
      result.locationGroupZones = this.locationGroupZones;
      return result;
    }

    /**
     * The countries already selected in any zone for the specified location group.
     */
    public Builder countriesInAnyZone(List<DeliveryCountryAndZone> countriesInAnyZone) {
      this.countriesInAnyZone = countriesInAnyZone;
      return this;
    }

    /**
     * The collection of locations that make up the specified location group.
     */
    public Builder locationGroup(DeliveryLocationGroup locationGroup) {
      this.locationGroup = locationGroup;
      return this;
    }

    /**
     * The applicable zones associated to the specified location group.
     */
    public Builder locationGroupZones(DeliveryLocationGroupZoneConnection locationGroupZones) {
      this.locationGroupZones = locationGroupZones;
      return this;
    }
  }
}

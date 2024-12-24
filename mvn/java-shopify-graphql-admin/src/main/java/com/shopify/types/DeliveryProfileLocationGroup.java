package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DeliveryProfileLocationGroup {
  
  private List<DeliveryCountryAndZone> countriesInAnyZone;

  
  private DeliveryLocationGroup locationGroup;

  
  private DeliveryLocationGroupZoneConnection locationGroupZones;

  public DeliveryProfileLocationGroup() {
  }

  
  public List<DeliveryCountryAndZone> getCountriesInAnyZone() {
    return countriesInAnyZone;
  }

  public void setCountriesInAnyZone(List<DeliveryCountryAndZone> countriesInAnyZone) {
    this.countriesInAnyZone = countriesInAnyZone;
  }

  
  public DeliveryLocationGroup getLocationGroup() {
    return locationGroup;
  }

  public void setLocationGroup(DeliveryLocationGroup locationGroup) {
    this.locationGroup = locationGroup;
  }

  
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
    
    private List<DeliveryCountryAndZone> countriesInAnyZone;

    
    private DeliveryLocationGroup locationGroup;

    
    private DeliveryLocationGroupZoneConnection locationGroupZones;

    public DeliveryProfileLocationGroup build() {
      DeliveryProfileLocationGroup result = new DeliveryProfileLocationGroup();
      result.countriesInAnyZone = this.countriesInAnyZone;
      result.locationGroup = this.locationGroup;
      result.locationGroupZones = this.locationGroupZones;
      return result;
    }

    
    public Builder countriesInAnyZone(List<DeliveryCountryAndZone> countriesInAnyZone) {
      this.countriesInAnyZone = countriesInAnyZone;
      return this;
    }

    
    public Builder locationGroup(DeliveryLocationGroup locationGroup) {
      this.locationGroup = locationGroup;
      return this;
    }

    
    public Builder locationGroupZones(DeliveryLocationGroupZoneConnection locationGroupZones) {
      this.locationGroupZones = locationGroupZones;
      return this;
    }
  }
}

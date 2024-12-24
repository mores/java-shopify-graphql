package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DeliveryCarrierServiceAndLocations {
  
  private DeliveryCarrierService carrierService;

  
  private List<Location> locations;

  public DeliveryCarrierServiceAndLocations() {
  }

  
  public DeliveryCarrierService getCarrierService() {
    return carrierService;
  }

  public void setCarrierService(DeliveryCarrierService carrierService) {
    this.carrierService = carrierService;
  }

  
  public List<Location> getLocations() {
    return locations;
  }

  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }

  @Override
  public String toString() {
    return "DeliveryCarrierServiceAndLocations{carrierService='" + carrierService + "', locations='" + locations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCarrierServiceAndLocations that = (DeliveryCarrierServiceAndLocations) o;
    return Objects.equals(carrierService, that.carrierService) &&
        Objects.equals(locations, that.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierService, locations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DeliveryCarrierService carrierService;

    
    private List<Location> locations;

    public DeliveryCarrierServiceAndLocations build() {
      DeliveryCarrierServiceAndLocations result = new DeliveryCarrierServiceAndLocations();
      result.carrierService = this.carrierService;
      result.locations = this.locations;
      return result;
    }

    
    public Builder carrierService(DeliveryCarrierService carrierService) {
      this.carrierService = carrierService;
      return this;
    }

    
    public Builder locations(List<Location> locations) {
      this.locations = locations;
      return this;
    }
  }
}

package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A carrier service and the associated list of shop locations.
 */
public class DeliveryCarrierServiceAndLocations {
  /**
   * The carrier service.
   */
  private DeliveryCarrierService carrierService;

  /**
   * The list of locations that support this carrier service.
   */
  private List<Location> locations;

  public DeliveryCarrierServiceAndLocations() {
  }

  /**
   * The carrier service.
   */
  public DeliveryCarrierService getCarrierService() {
    return carrierService;
  }

  public void setCarrierService(DeliveryCarrierService carrierService) {
    this.carrierService = carrierService;
  }

  /**
   * The list of locations that support this carrier service.
   */
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
    /**
     * The carrier service.
     */
    private DeliveryCarrierService carrierService;

    /**
     * The list of locations that support this carrier service.
     */
    private List<Location> locations;

    public DeliveryCarrierServiceAndLocations build() {
      DeliveryCarrierServiceAndLocations result = new DeliveryCarrierServiceAndLocations();
      result.carrierService = this.carrierService;
      result.locations = this.locations;
      return result;
    }

    /**
     * The carrier service.
     */
    public Builder carrierService(DeliveryCarrierService carrierService) {
      this.carrierService = carrierService;
      return this;
    }

    /**
     * The list of locations that support this carrier service.
     */
    public Builder locations(List<Location> locations) {
      this.locations = locations;
      return this;
    }
  }
}

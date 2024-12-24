package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class LocationLocalPickupDisablePayload {
  
  private String locationId;

  
  private List<DeliveryLocationLocalPickupSettingsError> userErrors;

  public LocationLocalPickupDisablePayload() {
  }

  
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  
  public List<DeliveryLocationLocalPickupSettingsError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DeliveryLocationLocalPickupSettingsError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "LocationLocalPickupDisablePayload{locationId='" + locationId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationLocalPickupDisablePayload that = (LocationLocalPickupDisablePayload) o;
    return Objects.equals(locationId, that.locationId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String locationId;

    
    private List<DeliveryLocationLocalPickupSettingsError> userErrors;

    public LocationLocalPickupDisablePayload build() {
      LocationLocalPickupDisablePayload result = new LocationLocalPickupDisablePayload();
      result.locationId = this.locationId;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    
    public Builder userErrors(List<DeliveryLocationLocalPickupSettingsError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

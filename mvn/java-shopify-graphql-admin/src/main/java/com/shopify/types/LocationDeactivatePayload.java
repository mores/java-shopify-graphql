package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class LocationDeactivatePayload {
  
  private Location location;

  
  private List<LocationDeactivateUserError> locationDeactivateUserErrors;

  public LocationDeactivatePayload() {
  }

  
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  
  public List<LocationDeactivateUserError> getLocationDeactivateUserErrors() {
    return locationDeactivateUserErrors;
  }

  public void setLocationDeactivateUserErrors(
      List<LocationDeactivateUserError> locationDeactivateUserErrors) {
    this.locationDeactivateUserErrors = locationDeactivateUserErrors;
  }

  @Override
  public String toString() {
    return "LocationDeactivatePayload{location='" + location + "', locationDeactivateUserErrors='" + locationDeactivateUserErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationDeactivatePayload that = (LocationDeactivatePayload) o;
    return Objects.equals(location, that.location) &&
        Objects.equals(locationDeactivateUserErrors, that.locationDeactivateUserErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, locationDeactivateUserErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Location location;

    
    private List<LocationDeactivateUserError> locationDeactivateUserErrors;

    public LocationDeactivatePayload build() {
      LocationDeactivatePayload result = new LocationDeactivatePayload();
      result.location = this.location;
      result.locationDeactivateUserErrors = this.locationDeactivateUserErrors;
      return result;
    }

    
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    
    public Builder locationDeactivateUserErrors(
        List<LocationDeactivateUserError> locationDeactivateUserErrors) {
      this.locationDeactivateUserErrors = locationDeactivateUserErrors;
      return this;
    }
  }
}

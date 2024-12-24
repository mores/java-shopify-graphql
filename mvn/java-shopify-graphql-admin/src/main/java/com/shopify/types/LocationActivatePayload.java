package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class LocationActivatePayload {
  
  private Location location;

  
  private List<LocationActivateUserError> locationActivateUserErrors;

  public LocationActivatePayload() {
  }

  
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  
  public List<LocationActivateUserError> getLocationActivateUserErrors() {
    return locationActivateUserErrors;
  }

  public void setLocationActivateUserErrors(
      List<LocationActivateUserError> locationActivateUserErrors) {
    this.locationActivateUserErrors = locationActivateUserErrors;
  }

  @Override
  public String toString() {
    return "LocationActivatePayload{location='" + location + "', locationActivateUserErrors='" + locationActivateUserErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationActivatePayload that = (LocationActivatePayload) o;
    return Objects.equals(location, that.location) &&
        Objects.equals(locationActivateUserErrors, that.locationActivateUserErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, locationActivateUserErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Location location;

    
    private List<LocationActivateUserError> locationActivateUserErrors;

    public LocationActivatePayload build() {
      LocationActivatePayload result = new LocationActivatePayload();
      result.location = this.location;
      result.locationActivateUserErrors = this.locationActivateUserErrors;
      return result;
    }

    
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    
    public Builder locationActivateUserErrors(
        List<LocationActivateUserError> locationActivateUserErrors) {
      this.locationActivateUserErrors = locationActivateUserErrors;
      return this;
    }
  }
}

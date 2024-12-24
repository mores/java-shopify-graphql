package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class LocationAddPayload {
  
  private Location location;

  
  private List<LocationAddUserError> userErrors;

  public LocationAddPayload() {
  }

  
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  
  public List<LocationAddUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<LocationAddUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "LocationAddPayload{location='" + location + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationAddPayload that = (LocationAddPayload) o;
    return Objects.equals(location, that.location) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Location location;

    
    private List<LocationAddUserError> userErrors;

    public LocationAddPayload build() {
      LocationAddPayload result = new LocationAddPayload();
      result.location = this.location;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    
    public Builder userErrors(List<LocationAddUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

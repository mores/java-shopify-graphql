package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class LocationEditPayload {
  
  private Location location;

  
  private List<LocationEditUserError> userErrors;

  public LocationEditPayload() {
  }

  
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  
  public List<LocationEditUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<LocationEditUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "LocationEditPayload{location='" + location + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationEditPayload that = (LocationEditPayload) o;
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

    
    private List<LocationEditUserError> userErrors;

    public LocationEditPayload build() {
      LocationEditPayload result = new LocationEditPayload();
      result.location = this.location;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    
    public Builder userErrors(List<LocationEditUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

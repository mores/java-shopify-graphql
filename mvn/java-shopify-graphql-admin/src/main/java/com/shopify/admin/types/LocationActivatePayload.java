package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `locationActivate` mutation.
 */
public class LocationActivatePayload {
  /**
   * The location that was activated.
   */
  private Location location;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<LocationActivateUserError> locationActivateUserErrors;

  public LocationActivatePayload() {
  }

  /**
   * The location that was activated.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
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
    /**
     * The location that was activated.
     */
    private Location location;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<LocationActivateUserError> locationActivateUserErrors;

    public LocationActivatePayload build() {
      LocationActivatePayload result = new LocationActivatePayload();
      result.location = this.location;
      result.locationActivateUserErrors = this.locationActivateUserErrors;
      return result;
    }

    /**
     * The location that was activated.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder locationActivateUserErrors(
        List<LocationActivateUserError> locationActivateUserErrors) {
      this.locationActivateUserErrors = locationActivateUserErrors;
      return this;
    }
  }
}

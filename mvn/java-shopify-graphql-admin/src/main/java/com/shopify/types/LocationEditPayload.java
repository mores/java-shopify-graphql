package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `locationEdit` mutation.
 */
public class LocationEditPayload {
  /**
   * The location that was edited.
   */
  private Location location;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<LocationEditUserError> userErrors;

  public LocationEditPayload() {
  }

  /**
   * The location that was edited.
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
    /**
     * The location that was edited.
     */
    private Location location;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<LocationEditUserError> userErrors;

    public LocationEditPayload build() {
      LocationEditPayload result = new LocationEditPayload();
      result.location = this.location;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The location that was edited.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<LocationEditUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

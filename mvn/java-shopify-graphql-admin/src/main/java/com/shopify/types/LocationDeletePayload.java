package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `locationDelete` mutation.
 */
public class LocationDeletePayload {
  /**
   * The ID of the location that was deleted.
   */
  private String deletedLocationId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<LocationDeleteUserError> locationDeleteUserErrors;

  public LocationDeletePayload() {
  }

  /**
   * The ID of the location that was deleted.
   */
  public String getDeletedLocationId() {
    return deletedLocationId;
  }

  public void setDeletedLocationId(String deletedLocationId) {
    this.deletedLocationId = deletedLocationId;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<LocationDeleteUserError> getLocationDeleteUserErrors() {
    return locationDeleteUserErrors;
  }

  public void setLocationDeleteUserErrors(List<LocationDeleteUserError> locationDeleteUserErrors) {
    this.locationDeleteUserErrors = locationDeleteUserErrors;
  }

  @Override
  public String toString() {
    return "LocationDeletePayload{deletedLocationId='" + deletedLocationId + "', locationDeleteUserErrors='" + locationDeleteUserErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocationDeletePayload that = (LocationDeletePayload) o;
    return Objects.equals(deletedLocationId, that.deletedLocationId) &&
        Objects.equals(locationDeleteUserErrors, that.locationDeleteUserErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedLocationId, locationDeleteUserErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the location that was deleted.
     */
    private String deletedLocationId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<LocationDeleteUserError> locationDeleteUserErrors;

    public LocationDeletePayload build() {
      LocationDeletePayload result = new LocationDeletePayload();
      result.deletedLocationId = this.deletedLocationId;
      result.locationDeleteUserErrors = this.locationDeleteUserErrors;
      return result;
    }

    /**
     * The ID of the location that was deleted.
     */
    public Builder deletedLocationId(String deletedLocationId) {
      this.deletedLocationId = deletedLocationId;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder locationDeleteUserErrors(
        List<LocationDeleteUserError> locationDeleteUserErrors) {
      this.locationDeleteUserErrors = locationDeleteUserErrors;
      return this;
    }
  }
}

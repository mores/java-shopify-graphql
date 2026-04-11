package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `pointOfSaleDeviceAssignToCashDrawer` mutation.
 */
public class PointOfSaleDeviceAssignToCashDrawerPayload {
  /**
   * The point of sale device.
   */
  private PointOfSaleDevice pointOfSaleDevice;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PointOfSaleDeviceAssignToCashDrawerUserError> userErrors;

  public PointOfSaleDeviceAssignToCashDrawerPayload() {
  }

  /**
   * The point of sale device.
   */
  public PointOfSaleDevice getPointOfSaleDevice() {
    return pointOfSaleDevice;
  }

  public void setPointOfSaleDevice(PointOfSaleDevice pointOfSaleDevice) {
    this.pointOfSaleDevice = pointOfSaleDevice;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<PointOfSaleDeviceAssignToCashDrawerUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PointOfSaleDeviceAssignToCashDrawerUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PointOfSaleDeviceAssignToCashDrawerPayload{pointOfSaleDevice='" + pointOfSaleDevice + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PointOfSaleDeviceAssignToCashDrawerPayload that = (PointOfSaleDeviceAssignToCashDrawerPayload) o;
    return Objects.equals(pointOfSaleDevice, that.pointOfSaleDevice) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointOfSaleDevice, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The point of sale device.
     */
    private PointOfSaleDevice pointOfSaleDevice;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PointOfSaleDeviceAssignToCashDrawerUserError> userErrors;

    public PointOfSaleDeviceAssignToCashDrawerPayload build() {
      PointOfSaleDeviceAssignToCashDrawerPayload result = new PointOfSaleDeviceAssignToCashDrawerPayload();
      result.pointOfSaleDevice = this.pointOfSaleDevice;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The point of sale device.
     */
    public Builder pointOfSaleDevice(PointOfSaleDevice pointOfSaleDevice) {
      this.pointOfSaleDevice = pointOfSaleDevice;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PointOfSaleDeviceAssignToCashDrawerUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

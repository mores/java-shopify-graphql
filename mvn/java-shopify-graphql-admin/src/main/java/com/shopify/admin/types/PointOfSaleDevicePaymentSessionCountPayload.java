package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `pointOfSaleDevicePaymentSessionCount` mutation.
 */
public class PointOfSaleDevicePaymentSessionCountPayload {
  /**
   * The point of sale device payment session after recording the count.
   */
  private PointOfSaleDevicePaymentSession pointOfSaleDevicePaymentSession;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PointOfSaleDevicePaymentSessionCountUserError> userErrors;

  public PointOfSaleDevicePaymentSessionCountPayload() {
  }

  /**
   * The point of sale device payment session after recording the count.
   */
  public PointOfSaleDevicePaymentSession getPointOfSaleDevicePaymentSession() {
    return pointOfSaleDevicePaymentSession;
  }

  public void setPointOfSaleDevicePaymentSession(
      PointOfSaleDevicePaymentSession pointOfSaleDevicePaymentSession) {
    this.pointOfSaleDevicePaymentSession = pointOfSaleDevicePaymentSession;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<PointOfSaleDevicePaymentSessionCountUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PointOfSaleDevicePaymentSessionCountUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PointOfSaleDevicePaymentSessionCountPayload{pointOfSaleDevicePaymentSession='" + pointOfSaleDevicePaymentSession + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PointOfSaleDevicePaymentSessionCountPayload that = (PointOfSaleDevicePaymentSessionCountPayload) o;
    return Objects.equals(pointOfSaleDevicePaymentSession, that.pointOfSaleDevicePaymentSession) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointOfSaleDevicePaymentSession, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The point of sale device payment session after recording the count.
     */
    private PointOfSaleDevicePaymentSession pointOfSaleDevicePaymentSession;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PointOfSaleDevicePaymentSessionCountUserError> userErrors;

    public PointOfSaleDevicePaymentSessionCountPayload build() {
      PointOfSaleDevicePaymentSessionCountPayload result = new PointOfSaleDevicePaymentSessionCountPayload();
      result.pointOfSaleDevicePaymentSession = this.pointOfSaleDevicePaymentSession;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The point of sale device payment session after recording the count.
     */
    public Builder pointOfSaleDevicePaymentSession(
        PointOfSaleDevicePaymentSession pointOfSaleDevicePaymentSession) {
      this.pointOfSaleDevicePaymentSession = pointOfSaleDevicePaymentSession;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PointOfSaleDevicePaymentSessionCountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

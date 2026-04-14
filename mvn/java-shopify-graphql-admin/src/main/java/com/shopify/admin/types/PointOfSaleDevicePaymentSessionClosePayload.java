package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `pointOfSaleDevicePaymentSessionClose` mutation.
 */
public class PointOfSaleDevicePaymentSessionClosePayload {
  /**
   * The closed point of sale device payment session.
   */
  private PointOfSaleDevicePaymentSession pointOfSaleDevicePaymentSession;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PointOfSaleDevicePaymentSessionCloseUserError> userErrors;

  public PointOfSaleDevicePaymentSessionClosePayload() {
  }

  /**
   * The closed point of sale device payment session.
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
  public List<PointOfSaleDevicePaymentSessionCloseUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PointOfSaleDevicePaymentSessionCloseUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PointOfSaleDevicePaymentSessionClosePayload{pointOfSaleDevicePaymentSession='" + pointOfSaleDevicePaymentSession + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PointOfSaleDevicePaymentSessionClosePayload that = (PointOfSaleDevicePaymentSessionClosePayload) o;
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
     * The closed point of sale device payment session.
     */
    private PointOfSaleDevicePaymentSession pointOfSaleDevicePaymentSession;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PointOfSaleDevicePaymentSessionCloseUserError> userErrors;

    public PointOfSaleDevicePaymentSessionClosePayload build() {
      PointOfSaleDevicePaymentSessionClosePayload result = new PointOfSaleDevicePaymentSessionClosePayload();
      result.pointOfSaleDevicePaymentSession = this.pointOfSaleDevicePaymentSession;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The closed point of sale device payment session.
     */
    public Builder pointOfSaleDevicePaymentSession(
        PointOfSaleDevicePaymentSession pointOfSaleDevicePaymentSession) {
      this.pointOfSaleDevicePaymentSession = pointOfSaleDevicePaymentSession;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PointOfSaleDevicePaymentSessionCloseUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

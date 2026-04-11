package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `pointOfSaleDevicePaymentSessionAdjust` mutation.
 */
public class PointOfSaleDevicePaymentSessionAdjustPayload {
  /**
   * The adjusted point of sale device payment session.
   */
  private PointOfSaleDevicePaymentSession pointOfSaleDevicePaymentSession;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public PointOfSaleDevicePaymentSessionAdjustPayload() {
  }

  /**
   * The adjusted point of sale device payment session.
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
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PointOfSaleDevicePaymentSessionAdjustPayload{pointOfSaleDevicePaymentSession='" + pointOfSaleDevicePaymentSession + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PointOfSaleDevicePaymentSessionAdjustPayload that = (PointOfSaleDevicePaymentSessionAdjustPayload) o;
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
     * The adjusted point of sale device payment session.
     */
    private PointOfSaleDevicePaymentSession pointOfSaleDevicePaymentSession;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public PointOfSaleDevicePaymentSessionAdjustPayload build() {
      PointOfSaleDevicePaymentSessionAdjustPayload result = new PointOfSaleDevicePaymentSessionAdjustPayload();
      result.pointOfSaleDevicePaymentSession = this.pointOfSaleDevicePaymentSession;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The adjusted point of sale device payment session.
     */
    public Builder pointOfSaleDevicePaymentSession(
        PointOfSaleDevicePaymentSession pointOfSaleDevicePaymentSession) {
      this.pointOfSaleDevicePaymentSession = pointOfSaleDevicePaymentSession;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

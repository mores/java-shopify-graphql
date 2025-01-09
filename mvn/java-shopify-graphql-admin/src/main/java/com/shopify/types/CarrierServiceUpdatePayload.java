package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `carrierServiceUpdate` mutation.
 */
public class CarrierServiceUpdatePayload {
  /**
   * The updated carrier service.
   */
  private DeliveryCarrierService carrierService;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CarrierServiceUpdateUserError> userErrors;

  public CarrierServiceUpdatePayload() {
  }

  /**
   * The updated carrier service.
   */
  public DeliveryCarrierService getCarrierService() {
    return carrierService;
  }

  public void setCarrierService(DeliveryCarrierService carrierService) {
    this.carrierService = carrierService;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CarrierServiceUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CarrierServiceUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CarrierServiceUpdatePayload{carrierService='" + carrierService + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CarrierServiceUpdatePayload that = (CarrierServiceUpdatePayload) o;
    return Objects.equals(carrierService, that.carrierService) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierService, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated carrier service.
     */
    private DeliveryCarrierService carrierService;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CarrierServiceUpdateUserError> userErrors;

    public CarrierServiceUpdatePayload build() {
      CarrierServiceUpdatePayload result = new CarrierServiceUpdatePayload();
      result.carrierService = this.carrierService;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated carrier service.
     */
    public Builder carrierService(DeliveryCarrierService carrierService) {
      this.carrierService = carrierService;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CarrierServiceUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

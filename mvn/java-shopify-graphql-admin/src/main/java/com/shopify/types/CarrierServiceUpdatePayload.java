package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CarrierServiceUpdatePayload {
  
  private DeliveryCarrierService carrierService;

  
  private List<CarrierServiceUpdateUserError> userErrors;

  public CarrierServiceUpdatePayload() {
  }

  
  public DeliveryCarrierService getCarrierService() {
    return carrierService;
  }

  public void setCarrierService(DeliveryCarrierService carrierService) {
    this.carrierService = carrierService;
  }

  
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
    
    private DeliveryCarrierService carrierService;

    
    private List<CarrierServiceUpdateUserError> userErrors;

    public CarrierServiceUpdatePayload build() {
      CarrierServiceUpdatePayload result = new CarrierServiceUpdatePayload();
      result.carrierService = this.carrierService;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder carrierService(DeliveryCarrierService carrierService) {
      this.carrierService = carrierService;
      return this;
    }

    
    public Builder userErrors(List<CarrierServiceUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

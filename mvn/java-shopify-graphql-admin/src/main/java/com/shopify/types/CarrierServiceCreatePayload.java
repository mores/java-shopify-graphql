package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CarrierServiceCreatePayload {
  
  private DeliveryCarrierService carrierService;

  
  private List<CarrierServiceCreateUserError> userErrors;

  public CarrierServiceCreatePayload() {
  }

  
  public DeliveryCarrierService getCarrierService() {
    return carrierService;
  }

  public void setCarrierService(DeliveryCarrierService carrierService) {
    this.carrierService = carrierService;
  }

  
  public List<CarrierServiceCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CarrierServiceCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CarrierServiceCreatePayload{carrierService='" + carrierService + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CarrierServiceCreatePayload that = (CarrierServiceCreatePayload) o;
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

    
    private List<CarrierServiceCreateUserError> userErrors;

    public CarrierServiceCreatePayload build() {
      CarrierServiceCreatePayload result = new CarrierServiceCreatePayload();
      result.carrierService = this.carrierService;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder carrierService(DeliveryCarrierService carrierService) {
      this.carrierService = carrierService;
      return this;
    }

    
    public Builder userErrors(List<CarrierServiceCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}

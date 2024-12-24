package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class InventoryBulkToggleActivationInput {
  
  private String locationId;

  
  private boolean activate;

  public InventoryBulkToggleActivationInput() {
  }

  
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  
  public boolean getActivate() {
    return activate;
  }

  public void setActivate(boolean activate) {
    this.activate = activate;
  }

  @Override
  public String toString() {
    return "InventoryBulkToggleActivationInput{locationId='" + locationId + "', activate='" + activate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InventoryBulkToggleActivationInput that = (InventoryBulkToggleActivationInput) o;
    return Objects.equals(locationId, that.locationId) &&
        activate == that.activate;
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, activate);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String locationId;

    
    private boolean activate;

    public InventoryBulkToggleActivationInput build() {
      InventoryBulkToggleActivationInput result = new InventoryBulkToggleActivationInput();
      result.locationId = this.locationId;
      result.activate = this.activate;
      return result;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    
    public Builder activate(boolean activate) {
      this.activate = activate;
      return this;
    }
  }
}

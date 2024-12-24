package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryLocationLocalPickupEnableInput {
  
  private String locationId;

  
  private DeliveryLocalPickupTime pickupTime;

  
  private String instructions;

  public DeliveryLocationLocalPickupEnableInput() {
  }

  
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  
  public DeliveryLocalPickupTime getPickupTime() {
    return pickupTime;
  }

  public void setPickupTime(DeliveryLocalPickupTime pickupTime) {
    this.pickupTime = pickupTime;
  }

  
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  @Override
  public String toString() {
    return "DeliveryLocationLocalPickupEnableInput{locationId='" + locationId + "', pickupTime='" + pickupTime + "', instructions='" + instructions + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryLocationLocalPickupEnableInput that = (DeliveryLocationLocalPickupEnableInput) o;
    return Objects.equals(locationId, that.locationId) &&
        Objects.equals(pickupTime, that.pickupTime) &&
        Objects.equals(instructions, that.instructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, pickupTime, instructions);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String locationId;

    
    private DeliveryLocalPickupTime pickupTime;

    
    private String instructions;

    public DeliveryLocationLocalPickupEnableInput build() {
      DeliveryLocationLocalPickupEnableInput result = new DeliveryLocationLocalPickupEnableInput();
      result.locationId = this.locationId;
      result.pickupTime = this.pickupTime;
      result.instructions = this.instructions;
      return result;
    }

    
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    
    public Builder pickupTime(DeliveryLocalPickupTime pickupTime) {
      this.pickupTime = pickupTime;
      return this;
    }

    
    public Builder instructions(String instructions) {
      this.instructions = instructions;
      return this;
    }
  }
}

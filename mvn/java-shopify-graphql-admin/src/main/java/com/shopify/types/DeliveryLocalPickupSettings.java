package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryLocalPickupSettings {
  
  private String instructions;

  
  private DeliveryLocalPickupTime pickupTime;

  public DeliveryLocalPickupSettings() {
  }

  
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  
  public DeliveryLocalPickupTime getPickupTime() {
    return pickupTime;
  }

  public void setPickupTime(DeliveryLocalPickupTime pickupTime) {
    this.pickupTime = pickupTime;
  }

  @Override
  public String toString() {
    return "DeliveryLocalPickupSettings{instructions='" + instructions + "', pickupTime='" + pickupTime + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryLocalPickupSettings that = (DeliveryLocalPickupSettings) o;
    return Objects.equals(instructions, that.instructions) &&
        Objects.equals(pickupTime, that.pickupTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructions, pickupTime);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String instructions;

    
    private DeliveryLocalPickupTime pickupTime;

    public DeliveryLocalPickupSettings build() {
      DeliveryLocalPickupSettings result = new DeliveryLocalPickupSettings();
      result.instructions = this.instructions;
      result.pickupTime = this.pickupTime;
      return result;
    }

    
    public Builder instructions(String instructions) {
      this.instructions = instructions;
      return this;
    }

    
    public Builder pickupTime(DeliveryLocalPickupTime pickupTime) {
      this.pickupTime = pickupTime;
      return this;
    }
  }
}

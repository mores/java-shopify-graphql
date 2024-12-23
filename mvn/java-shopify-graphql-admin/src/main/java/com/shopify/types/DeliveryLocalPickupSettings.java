package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Local pickup settings associated with a location.
 */
public class DeliveryLocalPickupSettings {
  /**
   * Additional instructions or information related to the local pickup.
   */
  private String instructions;

  /**
   * The estimated pickup time to show customers at checkout.
   */
  private DeliveryLocalPickupTime pickupTime;

  public DeliveryLocalPickupSettings() {
  }

  /**
   * Additional instructions or information related to the local pickup.
   */
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * The estimated pickup time to show customers at checkout.
   */
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
    /**
     * Additional instructions or information related to the local pickup.
     */
    private String instructions;

    /**
     * The estimated pickup time to show customers at checkout.
     */
    private DeliveryLocalPickupTime pickupTime;

    public DeliveryLocalPickupSettings build() {
      DeliveryLocalPickupSettings result = new DeliveryLocalPickupSettings();
      result.instructions = this.instructions;
      result.pickupTime = this.pickupTime;
      return result;
    }

    /**
     * Additional instructions or information related to the local pickup.
     */
    public Builder instructions(String instructions) {
      this.instructions = instructions;
      return this;
    }

    /**
     * The estimated pickup time to show customers at checkout.
     */
    public Builder pickupTime(DeliveryLocalPickupTime pickupTime) {
      this.pickupTime = pickupTime;
      return this;
    }
  }
}

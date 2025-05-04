package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a local pickup setting associated with a location.
 */
public class DeliveryLocationLocalPickupEnableInput {
  /**
   * The ID of the location associated with the location setting.
   */
  private String locationId;

  /**
   * The time of the local pickup.
   */
  private DeliveryLocalPickupTime pickupTime;

  /**
   * The instructions for the local pickup.
   */
  private String instructions;

  public DeliveryLocationLocalPickupEnableInput() {
  }

  /**
   * The ID of the location associated with the location setting.
   */
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  /**
   * The time of the local pickup.
   */
  public DeliveryLocalPickupTime getPickupTime() {
    return pickupTime;
  }

  public void setPickupTime(DeliveryLocalPickupTime pickupTime) {
    this.pickupTime = pickupTime;
  }

  /**
   * The instructions for the local pickup.
   */
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
    /**
     * The ID of the location associated with the location setting.
     */
    private String locationId;

    /**
     * The time of the local pickup.
     */
    private DeliveryLocalPickupTime pickupTime;

    /**
     * The instructions for the local pickup.
     */
    private String instructions;

    public DeliveryLocationLocalPickupEnableInput build() {
      DeliveryLocationLocalPickupEnableInput result = new DeliveryLocationLocalPickupEnableInput();
      result.locationId = this.locationId;
      result.pickupTime = this.pickupTime;
      result.instructions = this.instructions;
      return result;
    }

    /**
     * The ID of the location associated with the location setting.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     * The time of the local pickup.
     */
    public Builder pickupTime(DeliveryLocalPickupTime pickupTime) {
      this.pickupTime = pickupTime;
      return this;
    }

    /**
     * The instructions for the local pickup.
     */
    public Builder instructions(String instructions) {
      this.instructions = instructions;
      return this;
    }
  }
}

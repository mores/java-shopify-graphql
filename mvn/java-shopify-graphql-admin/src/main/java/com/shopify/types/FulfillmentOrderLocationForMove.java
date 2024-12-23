package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A location that a fulfillment order can potentially move to.
 */
public class FulfillmentOrderLocationForMove {
  /**
   * Fulfillment order line items that can be moved from their current location to the given location.
   */
  private FulfillmentOrderLineItemConnection availableLineItems;

  /**
   * Total number of fulfillment order line items that can be moved from their current assigned location to the
   * given location.
   */
  private Count availableLineItemsCount;

  /**
   * The location being considered as the fulfillment order's new assigned location.
   */
  private Location location;

  /**
   * A human-readable string with the reason why the fulfillment order, or some of its line items, can't be
   * moved to the location.
   */
  private String message;

  /**
   * Whether the fulfillment order can be moved to the location.
   */
  private boolean movable;

  /**
   * Fulfillment order line items that cannot be moved from their current location to the given location.
   */
  private FulfillmentOrderLineItemConnection unavailableLineItems;

  /**
   * Total number of fulfillment order line items that can't be moved from their current assigned location to the
   * given location.
   */
  private Count unavailableLineItemsCount;

  public FulfillmentOrderLocationForMove() {
  }

  /**
   * Fulfillment order line items that can be moved from their current location to the given location.
   */
  public FulfillmentOrderLineItemConnection getAvailableLineItems() {
    return availableLineItems;
  }

  public void setAvailableLineItems(FulfillmentOrderLineItemConnection availableLineItems) {
    this.availableLineItems = availableLineItems;
  }

  /**
   * Total number of fulfillment order line items that can be moved from their current assigned location to the
   * given location.
   */
  public Count getAvailableLineItemsCount() {
    return availableLineItemsCount;
  }

  public void setAvailableLineItemsCount(Count availableLineItemsCount) {
    this.availableLineItemsCount = availableLineItemsCount;
  }

  /**
   * The location being considered as the fulfillment order's new assigned location.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * A human-readable string with the reason why the fulfillment order, or some of its line items, can't be
   * moved to the location.
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Whether the fulfillment order can be moved to the location.
   */
  public boolean getMovable() {
    return movable;
  }

  public void setMovable(boolean movable) {
    this.movable = movable;
  }

  /**
   * Fulfillment order line items that cannot be moved from their current location to the given location.
   */
  public FulfillmentOrderLineItemConnection getUnavailableLineItems() {
    return unavailableLineItems;
  }

  public void setUnavailableLineItems(FulfillmentOrderLineItemConnection unavailableLineItems) {
    this.unavailableLineItems = unavailableLineItems;
  }

  /**
   * Total number of fulfillment order line items that can't be moved from their current assigned location to the
   * given location.
   */
  public Count getUnavailableLineItemsCount() {
    return unavailableLineItemsCount;
  }

  public void setUnavailableLineItemsCount(Count unavailableLineItemsCount) {
    this.unavailableLineItemsCount = unavailableLineItemsCount;
  }

  @Override
  public String toString() {
    return "FulfillmentOrderLocationForMove{availableLineItems='" + availableLineItems + "', availableLineItemsCount='" + availableLineItemsCount + "', location='" + location + "', message='" + message + "', movable='" + movable + "', unavailableLineItems='" + unavailableLineItems + "', unavailableLineItemsCount='" + unavailableLineItemsCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrderLocationForMove that = (FulfillmentOrderLocationForMove) o;
    return Objects.equals(availableLineItems, that.availableLineItems) &&
        Objects.equals(availableLineItemsCount, that.availableLineItemsCount) &&
        Objects.equals(location, that.location) &&
        Objects.equals(message, that.message) &&
        movable == that.movable &&
        Objects.equals(unavailableLineItems, that.unavailableLineItems) &&
        Objects.equals(unavailableLineItemsCount, that.unavailableLineItemsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableLineItems, availableLineItemsCount, location, message, movable, unavailableLineItems, unavailableLineItemsCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Fulfillment order line items that can be moved from their current location to the given location.
     */
    private FulfillmentOrderLineItemConnection availableLineItems;

    /**
     * Total number of fulfillment order line items that can be moved from their current assigned location to the
     * given location.
     */
    private Count availableLineItemsCount;

    /**
     * The location being considered as the fulfillment order's new assigned location.
     */
    private Location location;

    /**
     * A human-readable string with the reason why the fulfillment order, or some of its line items, can't be
     * moved to the location.
     */
    private String message;

    /**
     * Whether the fulfillment order can be moved to the location.
     */
    private boolean movable;

    /**
     * Fulfillment order line items that cannot be moved from their current location to the given location.
     */
    private FulfillmentOrderLineItemConnection unavailableLineItems;

    /**
     * Total number of fulfillment order line items that can't be moved from their current assigned location to the
     * given location.
     */
    private Count unavailableLineItemsCount;

    public FulfillmentOrderLocationForMove build() {
      FulfillmentOrderLocationForMove result = new FulfillmentOrderLocationForMove();
      result.availableLineItems = this.availableLineItems;
      result.availableLineItemsCount = this.availableLineItemsCount;
      result.location = this.location;
      result.message = this.message;
      result.movable = this.movable;
      result.unavailableLineItems = this.unavailableLineItems;
      result.unavailableLineItemsCount = this.unavailableLineItemsCount;
      return result;
    }

    /**
     * Fulfillment order line items that can be moved from their current location to the given location.
     */
    public Builder availableLineItems(FulfillmentOrderLineItemConnection availableLineItems) {
      this.availableLineItems = availableLineItems;
      return this;
    }

    /**
     * Total number of fulfillment order line items that can be moved from their current assigned location to the
     * given location.
     */
    public Builder availableLineItemsCount(Count availableLineItemsCount) {
      this.availableLineItemsCount = availableLineItemsCount;
      return this;
    }

    /**
     * The location being considered as the fulfillment order's new assigned location.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * A human-readable string with the reason why the fulfillment order, or some of its line items, can't be
     * moved to the location.
     */
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    /**
     * Whether the fulfillment order can be moved to the location.
     */
    public Builder movable(boolean movable) {
      this.movable = movable;
      return this;
    }

    /**
     * Fulfillment order line items that cannot be moved from their current location to the given location.
     */
    public Builder unavailableLineItems(FulfillmentOrderLineItemConnection unavailableLineItems) {
      this.unavailableLineItems = unavailableLineItems;
      return this;
    }

    /**
     * Total number of fulfillment order line items that can't be moved from their current assigned location to the
     * given location.
     */
    public Builder unavailableLineItemsCount(Count unavailableLineItemsCount) {
      this.unavailableLineItemsCount = unavailableLineItemsCount;
      return this;
    }
  }
}

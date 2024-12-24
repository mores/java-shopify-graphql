package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FulfillmentOrderLocationForMove {
  
  private FulfillmentOrderLineItemConnection availableLineItems;

  
  private Count availableLineItemsCount;

  
  private Location location;

  
  private String message;

  
  private boolean movable;

  
  private FulfillmentOrderLineItemConnection unavailableLineItems;

  
  private Count unavailableLineItemsCount;

  public FulfillmentOrderLocationForMove() {
  }

  
  public FulfillmentOrderLineItemConnection getAvailableLineItems() {
    return availableLineItems;
  }

  public void setAvailableLineItems(FulfillmentOrderLineItemConnection availableLineItems) {
    this.availableLineItems = availableLineItems;
  }

  
  public Count getAvailableLineItemsCount() {
    return availableLineItemsCount;
  }

  public void setAvailableLineItemsCount(Count availableLineItemsCount) {
    this.availableLineItemsCount = availableLineItemsCount;
  }

  
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  
  public boolean getMovable() {
    return movable;
  }

  public void setMovable(boolean movable) {
    this.movable = movable;
  }

  
  public FulfillmentOrderLineItemConnection getUnavailableLineItems() {
    return unavailableLineItems;
  }

  public void setUnavailableLineItems(FulfillmentOrderLineItemConnection unavailableLineItems) {
    this.unavailableLineItems = unavailableLineItems;
  }

  
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
    
    private FulfillmentOrderLineItemConnection availableLineItems;

    
    private Count availableLineItemsCount;

    
    private Location location;

    
    private String message;

    
    private boolean movable;

    
    private FulfillmentOrderLineItemConnection unavailableLineItems;

    
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

    
    public Builder availableLineItems(FulfillmentOrderLineItemConnection availableLineItems) {
      this.availableLineItems = availableLineItems;
      return this;
    }

    
    public Builder availableLineItemsCount(Count availableLineItemsCount) {
      this.availableLineItemsCount = availableLineItemsCount;
      return this;
    }

    
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }

    
    public Builder movable(boolean movable) {
      this.movable = movable;
      return this;
    }

    
    public Builder unavailableLineItems(FulfillmentOrderLineItemConnection unavailableLineItems) {
      this.unavailableLineItems = unavailableLineItems;
      return this;
    }

    
    public Builder unavailableLineItemsCount(Count unavailableLineItemsCount) {
      this.unavailableLineItemsCount = unavailableLineItemsCount;
      return this;
    }
  }
}

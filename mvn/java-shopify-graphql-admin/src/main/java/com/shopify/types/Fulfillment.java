package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Fulfillment implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private OffsetDateTime createdAt;

  
  private OffsetDateTime deliveredAt;

  
  private FulfillmentDisplayStatus displayStatus;

  
  private OffsetDateTime estimatedDeliveryAt;

  
  private FulfillmentEventConnection events;

  
  private FulfillmentLineItemConnection fulfillmentLineItems;

  
  private FulfillmentOrderConnection fulfillmentOrders;

  
  private String id;

  
  private OffsetDateTime inTransitAt;

  
  private String legacyResourceId;

  
  private Location location;

  
  private String name;

  
  private Order order;

  
  private FulfillmentOriginAddress originAddress;

  
  private boolean requiresShipping;

  
  private FulfillmentService service;

  
  private FulfillmentStatus status;

  
  private int totalQuantity;

  
  private List<FulfillmentTrackingInfo> trackingInfo;

  
  private OffsetDateTime updatedAt;

  public Fulfillment() {
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public OffsetDateTime getDeliveredAt() {
    return deliveredAt;
  }

  public void setDeliveredAt(OffsetDateTime deliveredAt) {
    this.deliveredAt = deliveredAt;
  }

  
  public FulfillmentDisplayStatus getDisplayStatus() {
    return displayStatus;
  }

  public void setDisplayStatus(FulfillmentDisplayStatus displayStatus) {
    this.displayStatus = displayStatus;
  }

  
  public OffsetDateTime getEstimatedDeliveryAt() {
    return estimatedDeliveryAt;
  }

  public void setEstimatedDeliveryAt(OffsetDateTime estimatedDeliveryAt) {
    this.estimatedDeliveryAt = estimatedDeliveryAt;
  }

  
  public FulfillmentEventConnection getEvents() {
    return events;
  }

  public void setEvents(FulfillmentEventConnection events) {
    this.events = events;
  }

  
  public FulfillmentLineItemConnection getFulfillmentLineItems() {
    return fulfillmentLineItems;
  }

  public void setFulfillmentLineItems(FulfillmentLineItemConnection fulfillmentLineItems) {
    this.fulfillmentLineItems = fulfillmentLineItems;
  }

  
  public FulfillmentOrderConnection getFulfillmentOrders() {
    return fulfillmentOrders;
  }

  public void setFulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
    this.fulfillmentOrders = fulfillmentOrders;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public OffsetDateTime getInTransitAt() {
    return inTransitAt;
  }

  public void setInTransitAt(OffsetDateTime inTransitAt) {
    this.inTransitAt = inTransitAt;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  
  public FulfillmentOriginAddress getOriginAddress() {
    return originAddress;
  }

  public void setOriginAddress(FulfillmentOriginAddress originAddress) {
    this.originAddress = originAddress;
  }

  
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  
  public FulfillmentService getService() {
    return service;
  }

  public void setService(FulfillmentService service) {
    this.service = service;
  }

  
  public FulfillmentStatus getStatus() {
    return status;
  }

  public void setStatus(FulfillmentStatus status) {
    this.status = status;
  }

  
  public int getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  
  public List<FulfillmentTrackingInfo> getTrackingInfo() {
    return trackingInfo;
  }

  public void setTrackingInfo(List<FulfillmentTrackingInfo> trackingInfo) {
    this.trackingInfo = trackingInfo;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Fulfillment{createdAt='" + createdAt + "', deliveredAt='" + deliveredAt + "', displayStatus='" + displayStatus + "', estimatedDeliveryAt='" + estimatedDeliveryAt + "', events='" + events + "', fulfillmentLineItems='" + fulfillmentLineItems + "', fulfillmentOrders='" + fulfillmentOrders + "', id='" + id + "', inTransitAt='" + inTransitAt + "', legacyResourceId='" + legacyResourceId + "', location='" + location + "', name='" + name + "', order='" + order + "', originAddress='" + originAddress + "', requiresShipping='" + requiresShipping + "', service='" + service + "', status='" + status + "', totalQuantity='" + totalQuantity + "', trackingInfo='" + trackingInfo + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Fulfillment that = (Fulfillment) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(deliveredAt, that.deliveredAt) &&
        Objects.equals(displayStatus, that.displayStatus) &&
        Objects.equals(estimatedDeliveryAt, that.estimatedDeliveryAt) &&
        Objects.equals(events, that.events) &&
        Objects.equals(fulfillmentLineItems, that.fulfillmentLineItems) &&
        Objects.equals(fulfillmentOrders, that.fulfillmentOrders) &&
        Objects.equals(id, that.id) &&
        Objects.equals(inTransitAt, that.inTransitAt) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(location, that.location) &&
        Objects.equals(name, that.name) &&
        Objects.equals(order, that.order) &&
        Objects.equals(originAddress, that.originAddress) &&
        requiresShipping == that.requiresShipping &&
        Objects.equals(service, that.service) &&
        Objects.equals(status, that.status) &&
        totalQuantity == that.totalQuantity &&
        Objects.equals(trackingInfo, that.trackingInfo) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, deliveredAt, displayStatus, estimatedDeliveryAt, events, fulfillmentLineItems, fulfillmentOrders, id, inTransitAt, legacyResourceId, location, name, order, originAddress, requiresShipping, service, status, totalQuantity, trackingInfo, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime createdAt;

    
    private OffsetDateTime deliveredAt;

    
    private FulfillmentDisplayStatus displayStatus;

    
    private OffsetDateTime estimatedDeliveryAt;

    
    private FulfillmentEventConnection events;

    
    private FulfillmentLineItemConnection fulfillmentLineItems;

    
    private FulfillmentOrderConnection fulfillmentOrders;

    
    private String id;

    
    private OffsetDateTime inTransitAt;

    
    private String legacyResourceId;

    
    private Location location;

    
    private String name;

    
    private Order order;

    
    private FulfillmentOriginAddress originAddress;

    
    private boolean requiresShipping;

    
    private FulfillmentService service;

    
    private FulfillmentStatus status;

    
    private int totalQuantity;

    
    private List<FulfillmentTrackingInfo> trackingInfo;

    
    private OffsetDateTime updatedAt;

    public Fulfillment build() {
      Fulfillment result = new Fulfillment();
      result.createdAt = this.createdAt;
      result.deliveredAt = this.deliveredAt;
      result.displayStatus = this.displayStatus;
      result.estimatedDeliveryAt = this.estimatedDeliveryAt;
      result.events = this.events;
      result.fulfillmentLineItems = this.fulfillmentLineItems;
      result.fulfillmentOrders = this.fulfillmentOrders;
      result.id = this.id;
      result.inTransitAt = this.inTransitAt;
      result.legacyResourceId = this.legacyResourceId;
      result.location = this.location;
      result.name = this.name;
      result.order = this.order;
      result.originAddress = this.originAddress;
      result.requiresShipping = this.requiresShipping;
      result.service = this.service;
      result.status = this.status;
      result.totalQuantity = this.totalQuantity;
      result.trackingInfo = this.trackingInfo;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder deliveredAt(OffsetDateTime deliveredAt) {
      this.deliveredAt = deliveredAt;
      return this;
    }

    
    public Builder displayStatus(FulfillmentDisplayStatus displayStatus) {
      this.displayStatus = displayStatus;
      return this;
    }

    
    public Builder estimatedDeliveryAt(OffsetDateTime estimatedDeliveryAt) {
      this.estimatedDeliveryAt = estimatedDeliveryAt;
      return this;
    }

    
    public Builder events(FulfillmentEventConnection events) {
      this.events = events;
      return this;
    }

    
    public Builder fulfillmentLineItems(FulfillmentLineItemConnection fulfillmentLineItems) {
      this.fulfillmentLineItems = fulfillmentLineItems;
      return this;
    }

    
    public Builder fulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
      this.fulfillmentOrders = fulfillmentOrders;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder inTransitAt(OffsetDateTime inTransitAt) {
      this.inTransitAt = inTransitAt;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    
    public Builder originAddress(FulfillmentOriginAddress originAddress) {
      this.originAddress = originAddress;
      return this;
    }

    
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    
    public Builder service(FulfillmentService service) {
      this.service = service;
      return this;
    }

    
    public Builder status(FulfillmentStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder totalQuantity(int totalQuantity) {
      this.totalQuantity = totalQuantity;
      return this;
    }

    
    public Builder trackingInfo(List<FulfillmentTrackingInfo> trackingInfo) {
      this.trackingInfo = trackingInfo;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}

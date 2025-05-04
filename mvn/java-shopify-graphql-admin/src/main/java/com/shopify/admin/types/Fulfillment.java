package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents a fulfillment.
 * In Shopify, a fulfillment represents a shipment of one or more items in an order.
 * When an order has been completely fulfilled, it means that all the items that are included
 * in the order have been sent to the customer.
 * There can be more than one fulfillment for an order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Fulfillment implements com.shopify.admin.types.LegacyInteroperability, com.shopify.admin.types.Node {
  /**
   * The date and time when the fulfillment was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The date that this fulfillment was delivered.
   */
  private OffsetDateTime deliveredAt;

  /**
   * Human readable display status for this fulfillment.
   */
  private FulfillmentDisplayStatus displayStatus;

  /**
   * The estimated date that this fulfillment will arrive.
   */
  private OffsetDateTime estimatedDeliveryAt;

  /**
   * The history of events associated with this fulfillment.
   */
  private FulfillmentEventConnection events;

  /**
   * List of the fulfillment's line items.
   */
  private FulfillmentLineItemConnection fulfillmentLineItems;

  /**
   * A paginated list of fulfillment orders for the fulfillment.
   */
  private FulfillmentOrderConnection fulfillmentOrders;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The date and time when the fulfillment went into transit.
   */
  private OffsetDateTime inTransitAt;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The location that the fulfillment was processed at.
   */
  private Location location;

  /**
   * Human readable reference identifier for this fulfillment.
   */
  private String name;

  /**
   * The order for which the fulfillment was created.
   */
  private Order order;

  /**
   * The address at which the fulfillment occurred. This field is intended for tax
   * purposes, as a full address is required for tax providers to accurately
   * calculate taxes. Typically this is the address of the warehouse or fulfillment
   * center. To retrieve a fulfillment location's address, use the
   * `assignedLocation` field on the
   * [`FulfillmentOrder`](/docs/api/admin-graphql/latest/objects/FulfillmentOrder)
   * object instead.
   */
  private FulfillmentOriginAddress originAddress;

  /**
   * Whether any of the line items in the fulfillment require shipping.
   */
  private boolean requiresShipping;

  /**
   * Fulfillment service associated with the fulfillment.
   */
  private FulfillmentService service;

  /**
   * The status of the fulfillment.
   */
  private FulfillmentStatus status;

  /**
   * Sum of all line item quantities for the fulfillment.
   */
  private int totalQuantity;

  /**
   * Tracking information associated with the fulfillment,
   * such as the tracking company, tracking number, and tracking URL.
   */
  private List<FulfillmentTrackingInfo> trackingInfo;

  /**
   * The date and time when the fulfillment was last modified.
   */
  private OffsetDateTime updatedAt;

  public Fulfillment() {
  }

  /**
   * The date and time when the fulfillment was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The date that this fulfillment was delivered.
   */
  public OffsetDateTime getDeliveredAt() {
    return deliveredAt;
  }

  public void setDeliveredAt(OffsetDateTime deliveredAt) {
    this.deliveredAt = deliveredAt;
  }

  /**
   * Human readable display status for this fulfillment.
   */
  public FulfillmentDisplayStatus getDisplayStatus() {
    return displayStatus;
  }

  public void setDisplayStatus(FulfillmentDisplayStatus displayStatus) {
    this.displayStatus = displayStatus;
  }

  /**
   * The estimated date that this fulfillment will arrive.
   */
  public OffsetDateTime getEstimatedDeliveryAt() {
    return estimatedDeliveryAt;
  }

  public void setEstimatedDeliveryAt(OffsetDateTime estimatedDeliveryAt) {
    this.estimatedDeliveryAt = estimatedDeliveryAt;
  }

  /**
   * The history of events associated with this fulfillment.
   */
  public FulfillmentEventConnection getEvents() {
    return events;
  }

  public void setEvents(FulfillmentEventConnection events) {
    this.events = events;
  }

  /**
   * List of the fulfillment's line items.
   */
  public FulfillmentLineItemConnection getFulfillmentLineItems() {
    return fulfillmentLineItems;
  }

  public void setFulfillmentLineItems(FulfillmentLineItemConnection fulfillmentLineItems) {
    this.fulfillmentLineItems = fulfillmentLineItems;
  }

  /**
   * A paginated list of fulfillment orders for the fulfillment.
   */
  public FulfillmentOrderConnection getFulfillmentOrders() {
    return fulfillmentOrders;
  }

  public void setFulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
    this.fulfillmentOrders = fulfillmentOrders;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The date and time when the fulfillment went into transit.
   */
  public OffsetDateTime getInTransitAt() {
    return inTransitAt;
  }

  public void setInTransitAt(OffsetDateTime inTransitAt) {
    this.inTransitAt = inTransitAt;
  }

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  /**
   * The location that the fulfillment was processed at.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * Human readable reference identifier for this fulfillment.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The order for which the fulfillment was created.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * The address at which the fulfillment occurred. This field is intended for tax
   * purposes, as a full address is required for tax providers to accurately
   * calculate taxes. Typically this is the address of the warehouse or fulfillment
   * center. To retrieve a fulfillment location's address, use the
   * `assignedLocation` field on the
   * [`FulfillmentOrder`](/docs/api/admin-graphql/latest/objects/FulfillmentOrder)
   * object instead.
   */
  public FulfillmentOriginAddress getOriginAddress() {
    return originAddress;
  }

  public void setOriginAddress(FulfillmentOriginAddress originAddress) {
    this.originAddress = originAddress;
  }

  /**
   * Whether any of the line items in the fulfillment require shipping.
   */
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  /**
   * Fulfillment service associated with the fulfillment.
   */
  public FulfillmentService getService() {
    return service;
  }

  public void setService(FulfillmentService service) {
    this.service = service;
  }

  /**
   * The status of the fulfillment.
   */
  public FulfillmentStatus getStatus() {
    return status;
  }

  public void setStatus(FulfillmentStatus status) {
    this.status = status;
  }

  /**
   * Sum of all line item quantities for the fulfillment.
   */
  public int getTotalQuantity() {
    return totalQuantity;
  }

  public void setTotalQuantity(int totalQuantity) {
    this.totalQuantity = totalQuantity;
  }

  /**
   * Tracking information associated with the fulfillment,
   * such as the tracking company, tracking number, and tracking URL.
   */
  public List<FulfillmentTrackingInfo> getTrackingInfo() {
    return trackingInfo;
  }

  public void setTrackingInfo(List<FulfillmentTrackingInfo> trackingInfo) {
    this.trackingInfo = trackingInfo;
  }

  /**
   * The date and time when the fulfillment was last modified.
   */
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
    /**
     * The date and time when the fulfillment was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The date that this fulfillment was delivered.
     */
    private OffsetDateTime deliveredAt;

    /**
     * Human readable display status for this fulfillment.
     */
    private FulfillmentDisplayStatus displayStatus;

    /**
     * The estimated date that this fulfillment will arrive.
     */
    private OffsetDateTime estimatedDeliveryAt;

    /**
     * The history of events associated with this fulfillment.
     */
    private FulfillmentEventConnection events;

    /**
     * List of the fulfillment's line items.
     */
    private FulfillmentLineItemConnection fulfillmentLineItems;

    /**
     * A paginated list of fulfillment orders for the fulfillment.
     */
    private FulfillmentOrderConnection fulfillmentOrders;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The date and time when the fulfillment went into transit.
     */
    private OffsetDateTime inTransitAt;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The location that the fulfillment was processed at.
     */
    private Location location;

    /**
     * Human readable reference identifier for this fulfillment.
     */
    private String name;

    /**
     * The order for which the fulfillment was created.
     */
    private Order order;

    /**
     * The address at which the fulfillment occurred. This field is intended for tax
     * purposes, as a full address is required for tax providers to accurately
     * calculate taxes. Typically this is the address of the warehouse or fulfillment
     * center. To retrieve a fulfillment location's address, use the
     * `assignedLocation` field on the
     * [`FulfillmentOrder`](/docs/api/admin-graphql/latest/objects/FulfillmentOrder)
     * object instead.
     */
    private FulfillmentOriginAddress originAddress;

    /**
     * Whether any of the line items in the fulfillment require shipping.
     */
    private boolean requiresShipping;

    /**
     * Fulfillment service associated with the fulfillment.
     */
    private FulfillmentService service;

    /**
     * The status of the fulfillment.
     */
    private FulfillmentStatus status;

    /**
     * Sum of all line item quantities for the fulfillment.
     */
    private int totalQuantity;

    /**
     * Tracking information associated with the fulfillment,
     * such as the tracking company, tracking number, and tracking URL.
     */
    private List<FulfillmentTrackingInfo> trackingInfo;

    /**
     * The date and time when the fulfillment was last modified.
     */
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

    /**
     * The date and time when the fulfillment was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The date that this fulfillment was delivered.
     */
    public Builder deliveredAt(OffsetDateTime deliveredAt) {
      this.deliveredAt = deliveredAt;
      return this;
    }

    /**
     * Human readable display status for this fulfillment.
     */
    public Builder displayStatus(FulfillmentDisplayStatus displayStatus) {
      this.displayStatus = displayStatus;
      return this;
    }

    /**
     * The estimated date that this fulfillment will arrive.
     */
    public Builder estimatedDeliveryAt(OffsetDateTime estimatedDeliveryAt) {
      this.estimatedDeliveryAt = estimatedDeliveryAt;
      return this;
    }

    /**
     * The history of events associated with this fulfillment.
     */
    public Builder events(FulfillmentEventConnection events) {
      this.events = events;
      return this;
    }

    /**
     * List of the fulfillment's line items.
     */
    public Builder fulfillmentLineItems(FulfillmentLineItemConnection fulfillmentLineItems) {
      this.fulfillmentLineItems = fulfillmentLineItems;
      return this;
    }

    /**
     * A paginated list of fulfillment orders for the fulfillment.
     */
    public Builder fulfillmentOrders(FulfillmentOrderConnection fulfillmentOrders) {
      this.fulfillmentOrders = fulfillmentOrders;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The date and time when the fulfillment went into transit.
     */
    public Builder inTransitAt(OffsetDateTime inTransitAt) {
      this.inTransitAt = inTransitAt;
      return this;
    }

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    /**
     * The location that the fulfillment was processed at.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * Human readable reference identifier for this fulfillment.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The order for which the fulfillment was created.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * The address at which the fulfillment occurred. This field is intended for tax
     * purposes, as a full address is required for tax providers to accurately
     * calculate taxes. Typically this is the address of the warehouse or fulfillment
     * center. To retrieve a fulfillment location's address, use the
     * `assignedLocation` field on the
     * [`FulfillmentOrder`](/docs/api/admin-graphql/latest/objects/FulfillmentOrder)
     * object instead.
     */
    public Builder originAddress(FulfillmentOriginAddress originAddress) {
      this.originAddress = originAddress;
      return this;
    }

    /**
     * Whether any of the line items in the fulfillment require shipping.
     */
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    /**
     * Fulfillment service associated with the fulfillment.
     */
    public Builder service(FulfillmentService service) {
      this.service = service;
      return this;
    }

    /**
     * The status of the fulfillment.
     */
    public Builder status(FulfillmentStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Sum of all line item quantities for the fulfillment.
     */
    public Builder totalQuantity(int totalQuantity) {
      this.totalQuantity = totalQuantity;
      return this;
    }

    /**
     * Tracking information associated with the fulfillment,
     * such as the tracking company, tracking number, and tracking URL.
     */
    public Builder trackingInfo(List<FulfillmentTrackingInfo> trackingInfo) {
      this.trackingInfo = trackingInfo;
      return this;
    }

    /**
     * The date and time when the fulfillment was last modified.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}

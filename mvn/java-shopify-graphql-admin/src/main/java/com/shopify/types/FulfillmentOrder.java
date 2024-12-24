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
public class FulfillmentOrder implements MetafieldReferencer, com.shopify.types.Node {
  
  private FulfillmentOrderAssignedLocation assignedLocation;

  
  private String channelId;

  
  private OffsetDateTime createdAt;

  
  private DeliveryMethod deliveryMethod;

  
  private FulfillmentOrderDestination destination;

  
  private OffsetDateTime fulfillAt;

  
  private OffsetDateTime fulfillBy;

  
  private List<FulfillmentHold> fulfillmentHolds;

  
  private FulfillmentOrderConnection fulfillmentOrdersForMerge;

  
  private FulfillmentConnection fulfillments;

  
  private String id;

  
  private FulfillmentOrderInternationalDuties internationalDuties;

  
  private FulfillmentOrderLineItemConnection lineItems;

  
  private FulfillmentOrderLocationForMoveConnection locationsForMove;

  
  private FulfillmentOrderMerchantRequestConnection merchantRequests;

  
  private Order order;

  
  private String orderId;

  
  private String orderName;

  
  private OffsetDateTime orderProcessedAt;

  
  private FulfillmentOrderRequestStatus requestStatus;

  
  private FulfillmentOrderStatus status;

  
  private List<FulfillmentOrderSupportedAction> supportedActions;

  
  private OffsetDateTime updatedAt;

  public FulfillmentOrder() {
  }

  
  public FulfillmentOrderAssignedLocation getAssignedLocation() {
    return assignedLocation;
  }

  public void setAssignedLocation(FulfillmentOrderAssignedLocation assignedLocation) {
    this.assignedLocation = assignedLocation;
  }

  
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public DeliveryMethod getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  
  public FulfillmentOrderDestination getDestination() {
    return destination;
  }

  public void setDestination(FulfillmentOrderDestination destination) {
    this.destination = destination;
  }

  
  public OffsetDateTime getFulfillAt() {
    return fulfillAt;
  }

  public void setFulfillAt(OffsetDateTime fulfillAt) {
    this.fulfillAt = fulfillAt;
  }

  
  public OffsetDateTime getFulfillBy() {
    return fulfillBy;
  }

  public void setFulfillBy(OffsetDateTime fulfillBy) {
    this.fulfillBy = fulfillBy;
  }

  
  public List<FulfillmentHold> getFulfillmentHolds() {
    return fulfillmentHolds;
  }

  public void setFulfillmentHolds(List<FulfillmentHold> fulfillmentHolds) {
    this.fulfillmentHolds = fulfillmentHolds;
  }

  
  public FulfillmentOrderConnection getFulfillmentOrdersForMerge() {
    return fulfillmentOrdersForMerge;
  }

  public void setFulfillmentOrdersForMerge(FulfillmentOrderConnection fulfillmentOrdersForMerge) {
    this.fulfillmentOrdersForMerge = fulfillmentOrdersForMerge;
  }

  
  public FulfillmentConnection getFulfillments() {
    return fulfillments;
  }

  public void setFulfillments(FulfillmentConnection fulfillments) {
    this.fulfillments = fulfillments;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public FulfillmentOrderInternationalDuties getInternationalDuties() {
    return internationalDuties;
  }

  public void setInternationalDuties(FulfillmentOrderInternationalDuties internationalDuties) {
    this.internationalDuties = internationalDuties;
  }

  
  public FulfillmentOrderLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(FulfillmentOrderLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  
  public FulfillmentOrderLocationForMoveConnection getLocationsForMove() {
    return locationsForMove;
  }

  public void setLocationsForMove(FulfillmentOrderLocationForMoveConnection locationsForMove) {
    this.locationsForMove = locationsForMove;
  }

  
  public FulfillmentOrderMerchantRequestConnection getMerchantRequests() {
    return merchantRequests;
  }

  public void setMerchantRequests(FulfillmentOrderMerchantRequestConnection merchantRequests) {
    this.merchantRequests = merchantRequests;
  }

  
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  
  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  
  public OffsetDateTime getOrderProcessedAt() {
    return orderProcessedAt;
  }

  public void setOrderProcessedAt(OffsetDateTime orderProcessedAt) {
    this.orderProcessedAt = orderProcessedAt;
  }

  
  public FulfillmentOrderRequestStatus getRequestStatus() {
    return requestStatus;
  }

  public void setRequestStatus(FulfillmentOrderRequestStatus requestStatus) {
    this.requestStatus = requestStatus;
  }

  
  public FulfillmentOrderStatus getStatus() {
    return status;
  }

  public void setStatus(FulfillmentOrderStatus status) {
    this.status = status;
  }

  
  public List<FulfillmentOrderSupportedAction> getSupportedActions() {
    return supportedActions;
  }

  public void setSupportedActions(List<FulfillmentOrderSupportedAction> supportedActions) {
    this.supportedActions = supportedActions;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "FulfillmentOrder{assignedLocation='" + assignedLocation + "', channelId='" + channelId + "', createdAt='" + createdAt + "', deliveryMethod='" + deliveryMethod + "', destination='" + destination + "', fulfillAt='" + fulfillAt + "', fulfillBy='" + fulfillBy + "', fulfillmentHolds='" + fulfillmentHolds + "', fulfillmentOrdersForMerge='" + fulfillmentOrdersForMerge + "', fulfillments='" + fulfillments + "', id='" + id + "', internationalDuties='" + internationalDuties + "', lineItems='" + lineItems + "', locationsForMove='" + locationsForMove + "', merchantRequests='" + merchantRequests + "', order='" + order + "', orderId='" + orderId + "', orderName='" + orderName + "', orderProcessedAt='" + orderProcessedAt + "', requestStatus='" + requestStatus + "', status='" + status + "', supportedActions='" + supportedActions + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentOrder that = (FulfillmentOrder) o;
    return Objects.equals(assignedLocation, that.assignedLocation) &&
        Objects.equals(channelId, that.channelId) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(deliveryMethod, that.deliveryMethod) &&
        Objects.equals(destination, that.destination) &&
        Objects.equals(fulfillAt, that.fulfillAt) &&
        Objects.equals(fulfillBy, that.fulfillBy) &&
        Objects.equals(fulfillmentHolds, that.fulfillmentHolds) &&
        Objects.equals(fulfillmentOrdersForMerge, that.fulfillmentOrdersForMerge) &&
        Objects.equals(fulfillments, that.fulfillments) &&
        Objects.equals(id, that.id) &&
        Objects.equals(internationalDuties, that.internationalDuties) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(locationsForMove, that.locationsForMove) &&
        Objects.equals(merchantRequests, that.merchantRequests) &&
        Objects.equals(order, that.order) &&
        Objects.equals(orderId, that.orderId) &&
        Objects.equals(orderName, that.orderName) &&
        Objects.equals(orderProcessedAt, that.orderProcessedAt) &&
        Objects.equals(requestStatus, that.requestStatus) &&
        Objects.equals(status, that.status) &&
        Objects.equals(supportedActions, that.supportedActions) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedLocation, channelId, createdAt, deliveryMethod, destination, fulfillAt, fulfillBy, fulfillmentHolds, fulfillmentOrdersForMerge, fulfillments, id, internationalDuties, lineItems, locationsForMove, merchantRequests, order, orderId, orderName, orderProcessedAt, requestStatus, status, supportedActions, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private FulfillmentOrderAssignedLocation assignedLocation;

    
    private String channelId;

    
    private OffsetDateTime createdAt;

    
    private DeliveryMethod deliveryMethod;

    
    private FulfillmentOrderDestination destination;

    
    private OffsetDateTime fulfillAt;

    
    private OffsetDateTime fulfillBy;

    
    private List<FulfillmentHold> fulfillmentHolds;

    
    private FulfillmentOrderConnection fulfillmentOrdersForMerge;

    
    private FulfillmentConnection fulfillments;

    
    private String id;

    
    private FulfillmentOrderInternationalDuties internationalDuties;

    
    private FulfillmentOrderLineItemConnection lineItems;

    
    private FulfillmentOrderLocationForMoveConnection locationsForMove;

    
    private FulfillmentOrderMerchantRequestConnection merchantRequests;

    
    private Order order;

    
    private String orderId;

    
    private String orderName;

    
    private OffsetDateTime orderProcessedAt;

    
    private FulfillmentOrderRequestStatus requestStatus;

    
    private FulfillmentOrderStatus status;

    
    private List<FulfillmentOrderSupportedAction> supportedActions;

    
    private OffsetDateTime updatedAt;

    public FulfillmentOrder build() {
      FulfillmentOrder result = new FulfillmentOrder();
      result.assignedLocation = this.assignedLocation;
      result.channelId = this.channelId;
      result.createdAt = this.createdAt;
      result.deliveryMethod = this.deliveryMethod;
      result.destination = this.destination;
      result.fulfillAt = this.fulfillAt;
      result.fulfillBy = this.fulfillBy;
      result.fulfillmentHolds = this.fulfillmentHolds;
      result.fulfillmentOrdersForMerge = this.fulfillmentOrdersForMerge;
      result.fulfillments = this.fulfillments;
      result.id = this.id;
      result.internationalDuties = this.internationalDuties;
      result.lineItems = this.lineItems;
      result.locationsForMove = this.locationsForMove;
      result.merchantRequests = this.merchantRequests;
      result.order = this.order;
      result.orderId = this.orderId;
      result.orderName = this.orderName;
      result.orderProcessedAt = this.orderProcessedAt;
      result.requestStatus = this.requestStatus;
      result.status = this.status;
      result.supportedActions = this.supportedActions;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder assignedLocation(FulfillmentOrderAssignedLocation assignedLocation) {
      this.assignedLocation = assignedLocation;
      return this;
    }

    
    public Builder channelId(String channelId) {
      this.channelId = channelId;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder deliveryMethod(DeliveryMethod deliveryMethod) {
      this.deliveryMethod = deliveryMethod;
      return this;
    }

    
    public Builder destination(FulfillmentOrderDestination destination) {
      this.destination = destination;
      return this;
    }

    
    public Builder fulfillAt(OffsetDateTime fulfillAt) {
      this.fulfillAt = fulfillAt;
      return this;
    }

    
    public Builder fulfillBy(OffsetDateTime fulfillBy) {
      this.fulfillBy = fulfillBy;
      return this;
    }

    
    public Builder fulfillmentHolds(List<FulfillmentHold> fulfillmentHolds) {
      this.fulfillmentHolds = fulfillmentHolds;
      return this;
    }

    
    public Builder fulfillmentOrdersForMerge(FulfillmentOrderConnection fulfillmentOrdersForMerge) {
      this.fulfillmentOrdersForMerge = fulfillmentOrdersForMerge;
      return this;
    }

    
    public Builder fulfillments(FulfillmentConnection fulfillments) {
      this.fulfillments = fulfillments;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder internationalDuties(FulfillmentOrderInternationalDuties internationalDuties) {
      this.internationalDuties = internationalDuties;
      return this;
    }

    
    public Builder lineItems(FulfillmentOrderLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    
    public Builder locationsForMove(FulfillmentOrderLocationForMoveConnection locationsForMove) {
      this.locationsForMove = locationsForMove;
      return this;
    }

    
    public Builder merchantRequests(FulfillmentOrderMerchantRequestConnection merchantRequests) {
      this.merchantRequests = merchantRequests;
      return this;
    }

    
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    
    public Builder orderName(String orderName) {
      this.orderName = orderName;
      return this;
    }

    
    public Builder orderProcessedAt(OffsetDateTime orderProcessedAt) {
      this.orderProcessedAt = orderProcessedAt;
      return this;
    }

    
    public Builder requestStatus(FulfillmentOrderRequestStatus requestStatus) {
      this.requestStatus = requestStatus;
      return this;
    }

    
    public Builder status(FulfillmentOrderStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder supportedActions(List<FulfillmentOrderSupportedAction> supportedActions) {
      this.supportedActions = supportedActions;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}

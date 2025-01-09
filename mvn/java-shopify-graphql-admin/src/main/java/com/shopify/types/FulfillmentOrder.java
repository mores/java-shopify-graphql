package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The FulfillmentOrder object represents either an item or a group of items in an
 * [Order](https://shopify.dev/api/admin-graphql/latest/objects/Order)
 * that are expected to be fulfilled from the same location.
 * There can be more than one fulfillment order for an
 * [order](https://shopify.dev/api/admin-graphql/latest/objects/Order)
 * at a given location.
 *
 * {{ '/api/reference/fulfillment_order_relationships.png' | image }}
 *
 * Fulfillment orders represent the work which is intended to be done in relation to an order.
 * When fulfillment has started for one or more line items, a
 * [Fulfillment](https://shopify.dev/api/admin-graphql/latest/objects/Fulfillment)
 * is created by a merchant or third party to represent the ongoing or completed work of fulfillment.
 *
 * [See below for more details on creating fulfillments](#the-lifecycle-of-a-fulfillment-order-at-a-location-which-is-managed-by-a-fulfillment-service).
 *
 * > Note:
 * > Shopify creates fulfillment orders automatically when an order is created.
 * > It is not possible to manually create fulfillment orders.
 * >
 * > [See below for more details on the lifecycle of a fulfillment order](#the-lifecycle-of-a-fulfillment-order).
 *
 * ## Retrieving fulfillment orders
 *
 * ### Fulfillment orders from an order
 *
 * All fulfillment orders related to a given order can be retrieved with the
 * [Order.fulfillmentOrders](https://shopify.dev/api/admin-graphql/latest/objects/Order#connection-order-fulfillmentorders)
 * connection.
 *
 * [API access scopes](#api-access-scopes)
 * govern which fulfillments orders are returned to clients.
 * An API client will only receive a subset of the fulfillment orders which belong to an order
 * if they don't have the necessary access scopes to view all of the fulfillment orders.
 *
 * ### Fulfillment orders assigned to the app for fulfillment
 *
 * Fulfillment service apps can retrieve the fulfillment orders which have been assigned to their locations with the
 * [assignedFulfillmentOrders](https://shopify.dev/api/admin-graphql/2024-07/objects/queryroot#connection-assignedfulfillmentorders)
 * connection.
 * Use the `assignmentStatus` argument to control whether all assigned fulfillment orders
 * should be returned or only those where a merchant has sent a
 * [fulfillment request](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrderMerchantRequest)
 * and it has yet to be responded to.
 *
 * The API client must be granted the `read_assigned_fulfillment_orders` access scope to access
 * the assigned fulfillment orders.
 *
 * ### All fulfillment orders
 *
 * Apps can retrieve all fulfillment orders with the
 * [fulfillmentOrders](https://shopify.dev/api/admin-graphql/latest/queries/fulfillmentOrders)
 * query. This query returns all assigned, merchant-managed, and third-party fulfillment orders on the shop,
 * which are accessible to the app according to the
 * [fulfillment order access scopes](#api-access-scopes) it was granted with.
 *
 * ## The lifecycle of a fulfillment order
 *
 * ### Fulfillment Order Creation
 *
 * After an order is created, a background worker performs the order routing process which determines
 * which locations will be responsible for fulfilling the purchased items.
 * Once the order routing process is complete, one or more fulfillment orders will be created
 * and assigned to these locations. It is not possible to manually create fulfillment orders.
 *
 * Once a fulfillment order has been created, it will have one of two different lifecycles depending on
 * the type of location which the fulfillment order is assigned to.
 *
 * ### The lifecycle of a fulfillment order at a merchant managed location
 *
 * Fulfillment orders are completed by creating
 * [fulfillments](https://shopify.dev/api/admin-graphql/latest/objects/Fulfillment).
 * Fulfillments represents the work done.
 *
 * For digital products a merchant or an order management app would create a fulfilment once the digital asset
 * has been provisioned.
 * For example, in the case of a digital gift card, a merchant would to do this once
 * the gift card has been activated - before the email has been shipped.
 *
 * On the other hand, for a traditional shipped order,
 * a merchant or an order management app would create a fulfillment after picking and packing the items relating
 * to a fulfillment order, but before the courier has collected the goods.
 *
 * [Learn about managing fulfillment orders as an order management app](https://shopify.dev/apps/fulfillment/order-management-apps/manage-fulfillments).
 *
 * ### The lifecycle of a fulfillment order at a location which is managed by a fulfillment service
 *
 * For fulfillment orders which are assigned to a location that is managed by a fulfillment service,
 * a merchant or an Order Management App can
 * [send a fulfillment request](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderSubmitFulfillmentRequest)
 * to the fulfillment service which operates the location to request that they fulfill the associated items.
 * A fulfillment service has the option to
 * [accept](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderAcceptFulfillmentRequest)
 * or [reject](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderRejectFulfillmentRequest)
 * this fulfillment request.
 *
 * Once the fulfillment service has accepted the request, the request can no longer be cancelled by the merchant
 * or order management app and instead a
 * [cancellation request must be submitted](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderSubmitCancellationRequest)
 * to the fulfillment service.
 *
 * Once a fulfillment service accepts a fulfillment request,
 * then after they are ready to pack items and send them for delivery, they create fulfillments with the
 * [fulfillmentCreate](https://shopify.dev/api/admin-graphql/unstable/mutations/fulfillmentCreate)
 * mutation.
 * They can provide tracking information right away or create fulfillments without it and then
 * update the tracking information for fulfillments with the
 * [fulfillmentTrackingInfoUpdate](https://shopify.dev/api/admin-graphql/unstable/mutations/fulfillmentTrackingInfoUpdate)
 * mutation.
 *
 * [Learn about managing fulfillment orders as a fulfillment service](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments).
 *
 * ## API access scopes
 *
 * Fulfillment orders are governed by the following API access scopes:
 *
 * * The `read_merchant_managed_fulfillment_orders` and
 *   `write_merchant_managed_fulfillment_orders` access scopes
 *   grant access to fulfillment orders assigned to merchant-managed locations.
 * * The `read_assigned_fulfillment_orders` and `write_assigned_fulfillment_orders`
 *   access scopes are intended for fulfillment services.
 *   These scopes grant access to fulfillment orders assigned to locations that are being managed
 *   by fulfillment services.
 * * The `read_third_party_fulfillment_orders` and `write_third_party_fulfillment_orders`
 *   access scopes grant access to fulfillment orders
 *   assigned to locations managed by other fulfillment services.
 *
 * ### Fulfillment service app access scopes
 *
 * Usually, **fulfillment services** have the `write_assigned_fulfillment_orders` access scope
 * and don't have the `*_third_party_fulfillment_orders`
 * or `*_merchant_managed_fulfillment_orders` access scopes.
 * The app will only have access to the fulfillment orders assigned to their location
 * (or multiple locations if the app registers multiple fulfillment services on the shop).
 * The app will not have access to fulfillment orders assigned to merchant-managed locations
 * or locations owned by other fulfillment service apps.
 *
 * ### Order management app access scopes
 *
 * **Order management apps** will usually request `write_merchant_managed_fulfillment_orders` and
 * `write_third_party_fulfillment_orders` access scopes. This will allow them to manage all fulfillment orders
 * on behalf of a merchant.
 *
 * If an app combines the functions of an order management app and a fulfillment service,
 * then the app should request all
 * access scopes to manage all assigned and all unassigned fulfillment orders.
 *
 * ## Notifications about fulfillment orders
 *
 * Fulfillment services are required to
 * [register](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentService)
 * a self-hosted callback URL which has a number of uses. One of these uses is that this callback URL will be notified
 * whenever a merchant submits a fulfillment or cancellation request.
 *
 * Both merchants and apps can
 * [subscribe](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments#webhooks)
 * to the
 * [fulfillment order webhooks](https://shopify.dev/api/admin-graphql/latest/enums/WebhookSubscriptionTopic#value-fulfillmentorderscancellationrequestaccepted)
 * to be notified whenever fulfillment order related domain events occur.
 *
 * [Learn about fulfillment workflows](https://shopify.dev/apps/fulfillment).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class FulfillmentOrder implements MetafieldReferencer, com.shopify.types.Node {
  /**
   * The fulfillment order's assigned location. This is the location where the fulfillment is expected to happen.
   *   
   * The fulfillment order's assigned location might change in the following cases:
   *   
   * - The fulfillment order has been entirely moved to a new location. For example, the [fulfillmentOrderMove](
   *   https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderMove
   *   ) mutation has been called, and you see the original fulfillment order in the [movedFulfillmentOrder](
   *   https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderMove#field-fulfillmentordermovepayload-movedfulfillmentorder
   *   ) field within the mutation's response.
   * - Work on the fulfillment order hasn't yet begun, which means that the fulfillment order has the
   *     [OPEN](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-open),
   *     [SCHEDULED](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-scheduled), or
   *     [ON_HOLD](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-onhold)
   *     status, and the shop's location properties might be undergoing edits (for example, in the Shopify admin).
   */
  private FulfillmentOrderAssignedLocation assignedLocation;

  /**
   * ID of the channel that created the order.
   */
  private String channelId;

  /**
   * Date and time when the fulfillment order was created.
   */
  private OffsetDateTime createdAt;

  /**
   * Delivery method of this fulfillment order.
   */
  private DeliveryMethod deliveryMethod;

  /**
   * The destination where the items should be sent.
   */
  private FulfillmentOrderDestination destination;

  /**
   * The date and time at which the fulfillment order will be fulfillable. When
   * this date and time is reached, the scheduled fulfillment order is
   * automatically transitioned to open. For example, the `fulfill_at` date for a
   * subscription order might be the 1st of each month, a pre-order `fulfill_at`
   * date would be `nil`, and a standard order `fulfill_at` date would be the order creation date.
   */
  private OffsetDateTime fulfillAt;

  /**
   * The latest date and time by which all items in the fulfillment order need to be fulfilled.
   */
  private OffsetDateTime fulfillBy;

  /**
   * The fulfillment holds applied on the fulfillment order.
   */
  private List<FulfillmentHold> fulfillmentHolds;

  /**
   * Fulfillment orders eligible for merging with the given fulfillment order.
   */
  private FulfillmentOrderConnection fulfillmentOrdersForMerge;

  /**
   * A list of fulfillments for the fulfillment order.
   */
  private FulfillmentConnection fulfillments;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The duties delivery method of this fulfillment order.
   */
  private FulfillmentOrderInternationalDuties internationalDuties;

  /**
   * A list of the fulfillment order's line items.
   */
  private FulfillmentOrderLineItemConnection lineItems;

  /**
   * A list of locations that the fulfillment order can potentially move to.
   */
  private FulfillmentOrderLocationForMoveConnection locationsForMove;

  /**
   * A list of requests sent by the merchant or an order management app to the fulfillment service for the fulfillment order.
   */
  private FulfillmentOrderMerchantRequestConnection merchantRequests;

  /**
   * The order that's associated with the fulfillment order.
   */
  private Order order;

  /**
   * ID of the order that's associated with the fulfillment order.
   */
  private String orderId;

  /**
   * The unique identifier for the order that appears on the order page in the Shopify admin and the <b>Order status</b> page.
   * For example, "#1001", "EN1001", or "1001-A".
   * This value isn't unique across multiple stores.
   */
  private String orderName;

  /**
   * The date and time when the order was processed.
   * This date and time might not match the date and time when the order was created.
   */
  private OffsetDateTime orderProcessedAt;

  /**
   * The request status of the fulfillment order.
   */
  private FulfillmentOrderRequestStatus requestStatus;

  /**
   * The status of the fulfillment order.
   */
  private FulfillmentOrderStatus status;

  /**
   * The actions that can be performed on this fulfillment order.
   */
  private List<FulfillmentOrderSupportedAction> supportedActions;

  /**
   * The date and time when the fulfillment order was last updated.
   */
  private OffsetDateTime updatedAt;

  public FulfillmentOrder() {
  }

  /**
   * The fulfillment order's assigned location. This is the location where the fulfillment is expected to happen.
   *   
   * The fulfillment order's assigned location might change in the following cases:
   *   
   * - The fulfillment order has been entirely moved to a new location. For example, the [fulfillmentOrderMove](
   *   https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderMove
   *   ) mutation has been called, and you see the original fulfillment order in the [movedFulfillmentOrder](
   *   https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderMove#field-fulfillmentordermovepayload-movedfulfillmentorder
   *   ) field within the mutation's response.
   * - Work on the fulfillment order hasn't yet begun, which means that the fulfillment order has the
   *     [OPEN](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-open),
   *     [SCHEDULED](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-scheduled), or
   *     [ON_HOLD](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-onhold)
   *     status, and the shop's location properties might be undergoing edits (for example, in the Shopify admin).
   */
  public FulfillmentOrderAssignedLocation getAssignedLocation() {
    return assignedLocation;
  }

  public void setAssignedLocation(FulfillmentOrderAssignedLocation assignedLocation) {
    this.assignedLocation = assignedLocation;
  }

  /**
   * ID of the channel that created the order.
   */
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  /**
   * Date and time when the fulfillment order was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Delivery method of this fulfillment order.
   */
  public DeliveryMethod getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  /**
   * The destination where the items should be sent.
   */
  public FulfillmentOrderDestination getDestination() {
    return destination;
  }

  public void setDestination(FulfillmentOrderDestination destination) {
    this.destination = destination;
  }

  /**
   * The date and time at which the fulfillment order will be fulfillable. When
   * this date and time is reached, the scheduled fulfillment order is
   * automatically transitioned to open. For example, the `fulfill_at` date for a
   * subscription order might be the 1st of each month, a pre-order `fulfill_at`
   * date would be `nil`, and a standard order `fulfill_at` date would be the order creation date.
   */
  public OffsetDateTime getFulfillAt() {
    return fulfillAt;
  }

  public void setFulfillAt(OffsetDateTime fulfillAt) {
    this.fulfillAt = fulfillAt;
  }

  /**
   * The latest date and time by which all items in the fulfillment order need to be fulfilled.
   */
  public OffsetDateTime getFulfillBy() {
    return fulfillBy;
  }

  public void setFulfillBy(OffsetDateTime fulfillBy) {
    this.fulfillBy = fulfillBy;
  }

  /**
   * The fulfillment holds applied on the fulfillment order.
   */
  public List<FulfillmentHold> getFulfillmentHolds() {
    return fulfillmentHolds;
  }

  public void setFulfillmentHolds(List<FulfillmentHold> fulfillmentHolds) {
    this.fulfillmentHolds = fulfillmentHolds;
  }

  /**
   * Fulfillment orders eligible for merging with the given fulfillment order.
   */
  public FulfillmentOrderConnection getFulfillmentOrdersForMerge() {
    return fulfillmentOrdersForMerge;
  }

  public void setFulfillmentOrdersForMerge(FulfillmentOrderConnection fulfillmentOrdersForMerge) {
    this.fulfillmentOrdersForMerge = fulfillmentOrdersForMerge;
  }

  /**
   * A list of fulfillments for the fulfillment order.
   */
  public FulfillmentConnection getFulfillments() {
    return fulfillments;
  }

  public void setFulfillments(FulfillmentConnection fulfillments) {
    this.fulfillments = fulfillments;
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
   * The duties delivery method of this fulfillment order.
   */
  public FulfillmentOrderInternationalDuties getInternationalDuties() {
    return internationalDuties;
  }

  public void setInternationalDuties(FulfillmentOrderInternationalDuties internationalDuties) {
    this.internationalDuties = internationalDuties;
  }

  /**
   * A list of the fulfillment order's line items.
   */
  public FulfillmentOrderLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(FulfillmentOrderLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * A list of locations that the fulfillment order can potentially move to.
   */
  public FulfillmentOrderLocationForMoveConnection getLocationsForMove() {
    return locationsForMove;
  }

  public void setLocationsForMove(FulfillmentOrderLocationForMoveConnection locationsForMove) {
    this.locationsForMove = locationsForMove;
  }

  /**
   * A list of requests sent by the merchant or an order management app to the fulfillment service for the fulfillment order.
   */
  public FulfillmentOrderMerchantRequestConnection getMerchantRequests() {
    return merchantRequests;
  }

  public void setMerchantRequests(FulfillmentOrderMerchantRequestConnection merchantRequests) {
    this.merchantRequests = merchantRequests;
  }

  /**
   * The order that's associated with the fulfillment order.
   */
  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  /**
   * ID of the order that's associated with the fulfillment order.
   */
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * The unique identifier for the order that appears on the order page in the Shopify admin and the <b>Order status</b> page.
   * For example, "#1001", "EN1001", or "1001-A".
   * This value isn't unique across multiple stores.
   */
  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  /**
   * The date and time when the order was processed.
   * This date and time might not match the date and time when the order was created.
   */
  public OffsetDateTime getOrderProcessedAt() {
    return orderProcessedAt;
  }

  public void setOrderProcessedAt(OffsetDateTime orderProcessedAt) {
    this.orderProcessedAt = orderProcessedAt;
  }

  /**
   * The request status of the fulfillment order.
   */
  public FulfillmentOrderRequestStatus getRequestStatus() {
    return requestStatus;
  }

  public void setRequestStatus(FulfillmentOrderRequestStatus requestStatus) {
    this.requestStatus = requestStatus;
  }

  /**
   * The status of the fulfillment order.
   */
  public FulfillmentOrderStatus getStatus() {
    return status;
  }

  public void setStatus(FulfillmentOrderStatus status) {
    this.status = status;
  }

  /**
   * The actions that can be performed on this fulfillment order.
   */
  public List<FulfillmentOrderSupportedAction> getSupportedActions() {
    return supportedActions;
  }

  public void setSupportedActions(List<FulfillmentOrderSupportedAction> supportedActions) {
    this.supportedActions = supportedActions;
  }

  /**
   * The date and time when the fulfillment order was last updated.
   */
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
    /**
     * The fulfillment order's assigned location. This is the location where the fulfillment is expected to happen.
     *   
     * The fulfillment order's assigned location might change in the following cases:
     *   
     * - The fulfillment order has been entirely moved to a new location. For example, the [fulfillmentOrderMove](
     *   https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderMove
     *   ) mutation has been called, and you see the original fulfillment order in the [movedFulfillmentOrder](
     *   https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderMove#field-fulfillmentordermovepayload-movedfulfillmentorder
     *   ) field within the mutation's response.
     * - Work on the fulfillment order hasn't yet begun, which means that the fulfillment order has the
     *     [OPEN](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-open),
     *     [SCHEDULED](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-scheduled), or
     *     [ON_HOLD](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-onhold)
     *     status, and the shop's location properties might be undergoing edits (for example, in the Shopify admin).
     */
    private FulfillmentOrderAssignedLocation assignedLocation;

    /**
     * ID of the channel that created the order.
     */
    private String channelId;

    /**
     * Date and time when the fulfillment order was created.
     */
    private OffsetDateTime createdAt;

    /**
     * Delivery method of this fulfillment order.
     */
    private DeliveryMethod deliveryMethod;

    /**
     * The destination where the items should be sent.
     */
    private FulfillmentOrderDestination destination;

    /**
     * The date and time at which the fulfillment order will be fulfillable. When
     * this date and time is reached, the scheduled fulfillment order is
     * automatically transitioned to open. For example, the `fulfill_at` date for a
     * subscription order might be the 1st of each month, a pre-order `fulfill_at`
     * date would be `nil`, and a standard order `fulfill_at` date would be the order creation date.
     */
    private OffsetDateTime fulfillAt;

    /**
     * The latest date and time by which all items in the fulfillment order need to be fulfilled.
     */
    private OffsetDateTime fulfillBy;

    /**
     * The fulfillment holds applied on the fulfillment order.
     */
    private List<FulfillmentHold> fulfillmentHolds;

    /**
     * Fulfillment orders eligible for merging with the given fulfillment order.
     */
    private FulfillmentOrderConnection fulfillmentOrdersForMerge;

    /**
     * A list of fulfillments for the fulfillment order.
     */
    private FulfillmentConnection fulfillments;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The duties delivery method of this fulfillment order.
     */
    private FulfillmentOrderInternationalDuties internationalDuties;

    /**
     * A list of the fulfillment order's line items.
     */
    private FulfillmentOrderLineItemConnection lineItems;

    /**
     * A list of locations that the fulfillment order can potentially move to.
     */
    private FulfillmentOrderLocationForMoveConnection locationsForMove;

    /**
     * A list of requests sent by the merchant or an order management app to the fulfillment service for the fulfillment order.
     */
    private FulfillmentOrderMerchantRequestConnection merchantRequests;

    /**
     * The order that's associated with the fulfillment order.
     */
    private Order order;

    /**
     * ID of the order that's associated with the fulfillment order.
     */
    private String orderId;

    /**
     * The unique identifier for the order that appears on the order page in the Shopify admin and the <b>Order status</b> page.
     * For example, "#1001", "EN1001", or "1001-A".
     * This value isn't unique across multiple stores.
     */
    private String orderName;

    /**
     * The date and time when the order was processed.
     * This date and time might not match the date and time when the order was created.
     */
    private OffsetDateTime orderProcessedAt;

    /**
     * The request status of the fulfillment order.
     */
    private FulfillmentOrderRequestStatus requestStatus;

    /**
     * The status of the fulfillment order.
     */
    private FulfillmentOrderStatus status;

    /**
     * The actions that can be performed on this fulfillment order.
     */
    private List<FulfillmentOrderSupportedAction> supportedActions;

    /**
     * The date and time when the fulfillment order was last updated.
     */
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

    /**
     * The fulfillment order's assigned location. This is the location where the fulfillment is expected to happen.
     *   
     * The fulfillment order's assigned location might change in the following cases:
     *   
     * - The fulfillment order has been entirely moved to a new location. For example, the [fulfillmentOrderMove](
     *   https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderMove
     *   ) mutation has been called, and you see the original fulfillment order in the [movedFulfillmentOrder](
     *   https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentOrderMove#field-fulfillmentordermovepayload-movedfulfillmentorder
     *   ) field within the mutation's response.
     * - Work on the fulfillment order hasn't yet begun, which means that the fulfillment order has the
     *     [OPEN](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-open),
     *     [SCHEDULED](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-scheduled), or
     *     [ON_HOLD](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderStatus#value-onhold)
     *     status, and the shop's location properties might be undergoing edits (for example, in the Shopify admin).
     */
    public Builder assignedLocation(FulfillmentOrderAssignedLocation assignedLocation) {
      this.assignedLocation = assignedLocation;
      return this;
    }

    /**
     * ID of the channel that created the order.
     */
    public Builder channelId(String channelId) {
      this.channelId = channelId;
      return this;
    }

    /**
     * Date and time when the fulfillment order was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Delivery method of this fulfillment order.
     */
    public Builder deliveryMethod(DeliveryMethod deliveryMethod) {
      this.deliveryMethod = deliveryMethod;
      return this;
    }

    /**
     * The destination where the items should be sent.
     */
    public Builder destination(FulfillmentOrderDestination destination) {
      this.destination = destination;
      return this;
    }

    /**
     * The date and time at which the fulfillment order will be fulfillable. When
     * this date and time is reached, the scheduled fulfillment order is
     * automatically transitioned to open. For example, the `fulfill_at` date for a
     * subscription order might be the 1st of each month, a pre-order `fulfill_at`
     * date would be `nil`, and a standard order `fulfill_at` date would be the order creation date.
     */
    public Builder fulfillAt(OffsetDateTime fulfillAt) {
      this.fulfillAt = fulfillAt;
      return this;
    }

    /**
     * The latest date and time by which all items in the fulfillment order need to be fulfilled.
     */
    public Builder fulfillBy(OffsetDateTime fulfillBy) {
      this.fulfillBy = fulfillBy;
      return this;
    }

    /**
     * The fulfillment holds applied on the fulfillment order.
     */
    public Builder fulfillmentHolds(List<FulfillmentHold> fulfillmentHolds) {
      this.fulfillmentHolds = fulfillmentHolds;
      return this;
    }

    /**
     * Fulfillment orders eligible for merging with the given fulfillment order.
     */
    public Builder fulfillmentOrdersForMerge(FulfillmentOrderConnection fulfillmentOrdersForMerge) {
      this.fulfillmentOrdersForMerge = fulfillmentOrdersForMerge;
      return this;
    }

    /**
     * A list of fulfillments for the fulfillment order.
     */
    public Builder fulfillments(FulfillmentConnection fulfillments) {
      this.fulfillments = fulfillments;
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
     * The duties delivery method of this fulfillment order.
     */
    public Builder internationalDuties(FulfillmentOrderInternationalDuties internationalDuties) {
      this.internationalDuties = internationalDuties;
      return this;
    }

    /**
     * A list of the fulfillment order's line items.
     */
    public Builder lineItems(FulfillmentOrderLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * A list of locations that the fulfillment order can potentially move to.
     */
    public Builder locationsForMove(FulfillmentOrderLocationForMoveConnection locationsForMove) {
      this.locationsForMove = locationsForMove;
      return this;
    }

    /**
     * A list of requests sent by the merchant or an order management app to the fulfillment service for the fulfillment order.
     */
    public Builder merchantRequests(FulfillmentOrderMerchantRequestConnection merchantRequests) {
      this.merchantRequests = merchantRequests;
      return this;
    }

    /**
     * The order that's associated with the fulfillment order.
     */
    public Builder order(Order order) {
      this.order = order;
      return this;
    }

    /**
     * ID of the order that's associated with the fulfillment order.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * The unique identifier for the order that appears on the order page in the Shopify admin and the <b>Order status</b> page.
     * For example, "#1001", "EN1001", or "1001-A".
     * This value isn't unique across multiple stores.
     */
    public Builder orderName(String orderName) {
      this.orderName = orderName;
      return this;
    }

    /**
     * The date and time when the order was processed.
     * This date and time might not match the date and time when the order was created.
     */
    public Builder orderProcessedAt(OffsetDateTime orderProcessedAt) {
      this.orderProcessedAt = orderProcessedAt;
      return this;
    }

    /**
     * The request status of the fulfillment order.
     */
    public Builder requestStatus(FulfillmentOrderRequestStatus requestStatus) {
      this.requestStatus = requestStatus;
      return this;
    }

    /**
     * The status of the fulfillment order.
     */
    public Builder status(FulfillmentOrderStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The actions that can be performed on this fulfillment order.
     */
    public Builder supportedActions(List<FulfillmentOrderSupportedAction> supportedActions) {
      this.supportedActions = supportedActions;
      return this;
    }

    /**
     * The date and time when the fulfillment order was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}

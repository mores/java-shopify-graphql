package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A **Fulfillment Service** is a third party warehouse that prepares and ships orders
 * on behalf of the store owner. Fulfillment services charge a fee to package and ship items
 * and update product inventory levels. Some well known fulfillment services with Shopify integrations
 * include: Amazon, Shipwire, and Rakuten. When an app registers a new `FulfillmentService` on a store,
 * Shopify automatically creates a `Location` that's associated to the fulfillment service.
 * To learn more about fulfillment services, refer to
 * [Manage fulfillments as a fulfillment service app](https://shopify.dev/apps/fulfillment/fulfillment-service-apps)
 * guide.
 *
 * ## Mutations
 *
 * You can work with the `FulfillmentService` object with the
 * [fulfillmentServiceCreate](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentServiceCreate),
 * [fulfillmentServiceUpdate](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentServiceUpdate),
 * and [fulfillmentServiceDelete](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentServiceDelete)
 * mutations.
 *
 * ## Hosted endpoints
 *
 * Fulfillment service providers integrate with Shopify by providing Shopify with a set of hosted endpoints that
 * Shopify can query on certain conditions.
 * These endpoints must have a common prefix, and this prefix should be supplied in the `callbackUrl` parameter
 * in the
 * [fulfillmentServiceCreate](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentServiceCreate)
 * mutation.
 *
 * - Shopify sends POST requests to the `&lt;callbackUrl>/fulfillment_order_notification` endpoint
 *   to notify the fulfillment service about fulfillment requests and fulfillment cancellation requests.
 *
 *   For more information, refer to
 *   [Receive fulfillment requests and cancellations](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments#step-2-receive-fulfillment-requests-and-cancellations).
 * - Shopify sends GET requests to the `&lt;callbackUrl>/fetch_tracking_numbers` endpoint to retrieve tracking numbers for orders
 *   if `trackingSupport` is set to `true`.
 *
 *   For more information, refer to
 *   [Enable tracking support](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments#step-8-enable-tracking-support-optional).
 *
 *   Fulfillment services can also update tracking information using the
 *   [fulfillmentTrackingInfoUpdate](https://shopify.dev/api/admin-graphql/latest/mutations/fulfillmentTrackingInfoUpdate) mutation,
 *   rather than waiting for Shopify to ask for tracking numbers.
 * - Shopify sends GET requests to the `&lt;callbackUrl>/fetch_stock` endpoint to retrieve
 *   on hand inventory levels for the fulfillment service location if `inventoryManagement` is set to `true`.
 *
 *   For more information, refer to
 *   [Sharing inventory levels with Shopify](https://shopify.dev/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillment-services#step-10-optional-share-inventory-levels-with-shopify).
 *
 * To make sure you have everything set up correctly, you can test the `callbackUrl`-prefixed endpoints
 * in your development store.
 *
 * ## Resources and webhooks
 *
 * There are a variety of objects and webhooks that enable a fulfillment service to work.
 * To exchange fulfillment information with Shopify, fulfillment services use the
 * [FulfillmentOrder](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentOrder),
 * [Fulfillment](https://shopify.dev/api/admin-graphql/latest/objects/Fulfillment) and
 * [Order](https://shopify.dev/api/admin-graphql/latest/objects/Order) objects and related mutations.
 * To act on fulfillment process events that happen on the Shopify side,
 * besides awaiting calls to `callbackUrl`-prefixed endpoints,
 * fulfillment services can subscribe to the
 * [fulfillment order](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments#webhooks)
 * and [order](https://shopify.dev/api/admin-rest/latest/resources/webhook)
 * webhooks.
 */
public class FulfillmentService {
  /**
   * The callback URL that the fulfillment service has registered for requests. The following considerations apply:
   *   
   * - Shopify queries the `&lt;callbackUrl>/fetch_tracking_numbers` endpoint to retrieve tracking numbers
   *     for orders, if `trackingSupport` is set to `true`.
   * - Shopify queries the `&lt;callbackUrl>/fetch_stock` endpoint to retrieve inventory levels,
   *     if `inventoryManagement` is set to `true`.
   * - Shopify uses the `&lt;callbackUrl>/fulfillment_order_notification` endpoint to send
   *     [fulfillment and cancellation requests](https://shopify.dev/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillment-services#step-9-optional-enable-tracking-support).
   */
  private String callbackUrl;

  /**
   * Whether the fulfillment service uses the [fulfillment order based workflow](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments)
   * for managing fulfillments.
   *   
   * As the migration is now finished, the `fulfillmentOrdersOptIn` property is [deprecated](
   * https://shopify.dev/changelog/deprecation-of-the-fulfillmentservice-fulfillmentordersoptin-field)
   * and is always set to `true` on correctly functioning fulfillment services.
   */
  private boolean fulfillmentOrdersOptIn;

  /**
   * Human-readable unique identifier for this fulfillment service.
   */
  private String handle;

  /**
   * The ID of the fulfillment service.
   */
  private String id;

  /**
   * Whether the fulfillment service tracks product inventory and provides updates to Shopify.
   */
  private boolean inventoryManagement;

  /**
   * Location associated with the fulfillment service.
   */
  private Location location;

  /**
   * Whether the fulfillment service can stock inventory alongside other locations.
   */
  private boolean permitsSkuSharing;

  /**
   * Whether the fulfillment service requires products to be physically shipped.
   */
  private boolean requiresShippingMethod;

  /**
   * The name of the fulfillment service as seen by merchants.
   */
  private String serviceName;

  /**
   * Whether the fulfillment service implemented the /fetch_tracking_numbers endpoint.
   */
  private boolean trackingSupport;

  /**
   * Type associated with the fulfillment service.
   */
  private FulfillmentServiceType type;

  public FulfillmentService() {
  }

  /**
   * The callback URL that the fulfillment service has registered for requests. The following considerations apply:
   *   
   * - Shopify queries the `&lt;callbackUrl>/fetch_tracking_numbers` endpoint to retrieve tracking numbers
   *     for orders, if `trackingSupport` is set to `true`.
   * - Shopify queries the `&lt;callbackUrl>/fetch_stock` endpoint to retrieve inventory levels,
   *     if `inventoryManagement` is set to `true`.
   * - Shopify uses the `&lt;callbackUrl>/fulfillment_order_notification` endpoint to send
   *     [fulfillment and cancellation requests](https://shopify.dev/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillment-services#step-9-optional-enable-tracking-support).
   */
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  /**
   * Whether the fulfillment service uses the [fulfillment order based workflow](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments)
   * for managing fulfillments.
   *   
   * As the migration is now finished, the `fulfillmentOrdersOptIn` property is [deprecated](
   * https://shopify.dev/changelog/deprecation-of-the-fulfillmentservice-fulfillmentordersoptin-field)
   * and is always set to `true` on correctly functioning fulfillment services.
   */
  public boolean getFulfillmentOrdersOptIn() {
    return fulfillmentOrdersOptIn;
  }

  public void setFulfillmentOrdersOptIn(boolean fulfillmentOrdersOptIn) {
    this.fulfillmentOrdersOptIn = fulfillmentOrdersOptIn;
  }

  /**
   * Human-readable unique identifier for this fulfillment service.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The ID of the fulfillment service.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether the fulfillment service tracks product inventory and provides updates to Shopify.
   */
  public boolean getInventoryManagement() {
    return inventoryManagement;
  }

  public void setInventoryManagement(boolean inventoryManagement) {
    this.inventoryManagement = inventoryManagement;
  }

  /**
   * Location associated with the fulfillment service.
   */
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * Whether the fulfillment service can stock inventory alongside other locations.
   */
  public boolean getPermitsSkuSharing() {
    return permitsSkuSharing;
  }

  public void setPermitsSkuSharing(boolean permitsSkuSharing) {
    this.permitsSkuSharing = permitsSkuSharing;
  }

  /**
   * Whether the fulfillment service requires products to be physically shipped.
   */
  public boolean getRequiresShippingMethod() {
    return requiresShippingMethod;
  }

  public void setRequiresShippingMethod(boolean requiresShippingMethod) {
    this.requiresShippingMethod = requiresShippingMethod;
  }

  /**
   * The name of the fulfillment service as seen by merchants.
   */
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  /**
   * Whether the fulfillment service implemented the /fetch_tracking_numbers endpoint.
   */
  public boolean getTrackingSupport() {
    return trackingSupport;
  }

  public void setTrackingSupport(boolean trackingSupport) {
    this.trackingSupport = trackingSupport;
  }

  /**
   * Type associated with the fulfillment service.
   */
  public FulfillmentServiceType getType() {
    return type;
  }

  public void setType(FulfillmentServiceType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "FulfillmentService{callbackUrl='" + callbackUrl + "', fulfillmentOrdersOptIn='" + fulfillmentOrdersOptIn + "', handle='" + handle + "', id='" + id + "', inventoryManagement='" + inventoryManagement + "', location='" + location + "', permitsSkuSharing='" + permitsSkuSharing + "', requiresShippingMethod='" + requiresShippingMethod + "', serviceName='" + serviceName + "', trackingSupport='" + trackingSupport + "', type='" + type + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FulfillmentService that = (FulfillmentService) o;
    return Objects.equals(callbackUrl, that.callbackUrl) &&
        fulfillmentOrdersOptIn == that.fulfillmentOrdersOptIn &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        inventoryManagement == that.inventoryManagement &&
        Objects.equals(location, that.location) &&
        permitsSkuSharing == that.permitsSkuSharing &&
        requiresShippingMethod == that.requiresShippingMethod &&
        Objects.equals(serviceName, that.serviceName) &&
        trackingSupport == that.trackingSupport &&
        Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, fulfillmentOrdersOptIn, handle, id, inventoryManagement, location, permitsSkuSharing, requiresShippingMethod, serviceName, trackingSupport, type);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The callback URL that the fulfillment service has registered for requests. The following considerations apply:
     *   
     * - Shopify queries the `&lt;callbackUrl>/fetch_tracking_numbers` endpoint to retrieve tracking numbers
     *     for orders, if `trackingSupport` is set to `true`.
     * - Shopify queries the `&lt;callbackUrl>/fetch_stock` endpoint to retrieve inventory levels,
     *     if `inventoryManagement` is set to `true`.
     * - Shopify uses the `&lt;callbackUrl>/fulfillment_order_notification` endpoint to send
     *     [fulfillment and cancellation requests](https://shopify.dev/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillment-services#step-9-optional-enable-tracking-support).
     */
    private String callbackUrl;

    /**
     * Whether the fulfillment service uses the [fulfillment order based workflow](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments)
     * for managing fulfillments.
     *   
     * As the migration is now finished, the `fulfillmentOrdersOptIn` property is [deprecated](
     * https://shopify.dev/changelog/deprecation-of-the-fulfillmentservice-fulfillmentordersoptin-field)
     * and is always set to `true` on correctly functioning fulfillment services.
     */
    private boolean fulfillmentOrdersOptIn;

    /**
     * Human-readable unique identifier for this fulfillment service.
     */
    private String handle;

    /**
     * The ID of the fulfillment service.
     */
    private String id;

    /**
     * Whether the fulfillment service tracks product inventory and provides updates to Shopify.
     */
    private boolean inventoryManagement;

    /**
     * Location associated with the fulfillment service.
     */
    private Location location;

    /**
     * Whether the fulfillment service can stock inventory alongside other locations.
     */
    private boolean permitsSkuSharing;

    /**
     * Whether the fulfillment service requires products to be physically shipped.
     */
    private boolean requiresShippingMethod;

    /**
     * The name of the fulfillment service as seen by merchants.
     */
    private String serviceName;

    /**
     * Whether the fulfillment service implemented the /fetch_tracking_numbers endpoint.
     */
    private boolean trackingSupport;

    /**
     * Type associated with the fulfillment service.
     */
    private FulfillmentServiceType type;

    public FulfillmentService build() {
      FulfillmentService result = new FulfillmentService();
      result.callbackUrl = this.callbackUrl;
      result.fulfillmentOrdersOptIn = this.fulfillmentOrdersOptIn;
      result.handle = this.handle;
      result.id = this.id;
      result.inventoryManagement = this.inventoryManagement;
      result.location = this.location;
      result.permitsSkuSharing = this.permitsSkuSharing;
      result.requiresShippingMethod = this.requiresShippingMethod;
      result.serviceName = this.serviceName;
      result.trackingSupport = this.trackingSupport;
      result.type = this.type;
      return result;
    }

    /**
     * The callback URL that the fulfillment service has registered for requests. The following considerations apply:
     *   
     * - Shopify queries the `&lt;callbackUrl>/fetch_tracking_numbers` endpoint to retrieve tracking numbers
     *     for orders, if `trackingSupport` is set to `true`.
     * - Shopify queries the `&lt;callbackUrl>/fetch_stock` endpoint to retrieve inventory levels,
     *     if `inventoryManagement` is set to `true`.
     * - Shopify uses the `&lt;callbackUrl>/fulfillment_order_notification` endpoint to send
     *     [fulfillment and cancellation requests](https://shopify.dev/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillment-services#step-9-optional-enable-tracking-support).
     */
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      return this;
    }

    /**
     * Whether the fulfillment service uses the [fulfillment order based workflow](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments)
     * for managing fulfillments.
     *   
     * As the migration is now finished, the `fulfillmentOrdersOptIn` property is [deprecated](
     * https://shopify.dev/changelog/deprecation-of-the-fulfillmentservice-fulfillmentordersoptin-field)
     * and is always set to `true` on correctly functioning fulfillment services.
     */
    public Builder fulfillmentOrdersOptIn(boolean fulfillmentOrdersOptIn) {
      this.fulfillmentOrdersOptIn = fulfillmentOrdersOptIn;
      return this;
    }

    /**
     * Human-readable unique identifier for this fulfillment service.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The ID of the fulfillment service.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Whether the fulfillment service tracks product inventory and provides updates to Shopify.
     */
    public Builder inventoryManagement(boolean inventoryManagement) {
      this.inventoryManagement = inventoryManagement;
      return this;
    }

    /**
     * Location associated with the fulfillment service.
     */
    public Builder location(Location location) {
      this.location = location;
      return this;
    }

    /**
     * Whether the fulfillment service can stock inventory alongside other locations.
     */
    public Builder permitsSkuSharing(boolean permitsSkuSharing) {
      this.permitsSkuSharing = permitsSkuSharing;
      return this;
    }

    /**
     * Whether the fulfillment service requires products to be physically shipped.
     */
    public Builder requiresShippingMethod(boolean requiresShippingMethod) {
      this.requiresShippingMethod = requiresShippingMethod;
      return this;
    }

    /**
     * The name of the fulfillment service as seen by merchants.
     */
    public Builder serviceName(String serviceName) {
      this.serviceName = serviceName;
      return this;
    }

    /**
     * Whether the fulfillment service implemented the /fetch_tracking_numbers endpoint.
     */
    public Builder trackingSupport(boolean trackingSupport) {
      this.trackingSupport = trackingSupport;
      return this;
    }

    /**
     * Type associated with the fulfillment service.
     */
    public Builder type(FulfillmentServiceType type) {
      this.type = type;
      return this;
    }
  }
}

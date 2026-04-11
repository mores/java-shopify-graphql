package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates the [`FulfillmentService`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentService) configuration, including its name, callback URL, and operational settings.
 *   
 * The mutation modifies how the fulfillment service handles inventory tracking,
 * shipping requirements, and package tracking support.
 *   
 * > Note:
 * > To update the physical address or other location details of the fulfillment
 * service, use the [`locationEdit`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/locationEdit)
 * mutation instead.
 *   
 * Learn more about [editing fulfillment service locations](https://shopify.dev/docs/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillment-services#step-2-edit-locations).
 */
public class FulfillmentServiceUpdateGraphQLQuery extends GraphQLQuery {
  public FulfillmentServiceUpdateGraphQLQuery(String id, String name, String callbackUrl,
      Boolean trackingSupport, Boolean inventoryManagement, Boolean requiresShippingMethod,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (name != null || fieldsSet.contains("name")) {
        getInput().put("name", name);
    }if (callbackUrl != null || fieldsSet.contains("callbackUrl")) {
        getInput().put("callbackUrl", callbackUrl);
    }if (trackingSupport != null || fieldsSet.contains("trackingSupport")) {
        getInput().put("trackingSupport", trackingSupport);
    }if (inventoryManagement != null || fieldsSet.contains("inventoryManagement")) {
        getInput().put("inventoryManagement", inventoryManagement);
    }if (requiresShippingMethod != null || fieldsSet.contains("requiresShippingMethod")) {
        getInput().put("requiresShippingMethod", requiresShippingMethod);
    }
  }

  public FulfillmentServiceUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentServiceUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String name;

    private String callbackUrl;

    private Boolean trackingSupport;

    private Boolean inventoryManagement;

    private Boolean requiresShippingMethod;

    private String queryName;

    public FulfillmentServiceUpdateGraphQLQuery build() {
      return new FulfillmentServiceUpdateGraphQLQuery(id, name, callbackUrl, trackingSupport, inventoryManagement, requiresShippingMethod, queryName, fieldsSet);
               
    }

    /**
     * The id of the fulfillment service.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The name of the fulfillment service.
     */
    public Builder name(String name) {
      this.name = name;
      this.fieldsSet.add("name");
      return this;
    }

    /**
     * The URL to send requests for the fulfillment service.
     *     
     * If `callbackUrl` is provided:
     * - Shopify queries the <code>callback_url/fetch_tracking_numbers</code> endpoint to retrieve tracking numbers
     *     for orders, if `trackingSupport` is set to `true`.
     * - Shopify queries the <code>callback_url/fetch_stock</code> endpoint to retrieve inventory levels,
     *     if `inventoryManagement` is set to `true`.
     * - Shopify uses the <code>callback_url/fulfillment_order_notification</code> endpoint to send
     *     [fulfillment and cancellation requests](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments#step-2-receive-fulfillment-requests-and-cancellations).
     *     
     * Otherwise, if no `callbackUrl` is provided you need to submit this information via the api:
     * - For submitting tracking info and handling fulfillment requests, see our
     * docs on [building for fulfillment services](https://shopify.dev/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillment-services).
     * - For managing inventory quantities, see our docs on [managing inventory quantities and states](https://shopify.dev/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states).
     */
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      this.fieldsSet.add("callbackUrl");
      return this;
    }

    /**
     * Whether the fulfillment service provides tracking numbers for packages.
     *     
     * If `callbackUrl` is provided, Shopify will periodically fetch tracking numbers via the callback endpoint.
     *     
     * If no `callbackUrl` is provided you need to submit this information via the
     * api, see our docs on [building for fulfillment services](https://shopify.dev/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillment-services).
     */
    public Builder trackingSupport(Boolean trackingSupport) {
      this.trackingSupport = trackingSupport;
      this.fieldsSet.add("trackingSupport");
      return this;
    }

    /**
     * Whether the fulfillment service manages product inventory and provides updates to Shopify.
     *     
     * If `callbackUrl` is provided, Shopify will periodically fetch inventory levels via the callback endpoint.
     *     
     * If no `callbackUrl` is provided you need to submit this information via the
     * api, see our docs on [managing inventory quantities and states](https://shopify.dev/apps/build/orders-fulfillment/inventory-management-apps/manage-quantities-states).
     */
    public Builder inventoryManagement(Boolean inventoryManagement) {
      this.inventoryManagement = inventoryManagement;
      this.fieldsSet.add("inventoryManagement");
      return this;
    }

    /**
     * Whether the fulfillment service requires products to be physically shipped.
     */
    public Builder requiresShippingMethod(Boolean requiresShippingMethod) {
      this.requiresShippingMethod = requiresShippingMethod;
      this.fieldsSet.add("requiresShippingMethod");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

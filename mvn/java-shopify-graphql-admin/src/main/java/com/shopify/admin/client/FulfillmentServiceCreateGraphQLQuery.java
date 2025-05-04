package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a fulfillment service.
 *   
 * ## Fulfillment service location
 *   
 * When creating a fulfillment service, a new location will be automatically created on the shop
 * and will be associated with this fulfillment service.
 * This location will be named after the fulfillment service and inherit the shop's address.
 *   
 * If you are using API version `2023-10` or later, and you need to specify
 * custom attributes for the fulfillment service location
 * (for example, to change its address to a country different from the shop's country),
 * use the
 * [LocationEdit](https://shopify.dev/api/admin-graphql/latest/mutations/locationEdit)
 * mutation after creating the fulfillment service.
 */
public class FulfillmentServiceCreateGraphQLQuery extends GraphQLQuery {
  public FulfillmentServiceCreateGraphQLQuery(String name, String callbackUrl,
      Boolean trackingSupport, Boolean inventoryManagement, Boolean requiresShippingMethod,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (name != null || fieldsSet.contains("name")) {
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

  public FulfillmentServiceCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentServiceCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String name;

    private String callbackUrl;

    private Boolean trackingSupport;

    private Boolean inventoryManagement;

    private Boolean requiresShippingMethod;

    private String queryName;

    public FulfillmentServiceCreateGraphQLQuery build() {
      return new FulfillmentServiceCreateGraphQLQuery(name, callbackUrl, trackingSupport, inventoryManagement, requiresShippingMethod, queryName, fieldsSet);
               
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
     * The URL to send requests for the fulfillment service. The following considerations apply:
     *     
     * - Shopify queries the <code>callback_url/fetch_tracking_numbers</code> endpoint to retrieve tracking numbers
     *     for orders, if `trackingSupport` is set to `true`.
     * - Shopify queries the <code>callback_url/fetch_stock</code> endpoint to retrieve inventory levels,
     *     if `inventoryManagement` is set to `true`.
     * - Shopify uses the <code>callback_url/fulfillment_order_notification</code> endpoint to send
     *     [fulfillment and cancellation requests](https://shopify.dev/apps/fulfillment/fulfillment-service-apps/manage-fulfillments#step-2-receive-fulfillment-requests-and-cancellations).
     */
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      this.fieldsSet.add("callbackUrl");
      return this;
    }

    /**
     * Whether the fulfillment service provides tracking numbers for packages.
     */
    public Builder trackingSupport(Boolean trackingSupport) {
      this.trackingSupport = trackingSupport;
      this.fieldsSet.add("trackingSupport");
      return this;
    }

    /**
     * Whether the fulfillment service manages product inventory and provides updates to Shopify.
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

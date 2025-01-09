package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a fulfillment service.
 *   
 * If you are using API version `2023-10` or later,
 * and you need to update the location managed by the fulfillment service
 * (for example, to change the address of a fulfillment service),
 * use the
 * [LocationEdit](https://shopify.dev/api/admin-graphql/latest/mutations/locationEdit)
 * mutation.
 */
public class FulfillmentServiceUpdateGraphQLQuery extends GraphQLQuery {
  public FulfillmentServiceUpdateGraphQLQuery(String id, String name, String callbackUrl,
      Boolean trackingSupport, Boolean inventoryManagement, String queryName,
      Set<String> fieldsSet) {
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

    private String queryName;

    public FulfillmentServiceUpdateGraphQLQuery build() {
      return new FulfillmentServiceUpdateGraphQLQuery(id, name, callbackUrl, trackingSupport, inventoryManagement, queryName, fieldsSet);
               
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
     * Whether the fulfillment service tracks product inventory and provides updates to Shopify.
     */
    public Builder inventoryManagement(Boolean inventoryManagement) {
      this.inventoryManagement = inventoryManagement;
      this.fieldsSet.add("inventoryManagement");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

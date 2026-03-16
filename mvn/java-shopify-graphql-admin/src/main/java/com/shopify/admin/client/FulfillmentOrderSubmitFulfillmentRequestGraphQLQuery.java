package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FulfillmentOrderLineItemInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Sends a fulfillment request to the fulfillment service assigned to a [`FulfillmentOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder).
 * The fulfillment service must then accept or reject the request before
 * processing can begin.
 *   
 * You can either request fulfillment for all line items or specify individual
 * items with quantities for partial fulfillment. When requesting partial
 * fulfillment, Shopify splits the original fulfillment order into two: one with
 * the submitted items and another with the remaining unsubmitted items. Include
 * an optional message to communicate special instructions to the fulfillment
 * service, such as gift wrapping or handling requirements.
 *   
 * Learn more about [managing fulfillment requests as a fulfillment service](https://shopify.dev/docs/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillment-services#step-4-act-on-fulfillment-requests).
 */
public class FulfillmentOrderSubmitFulfillmentRequestGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderSubmitFulfillmentRequestGraphQLQuery(String id, String message,
      Boolean notifyCustomer, List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (message != null || fieldsSet.contains("message")) {
        getInput().put("message", message);
    }if (notifyCustomer != null || fieldsSet.contains("notifyCustomer")) {
        getInput().put("notifyCustomer", notifyCustomer);
    }if (fulfillmentOrderLineItems != null || fieldsSet.contains("fulfillmentOrderLineItems")) {
        getInput().put("fulfillmentOrderLineItems", fulfillmentOrderLineItems);
    }
  }

  public FulfillmentOrderSubmitFulfillmentRequestGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderSubmitFulfillmentRequest";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String message;

    private Boolean notifyCustomer;

    private List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems;

    private String queryName;

    public FulfillmentOrderSubmitFulfillmentRequestGraphQLQuery build() {
      return new FulfillmentOrderSubmitFulfillmentRequestGraphQLQuery(id, message, notifyCustomer, fulfillmentOrderLineItems, queryName, fieldsSet);
               
    }

    /**
     * The ID of the fulfillment order associated with fulfillment request.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * An optional message for the fulfillment request.
     */
    public Builder message(String message) {
      this.message = message;
      this.fieldsSet.add("message");
      return this;
    }

    /**
     * Whether the customer should be notified when fulfillments are created for this fulfillment order.
     */
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      this.fieldsSet.add("notifyCustomer");
      return this;
    }

    /**
     * The fulfillment order line items to be requested for fulfillment.
     * If left blank, all line items of the fulfillment order are requested for fulfillment.
     */
    public Builder fulfillmentOrderLineItems(
        List<FulfillmentOrderLineItemInput> fulfillmentOrderLineItems) {
      this.fulfillmentOrderLineItems = fulfillmentOrderLineItems;
      this.fieldsSet.add("fulfillmentOrderLineItems");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

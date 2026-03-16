package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Cancels an existing [`Fulfillment`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Fulfillment)
 * and reverses its effects on associated [`FulfillmentOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder)
 * objects. When you cancel a fulfillment, the system creates new fulfillment
 * orders for the cancelled items so they can be fulfilled again.
 *   
 * The cancellation affects fulfillment orders differently based on their
 * fulfillment status. If a fulfillment order was entirely fulfilled, then it
 * automatically closes. If a fulfillment order is partially fulfilled, then the
 * remaining quantities adjust to include the cancelled items. The system creates
 * new fulfillment orders at the original [`Location`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location)
 * when items are still stocked there, or at alternative locations based on the
 * store's fulfillment priority settings.
 *   
 * Learn more about [canceling fulfillments](https://shopify.dev/docs/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillment-services#step-7-cancel-a-fulfillment).
 */
public class FulfillmentCancelGraphQLQuery extends GraphQLQuery {
  public FulfillmentCancelGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public FulfillmentCancelGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentCancel";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public FulfillmentCancelGraphQLQuery build() {
      return new FulfillmentCancelGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the fulfillment to be canceled.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

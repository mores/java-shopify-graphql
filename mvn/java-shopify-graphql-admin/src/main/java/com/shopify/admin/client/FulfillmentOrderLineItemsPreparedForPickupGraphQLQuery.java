package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FulfillmentOrderLineItemsPreparedForPickupInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Marks [fulfillment order line items](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrderLineItem)
 * as ready for customer pickup. When executed, this mutation automatically sends
 * a "Ready For Pickup" notification to the customer.
 *   
 * Use this mutation for local pickup orders after the items have been prepared
 * and are available for the customer to collect. You can specify one or more [fulfillment order](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder)
 * objects by providing the fulfillment order IDs in the [`lineItemsByFulfillmentOrder`](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/PreparedFulfillmentOrderLineItemsInput)
 * field. This allows you to mark fulfillment order line items from different
 * fulfillment orders as ready for pickup.
 */
public class FulfillmentOrderLineItemsPreparedForPickupGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderLineItemsPreparedForPickupGraphQLQuery(
      FulfillmentOrderLineItemsPreparedForPickupInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public FulfillmentOrderLineItemsPreparedForPickupGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderLineItemsPreparedForPickup";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private FulfillmentOrderLineItemsPreparedForPickupInput input;

    private String queryName;

    public FulfillmentOrderLineItemsPreparedForPickupGraphQLQuery build() {
      return new FulfillmentOrderLineItemsPreparedForPickupGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input for marking fulfillment order line items as ready for pickup.
     */
    public Builder input(FulfillmentOrderLineItemsPreparedForPickupInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FulfillmentOrderLineItemsPreparedForPickupInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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

  public FulfillmentOrderLineItemsPreparedForPickupGraphQLQuery(
      FulfillmentOrderLineItemsPreparedForPickupInput input, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private FulfillmentOrderLineItemsPreparedForPickupInput input;

    private String queryName;

    public FulfillmentOrderLineItemsPreparedForPickupGraphQLQuery build() {
      return new FulfillmentOrderLineItemsPreparedForPickupGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input for marking fulfillment order line items as ready for pickup.
     */
    public Builder input(FulfillmentOrderLineItemsPreparedForPickupInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input for marking fulfillment order line items as ready for pickup.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("FulfillmentOrderLineItemsPreparedForPickupInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

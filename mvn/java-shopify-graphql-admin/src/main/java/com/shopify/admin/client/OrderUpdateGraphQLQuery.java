package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OrderInput;
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
 * Updates the attributes of an order, such as the customer's email, the shipping address for the order,
 * tags, and [metafields](https://shopify.dev/docs/apps/build/custom-data) associated with the order.
 *   
 * If you need to make significant updates to an order, such as adding or removing line items, changing
 * quantities, or modifying discounts, then use
 * the [`orderEditBegin`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderEditBegin)
 * mutation instead. The `orderEditBegin` mutation initiates an order editing session,
 * allowing you to make multiple changes before finalizing them. Learn more about using the `orderEditBegin`
 * mutation to [edit existing orders](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders).
 *   
 * If you need to remove a customer from an order, then use the [`orderCustomerRemove`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderCustomerRemove)
 * mutation instead.
 *   
 * Learn how to build apps that integrate with
 * [order management and fulfillment processes](https://shopify.dev/docs/apps/build/orders-fulfillment).
 */
public class OrderUpdateGraphQLQuery extends GraphQLQuery {
  public OrderUpdateGraphQLQuery(OrderInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public OrderUpdateGraphQLQuery(OrderInput input, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
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

  public OrderUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private OrderInput input;

    private String queryName;

    public OrderUpdateGraphQLQuery build() {
      return new OrderUpdateGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The attributes of the updated order.
     */
    public Builder input(OrderInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The attributes of the updated order.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("OrderInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

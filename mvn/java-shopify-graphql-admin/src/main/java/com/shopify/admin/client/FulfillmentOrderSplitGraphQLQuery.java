package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FulfillmentOrderSplitInput;
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
 * Splits [`FulfillmentOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder) objects by moving the specified [`LineItem`](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem)
 * objects and quantities into a new fulfillment order.
 *   
 * If the original fulfillment order can't be split due to its current state,
 * then the mutation creates a replacement fulfillment order instead.
 */
public class FulfillmentOrderSplitGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderSplitGraphQLQuery(List<FulfillmentOrderSplitInput> fulfillmentOrderSplits,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fulfillmentOrderSplits != null || fieldsSet.contains("fulfillmentOrderSplits")) {
        getInput().put("fulfillmentOrderSplits", fulfillmentOrderSplits);
    }
  }

  public FulfillmentOrderSplitGraphQLQuery(List<FulfillmentOrderSplitInput> fulfillmentOrderSplits,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (fulfillmentOrderSplits != null || fieldsSet.contains("fulfillmentOrderSplits")) {
        getInput().put("fulfillmentOrderSplits", fulfillmentOrderSplits);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public FulfillmentOrderSplitGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderSplit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private List<FulfillmentOrderSplitInput> fulfillmentOrderSplits;

    private String queryName;

    public FulfillmentOrderSplitGraphQLQuery build() {
      return new FulfillmentOrderSplitGraphQLQuery(fulfillmentOrderSplits, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The fulfillment orders, line items and quantities to be split into new fulfillment orders.
     */
    public Builder fulfillmentOrderSplits(List<FulfillmentOrderSplitInput> fulfillmentOrderSplits) {
      this.fulfillmentOrderSplits = fulfillmentOrderSplits;
      this.fieldsSet.add("fulfillmentOrderSplits");
      return this;
    }

    /**
     * The fulfillment orders, line items and quantities to be split into new fulfillment orders.
     */
    public Builder fulfillmentOrderSplitsReference(String variableRef) {
      this.variableReferences.put("fulfillmentOrderSplits", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("FulfillmentOrderSplitInput"))))).build());
      this.fieldsSet.add("fulfillmentOrderSplits");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

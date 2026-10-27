package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CalculateReturnInput;
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
 * Calculates the financial outcome of a
 * [`Return`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Return)
 * without creating it. Use this query to preview return costs before initiating
 * the actual return process.
 *   
 * The calculation provides detailed breakdowns of refund amounts, taxes, [`RestockingFee`](https://shopify.dev/docs/api/admin-graphql/latest/objects/RestockingFee)
 * charges, return shipping fees, and order-level discount adjustments based on the [`FulfillmentLineItem`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentLineItem)
 * objects that customers select for return.
 *   
 * Learn more about building for [return management](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/build-return-management).
 */
public class ReturnCalculateGraphQLQuery extends GraphQLQuery {
  public ReturnCalculateGraphQLQuery(CalculateReturnInput input, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ReturnCalculateGraphQLQuery(CalculateReturnInput input, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
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

  public ReturnCalculateGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "returnCalculate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private CalculateReturnInput input;

    private String queryName;

    public ReturnCalculateGraphQLQuery build() {
      return new ReturnCalculateGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields for calculating a return.
     */
    public Builder input(CalculateReturnInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields for calculating a return.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CalculateReturnInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

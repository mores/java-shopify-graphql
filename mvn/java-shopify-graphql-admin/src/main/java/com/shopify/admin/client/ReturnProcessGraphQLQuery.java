package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ReturnProcessInput;
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
 * Processes a return by confirming which items customers return and exchange,
 * handling their disposition, and optionally issuing refunds. This mutation
 * confirms the quantities for [`ReturnLineItem`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ReturnLineItem) and [`ExchangeLineItem`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ExchangeLineItem)
 * objects previously created on the
 * [`Return`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Return).
 *   
 * For returned items, you specify how to handle them through dispositions such
 * as restocking or disposal. The mutation creates [`FulfillmentOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder)
 * objects for exchange items and records all transactions in the merchant's
 * financial reports. You can optionally issue refunds through financial
 * transfers, apply refund duties, and refund shipping costs.
 *   
 * Learn more about [processing returns](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/build-return-management).
 */
public class ReturnProcessGraphQLQuery extends GraphQLQuery {
  public ReturnProcessGraphQLQuery(ReturnProcessInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ReturnProcessGraphQLQuery(ReturnProcessInput input, String queryName,
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

  public ReturnProcessGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "returnProcess";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private ReturnProcessInput input;

    private String queryName;

    public ReturnProcessGraphQLQuery build() {
      return new ReturnProcessGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Specifies the input fields for processing a return.
     */
    public Builder input(ReturnProcessInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * Specifies the input fields for processing a return.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ReturnProcessInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

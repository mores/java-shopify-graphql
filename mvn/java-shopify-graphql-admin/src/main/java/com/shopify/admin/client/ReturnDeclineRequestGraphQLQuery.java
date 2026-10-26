package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ReturnDeclineRequestInput;
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
 * Declines a return on an order.
 * When a return is declined, each `ReturnLineItem.fulfillmentLineItem` can be associated to a new return.
 * Use the `ReturnCreate` or `ReturnRequest` mutation to initiate a new return.
 */
public class ReturnDeclineRequestGraphQLQuery extends GraphQLQuery {
  public ReturnDeclineRequestGraphQLQuery(ReturnDeclineRequestInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ReturnDeclineRequestGraphQLQuery(ReturnDeclineRequestInput input, String queryName,
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

  public ReturnDeclineRequestGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "returnDeclineRequest";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private ReturnDeclineRequestInput input;

    private String queryName;

    public ReturnDeclineRequestGraphQLQuery build() {
      return new ReturnDeclineRequestGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields for declining a customer's return request.
     */
    public Builder input(ReturnDeclineRequestInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields for declining a customer's return request.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ReturnDeclineRequestInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

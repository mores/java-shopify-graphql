package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * The fulfillment constraint rules that belong to a shop.
 */
public class FulfillmentConstraintRulesGraphQLQuery extends GraphQLQuery {
  public FulfillmentConstraintRulesGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public FulfillmentConstraintRulesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentConstraintRules";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String queryName;

    public FulfillmentConstraintRulesGraphQLQuery build() {
      return new FulfillmentConstraintRulesGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

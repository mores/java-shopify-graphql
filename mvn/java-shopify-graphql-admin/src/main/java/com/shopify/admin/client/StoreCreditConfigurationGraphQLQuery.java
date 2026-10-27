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
 * Returns the store credit configuration for a shop, including whether store
 * credit is enabled for customers at checkout. Use this to display the current
 * state of a merchant's store credit program or check eligibility before issuing
 * store credit to customers.
 */
public class StoreCreditConfigurationGraphQLQuery extends GraphQLQuery {
  public StoreCreditConfigurationGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public StoreCreditConfigurationGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "storeCreditConfiguration";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String queryName;

    public StoreCreditConfigurationGraphQLQuery build() {
      return new StoreCreditConfigurationGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

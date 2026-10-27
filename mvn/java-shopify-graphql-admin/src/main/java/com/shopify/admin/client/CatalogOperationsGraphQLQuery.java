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
 * Returns the most recent catalog operations for the shop.
 */
public class CatalogOperationsGraphQLQuery extends GraphQLQuery {
  public CatalogOperationsGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public CatalogOperationsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "catalogOperations";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String queryName;

    public CatalogOperationsGraphQLQuery build() {
      return new CatalogOperationsGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

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
 * Lists all metafield definitions that can be used to create collection conditions.
 */
public class CollectionConditionMetafieldDefinitionsGraphQLQuery extends GraphQLQuery {
  public CollectionConditionMetafieldDefinitionsGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public CollectionConditionMetafieldDefinitionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "collectionConditionMetafieldDefinitions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String queryName;

    public CollectionConditionMetafieldDefinitionsGraphQLQuery build() {
      return new CollectionConditionMetafieldDefinitionsGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

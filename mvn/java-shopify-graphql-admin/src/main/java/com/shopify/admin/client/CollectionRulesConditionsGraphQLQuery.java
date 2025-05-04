package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Lists all rules that can be used to create smart collections.
 */
public class CollectionRulesConditionsGraphQLQuery extends GraphQLQuery {
  public CollectionRulesConditionsGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public CollectionRulesConditionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "collectionRulesConditions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public CollectionRulesConditionsGraphQLQuery build() {
      return new CollectionRulesConditionsGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

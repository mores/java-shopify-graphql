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
 * The shop's online store channel.
 */
public class OnlineStoreGraphQLQuery extends GraphQLQuery {
  public OnlineStoreGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public OnlineStoreGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "onlineStore";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String queryName;

    public OnlineStoreGraphQLQuery build() {
      return new OnlineStoreGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

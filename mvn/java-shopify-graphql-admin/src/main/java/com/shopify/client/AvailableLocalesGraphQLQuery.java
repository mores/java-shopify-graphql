package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * A list of available locales.
 */
public class AvailableLocalesGraphQLQuery extends GraphQLQuery {
  public AvailableLocalesGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public AvailableLocalesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "availableLocales";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public AvailableLocalesGraphQLQuery build() {
      return new AvailableLocalesGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

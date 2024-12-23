package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Return the AppInstallation for the currently authenticated App.
 */
public class CurrentAppInstallationGraphQLQuery extends GraphQLQuery {
  public CurrentAppInstallationGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public CurrentAppInstallationGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "currentAppInstallation";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public CurrentAppInstallationGraphQLQuery build() {
      return new CurrentAppInstallationGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

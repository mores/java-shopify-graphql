package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Uninstalls an app.
 */
public class AppUninstallGraphQLQuery extends GraphQLQuery {
  public AppUninstallGraphQLQuery(String queryName) {
    super("mutation", queryName);
  }

  public AppUninstallGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "appUninstall";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public AppUninstallGraphQLQuery build() {
      return new AppUninstallGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

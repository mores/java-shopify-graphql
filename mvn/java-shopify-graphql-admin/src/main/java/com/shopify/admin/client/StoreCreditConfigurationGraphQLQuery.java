package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the store credit configuration for a shop.
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

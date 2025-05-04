package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The number of pendings orders. Limited to a maximum of 10000.
 */
public class PendingOrdersCountGraphQLQuery extends GraphQLQuery {
  public PendingOrdersCountGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public PendingOrdersCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "pendingOrdersCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public PendingOrdersCountGraphQLQuery build() {
      return new PendingOrdersCountGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

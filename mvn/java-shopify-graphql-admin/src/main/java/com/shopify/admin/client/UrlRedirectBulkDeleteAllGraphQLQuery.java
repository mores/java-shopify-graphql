package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Asynchronously delete [URL redirects](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) in bulk.
 */
public class UrlRedirectBulkDeleteAllGraphQLQuery extends GraphQLQuery {
  public UrlRedirectBulkDeleteAllGraphQLQuery(String queryName) {
    super("mutation", queryName);
  }

  public UrlRedirectBulkDeleteAllGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectBulkDeleteAll";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public UrlRedirectBulkDeleteAllGraphQLQuery build() {
      return new UrlRedirectBulkDeleteAllGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

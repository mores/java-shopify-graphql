package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Asynchronously delete redirects in bulk.
 */
public class UrlRedirectBulkDeleteBySearchGraphQLQuery extends GraphQLQuery {
  public UrlRedirectBulkDeleteBySearchGraphQLQuery(String search, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }
  }

  public UrlRedirectBulkDeleteBySearchGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectBulkDeleteBySearch";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String search;

    private String queryName;

    public UrlRedirectBulkDeleteBySearchGraphQLQuery build() {
      return new UrlRedirectBulkDeleteBySearchGraphQLQuery(search, queryName, fieldsSet);
               
    }

    /**
     * Search query for filtering redirects on (both Redirect from and Redirect to fields).
     */
    public Builder search(String search) {
      this.search = search;
      this.fieldsSet.add("search");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

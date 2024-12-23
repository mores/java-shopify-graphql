package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Asynchronously delete redirects in bulk.
 */
public class UrlRedirectBulkDeleteBySavedSearchGraphQLQuery extends GraphQLQuery {
  public UrlRedirectBulkDeleteBySavedSearchGraphQLQuery(String savedSearchId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }
  }

  public UrlRedirectBulkDeleteBySavedSearchGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectBulkDeleteBySavedSearch";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String savedSearchId;

    private String queryName;

    public UrlRedirectBulkDeleteBySavedSearchGraphQLQuery build() {
      return new UrlRedirectBulkDeleteBySavedSearchGraphQLQuery(savedSearchId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the URL redirect saved search for filtering.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a [`UrlRedirect`](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) object.
 */
public class UrlRedirectDeleteGraphQLQuery extends GraphQLQuery {
  public UrlRedirectDeleteGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public UrlRedirectDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public UrlRedirectDeleteGraphQLQuery build() {
      return new UrlRedirectDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the redirect to delete.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

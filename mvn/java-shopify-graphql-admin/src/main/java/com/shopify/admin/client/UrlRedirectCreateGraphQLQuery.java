package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.UrlRedirectInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a [`UrlRedirect`](https://shopify.dev/api/admin-graphql/latest/objects/UrlRedirect) object.
 */
public class UrlRedirectCreateGraphQLQuery extends GraphQLQuery {
  public UrlRedirectCreateGraphQLQuery(UrlRedirectInput urlRedirect, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (urlRedirect != null || fieldsSet.contains("urlRedirect")) {
        getInput().put("urlRedirect", urlRedirect);
    }
  }

  public UrlRedirectCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private UrlRedirectInput urlRedirect;

    private String queryName;

    public UrlRedirectCreateGraphQLQuery build() {
      return new UrlRedirectCreateGraphQLQuery(urlRedirect, queryName, fieldsSet);
               
    }

    /**
     * The fields to use when creating the redirect.
     */
    public Builder urlRedirect(UrlRedirectInput urlRedirect) {
      this.urlRedirect = urlRedirect;
      this.fieldsSet.add("urlRedirect");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

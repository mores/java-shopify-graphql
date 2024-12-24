package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class UrlRedirectImportCreateGraphQLQuery extends GraphQLQuery {
  public UrlRedirectImportCreateGraphQLQuery(String url, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (url != null || fieldsSet.contains("url")) {
        getInput().put("url", url);
    }
  }

  public UrlRedirectImportCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectImportCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String url;

    private String queryName;

    public UrlRedirectImportCreateGraphQLQuery build() {
      return new UrlRedirectImportCreateGraphQLQuery(url, queryName, fieldsSet);
               
    }

    
    public Builder url(String url) {
      this.url = url;
      this.fieldsSet.add("url");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

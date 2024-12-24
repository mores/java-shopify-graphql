package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.UrlRedirectInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class UrlRedirectUpdateGraphQLQuery extends GraphQLQuery {
  public UrlRedirectUpdateGraphQLQuery(String id, UrlRedirectInput urlRedirect, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (urlRedirect != null || fieldsSet.contains("urlRedirect")) {
        getInput().put("urlRedirect", urlRedirect);
    }
  }

  public UrlRedirectUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "urlRedirectUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private UrlRedirectInput urlRedirect;

    private String queryName;

    public UrlRedirectUpdateGraphQLQuery build() {
      return new UrlRedirectUpdateGraphQLQuery(id, urlRedirect, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
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

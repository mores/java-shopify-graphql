package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class ShopLocalesGraphQLQuery extends GraphQLQuery {
  public ShopLocalesGraphQLQuery(Boolean published, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (published != null || fieldsSet.contains("published")) {
        getInput().put("published", published);
    }
  }

  public ShopLocalesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "shopLocales";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private Boolean published;

    private String queryName;

    public ShopLocalesGraphQLQuery build() {
      return new ShopLocalesGraphQLQuery(published, queryName, fieldsSet);
               
    }

    
    public Builder published(Boolean published) {
      this.published = published;
      this.fieldsSet.add("published");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

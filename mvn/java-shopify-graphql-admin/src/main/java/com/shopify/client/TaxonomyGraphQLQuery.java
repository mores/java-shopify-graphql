package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class TaxonomyGraphQLQuery extends GraphQLQuery {
  public TaxonomyGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public TaxonomyGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "taxonomy";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public TaxonomyGraphQLQuery build() {
      return new TaxonomyGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

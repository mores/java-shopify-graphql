package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Count of pages.
 */
public class PagesCountGraphQLQuery extends GraphQLQuery {
  public PagesCountGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public PagesCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "pagesCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public PagesCountGraphQLQuery build() {
      return new PagesCountGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

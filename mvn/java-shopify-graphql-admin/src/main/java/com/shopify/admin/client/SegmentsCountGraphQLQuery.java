package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The number of segments for a shop.
 */
public class SegmentsCountGraphQLQuery extends GraphQLQuery {
  public SegmentsCountGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public SegmentsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "segmentsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public SegmentsCountGraphQLQuery build() {
      return new SegmentsCountGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

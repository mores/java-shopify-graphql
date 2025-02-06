package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a list of Business Entities associated with the shop.
 */
public class BusinessEntitiesGraphQLQuery extends GraphQLQuery {
  public BusinessEntitiesGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public BusinessEntitiesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "businessEntities";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public BusinessEntitiesGraphQLQuery build() {
      return new BusinessEntitiesGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

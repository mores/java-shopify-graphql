package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a list of activated carrier services and associated shop locations that support them.
 */
public class AvailableCarrierServicesGraphQLQuery extends GraphQLQuery {
  public AvailableCarrierServicesGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public AvailableCarrierServicesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "availableCarrierServices";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public AvailableCarrierServicesGraphQLQuery build() {
      return new AvailableCarrierServicesGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

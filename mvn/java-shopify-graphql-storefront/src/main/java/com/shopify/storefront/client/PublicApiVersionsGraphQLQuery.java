package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The list of public Storefront API versions, including supported, release candidate and unstable versions.
 */
public class PublicApiVersionsGraphQLQuery extends GraphQLQuery {
  public PublicApiVersionsGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public PublicApiVersionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "publicApiVersions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public PublicApiVersionsGraphQLQuery build() {
      return new PublicApiVersionsGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

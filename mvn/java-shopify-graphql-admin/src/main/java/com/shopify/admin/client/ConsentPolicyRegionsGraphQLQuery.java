package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * List of countries and regions for which consent policies can be created or updated.
 */
public class ConsentPolicyRegionsGraphQLQuery extends GraphQLQuery {
  public ConsentPolicyRegionsGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public ConsentPolicyRegionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "consentPolicyRegions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public ConsentPolicyRegionsGraphQLQuery build() {
      return new ConsentPolicyRegionsGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

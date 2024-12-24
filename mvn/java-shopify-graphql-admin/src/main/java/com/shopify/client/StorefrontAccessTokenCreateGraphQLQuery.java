package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.StorefrontAccessTokenInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class StorefrontAccessTokenCreateGraphQLQuery extends GraphQLQuery {
  public StorefrontAccessTokenCreateGraphQLQuery(StorefrontAccessTokenInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public StorefrontAccessTokenCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "storefrontAccessTokenCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private StorefrontAccessTokenInput input;

    private String queryName;

    public StorefrontAccessTokenCreateGraphQLQuery build() {
      return new StorefrontAccessTokenCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(StorefrontAccessTokenInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

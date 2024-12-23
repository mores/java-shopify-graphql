package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.StorefrontAccessTokenDeleteInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a storefront access token.
 */
public class StorefrontAccessTokenDeleteGraphQLQuery extends GraphQLQuery {
  public StorefrontAccessTokenDeleteGraphQLQuery(StorefrontAccessTokenDeleteInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public StorefrontAccessTokenDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "storefrontAccessTokenDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private StorefrontAccessTokenDeleteInput input;

    private String queryName;

    public StorefrontAccessTokenDeleteGraphQLQuery build() {
      return new StorefrontAccessTokenDeleteGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Provides the input fields required to delete a storefront access token.
     */
    public Builder input(StorefrontAccessTokenDeleteInput input) {
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

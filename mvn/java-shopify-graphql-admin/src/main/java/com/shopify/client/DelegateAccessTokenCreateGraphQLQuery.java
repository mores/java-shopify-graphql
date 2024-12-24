package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DelegateAccessTokenInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a delegate access token.
 *   
 * To learn more about creating delegate access tokens, refer to
 * [Delegate OAuth access tokens to subsystems](https://shopify.dev/docs/apps/build/authentication-authorization/access-tokens/use-delegate-tokens).
 */
public class DelegateAccessTokenCreateGraphQLQuery extends GraphQLQuery {
  public DelegateAccessTokenCreateGraphQLQuery(DelegateAccessTokenInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public DelegateAccessTokenCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "delegateAccessTokenCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DelegateAccessTokenInput input;

    private String queryName;

    public DelegateAccessTokenCreateGraphQLQuery build() {
      return new DelegateAccessTokenCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(DelegateAccessTokenInput input) {
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

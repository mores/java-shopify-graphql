package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DelegateAccessTokenInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a [`DelegateAccessToken`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DelegateAccessToken) with a subset of the parent token's permissions.
 *   
 * Delegate access tokens enable secure permission delegation to subsystems or
 * services that need limited access to shop resources. Each token inherits only
 * the scopes you specify, ensuring subsystems operate with minimal required
 * permissions rather than full app access.
 *   
 * Learn more about [delegating access tokens to subsystems](https://shopify.dev/docs/apps/build/authentication-authorization/access-tokens/use-delegate-tokens).
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

    /**
     * The input fields for creating a delegate access token.
     */
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

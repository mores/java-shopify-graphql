package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Destroys a delegate access token.
 */
public class DelegateAccessTokenDestroyGraphQLQuery extends GraphQLQuery {
  public DelegateAccessTokenDestroyGraphQLQuery(String accessToken, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (accessToken != null || fieldsSet.contains("accessToken")) {
        getInput().put("accessToken", accessToken);
    }
  }

  public DelegateAccessTokenDestroyGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "delegateAccessTokenDestroy";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String accessToken;

    private String queryName;

    public DelegateAccessTokenDestroyGraphQLQuery build() {
      return new DelegateAccessTokenDestroyGraphQLQuery(accessToken, queryName, fieldsSet);
               
    }

    /**
     * Provides the delegate access token to destroy.
     */
    public Builder accessToken(String accessToken) {
      this.accessToken = accessToken;
      this.fieldsSet.add("accessToken");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * A poll for the status of the cart checkout completion and order creation.
 */
public class CartCompletionAttemptGraphQLQuery extends GraphQLQuery {
  public CartCompletionAttemptGraphQLQuery(String attemptId, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (attemptId != null || fieldsSet.contains("attemptId")) {
        getInput().put("attemptId", attemptId);
    }
  }

  public CartCompletionAttemptGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "cartCompletionAttempt";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String attemptId;

    private String queryName;

    public CartCompletionAttemptGraphQLQuery build() {
      return new CartCompletionAttemptGraphQLQuery(attemptId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the attempt.
     */
    public Builder attemptId(String attemptId) {
      this.attemptId = attemptId;
      this.fieldsSet.add("attemptId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

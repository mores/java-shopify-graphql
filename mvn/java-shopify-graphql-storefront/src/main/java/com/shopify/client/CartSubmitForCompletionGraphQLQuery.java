package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Submit the cart for checkout completion.
 */
public class CartSubmitForCompletionGraphQLQuery extends GraphQLQuery {
  public CartSubmitForCompletionGraphQLQuery(String attemptToken, String cartId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (attemptToken != null || fieldsSet.contains("attemptToken")) {
        getInput().put("attemptToken", attemptToken);
    }if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }
  }

  public CartSubmitForCompletionGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartSubmitForCompletion";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String attemptToken;

    private String cartId;

    private String queryName;

    public CartSubmitForCompletionGraphQLQuery build() {
      return new CartSubmitForCompletionGraphQLQuery(attemptToken, cartId, queryName, fieldsSet);
               
    }

    /**
     * The attemptToken is used to guarantee an idempotent result.
     * If more than one call uses the same attemptToken within a short period of time, only one will be accepted.
     */
    public Builder attemptToken(String attemptToken) {
      this.attemptToken = attemptToken;
      this.fieldsSet.add("attemptToken");
      return this;
    }

    /**
     * The ID of the cart.
     */
    public Builder cartId(String cartId) {
      this.cartId = cartId;
      this.fieldsSet.add("cartId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

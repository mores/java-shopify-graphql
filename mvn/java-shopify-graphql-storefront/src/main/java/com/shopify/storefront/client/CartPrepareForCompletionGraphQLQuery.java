package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Prepare the cart for cart checkout completion.
 */
public class CartPrepareForCompletionGraphQLQuery extends GraphQLQuery {
  public CartPrepareForCompletionGraphQLQuery(String cartId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }
  }

  public CartPrepareForCompletionGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartPrepareForCompletion";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String cartId;

    private String queryName;

    public CartPrepareForCompletionGraphQLQuery build() {
      return new CartPrepareForCompletionGraphQLQuery(cartId, queryName, fieldsSet);
               
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

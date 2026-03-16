package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a clone of the specified cart with all personally identifiable information removed.
 */
public class CartCloneGraphQLQuery extends GraphQLQuery {
  public CartCloneGraphQLQuery(String cartId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }
  }

  public CartCloneGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartClone";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String cartId;

    private String queryName;

    public CartCloneGraphQLQuery build() {
      return new CartCloneGraphQLQuery(cartId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the cart to clone.
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

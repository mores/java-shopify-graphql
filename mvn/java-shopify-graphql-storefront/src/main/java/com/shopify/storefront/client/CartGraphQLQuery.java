package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieve a cart by its ID. For more information, refer to
 * [Manage a cart with the Storefront API](https://shopify.dev/custom-storefronts/cart/manage).
 */
public class CartGraphQLQuery extends GraphQLQuery {
  public CartGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public CartGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "cart";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public CartGraphQLQuery build() {
      return new CartGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the cart.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

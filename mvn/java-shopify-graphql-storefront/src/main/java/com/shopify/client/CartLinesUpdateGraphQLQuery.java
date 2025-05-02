package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CartLineUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Updates one or more merchandise lines on a cart.
 */
public class CartLinesUpdateGraphQLQuery extends GraphQLQuery {
  public CartLinesUpdateGraphQLQuery(String cartId, List<CartLineUpdateInput> lines,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (lines != null || fieldsSet.contains("lines")) {
        getInput().put("lines", lines);
    }
  }

  public CartLinesUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartLinesUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String cartId;

    private List<CartLineUpdateInput> lines;

    private String queryName;

    public CartLinesUpdateGraphQLQuery build() {
      return new CartLinesUpdateGraphQLQuery(cartId, lines, queryName, fieldsSet);
               
    }

    /**
     * The ID of the cart.
     */
    public Builder cartId(String cartId) {
      this.cartId = cartId;
      this.fieldsSet.add("cartId");
      return this;
    }

    /**
     * The merchandise lines to update.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder lines(List<CartLineUpdateInput> lines) {
      this.lines = lines;
      this.fieldsSet.add("lines");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

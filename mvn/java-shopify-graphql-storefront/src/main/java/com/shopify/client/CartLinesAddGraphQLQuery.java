package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CartLineInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Adds a merchandise line to the cart.
 */
public class CartLinesAddGraphQLQuery extends GraphQLQuery {
  public CartLinesAddGraphQLQuery(String cartId, List<CartLineInput> lines, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (lines != null || fieldsSet.contains("lines")) {
        getInput().put("lines", lines);
    }
  }

  public CartLinesAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartLinesAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String cartId;

    private List<CartLineInput> lines;

    private String queryName;

    public CartLinesAddGraphQLQuery build() {
      return new CartLinesAddGraphQLQuery(cartId, lines, queryName, fieldsSet);
               
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
     * A list of merchandise lines to add to the cart.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder lines(List<CartLineInput> lines) {
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

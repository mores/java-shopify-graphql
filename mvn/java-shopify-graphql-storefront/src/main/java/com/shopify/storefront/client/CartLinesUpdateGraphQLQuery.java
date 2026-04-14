package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CartLineUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Updates one or more merchandise lines on a
 * [`Cart`](https://shopify.dev/docs/api/storefront/current/objects/Cart). You
 * can modify the quantity, swap the merchandise, change custom attributes, or
 * update the selling plan for each line. You can update a maximum of 250 lines per request.
 *   
 * Omitting the [`attributes`](https://shopify.dev/docs/api/storefront/current/mutations/cartLinesUpdate#arguments-lines.fields.attributes) field or setting it to null preserves existing line attributes. Pass an empty
 * array to clear all attributes from a line.
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

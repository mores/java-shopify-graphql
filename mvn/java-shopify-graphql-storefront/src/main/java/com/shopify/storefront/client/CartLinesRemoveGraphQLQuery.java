package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Removes one or more merchandise lines from a
 * [`Cart`](https://shopify.dev/docs/api/storefront/current/objects/Cart).
 * Accepts up to 250 line IDs per request. Returns the updated cart along with
 * any errors or warnings.
 */
public class CartLinesRemoveGraphQLQuery extends GraphQLQuery {
  public CartLinesRemoveGraphQLQuery(String cartId, List<String> lineIds, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (lineIds != null || fieldsSet.contains("lineIds")) {
        getInput().put("lineIds", lineIds);
    }
  }

  public CartLinesRemoveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartLinesRemove";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String cartId;

    private List<String> lineIds;

    private String queryName;

    public CartLinesRemoveGraphQLQuery build() {
      return new CartLinesRemoveGraphQLQuery(cartId, lineIds, queryName, fieldsSet);
               
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
     * The merchandise line IDs to remove.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder lineIds(List<String> lineIds) {
      this.lineIds = lineIds;
      this.fieldsSet.add("lineIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

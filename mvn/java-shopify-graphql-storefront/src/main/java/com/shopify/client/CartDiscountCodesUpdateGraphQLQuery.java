package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Updates the discount codes applied to the cart.
 */
public class CartDiscountCodesUpdateGraphQLQuery extends GraphQLQuery {
  public CartDiscountCodesUpdateGraphQLQuery(String cartId, List<String> discountCodes,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (cartId != null || fieldsSet.contains("cartId")) {
        getInput().put("cartId", cartId);
    }if (discountCodes != null || fieldsSet.contains("discountCodes")) {
        getInput().put("discountCodes", discountCodes);
    }
  }

  public CartDiscountCodesUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartDiscountCodesUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String cartId;

    private List<String> discountCodes;

    private String queryName;

    public CartDiscountCodesUpdateGraphQLQuery build() {
      return new CartDiscountCodesUpdateGraphQLQuery(cartId, discountCodes, queryName, fieldsSet);
               
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
     * The case-insensitive discount codes that the customer added at checkout.
     *     
     * The input must not contain more than `250` values.
     */
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      this.fieldsSet.add("discountCodes");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CartMetafieldDeleteInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a cart metafield.
 */
public class CartMetafieldDeleteGraphQLQuery extends GraphQLQuery {
  public CartMetafieldDeleteGraphQLQuery(CartMetafieldDeleteInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CartMetafieldDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartMetafieldDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CartMetafieldDeleteInput input;

    private String queryName;

    public CartMetafieldDeleteGraphQLQuery build() {
      return new CartMetafieldDeleteGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields used to delete a cart metafield.
     */
    public Builder input(CartMetafieldDeleteInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

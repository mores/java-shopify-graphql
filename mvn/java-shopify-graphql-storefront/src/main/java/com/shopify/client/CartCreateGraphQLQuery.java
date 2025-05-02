package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CartInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a new cart.
 */
public class CartCreateGraphQLQuery extends GraphQLQuery {
  public CartCreateGraphQLQuery(CartInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CartCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CartInput input;

    private String queryName;

    public CartCreateGraphQLQuery build() {
      return new CartCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The fields used to create a cart.
     */
    public Builder input(CartInput input) {
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

package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.OrderCloseInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Closes an open order.
 */
public class OrderCloseGraphQLQuery extends GraphQLQuery {
  public OrderCloseGraphQLQuery(OrderCloseInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public OrderCloseGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderClose";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OrderCloseInput input;

    private String queryName;

    public OrderCloseGraphQLQuery build() {
      return new OrderCloseGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input for the mutation.
     */
    public Builder input(OrderCloseInput input) {
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

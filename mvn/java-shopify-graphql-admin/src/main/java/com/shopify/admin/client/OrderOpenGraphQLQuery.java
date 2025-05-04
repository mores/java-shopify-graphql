package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OrderOpenInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Opens a closed order.
 */
public class OrderOpenGraphQLQuery extends GraphQLQuery {
  public OrderOpenGraphQLQuery(OrderOpenInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public OrderOpenGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderOpen";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OrderOpenInput input;

    private String queryName;

    public OrderOpenGraphQLQuery build() {
      return new OrderOpenGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input for the mutation.
     */
    public Builder input(OrderOpenInput input) {
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

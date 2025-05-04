package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OrderMarkAsPaidInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Marks an order as paid. You can only mark an order as paid if it isn't already fully paid.
 */
public class OrderMarkAsPaidGraphQLQuery extends GraphQLQuery {
  public OrderMarkAsPaidGraphQLQuery(OrderMarkAsPaidInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public OrderMarkAsPaidGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderMarkAsPaid";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OrderMarkAsPaidInput input;

    private String queryName;

    public OrderMarkAsPaidGraphQLQuery build() {
      return new OrderMarkAsPaidGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input for the mutation.
     */
    public Builder input(OrderMarkAsPaidInput input) {
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

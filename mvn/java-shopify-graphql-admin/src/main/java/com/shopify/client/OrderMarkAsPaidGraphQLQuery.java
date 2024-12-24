package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.OrderMarkAsPaidInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


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

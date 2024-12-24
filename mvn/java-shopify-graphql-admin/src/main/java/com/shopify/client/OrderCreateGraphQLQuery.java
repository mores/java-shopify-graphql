package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.OrderCreateOptionsInput;
import com.shopify.types.OrderCreateOrderInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class OrderCreateGraphQLQuery extends GraphQLQuery {
  public OrderCreateGraphQLQuery(OrderCreateOrderInput order, OrderCreateOptionsInput options,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (order != null || fieldsSet.contains("order")) {
        getInput().put("order", order);
    }if (options != null || fieldsSet.contains("options")) {
        getInput().put("options", options);
    }
  }

  public OrderCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OrderCreateOrderInput order;

    private OrderCreateOptionsInput options;

    private String queryName;

    public OrderCreateGraphQLQuery build() {
      return new OrderCreateGraphQLQuery(order, options, queryName, fieldsSet);
               
    }

    
    public Builder order(OrderCreateOrderInput order) {
      this.order = order;
      this.fieldsSet.add("order");
      return this;
    }

    
    public Builder options(OrderCreateOptionsInput options) {
      this.options = options;
      this.fieldsSet.add("options");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

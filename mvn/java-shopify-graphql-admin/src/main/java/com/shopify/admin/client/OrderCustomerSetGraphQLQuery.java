package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Sets a customer on an order.
 */
public class OrderCustomerSetGraphQLQuery extends GraphQLQuery {
  public OrderCustomerSetGraphQLQuery(String orderId, String customerId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (orderId != null || fieldsSet.contains("orderId")) {
        getInput().put("orderId", orderId);
    }if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }
  }

  public OrderCustomerSetGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderCustomerSet";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String orderId;

    private String customerId;

    private String queryName;

    public OrderCustomerSetGraphQLQuery build() {
      return new OrderCustomerSetGraphQLQuery(orderId, customerId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the order having a customer set.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      this.fieldsSet.add("orderId");
      return this;
    }

    /**
     * The ID of the customer being set on the order.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

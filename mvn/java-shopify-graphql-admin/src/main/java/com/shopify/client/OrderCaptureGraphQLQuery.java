package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.OrderCaptureInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Captures payment for an authorized transaction on an order. An order can only
 * be captured if it has a successful authorization transaction. Capturing an
 * order will claim the money reserved by the authorization. orderCapture can be
 * used to capture multiple times as long as the OrderTransaction is
 * multi-capturable. To capture a partial payment, the included `amount` value
 * should be less than the total order amount. Multi-capture is available only to
 * stores on a Shopify Plus plan.
 */
public class OrderCaptureGraphQLQuery extends GraphQLQuery {
  public OrderCaptureGraphQLQuery(OrderCaptureInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public OrderCaptureGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderCapture";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OrderCaptureInput input;

    private String queryName;

    public OrderCaptureGraphQLQuery build() {
      return new OrderCaptureGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(OrderCaptureInput input) {
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

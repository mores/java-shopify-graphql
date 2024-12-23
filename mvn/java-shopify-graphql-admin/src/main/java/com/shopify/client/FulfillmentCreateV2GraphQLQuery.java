package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FulfillmentV2Input;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a fulfillment for one or many fulfillment orders.
 * The fulfillment orders are associated with the same order and are assigned to the same location.
 */
public class FulfillmentCreateV2GraphQLQuery extends GraphQLQuery {
  public FulfillmentCreateV2GraphQLQuery(FulfillmentV2Input fulfillment, String message,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fulfillment != null || fieldsSet.contains("fulfillment")) {
        getInput().put("fulfillment", fulfillment);
    }if (message != null || fieldsSet.contains("message")) {
        getInput().put("message", message);
    }
  }

  public FulfillmentCreateV2GraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentCreateV2";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private FulfillmentV2Input fulfillment;

    private String message;

    private String queryName;

    public FulfillmentCreateV2GraphQLQuery build() {
      return new FulfillmentCreateV2GraphQLQuery(fulfillment, message, queryName, fieldsSet);
               
    }

    /**
     * The input fields used to create a fulfillment from fulfillment orders.
     */
    public Builder fulfillment(FulfillmentV2Input fulfillment) {
      this.fulfillment = fulfillment;
      this.fieldsSet.add("fulfillment");
      return this;
    }

    /**
     * An optional message for the fulfillment request.
     */
    public Builder message(String message) {
      this.message = message;
      this.fieldsSet.add("message");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

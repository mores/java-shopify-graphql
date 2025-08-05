package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Accepts a fulfillment request sent to a fulfillment service for a fulfillment order.
 */
public class FulfillmentOrderAcceptFulfillmentRequestGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderAcceptFulfillmentRequestGraphQLQuery(String id, String message,
      OffsetDateTime estimatedShippedAt, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (message != null || fieldsSet.contains("message")) {
        getInput().put("message", message);
    }if (estimatedShippedAt != null || fieldsSet.contains("estimatedShippedAt")) {
        getInput().put("estimatedShippedAt", estimatedShippedAt);
    }
  }

  public FulfillmentOrderAcceptFulfillmentRequestGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderAcceptFulfillmentRequest";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String message;

    private OffsetDateTime estimatedShippedAt;

    private String queryName;

    public FulfillmentOrderAcceptFulfillmentRequestGraphQLQuery build() {
      return new FulfillmentOrderAcceptFulfillmentRequestGraphQLQuery(id, message, estimatedShippedAt, queryName, fieldsSet);
               
    }

    /**
     * The ID of the fulfillment order associated with the fulfillment request.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * An optional reason for accepting the fulfillment request.
     */
    public Builder message(String message) {
      this.message = message;
      this.fieldsSet.add("message");
      return this;
    }

    /**
     * The estimated date and time when the fulfillment order will be shipped.
     */
    public Builder estimatedShippedAt(OffsetDateTime estimatedShippedAt) {
      this.estimatedShippedAt = estimatedShippedAt;
      this.fieldsSet.add("estimatedShippedAt");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

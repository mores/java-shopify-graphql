package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Marks an in-progress fulfillment order as incomplete, indicating the
 * fulfillment service is unable to ship any remaining items and intends to close
 * the fulfillment order.
 */
public class FulfillmentOrderCloseGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderCloseGraphQLQuery(String id, String message, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (message != null || fieldsSet.contains("message")) {
        getInput().put("message", message);
    }
  }

  public FulfillmentOrderCloseGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderClose";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String message;

    private String queryName;

    public FulfillmentOrderCloseGraphQLQuery build() {
      return new FulfillmentOrderCloseGraphQLQuery(id, message, queryName, fieldsSet);
               
    }

    /**
     * The ID of the fulfillment order to mark as incomplete.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * An optional reason for marking the fulfillment order as incomplete.
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

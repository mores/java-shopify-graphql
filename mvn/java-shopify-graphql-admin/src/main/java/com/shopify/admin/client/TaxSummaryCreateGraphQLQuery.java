package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a tax summary for a given order.
 * If both an order ID and a start and end time are provided, the order ID will be used.
 */
public class TaxSummaryCreateGraphQLQuery extends GraphQLQuery {
  public TaxSummaryCreateGraphQLQuery(String orderId, OffsetDateTime startTime,
      OffsetDateTime endTime, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (orderId != null || fieldsSet.contains("orderId")) {
        getInput().put("orderId", orderId);
    }if (startTime != null || fieldsSet.contains("startTime")) {
        getInput().put("startTime", startTime);
    }if (endTime != null || fieldsSet.contains("endTime")) {
        getInput().put("endTime", endTime);
    }
  }

  public TaxSummaryCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "taxSummaryCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String orderId;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    private String queryName;

    public TaxSummaryCreateGraphQLQuery build() {
      return new TaxSummaryCreateGraphQLQuery(orderId, startTime, endTime, queryName, fieldsSet);
               
    }

    /**
     * The ID of the order to create the tax summary for.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      this.fieldsSet.add("orderId");
      return this;
    }

    /**
     * The start time of the range of orders to create the tax summary for.
     */
    public Builder startTime(OffsetDateTime startTime) {
      this.startTime = startTime;
      this.fieldsSet.add("startTime");
      return this;
    }

    /**
     * The end time of the range of orders to create the tax summary for.
     */
    public Builder endTime(OffsetDateTime endTime) {
      this.endTime = endTime;
      this.fieldsSet.add("endTime");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

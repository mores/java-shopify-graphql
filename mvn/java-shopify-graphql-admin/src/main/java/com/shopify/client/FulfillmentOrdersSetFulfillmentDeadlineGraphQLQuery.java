package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Sets the latest date and time by which the fulfillment orders need to be fulfilled.
 */
public class FulfillmentOrdersSetFulfillmentDeadlineGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrdersSetFulfillmentDeadlineGraphQLQuery(List<String> fulfillmentOrderIds,
      OffsetDateTime fulfillmentDeadline, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fulfillmentOrderIds != null || fieldsSet.contains("fulfillmentOrderIds")) {
        getInput().put("fulfillmentOrderIds", fulfillmentOrderIds);
    }if (fulfillmentDeadline != null || fieldsSet.contains("fulfillmentDeadline")) {
        getInput().put("fulfillmentDeadline", fulfillmentDeadline);
    }
  }

  public FulfillmentOrdersSetFulfillmentDeadlineGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrdersSetFulfillmentDeadline";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> fulfillmentOrderIds;

    private OffsetDateTime fulfillmentDeadline;

    private String queryName;

    public FulfillmentOrdersSetFulfillmentDeadlineGraphQLQuery build() {
      return new FulfillmentOrdersSetFulfillmentDeadlineGraphQLQuery(fulfillmentOrderIds, fulfillmentDeadline, queryName, fieldsSet);
               
    }

    /**
     * The IDs of the fulfillment orders for which the deadline is being set.
     */
    public Builder fulfillmentOrderIds(List<String> fulfillmentOrderIds) {
      this.fulfillmentOrderIds = fulfillmentOrderIds;
      this.fieldsSet.add("fulfillmentOrderIds");
      return this;
    }

    /**
     * The new fulfillment deadline of the fulfillment orders.
     */
    public Builder fulfillmentDeadline(OffsetDateTime fulfillmentDeadline) {
      this.fulfillmentDeadline = fulfillmentDeadline;
      this.fieldsSet.add("fulfillmentDeadline");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


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

    
    public Builder fulfillmentOrderIds(List<String> fulfillmentOrderIds) {
      this.fulfillmentOrderIds = fulfillmentOrderIds;
      this.fieldsSet.add("fulfillmentOrderIds");
      return this;
    }

    
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

package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;


public class FulfillmentOrderRescheduleGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderRescheduleGraphQLQuery(String id, OffsetDateTime fulfillAt,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (fulfillAt != null || fieldsSet.contains("fulfillAt")) {
        getInput().put("fulfillAt", fulfillAt);
    }
  }

  public FulfillmentOrderRescheduleGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderReschedule";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private OffsetDateTime fulfillAt;

    private String queryName;

    public FulfillmentOrderRescheduleGraphQLQuery build() {
      return new FulfillmentOrderRescheduleGraphQLQuery(id, fulfillAt, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder fulfillAt(OffsetDateTime fulfillAt) {
      this.fulfillAt = fulfillAt;
      this.fieldsSet.add("fulfillAt");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

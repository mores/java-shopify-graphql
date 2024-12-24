package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MoneyInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class AppUsageRecordCreateGraphQLQuery extends GraphQLQuery {
  public AppUsageRecordCreateGraphQLQuery(String subscriptionLineItemId, MoneyInput price,
      String description, String idempotencyKey, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (subscriptionLineItemId != null || fieldsSet.contains("subscriptionLineItemId")) {
        getInput().put("subscriptionLineItemId", subscriptionLineItemId);
    }if (price != null || fieldsSet.contains("price")) {
        getInput().put("price", price);
    }if (description != null || fieldsSet.contains("description")) {
        getInput().put("description", description);
    }if (idempotencyKey != null || fieldsSet.contains("idempotencyKey")) {
        getInput().put("idempotencyKey", idempotencyKey);
    }
  }

  public AppUsageRecordCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "appUsageRecordCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String subscriptionLineItemId;

    private MoneyInput price;

    private String description;

    private String idempotencyKey;

    private String queryName;

    public AppUsageRecordCreateGraphQLQuery build() {
      return new AppUsageRecordCreateGraphQLQuery(subscriptionLineItemId, price, description, idempotencyKey, queryName, fieldsSet);
               
    }

    
    public Builder subscriptionLineItemId(String subscriptionLineItemId) {
      this.subscriptionLineItemId = subscriptionLineItemId;
      this.fieldsSet.add("subscriptionLineItemId");
      return this;
    }

    
    public Builder price(MoneyInput price) {
      this.price = price;
      this.fieldsSet.add("price");
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      this.fieldsSet.add("description");
      return this;
    }

    
    public Builder idempotencyKey(String idempotencyKey) {
      this.idempotencyKey = idempotencyKey;
      this.fieldsSet.add("idempotencyKey");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

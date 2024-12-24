package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FulfillmentOrderHoldInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class FulfillmentOrderHoldGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderHoldGraphQLQuery(String id, FulfillmentOrderHoldInput fulfillmentHold,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (fulfillmentHold != null || fieldsSet.contains("fulfillmentHold")) {
        getInput().put("fulfillmentHold", fulfillmentHold);
    }
  }

  public FulfillmentOrderHoldGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderHold";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private FulfillmentOrderHoldInput fulfillmentHold;

    private String queryName;

    public FulfillmentOrderHoldGraphQLQuery build() {
      return new FulfillmentOrderHoldGraphQLQuery(id, fulfillmentHold, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder fulfillmentHold(FulfillmentOrderHoldInput fulfillmentHold) {
      this.fulfillmentHold = fulfillmentHold;
      this.fieldsSet.add("fulfillmentHold");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

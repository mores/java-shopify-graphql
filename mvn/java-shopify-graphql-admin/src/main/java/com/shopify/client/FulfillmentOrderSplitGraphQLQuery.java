package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FulfillmentOrderSplitInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FulfillmentOrderSplitGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderSplitGraphQLQuery(List<FulfillmentOrderSplitInput> fulfillmentOrderSplits,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fulfillmentOrderSplits != null || fieldsSet.contains("fulfillmentOrderSplits")) {
        getInput().put("fulfillmentOrderSplits", fulfillmentOrderSplits);
    }
  }

  public FulfillmentOrderSplitGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderSplit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<FulfillmentOrderSplitInput> fulfillmentOrderSplits;

    private String queryName;

    public FulfillmentOrderSplitGraphQLQuery build() {
      return new FulfillmentOrderSplitGraphQLQuery(fulfillmentOrderSplits, queryName, fieldsSet);
               
    }

    
    public Builder fulfillmentOrderSplits(List<FulfillmentOrderSplitInput> fulfillmentOrderSplits) {
      this.fulfillmentOrderSplits = fulfillmentOrderSplits;
      this.fieldsSet.add("fulfillmentOrderSplits");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

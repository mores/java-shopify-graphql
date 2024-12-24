package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FulfillmentOrderMergeInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FulfillmentOrderMergeGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrderMergeGraphQLQuery(
      List<FulfillmentOrderMergeInput> fulfillmentOrderMergeInputs, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fulfillmentOrderMergeInputs != null || fieldsSet.contains("fulfillmentOrderMergeInputs")) {
        getInput().put("fulfillmentOrderMergeInputs", fulfillmentOrderMergeInputs);
    }
  }

  public FulfillmentOrderMergeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrderMerge";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<FulfillmentOrderMergeInput> fulfillmentOrderMergeInputs;

    private String queryName;

    public FulfillmentOrderMergeGraphQLQuery build() {
      return new FulfillmentOrderMergeGraphQLQuery(fulfillmentOrderMergeInputs, queryName, fieldsSet);
               
    }

    
    public Builder fulfillmentOrderMergeInputs(
        List<FulfillmentOrderMergeInput> fulfillmentOrderMergeInputs) {
      this.fulfillmentOrderMergeInputs = fulfillmentOrderMergeInputs;
      this.fieldsSet.add("fulfillmentOrderMergeInputs");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FulfillmentTrackingInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class FulfillmentTrackingInfoUpdateV2GraphQLQuery extends GraphQLQuery {
  public FulfillmentTrackingInfoUpdateV2GraphQLQuery(String fulfillmentId,
      FulfillmentTrackingInput trackingInfoInput, Boolean notifyCustomer, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (fulfillmentId != null || fieldsSet.contains("fulfillmentId")) {
        getInput().put("fulfillmentId", fulfillmentId);
    }if (trackingInfoInput != null || fieldsSet.contains("trackingInfoInput")) {
        getInput().put("trackingInfoInput", trackingInfoInput);
    }if (notifyCustomer != null || fieldsSet.contains("notifyCustomer")) {
        getInput().put("notifyCustomer", notifyCustomer);
    }
  }

  public FulfillmentTrackingInfoUpdateV2GraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentTrackingInfoUpdateV2";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String fulfillmentId;

    private FulfillmentTrackingInput trackingInfoInput;

    private Boolean notifyCustomer;

    private String queryName;

    public FulfillmentTrackingInfoUpdateV2GraphQLQuery build() {
      return new FulfillmentTrackingInfoUpdateV2GraphQLQuery(fulfillmentId, trackingInfoInput, notifyCustomer, queryName, fieldsSet);
               
    }

    
    public Builder fulfillmentId(String fulfillmentId) {
      this.fulfillmentId = fulfillmentId;
      this.fieldsSet.add("fulfillmentId");
      return this;
    }

    
    public Builder trackingInfoInput(FulfillmentTrackingInput trackingInfoInput) {
      this.trackingInfoInput = trackingInfoInput;
      this.fieldsSet.add("trackingInfoInput");
      return this;
    }

    
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      this.fieldsSet.add("notifyCustomer");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

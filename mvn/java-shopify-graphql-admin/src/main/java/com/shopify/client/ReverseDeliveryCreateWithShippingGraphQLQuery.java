package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ReverseDeliveryLabelInput;
import com.shopify.types.ReverseDeliveryLineItemInput;
import com.shopify.types.ReverseDeliveryTrackingInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ReverseDeliveryCreateWithShippingGraphQLQuery extends GraphQLQuery {
  public ReverseDeliveryCreateWithShippingGraphQLQuery(String reverseFulfillmentOrderId,
      List<ReverseDeliveryLineItemInput> reverseDeliveryLineItems,
      ReverseDeliveryTrackingInput trackingInput, ReverseDeliveryLabelInput labelInput,
      Boolean notifyCustomer, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (reverseFulfillmentOrderId != null || fieldsSet.contains("reverseFulfillmentOrderId")) {
        getInput().put("reverseFulfillmentOrderId", reverseFulfillmentOrderId);
    }if (reverseDeliveryLineItems != null || fieldsSet.contains("reverseDeliveryLineItems")) {
        getInput().put("reverseDeliveryLineItems", reverseDeliveryLineItems);
    }if (trackingInput != null || fieldsSet.contains("trackingInput")) {
        getInput().put("trackingInput", trackingInput);
    }if (labelInput != null || fieldsSet.contains("labelInput")) {
        getInput().put("labelInput", labelInput);
    }if (notifyCustomer != null || fieldsSet.contains("notifyCustomer")) {
        getInput().put("notifyCustomer", notifyCustomer);
    }
  }

  public ReverseDeliveryCreateWithShippingGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "reverseDeliveryCreateWithShipping";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String reverseFulfillmentOrderId;

    private List<ReverseDeliveryLineItemInput> reverseDeliveryLineItems;

    private ReverseDeliveryTrackingInput trackingInput;

    private ReverseDeliveryLabelInput labelInput;

    private Boolean notifyCustomer;

    private String queryName;

    public ReverseDeliveryCreateWithShippingGraphQLQuery build() {
      return new ReverseDeliveryCreateWithShippingGraphQLQuery(reverseFulfillmentOrderId, reverseDeliveryLineItems, trackingInput, labelInput, notifyCustomer, queryName, fieldsSet);
               
    }

    
    public Builder reverseFulfillmentOrderId(String reverseFulfillmentOrderId) {
      this.reverseFulfillmentOrderId = reverseFulfillmentOrderId;
      this.fieldsSet.add("reverseFulfillmentOrderId");
      return this;
    }

    
    public Builder reverseDeliveryLineItems(
        List<ReverseDeliveryLineItemInput> reverseDeliveryLineItems) {
      this.reverseDeliveryLineItems = reverseDeliveryLineItems;
      this.fieldsSet.add("reverseDeliveryLineItems");
      return this;
    }

    
    public Builder trackingInput(ReverseDeliveryTrackingInput trackingInput) {
      this.trackingInput = trackingInput;
      this.fieldsSet.add("trackingInput");
      return this;
    }

    
    public Builder labelInput(ReverseDeliveryLabelInput labelInput) {
      this.labelInput = labelInput;
      this.fieldsSet.add("labelInput");
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

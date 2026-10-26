package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ReverseDeliveryLabelInput;
import com.shopify.admin.types.ReverseDeliveryLineItemInput;
import com.shopify.admin.types.ReverseDeliveryTrackingInput;
import graphql.language.VariableDefinition;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Creates a new reverse delivery with associated external shipping information.
 */
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

  public ReverseDeliveryCreateWithShippingGraphQLQuery(String reverseFulfillmentOrderId,
      List<ReverseDeliveryLineItemInput> reverseDeliveryLineItems,
      ReverseDeliveryTrackingInput trackingInput, ReverseDeliveryLabelInput labelInput,
      Boolean notifyCustomer, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
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
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String reverseFulfillmentOrderId;

    private List<ReverseDeliveryLineItemInput> reverseDeliveryLineItems;

    private ReverseDeliveryTrackingInput trackingInput;

    private ReverseDeliveryLabelInput labelInput;

    private Boolean notifyCustomer;

    private String queryName;

    public ReverseDeliveryCreateWithShippingGraphQLQuery build() {
      return new ReverseDeliveryCreateWithShippingGraphQLQuery(reverseFulfillmentOrderId, reverseDeliveryLineItems, trackingInput, labelInput, notifyCustomer, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the reverse fulfillment order that's associated to the reverse delivery.
     */
    public Builder reverseFulfillmentOrderId(String reverseFulfillmentOrderId) {
      this.reverseFulfillmentOrderId = reverseFulfillmentOrderId;
      this.fieldsSet.add("reverseFulfillmentOrderId");
      return this;
    }

    /**
     * The ID of the reverse fulfillment order that's associated to the reverse delivery.
     */
    public Builder reverseFulfillmentOrderIdReference(String variableRef) {
      this.variableReferences.put("reverseFulfillmentOrderId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("reverseFulfillmentOrderId");
      return this;
    }

    /**
     * The reverse delivery line items to be created. If an empty array is provided, then this mutation
     *           will create a reverse delivery line item for each reverse fulfillment order line item, with its quantity equal
     *           to the reverse fulfillment order line item total quantity.
     */
    public Builder reverseDeliveryLineItems(
        List<ReverseDeliveryLineItemInput> reverseDeliveryLineItems) {
      this.reverseDeliveryLineItems = reverseDeliveryLineItems;
      this.fieldsSet.add("reverseDeliveryLineItems");
      return this;
    }

    /**
     * The reverse delivery line items to be created. If an empty array is provided, then this mutation
     *           will create a reverse delivery line item for each reverse fulfillment order line item, with its quantity equal
     *           to the reverse fulfillment order line item total quantity.
     */
    public Builder reverseDeliveryLineItemsReference(String variableRef) {
      this.variableReferences.put("reverseDeliveryLineItems", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ReverseDeliveryLineItemInput"))))).build());
      this.fieldsSet.add("reverseDeliveryLineItems");
      return this;
    }

    /**
     * The tracking information for the reverse delivery.
     */
    public Builder trackingInput(ReverseDeliveryTrackingInput trackingInput) {
      this.trackingInput = trackingInput;
      this.fieldsSet.add("trackingInput");
      return this;
    }

    /**
     * The tracking information for the reverse delivery.
     */
    public Builder trackingInputReference(String variableRef) {
      this.variableReferences.put("trackingInput", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ReverseDeliveryTrackingInput")).build());
      this.fieldsSet.add("trackingInput");
      return this;
    }

    /**
     * The return label file information for the reverse delivery.
     */
    public Builder labelInput(ReverseDeliveryLabelInput labelInput) {
      this.labelInput = labelInput;
      this.fieldsSet.add("labelInput");
      return this;
    }

    /**
     * The return label file information for the reverse delivery.
     */
    public Builder labelInputReference(String variableRef) {
      this.variableReferences.put("labelInput", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("ReverseDeliveryLabelInput")).build());
      this.fieldsSet.add("labelInput");
      return this;
    }

    /**
     * When `true` the customer is notified with delivery instructions if the `ReverseFulfillmentOrder.order.email` is present.
     */
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      this.fieldsSet.add("notifyCustomer");
      return this;
    }

    /**
     * When `true` the customer is notified with delivery instructions if the `ReverseFulfillmentOrder.order.email` is present.
     */
    public Builder notifyCustomerReference(String variableRef) {
      this.variableReferences.put("notifyCustomer", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("Boolean")).build());
      this.fieldsSet.add("notifyCustomer");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}

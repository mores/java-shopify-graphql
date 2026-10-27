package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ReverseDeliveryLabelInput;
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
 * Updates a reverse delivery with associated external shipping information.
 */
public class ReverseDeliveryShippingUpdateGraphQLQuery extends GraphQLQuery {
  public ReverseDeliveryShippingUpdateGraphQLQuery(String reverseDeliveryId,
      ReverseDeliveryTrackingInput trackingInput, ReverseDeliveryLabelInput labelInput,
      Boolean notifyCustomer, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (reverseDeliveryId != null || fieldsSet.contains("reverseDeliveryId")) {
        getInput().put("reverseDeliveryId", reverseDeliveryId);
    }if (trackingInput != null || fieldsSet.contains("trackingInput")) {
        getInput().put("trackingInput", trackingInput);
    }if (labelInput != null || fieldsSet.contains("labelInput")) {
        getInput().put("labelInput", labelInput);
    }if (notifyCustomer != null || fieldsSet.contains("notifyCustomer")) {
        getInput().put("notifyCustomer", notifyCustomer);
    }
  }

  public ReverseDeliveryShippingUpdateGraphQLQuery(String reverseDeliveryId,
      ReverseDeliveryTrackingInput trackingInput, ReverseDeliveryLabelInput labelInput,
      Boolean notifyCustomer, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (reverseDeliveryId != null || fieldsSet.contains("reverseDeliveryId")) {
        getInput().put("reverseDeliveryId", reverseDeliveryId);
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

  public ReverseDeliveryShippingUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "reverseDeliveryShippingUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String reverseDeliveryId;

    private ReverseDeliveryTrackingInput trackingInput;

    private ReverseDeliveryLabelInput labelInput;

    private Boolean notifyCustomer;

    private String queryName;

    public ReverseDeliveryShippingUpdateGraphQLQuery build() {
      return new ReverseDeliveryShippingUpdateGraphQLQuery(reverseDeliveryId, trackingInput, labelInput, notifyCustomer, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the reverse delivery to update.
     */
    public Builder reverseDeliveryId(String reverseDeliveryId) {
      this.reverseDeliveryId = reverseDeliveryId;
      this.fieldsSet.add("reverseDeliveryId");
      return this;
    }

    /**
     * The ID of the reverse delivery to update.
     */
    public Builder reverseDeliveryIdReference(String variableRef) {
      this.variableReferences.put("reverseDeliveryId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("reverseDeliveryId");
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
     * If `true` and an email address exists on the
     * `ReverseFulfillmentOrder.order`, then the customer is notified with the
     * updated delivery instructions.
     */
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      this.fieldsSet.add("notifyCustomer");
      return this;
    }

    /**
     * If `true` and an email address exists on the
     * `ReverseFulfillmentOrder.order`, then the customer is notified with the
     * updated delivery instructions.
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
